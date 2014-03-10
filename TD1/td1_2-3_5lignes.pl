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
open(FICLOG, ">log/log_5lignes") || die ("Erreur d'ouverture du fichier");

# lecture ligne
$ligne = <FICIN>;

print FICOUT "<UNE>";
# if "une" existe
if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27914.*Lire l'article)/) {
	print FICOUT $1;
} else {
	print FICLOG "$fichier : 'La Une' n'existe pas\n";
}
print FICOUT "</UNE>\n";

print FICOUT "<LES_VOIRAUSSI>";
# if "à voir aussi" existe
if ($ligne =~ /(A voir aussi :.*<!-- \/(Bloc IBL_ID|Blc)=27914)/) {
	print FICOUT $1;
} else {
	print FICLOG "$fichier : 'A voir aussi' n'existe pas\n";
}
print FICOUT "</LES_VOIRAUSSI>\n";


print FICOUT "<FOCUS>";
# if "focus" existe
if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27913.*<!-- \/(Bloc IBL_ID|Blc)=27913)/) {
	print FICOUT $1;
} else {
	print FICLOG "$fichier : Le 'focus' n'existe pas\n";
}
print FICOUT "</FOCUS>\n";

print FICOUT "<LES_GROSTITIRES>";
# if "grostitre" existe
if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27915.*<!-- \/(Bloc IBL_ID|Blc)=27915)/) {
	print FICOUT $1;
} else {
	print FICLOG "$fichier : 'Les gros titres' n'existe pas\n";
}
print FICOUT "</LES_GROSTITRES>\n";

print FICOUT "<LES_RAPPELS>";
# if "rappel" existe
if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27916.*<!-- \/(Bloc IBL_ID|Blc)=27916)/) {
	print FICOUT $1;	
} else {
	print FICLOG "$fichier : 'Les rappels' n'existe pas\n";
}
print FICOUT "</LES_RAPPELS>\n";

print "\nEND\n";
