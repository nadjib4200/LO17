#!/usr/bin/perl

$corpus = "CORPUS/corpus_stopliste.xml";
$corpus_res = "CORPUS/corpus_lemmatise.xml";

print "====Lemmatisation====\n";

# Etape 1 : création liste mots à partir du nouveau corpus (stopliste)
print "Etape 1 (création liste mots - corpus stopliste)\n";
`cat $corpus | perl scripts/newsegmente.pl -f | perl supp_chiffres.pl | sort -u | cut -f1 | uniq > res_lemm/mots.txt`;

# Etape 2 : liste successeurs
print "Etape 2 (liste successeurs)\n";
`perl scripts/successeurs_2013.pl res_lemm/mots.txt | sort -k2 > res_lemm/succ.txt`;

# Etape 3 : lemm
print "Etape 3 (lemm) : mot | lemme\n";
`perl scripts/filtronc.pl -v res_lemm/succ.txt > res_lemm/lemm.txt`;

# Etape 4 : création filtre
print "Etape 4 création filtre\n";
`perl scripts/newcreeFiltre.pl res_lemm/lemm.txt > script_filtre_lemmes.pl`;
`chmod +x script_filtre_lemmes.pl`;

# Etape 5 : lemmatisation du corpus
print "Etape 5 lemmatisation du corpus";
$c = `perl script_filtre_lemmes.pl $corpus > $corpus_res`;
