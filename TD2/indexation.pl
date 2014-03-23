#!/usr/bin/perl

$corpus = "CORPUS/corpus.xml";

# paramétrage système langue française
`setenv LANG=C`;

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
