#!/usr/bin/perl

# ex : script.pl nom_fic
# script doit être à coté de LCI

############################################
# Lecture args
############################################
$num_args = $#ARGV + 1;
if ($num_args != 1) {
	print "Usage: script.pl nom_fic\n";
	exit;
}
$fichier = $ARGV[0];
chomp($fichier);

############################################
# test une seule ligne fichier entrée
############################################
open(FICIN, "LCI_3/$fichier") || die ("Erreur d'ouverture du fichier");
$i = 0;
while ($ligne = <FICIN>) {
	$i++;
}
if ($i > 1 | $i < 1) {
	print "$fichier : Le fichier d'entrée comporte 0 ou plus d'une ligne\n"; 
	print "$fichier : Arrêt programme à cause d'erreur, voir fichier log\n"; 
	exit;
}
close FICIN;

############################################
# test existence et unicité rubriques
############################################
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
	print "$fichier : Element Une trouvé $t_une fois dans le texte\n";
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
		print "$fichier : Element Une NON trouvé dans le texte alors qu'il existe dans le fichier d'origine.\n";
	} else {
		print "$fichier : Element Une NON trouvé ni dans le texte ni dans le fichier d'origine.\n";
	}
	close FICORIGINE;
}
if ($t_avoiraussi > 1) {
	print "$fichier : Element Avoiraussi trouvé $t_avoiraussi fois dans le texte\n";
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
		print "$fichier : Element Avoiraussi NON trouvé dans le texte alors qu'il existe dans le fichier d'origine.\n";
	} else {
		print "$fichier : Element Avoiraussi NON trouvé ni dans le texte ni dans le fichier d'origine.\n";
	}
	close FICORIGINE;
}
if ($t_focus > 1) {
	print "$fichier : Element Focus trouvé $t_focus fois dans le texte\n";
} elsif ($t_focus < 1) {
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
		print "$fichier : Element Focus NON trouvé dans le texte alors qu'il existe dans le fichier d'origine.\n";
	} else {
		print "$fichier : Element Focus NON trouvé ni dans le texte ni dans le fichier d'origine.\n";
	}
	close FICORIGINE;
}
if ($t_grostitre > 1) {
	print "$fichier : Element Grostitre trouvé $t_grostitre fois dans le texte\n";
} elsif ($t_grostitre < 1) {
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
		print "$fichier : Element Grostitre NON trouvé dans le texte alors qu'il existe dans le fichier d'origine.\n";
	} else {
		print "$fichier : Element Grostitre NON trouvé ni dans le texte ni dans le fichier d'origine.\n";
	}
	close FICORIGINE;
}
if ($t_rappel > 1) {
	print "$fichier : Element Rappel trouvé $t_rappel fois dans le texte\n";
} elsif ($t_rappel < 1) {
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
		print "$fichier : Element Rappel NON trouvé dans le texte alors qu'il existe dans le fichier d'origine.\n";
	} else {
		print "$fichier : Element Rappel NON trouvé ni dans le texte ni dans le fichier d'origine.\n";
	}
	close FICORIGINE;
}
close FICIN;

############################################
# traitement
############################################
open(FICIN, "LCI_3/$fichier") || die ("Erreur d'ouverture du fichier");
open(FICOUT, ">LCI_4/$fichier") || die ("Erreur d'ouverture du fichier");
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
