#!/usr/bin/perl

# recupération tous les fichiers HTML dans un tableau
@list = `ls LCI/*.html`;
$nb_fic = @list;
print "Nombre de fichiers originaux : $nb_fic\n";

# on enlève le "LCI/" du nom
foreach $fic (@list) {
  $fic =~ s/LCI\///;
}

$i = 0;
# pour chaque fichier on appelle le script td1_une.pl
foreach $fic (@list) {
  `perl td1_une.pl $fic`; 
   $i++;
}

print "Nombre de fichiers générés : $i\n";