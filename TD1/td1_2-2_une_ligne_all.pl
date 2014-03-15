#!/usr/bin/perl

# recupération tous les fichiers HTML dans un tableau
@list = `ls LCI_2/*.html`;
$nb_fic = @list;
print "Nombre de fichiers originaux : $nb_fic\n";

open(FICLOG, ">log/log_une_ligne") || die ("Erreur d'ouverture du fichier");

# on enlève le "LCI_2/" du nom
foreach $fic (@list) {
  $fic =~ s/LCI_2\///;
}

# fichiers générées
$i = 0;
# pour chaque fichier on appelle le script correspondant
foreach $fic (@list) {
  print FICLOG `perl td1_2-2_une_ligne.pl $fic`; 
   $i++;
}

$nb_fic_out = `ls LCI_3 | wc -l`;
print "Nombre de fichiers traités : $i\n"; 
print "Nombre de fichiers dans le dossier LCI_3 d'après commande Unix (wc -l) : $nb_fic_out";

close FICLOG;
