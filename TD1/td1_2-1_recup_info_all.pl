#!/usr/bin/perl

# recupération tous les fichiers HTML dans un tableau
@list = `ls LCI/*.html`;
$nb_fic = @list;
print "Nombre de fichiers originaux : $nb_fic\n";

# on enlève le "LCI/" du nom
foreach $fic (@list) {
  $fic =~ s/LCI\///;
}

open(FICLOG, ">log/log_recup_info") || die ("Erreur d'ouverture du fichier");

print "Normalisation de fichiers au format iso8859-1\n";

# fichiers générées
$i = 0;
# pour chaque fichier on appelle le script correspondant
foreach $fic (@list) {
	print FICLOG `perl td1_2-1_recup_info.pl $fic`; 
	$i++;
}

$nb_fic_out = `ls LCI_2 | wc -l`;
print "Nombre de fichiers traités : $i\n"; 
print "Nombre de fichiers dans le dossier LCI_2 d'après commande Unix (wc -l) : $nb_fic_out";

close FICLOG;
