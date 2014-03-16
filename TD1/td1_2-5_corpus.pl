#!/usr/bin/perl

# recupération tous les fichiers HTML dans un tableau
@list = `ls LCI_5/*.html`;
$nb_fic = @list;
print "Nombre de fichiers originaux : $nb_fic\n";

open(FICOUT, ">CORPUS/corpus.xml") || die ("Erreur d'ouverture du fichier");

print FICOUT "<CORPUS>\n";

# fichiers générées
$i = 0;
# on concatène chaque fichier
foreach $fic (@list) {
	print FICOUT `cat $fic`;
	$i++;
}

print FICOUT "</CORPUS>\n";

$nb_fic_out = `ls CORPUS | wc -l`;
print "Nombre de fichiers traités : $i\n"; 
print "Nombre de fichiers dans le dossier XML d'après commande Unix (wc -l) : $nb_fic_out";

close FICOUT;
