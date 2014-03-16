#!/usr/bin/perl

# ex : script.pl nom_fic
# script doit être à coté de LCI

# (1) quit unless we have the correct number of command-line args
$num_args = $#ARGV + 1;
if ($num_args != 1) {
	print "Usage: script.pl nom_fic\n";
	exit;
}

# lecture args
$fichier = $ARGV[0];

print "Source : LCI_3/$fichier\n";

# test nb lignes fichier entrée
open(FICIN, "LCI_3/$fichier") || die ("Erreur d'ouverture du fichier");
$i = 0;
while ($ligne = <FICIN>) {
	$i++;
}
if ($i > 1 | $i < 1) {
	print "Le fichier d'entrée comporte 0 ou plus d'une ligne\n"; 
	print "Arrêt programme à cause d'erreur, voir fichier log\n"; 
	exit;
}
close FICIN;

# test unicité et existence rubriques
open(FICIN, "LCI_3/$fichier") || die ("Erreur d'ouverture du fichier");

$t_une = 0;
$t_avoiraussi = 0;
$t_focus = 0;
$t_grostitre = 0;
$t_rappel = 0;

$ligne = <FICIN>;
while ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27914.*?Lire l'article)/g) {
	$t_une++;
}

while ($ligne =~ /(A voir aussi :.*<!-- \/(Bloc IBL_ID|Blc)=27914)/g) {
	$t_avoiraussi++;
}

while ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27913.*<!-- \/(Bloc IBL_ID|Blc)=27913)/g) {
	$t_focus++;
}

while ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27915.*<!-- \/(Bloc IBL_ID|Blc)=27915)/g) {
	$t_grostitre++;
}

while ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27916.*<!-- \/(Bloc IBL_ID|Blc)=27916)/g) {
	$t_rappel++;
}

if ($t_une > 1) {
	print "Element Une trouvé $t_une fois dans le texte\n";
} elsif ($t_une < 1) {
	# verification fichier origine
	open(FICORIGINE, "LCI/$fichier") || die ("Erreur d'ouverture du fichier");
	$ligne = <FICORIGINE>;
	$nb = 0;
	while ($ligne = <FICORIGINE>) {
		if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27914.*?Lire l'article)/) {
			$nb++;
		}
	}	
	if ($nb > 0) {
		print "Element Une NON trouvé dans le texte alors qu'il existe dans le fichier d'origine.\n";
	} else {
		print "Element Une NON trouvé ni dans le texte ni dans le fichier d'origine.\n";
	}
	close FICORIGINE;
}
if ($t_avoiraussi > 1) {
	print "Element Avoiraussi trouvé $t_avoiraussi fois dans le texte\n";
} elsif ($t_avoiraussi < 1) {
	# verification fichier origine
	open(FICORIGINE, "LCI/$fichier") || die ("Erreur d'ouverture du fichier");
	$ligne = <FICORIGINE>;
	$nb = 0;
	while ($ligne = <FICORIGINE>) {
		if ($ligne =~ /(A voir aussi :.*<!-- \/(Bloc IBL_ID|Blc)=27914)/) {
			$nb++;
		}
	}	
	if ($nb > 0) {
		print "Element Avoiraussi NON trouvé dans le texte alors qu'il existe dans le fichier d'origine.\n";
	} else {
		print "Element Avoiraussi NON trouvé ni dans le texte ni dans le fichier d'origine.\n";
	}
	close FICORIGINE;
}
if ($t_focus > 1) {
	print "Element Focus trouvé $t_focus fois dans le texte\n";
} elsif ($t_focus < 1) {
	print "Element Focus NON trouvé dans le texte\n";
	# verification fichier origine
	open(FICORIGINE, "LCI/$fichier") || die ("Erreur d'ouverture du fichier");
	$ligne = <FICORIGINE>;
	$nb = 0;
	while ($ligne = <FICORIGINE>) {
		if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27913.*<!-- \/(Bloc IBL_ID|Blc)=27913)/) {
			$nb++;
		}
	}	
	if ($nb > 0) {
		print "Element Focus NON trouvé dans le texte alors qu'il existe dans le fichier d'origine.\n";
	} else {
		print "Element Focus NON trouvé ni dans le texte ni dans le fichier d'origine.\n";
	}
	close FICORIGINE;
}
if ($t_grostitre > 1) {
	print "Element Grostitre trouvé $t_grostitre fois dans le texte\n";
} elsif ($t_grostitre < 1) {
	print "Element Grostitre NON trouvé dans le texte\n";
	# verification fichier origine
	open(FICORIGINE, "LCI/$fichier") || die ("Erreur d'ouverture du fichier");
	$ligne = <FICORIGINE>;
	$nb = 0;
	while ($ligne = <FICORIGINE>) {
		if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27915.*<!-- \/(Bloc IBL_ID|Blc)=27915)/) {
			$nb++;
		}
	}	
	if ($nb > 0) {
		print "Element Grostitre NON trouvé dans le texte alors qu'il existe dans le fichier d'origine.\n";
	} else {
		print "Element Grostitre NON trouvé ni dans le texte ni dans le fichier d'origine.\n";
	}
	close FICORIGINE;
}
if ($t_rappel > 1) {
	print "Element Rappel trouvé $t_rappel fois dans le texte\n";
} elsif ($t_rappel < 1) {
	print "Element Rappel NON trouvé dans le texte\n";
	# verification fichier origine
	open(FICORIGINE, "LCI/$fichier") || die ("Erreur d'ouverture du fichier");
	$ligne = <FICORIGINE>;
	$nb = 0;
	while ($ligne = <FICORIGINE>) {
		if ($ligne =~ /(<!-- (Bloc IBL_ID|Blc)=27916.*<!-- \/(Bloc IBL_ID|Blc)=27916)/) {
			$nb++;
		}
	}	
	if ($nb > 0) {
		print "Element Rappel NON trouvé dans le texte alors qu'il existe dans le fichier d'origine.\n";
	} else {
		print "Element Rappel NON trouvé ni dans le texte ni dans le fichier d'origine.\n";
	}
	close FICORIGINE;
}
close FICIN;

# on se place en première ligne
open(FICIN, "LCI_3/$fichier") || die ("Erreur d'ouverture du fichier");
open(FICOUT, ">LCI_4/$fichier") || die ("Erreur d'ouverture du fichier");

# on lit la ligne
$ligne = <FICIN>;

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
