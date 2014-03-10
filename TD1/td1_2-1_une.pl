#!/usr/bin/perl

# ex : script.pl nom_fic
# script doit être à coté de LCI

use Unicode::String qw(utf8 latin1);

# spécifie le format par défaut des chaînes en entrée
Unicode::String->stringify_as('utf8');

# (1) quit unless we have the correct number of command-line args
$num_args = $#ARGV + 1;
print "Nb args : $num_args\n";
if ($num_args != 1) {
	print "Usage: script.pl nom_fic\n";
	exit;
}

# lecture args
$fichier = $ARGV[0];

print "Source : LCI/$fichier\n";

open(FICIN, "LCI/$fichier") || die ("Erreur d'ouverture du fichier");
open(FICOUT, ">LCI_2/$fichier") || die ("Erreur d'ouverture du fichier");

while ($ligne = <FICIN>) {
	if ($ligne =~ /(IBL_ID|Blc)=27303/) {
		do {
		      # convertir la ligne DOCTYPE .. UTF-8 en DOCTYPE .. iso8859-1
		      # pour que le document converti puisse toujours
		      # être affiché correctement par un navigateur
		      (/DOCTYPE HTML/) && (s/[Uu][Tt][Ff]\-8/iso8859-1/);

		      # instancier la chaîne en objet au format "neutre"
		      $u = Unicode::String->new($ligne);

		      # rendre la chaîne sous un format iso8859-1		      
		      print FICOUT $u->latin1;
		      
		      # on passe à la ligne suivante
		      $ligne = <FICIN>;		
		} until ($ligne =~ /(\/Bloc IBL_ID|\/Blc)=27916/);
		# instancier la chaîne en objet au format "neutre"
		$u = Unicode::String->new($ligne);
		# rendre la chaîne sous un format iso8859-1		      
		print FICOUT $u->latin1;
	}
}

print "END\n";
