#!/usr/bin/perl

open(IDF, "res/idf.txt") || die ("Erreur d'ouverture du fichier");
open(TF, "res/tf.txt") || die ("Erreur d'ouverture du fichier");

# hashmap des idf, clé : mot, val : idf
my %idf = {};

# parcours fichier idf.txt pour construction hashmap idf
while($ligne = <IDF>) {
	$ligne =~ /(.*?)\t(.*?)\n/;
	$idf{$1} = $2;
}

# parcours fichier tf.txt pour calcul tf x idf
while($ligne = <TF>) {
	$ligne =~ /(\d+)\s(.*?)\t(.*?)\n/; # $1 = tf, $2 = mot, $3 = page
	$t = $1 * $idf{$2}; # tf * idf
	print "$3\t$2\t$t\n"; # page, mot, tf * idf
}

close(IDF);
close(TF);
