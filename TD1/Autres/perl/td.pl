#!/usr/bin/perl

# filehandle (descripteur de fichier) : STDIN et STDOUT

#Lorsque le nom du fichier n'est précédé d'aucun signe particulier il s'agit d'une ouverture en lecture seule.
#Lorsque le nom du fichier est précédé du signe supérieur > il s'agit d'une création de fichier.
#Lorsque le nom du fichier est précédé du double signe supérieur >> il s'agit d'une ouverture en écriture.

# (1) quit unless we have the correct number of command-line args
$num_args = $#ARGV + 1;
print "Nb args : $num_args\n";
if ($num_args != 1) {
	print "Usage: td.pl nom_balise\n";
	exit;
}

# lecture argument
$nom_balise = $ARGV[0];
print "Balise dont le contenu est à extraire : $nom_balise \n\n";

open(FILE, "sa_b.tei") || die ("Erreur d'ouverture du fichier");

$lig = 0;
$nb_biblio = 0;
my @t = ();
$i = 0;
%tab;	#tableau associatif : cle = nom de balise, valeur = nb d'occurences

# parcours ligne par ligne
while ($ligne = <FILE>) {
    #~ print STDOUT ++$lig.".] ".$ligne;
    # test nb entrées bibliographiques
    if (index($ligne, '<bibl') != -1) {
		$nb_biblio++;
	}
	# extraction contenu balise
	if ($ligne =~ m#<$nom_balise>(.*)</$nom_balise>#) {
		@t[$i++] = $1;
	}

	$ligne =~ s/>(.*?)</></g;			#retire tout le texte compris entre 2 balises
	$ligne =~ s/<\/(.+?)>//g;			# retire toutes les balises fermantes du texte
	$ligne =~ s/<(.+?)\s(.+?)>/<$1>/g;  # retire toutes les balises epurees de leur eventuels arguments
	print "$ligne";

	while ($ligne =~ /<(.+?)>/g) {		# lit tout ce qui se trouve entre chevron. Le ? permet de parcourir la ligne 1 balise a la fois
		$tab{$1}++;						# ajoute la cle dans la table des cles, si elle n'y est pas et incremente le compteur associe
	}
}

print "Il y a $nb_biblio entrées bibliographiques dans le fichier.\n";

print "\nRésultat extraction contenu : \n";
foreach $v (@t) {
	print $v."\n";
}

print "\nRésultat extraction balises : \n";
@cles = keys(%tab);		# recupere la liste des cles
@cles = sort (@cles);	# trie la liste des cles
foreach $elt (@cles) {	# affichage
	print "$elt \n";
}

close(FILE);
