#!/usr/bin/perl

# recupération tous les fichiers HTML dans un tableau
@list = `ls LCI_2/*.html`;
$nb_fic = @list;
print "Nombre de fichiers originaux : $nb_fic\n";

# on enlève le "LCI_2/" du nom
foreach $fic (@list) {
  $fic =~ s/LCI_2\///;
}

# fichiers générées
$i = 0;
# pour chaque fichier on appelle le script td1_2-2_une_ligne.pl
foreach $fic (@list) {
  `perl td1_2-2_une_ligne.pl $fic`; 
   $i++;
}

print "Nombre de fichiers générés : $i\n";
