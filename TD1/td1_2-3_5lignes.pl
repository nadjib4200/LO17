#!/usr/bin/perl

# ex : script.pl nom_fic
# script doit être à coté de LCI

use Data::Dumper;

# (1) quit unless we have the correct number of command-line args
$num_args = $#ARGV + 1;
if ($num_args != 1) {
	print "Usage: script.pl nom_fic\n";
	exit;
}

# lecture args
$fichier = $ARGV[0];

print "Source : LCI_3/$fichier\n";

open(FICIN, "LCI_3/$fichier") || die ("Erreur d'ouverture du fichier");
open(FICOUT, ">LCI_4/$fichier") || die ("Erreur d'ouverture du fichier");

$t_une = 0;
$t_avoiraussi = 0;
$t_focus = 0;
$t_grostitre = 0;
$t_rappel = 0;

# test
$ligne = <FICIN>;
$i = 0;
@res = ();
while ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27914.*?Lire l'article)/g) {
	@res[$i++] = $1;
}
$t_une = $#res + 1;
#~ print Dumper(@res);

$i = 0;
@res = ();
while ($ligne =~ /(A voir aussi :.*<!-- \/(Bloc IBL_ID|Blc)=27914)/g) {
	@res[$i++] = $1;
}
$t_avoiraussi = $#res + 1;
#~ print Dumper(@res);

$i = 0;
@res = ();
while ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27913.*<!-- \/(Bloc IBL_ID|Blc)=27913)/g) {
	@res[$i++] = $1;
}
$t_focus = $#res + 1;
#~ print Dumper(@res);

$i = 0;
@res = ();
while ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27915.*<!-- \/(Bloc IBL_ID|Blc)=27915)/g) {
	@res[$i++] = $1;
}
$t_grostitre = $#res + 1;
#~ print Dumper(@res);

$i = 0;
@res = ();
while ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27916.*<!-- \/(Bloc IBL_ID|Blc)=27916)/g) {
	@res[$i++] = $1;
}
$t_rappel = $#res + 1;
#~ print Dumper(@res);

$t_err = 0;
if ($t_une > 1) {
	print "Element Une trouvé $t_une fois dans le texte\n";
	$t_err = 1;
} elsif ($t_une < 1) {
	print "Element Une NON trouvé dans le texte\n";
	$t_err = 1;
}
if ($t_avoiraussi > 1) {
	print "Element Avoiraussi trouvé $t_avoiraussi fois dans le texte\n";
	$t_err = 1;
} elsif ($t_avoiraussi < 1) {
	print "Element Avoiraussi NON trouvé dans le texte\n";
	$t_err = 1;
}
if ($t_focus > 1) {
	print "Element Focus trouvé $t_focus fois dans le texte\n";
	$t_err = 1;
} elsif ($t_focus < 1) {
	print "Element Focus NON trouvé dans le texte\n";
	$t_err = 1;
}
if ($t_grostitre > 1) {
	print "Element Grostitre trouvé $t_grostitre fois dans le texte\n";
	$t_err = 1;
} elsif ($t_grostitre < 1) {
	print "Element Grostitre NON trouvé dans le texte\n";
	$t_err = 1;
}
if ($t_rappel > 1) {
	print "Element Rappel trouvé $t_rappel fois dans le texte\n";
	$t_err = 1;
} elsif ($t_rappel < 1) {
	print "Element Rappel NON trouvé dans le texte\n";
	$t_err = 1;
}

#~ # erreur
#~ if ($t_err > 0) {
	#~ print "Arrêt programme à cause d'erreur, voir fichier log\n"; 
	#~ exit;
#~ }

# on se place en première ligne
close FICIN;
open(FICIN, "LCI_3/$fichier") || die ("Erreur d'ouverture du fichier");

print FICOUT "<UNE>";
# if "une" existe
if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27914.*?Lire l'article)/) {
	print FICOUT $1;
}
print FICOUT "</UNE>\n";

print FICOUT "<LES_VOIRAUSSI>";
# if "à voir aussi" existe
if ($ligne =~ /(A voir aussi :.*<!-- \/(Bloc IBL_ID|Blc)=27914)/) {
	print FICOUT $1;
}
print FICOUT "</LES_VOIRAUSSI>\n";

print FICOUT "<FOCUS>";
# if "focus" existe
if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27913.*<!-- \/(Bloc IBL_ID|Blc)=27913)/) {
	print FICOUT $1;
}
print FICOUT "</FOCUS>\n";

print FICOUT "<LES_GROSTITIRES>";
# if "grostitre" existe
if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27915.*<!-- \/(Bloc IBL_ID|Blc)=27915)/) {
	print FICOUT $1;
}
print FICOUT "</LES_GROSTITRES>\n";

print FICOUT "<LES_RAPPELS>";
# if "rappel" existe
if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27916.*<!-- \/(Bloc IBL_ID|Blc)=27916)/) {
	print FICOUT $1;	
}
print FICOUT "</LES_RAPPELS>\n";

close FICIN;
close FICOUT;
