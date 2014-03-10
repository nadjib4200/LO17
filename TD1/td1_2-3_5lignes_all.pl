#!/usr/bin/perl

# recupération tous les fichiers HTML dans un tableau
@list = `ls LCI_3/*.html`;
$nb_fic = @list;
print "Nombre de fichiers originaux : $nb_fic\n";

# on enlève le "LCI_3/" du nom
foreach $fic (@list) {
  $fic =~ s/LCI_3\///;
}

# fichiers générées
$i = 0;
# pour chaque fichier on appelle le script td1_2-3_5lignes.pl
foreach $fic (@list) {
  `perl td1_2-3_5lignes.pl $fic`; 
   $i++;
}

print "Nombre de fichiers générés : $i\n";
