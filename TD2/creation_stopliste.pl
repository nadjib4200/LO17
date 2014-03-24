#!/usr/bin/perl

open(TFIDF, "res/tfxidf.txt") || die ("Erreur d'ouverture du fichier");

# clé : mot, val : tf*idf < 0.413116254843684
my %stopliste = ();

$i = 0;
# construction stopliste
while ($ligne = <TFIDF>) {
	# $1 : mot, $2 : coef
	if ($ligne =~ /.*?\t(.*?)\t(.*?)\n/) {
		if (!exists($stopliste{$1}) && $2 < 0.413116254843684) {
			$stopliste{$1} = $i++; # on récupère juste les mots non intéressants
		}
	}
}

# affichage
@liste_mots = keys(%stopliste);
foreach $mot (@liste_mots) {
	print "$mot\n";
}

close(TFIDF);
