#!/usr/bin/perl

# ex : script.pl nom_fic
# script doit être à coté de LCI

############################################
# Lecture args
############################################
$num_args = $#ARGV + 1;
if ($num_args != 1) {
	print "Usage: script.pl nom_fic\n";
	exit;
}
$fichier = $ARGV[0];
chomp($fichier);

############################################
# traitement
############################################
open(FICIN, "LCI_2/$fichier") || die ("Erreur d'ouverture du fichier");
open(FICOUT, ">LCI_3/$fichier") || die ("Erreur d'ouverture du fichier");

while ($ligne = <FICIN>) {
	if ($ligne =~ s/(\n|\r|\f)//g) {
		print FICOUT $ligne;
	}
}

close FICIN;
close FICOUT;
