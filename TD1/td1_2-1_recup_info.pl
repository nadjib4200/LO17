#!/usr/bin/perl
# ex : script.pl nom_fic
# script doit être à coté de LCI

use Unicode::String qw(utf8 latin1);

# spécifie le format par défaut des chaînes en entrée
Unicode::String->stringify_as('utf8');

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
# test existence et unicité
############################################
open(FICIN, "LCI/$fichier") || die ("Erreur d'ouverture du fichier");
$t_deb_info = 0;
$t_fin_info = 0;
while ($ligne = <FICIN>) {
	if ($ligne =~ /([^\/]Bloc IBL_ID|Blc)=27303/) {
		$t_deb_info++;
	} elsif ($ligne =~ /(\/Bloc IBL_ID|\/Blc)=27916/) {
		$t_fin_info++;
	}
}
$t_err = 0;
if ($t_deb_info > 1) {
	print "$fichier : Element début partie informative trouvé $deb_info fois dans le texte\n";
	$t_err = 1;
} elsif ($t_deb_info < 1) {
	print "$fichier : Element début partie informative NON trouvé dans le texte\n";
	$t_err = 1;
}
if ($t_fin_info > 1) {
	print "$fichier : Element fin partie informative trouvé $fin_info fois dans le texte\n";
	$t_err = 1;
} elsif ($t_fin_info < 1) {
	print "$fichier : Element fin partie informative NON trouvé dans le texte\n";
	$t_err = 1;
}
# erreur
if ($t_err > 0) {
	print "$fichier : Arrêt programme à cause d'erreur, voir fichier log\n"; 
	exit;
}
close FICIN;

############################################
# traitement
############################################
open(FICIN, "LCI/$fichier") || die ("Erreur d'ouverture du fichier");
open(FICOUT, ">LCI_2/$fichier") || die ("Erreur d'ouverture du fichier");

while ($ligne = <FICIN>) {
	if ($ligne =~ /([^\/]Bloc IBL_ID|Blc)=27303/) {
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

close FICIN;
close FICOUT;
