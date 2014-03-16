#!/usr/bin/perl

# recupération tous les fichiers HTML dans un tableau
@list = `ls LCI_4/*.html`;
$nb_fic = @list;

open(FICLOG, ">log/log_xml") || die ("Erreur d'ouverture du fichier");
print FICLOG "Nombre de fichiers originaux : $nb_fic\n";

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
$nb_fic_gen = $i;

############################################
# test nombre fichiers traités
############################################
$nb_fic_out = `ls LCI_5 | wc -l`;
print FICLOG "Nombre de fichiers traités : $i\n"; 
print FICLOG "Nombre de fichiers dans le dossier LCI_5 d'après commande Unix (wc -l) : $nb_fic_out\n";

############################################
# test existence et unicité url partie Une
############################################
my %hash_url = ();
# construct hashmap url fichiers
foreach $fic (@list) {  
	open(FICTEST, "LCI_5/".$fic) || die ("Erreur d'ouverture du fichier");
	while ($ligne = <FICTEST>) {
		if ($ligne =~ /<UNE>/) {
			# première ligne après UNE
			$ligne = <FICTEST>;
			$ligne =~ /<urlArticle>(.*?)<\/urlArticle>/;
			$url = $1;
			@valeurs = values(%hash_url);
			for $elt (@valeurs) {
				if ($elt == $url && !elt) {
					chomp($fic);
					print FICLOG "$fic : url $url déjà trouvé dans un autre fichier.\n";
				}
			}
			$hash_url{$fic} = $url;
		}
	}
	close FICTEST;
}

############################################
# test existence et unicité titre partie Une
############################################
my %hash_titre = ();
# construct hashmap titre fichiers
foreach $fic (@list) {  
	open(FICTEST, "LCI_5/".$fic) || die ("Erreur d'ouverture du fichier");
	while ($ligne = <FICTEST>) {
		if ($ligne =~ /<UNE>/) {
			# deuxième ligne après UNE
			<FICTEST>;
			$ligne = <FICTEST>;
			$ligne =~ /<titreArticle>(.*?)<\/titreArticle>/;
			$titre = $1;
			@valeurs = values(%hash_titre);
			for $elt (@valeurs) {
				if ($elt == $titre && !elt) {
					chomp($fic);
					print FICLOG "$fic : titre $titre déjà trouvé dans un autre fichier.\n";
				}
			}
			$hash_titre{$fic} = $titre;
		}
	}
	close FICTEST;
}

############################################
# statistiques
############################################

# liste des pages qui n'ont pas de URL
@liste_fic = keys(%hash_url);
$i = 0;
foreach $fic (@liste_fic) {
	if (!$hash_url{$fic}) {
		$i++;
		chomp($fic);
		print FICLOG "$fic : n'a pas de url.\n";
	}
}
$possede_url = $nb_fic_gen - $i;
print FICLOG "Fichiers possédant une url : $possede_url/$nb_fic_gen\n";

# liste des pages qui n'ont pas de TITRE
@liste_fic = keys(%hash_titre);
$i = 0;
foreach $fic (@liste_fic) {
	if (!$hash_titre{$fic}) {
		$i++;
		chomp($fic);
		print FICLOG "$fic : n'a pas de titre.\n";
	}
}
$possede_titre = $nb_fic_gen - $i;
print FICLOG "Fichiers possédant un titre : $possede_titre/$nb_fic_gen\n";

close FICLOG;
