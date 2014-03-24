#!/usr/bin/perl

$corpus = "CORPUS/corpus_stopliste.xml";

print "====Fichiers inverses====\n";

# Etape 1 : création table inverse pour balises
print "Etape 1 ()\n";
#~ `cat $corpus | perl scripts/newsegmente.pl -f | sort -u | cut -f1 | uniq > res_lemm/mots.txt`;

# Etape 2 : création table inverse pour les mots séparés par des balises
print "Etape 2 ()\n";
#~ `cat $corpus | perl scripts/newsegmente.pl -f | sort -u | cut -f1 | uniq > res_lemm/mots.txt`;
