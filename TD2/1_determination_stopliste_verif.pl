#!/usr/bin/perl

#################################
# Tests de vérification stopliste
#################################

open(FICHSTOP, "res/stopliste_chiff.txt") || die ("Erreur d'ouverture du fichier");

while ($ligne = <FICHSTOP>) {
	$ligne =~ /(.*?)\n/;
	print `cat CORPUS/corpus_stopliste.xml | grep '<titreArticle>\|<resumeArticle>' | grep -e '\s$1\s'`
}
