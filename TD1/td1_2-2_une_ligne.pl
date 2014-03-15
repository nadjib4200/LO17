#!/usr/bin/perl

# ex : script.pl nom_fic
# script doit être à coté de LCI

# (1) quit unless we have the correct number of command-line args
$num_args = $#ARGV + 1;
if ($num_args != 1) {
	print "Usage: script.pl nom_fic\n";
	exit;
}

# lecture args
$fichier = $ARGV[0];

print "Source : LCI_2/$fichier\n";

open(FICIN, "LCI_2/$fichier") || die ("Erreur d'ouverture du fichier");
open(FICOUT, ">LCI_3/$fichier") || die ("Erreur d'ouverture du fichier");

# lecture fichier entrée
while ($ligne = <FICIN>) {
	if ($ligne =~ s/(\n|\r|\f)//g) {
		print FICOUT $ligne;
	}
}
