#!/usr/bin/perl

$corpus = "CORPUS/corpus.xml";
$corpus_stopliste = "CORPUS/corpus_stopliste.xml";

# paramétrage système langue française
#`setenv LANG C`;

print "====Indexation du corpus====\n";

# Etape 1 : tf
print "Etape 1 (tf) : tf | mot | page\n";
$c = `cat $corpus | perl scripts/newsegmente.pl -f | sort | uniq -c > res/tf.txt`;

# Etape 2 : df
print "Etape 2 (df) : df | mot\n";
`cat $corpus | perl scripts/newsegmente.pl -f | sort -u > res/df_1.txt`;
`cat $corpus | perl scripts/newsegmente.pl -f | sort -u | cut -f1 > res/df_2.txt`;
`cat $corpus | perl scripts/newsegmente.pl -f | sort -u | cut -f1 | uniq -c > res/df_3.txt`;
`cat $corpus | perl scripts/newsegmente.pl -f | sort -u | cut -f1 | uniq -c | sort -rn > res/df.txt`;

# Etape 3 : idf
print "Etape 3 (idf) : mot | idf\n";
$c = `cat res/df.txt | perl calcul_idf.pl > res/idf.txt`;

# Etape 4 : tf * idf
print "Etape 4 (tf * idf) : page | mot | tf * idf\n";
`perl calcul_tfxidf.pl | sort -k 3 > res/tfxidf.txt`;

# Etape 5 : stopliste
print "Etape 5 (stopliste)\n";
`perl creation_stopliste.pl | sort > res/stopliste.txt`;

# Etape 6 : création du script qui élimine les mots de la stopliste du corpus
print "Etape 6 (création script qui élimine les mots de la stopliste du corpus)\n";
`perl scripts/newcreeFiltre.pl res/stopliste.txt > res_script_stopliste_corpus.pl`;
`chmod u+x res_script_stopliste_corpus.pl`;

# Etape 7 : Elimination des mots de la stopliste du corpus
print "Etape 7 (élimination des mots de la stopliste du corpus)\n";
`perl res_script_stopliste_corpus.pl $corpus > $corpus_stopliste`;

