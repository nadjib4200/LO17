#!/usr/bin/perl

# recupération tous les fichiers HTML dans un tableau
@list = `ls LCI_4/*.html`;
$nb_fic = @list;
print "Nombre de fichiers originaux : $nb_fic\n";

# on enlève le "LCI_4/" du nom
foreach $fic (@list) {
  $fic =~ s/LCI_4\///;
}

# fichiers générées
$i = 0;
# pour chaque fichier on appelle le script correspondant
foreach $fic (@list) {
  `perl td1_2-4_xml.pl $fic`;
   $i++;
}

$nb_fic_out = `ls LCI_5 | wc -l`;
print "Nombre de fichiers traités : $i\n"; 
print "Nombre de fichiers dans le dossier LCI_5 d'après commande Unix (wc -l) : $nb_fic_out";
