#!/usr/bin/perl

# ex : script.pl nom_fic
# script doit être à coté de LCI

# (1) quit unless we have the correct number of command-line args
$num_args = $#ARGV + 1;
print "Nb args : $num_args\n";
if ($num_args != 1) {
	print "Usage: script.pl nom_fic\n";
	exit;
}

# lecture args
$fichier = $ARGV[0];

print "Source : LCI_3/$fichier\n";

open(FICIN, "LCI_3/$fichier") || die ("Erreur d'ouverture du fichier");
open(FICOUT, ">LCI_4/$fichier") || die ("Erreur d'ouverture du fichier");

# lecture ligne
$ligne = <FICIN>;

print FICOUT "<PAGE_LCI>\n";
print FICOUT "<FICHIER>$fichier</FICHIER>\n";
print FICOUT "<DATE_PAGE></DATE_PAGE>\n";
print FICOUT "<UNE>\n";
	print FICOUT "<urlArticle>";
	print FICOUT "</urlArticle>\n";
	print FICOUT "<titreArticle>";
	print FICOUT "</titreArticle>\n";
	print FICOUT "<dateArticle>";
	print FICOUT "</dateArticle>\n";
	print FICOUT "<urlImage>";
	print FICOUT "</urlImage>\n";
	print FICOUT "<resumeArticle>";
	print FICOUT "</resumeArticle>\n";
	print FICOUT "<mailto>";
	print FICOUT "</mailto>\n";
	print FICOUT "<auteur>";
	print FICOUT "</auteur>\n";
print FICOUT "</UNE>\n";

print FICOUT "<LES_VOIRAUSSI>\n";
	print FICOUT "<VOIRAUSSI>\n";
		print FICOUT "<dateArticle>";
		print FICOUT "</dateArticle>\n";
		print FICOUT "<urlArticle>";
		print FICOUT "</urlArticle>\n";
		print FICOUT "<titreArticle>";
		print FICOUT "</titreArticle>\n";
	print FICOUT "</VOIRAUSSI>\n";
print FICOUT "</LES_VOIRAUSSI>\n";

print FICOUT "<FOCUS>\n";
	print FICOUT "<urlArticle>";
	print FICOUT "</urlArticle>\n";
	print FICOUT "<titreArticle>";
	print FICOUT "</titreArticle>\n";
	print FICOUT "<dateArticle>";
	print FICOUT "</dateArticle>\n";
	print FICOUT "<urlImage>";
	print FICOUT "</urlImage>\n";
	print FICOUT "<resumeArticle>";
	print FICOUT "</resumeArticle>\n";
	print FICOUT "<mailto>";
	print FICOUT "</mailto>\n";
	print FICOUT "<auteur>";
	print FICOUT "</auteur>\n";
print FICOUT "</FOCUS>\n";

print FICOUT "<LES_GROSTITIRES>\n";
	print FICOUT "<GROSTITRE>\n";
		print FICOUT "<urlArticle>";
		print FICOUT "</urlArticle>\n";
		print FICOUT "<themeArticle>";
		print FICOUT "</themeArticle>\n";
		print FICOUT "<titreArticle>";
		print FICOUT "</titreArticle>\n";
		print FICOUT "<dateArticle>";
		print FICOUT "</dateArticle>\n";
		print FICOUT "<urlImage>";
		print FICOUT "</urlImage>\n";
		print FICOUT "<resumeArticle>";
		print FICOUT "</resumeArticle>\n";
		print FICOUT "<mailto>";
		print FICOUT "</mailto>\n";
		print FICOUT "<auteur>";
		print FICOUT "</auteur>\n";
	print FICOUT "</GROSTITRE>\n";
print FICOUT "</LES_GROSTITRES>\n";

print FICOUT "<LES_RAPPELS>\n";
	print FICOUT "<RAPPEL>\n";
		print FICOUT "<dateArticle>";
		print FICOUT "</dateArticle>\n";
		print FICOUT "<themeArticle>";
		print FICOUT "</themeArticle>\n";
		print FICOUT "<urlArticle>";
		print FICOUT "</urlArticle>\n";
		print FICOUT "<titreArticle>";
		print FICOUT "</titreArticle>\n";
	print FICOUT "</RAPPEL>\n";
print FICOUT "</LES_RAPPELS>\n";

print FICOUT "</PAGE_LCI>";
