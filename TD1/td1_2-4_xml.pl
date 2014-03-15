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

print "Source : LCI_4/$fichier\n";

open(FICIN, "LCI_4/$fichier") || die ("Erreur d'ouverture du fichier");
open(FICOUT, ">LCI_5/$fichier") || die ("Erreur d'ouverture du fichier");

print FICOUT "<PAGE_LCI>\n";

# nom fichier
print FICOUT "<FICHIER>$fichier</FICHIER>\n";

# date
$fichier =~ /(\d{4})-(\d{2})-(\d{2})/;
$date_fic = $3."/".$2."/".$1;
$date_fic_mois = $2;
$date_fic_annee = $1;
print FICOUT "<DATE_PAGE>$date_fic</DATE_PAGE>\n";

# lecture ligne UNE
$ligne = <FICIN>;
print FICOUT "<UNE>\n";
	# url
	print FICOUT "<urlArticle>";
	if ($ligne =~ /<a href="(.*)" class="S431"/) {
		$url = $1;
		print FICOUT $url;
	}
	print FICOUT "</urlArticle>\n";
	# titre
	print FICOUT "<titreArticle>";
	if ($ligne =~ /class="S431" style="line-height:normal;">(.*?)<\/a>/) {
		print FICOUT $1;
	}
	print FICOUT "</titreArticle>\n";
	# date
	print FICOUT "<dateArticle>";
	print FICOUT $date_fic;
	print FICOUT "</dateArticle>\n";
	# urlImage
	print FICOUT "<urlImage>";
	if ($ligne =~ /$url"><img src="(.+?)"/) {
		$urlImage = $1;
		print FICOUT $urlImage;
	}
	print FICOUT "</urlImage>\n";
	# resume
	print FICOUT "<resumeArticle>";
	$i = 0;
	while ($ligne =~ /class="S48"><img.*?>(.*?)<\/a>/g) {
		@resume[$i++] = $1;
	}
	foreach $elt (@resume) {
		print FICOUT $elt;
	}
	print FICOUT "</resumeArticle>\n";
	# mailto
	print FICOUT "<mailto>";
	if ($ligne =~ /mailto:(.*?)"/) {
		print FICOUT $1;
	}
	print FICOUT "</mailto>\n";
	# auteur
	print FICOUT "<auteur>";
	if ($ligne =~ /class="S14">(.*?)<\/a>/) {
		print FICOUT $1;
	}
	print FICOUT "</auteur>\n";
print FICOUT "</UNE>\n";

# lecture ligne LESVOIRAUSSI
$ligne = <FICIN>;
print FICOUT "<LES_VOIRAUSSI>\n";
	$i = 0;
	while ($ligne =~ /(class="S48">.*?)((700,600,52\);")|(<\/table>))/g) {
		$voiraussi = $1;
		print FICOUT "<VOIRAUSSI>\n";
			print FICOUT "<dateArticle>";
			if ($voiraussi =~ /\((\d{2}\/\d{2}\/\d{4})\)/) {
				print FICOUT $1;
			}
			print FICOUT "</dateArticle>\n";
			print FICOUT "<urlArticle>";
			if ($voiraussi =~ /<a href="javascript:VerifCookie\('4','(.*?\.html)'/) {
				print FICOUT $1;
			}
			print FICOUT "</urlArticle>\n";
			print FICOUT "<titreArticle>";
			if ($voiraussi =~ /class="S48">(.*?) \(.*?\)/) {
				print FICOUT $1;
			}
			print FICOUT "</titreArticle>\n";
		print FICOUT "</VOIRAUSSI>\n";
	}
print FICOUT "</LES_VOIRAUSSI>\n";

# lecture ligne FOCUS
$ligne = <FICIN>;
print FICOUT "<FOCUS>\n";
	print FICOUT "<urlArticle>";
	if ($ligne =~ /<a href="(.*?\.html)"/) {
		print FICOUT $1;
	}
	print FICOUT "</urlArticle>\n";
	print FICOUT "<titreArticle>";
	if ($ligne =~ /class="S401">(.*?)<\/a>/) {
		print FICOUT $1;
	}
	print FICOUT "</titreArticle>\n";
	print FICOUT "<dateArticle>";
	print FICOUT $date_fic;
	print FICOUT "</dateArticle>\n";
	print FICOUT "<urlImage>";
	if ($ligne =~ /.html"><img src="(.*?\.jpg)"/) {
		print FICOUT $1;
	}
	print FICOUT "</urlImage>\n";
	print FICOUT "<resumeArticle>";
	if ($ligne =~ /.html" class="S48">(.*?)<\/a>/) {
		print FICOUT $1;
	}
	print FICOUT "</resumeArticle>\n";
	print FICOUT "<mailto>";
	if ($ligne =~ /mailto:(.*?)"/) {
		print FICOUT $1;
	}
	print FICOUT "</mailto>\n";
	print FICOUT "<auteur>";
	if ($ligne =~ /class="S14">(.*?)<\/a>/) {
		print FICOUT $1;
	}
	print FICOUT "</auteur>\n";
print FICOUT "</FOCUS>\n";

# lecture ligne GROSTITRE
$ligne = <FICIN>;
print FICOUT "<LES_GROSTITIRES>\n";
	while ($ligne =~ /td valign="top"(.*?)<\/table>/g) {
		$grostitre = $1;
		print FICOUT "<GROSTITRE>\n";
			print FICOUT "<urlArticle>";
			if ($grostitre =~ /<a href="(.*?\.html)">/) {
				print FICOUT $1;
			}
			print FICOUT "</urlArticle>\n";
			print FICOUT "<themeArticle>";
			if ($grostitre =~ /<span class="S301">(.*?)<\/span>/) {
				print FICOUT $1;
			}
			print FICOUT "</themeArticle>\n";
			print FICOUT "<titreArticle>";
			if ($grostitre =~ /class="S63">(.*?)<\/a>/) {
				print FICOUT $1;
			}
			print FICOUT "</titreArticle>\n";
			print FICOUT "<dateArticle>";
			print FICOUT $date_fic;
			print FICOUT "</dateArticle>\n";
			print FICOUT "<urlImage>";
			if ($grostitre =~ /.html"><img src="(.*?\.jpg)"/) {
				print FICOUT $1;
			}
			print FICOUT "</urlImage>\n";
			print FICOUT "<resumeArticle>";
			if ($grostitre =~ /class="S48">(.*?)<\/a>/) {
				print FICOUT $1;
			}
			print FICOUT "</resumeArticle>\n";
			print FICOUT "<mailto>";
			if ($grostitre =~ /mailto:(.*?)"/) {
				print FICOUT $1;
			}
			print FICOUT "</mailto>\n";
			print FICOUT "<auteur>";
			if ($grostitre =~ /class="S14">(.*?)<\/a>/) {
				print FICOUT $1;
			}
			print FICOUT "</auteur>\n";
		print FICOUT "</GROSTITRE>\n";
	}
print FICOUT "</LES_GROSTITRES>\n";

# lecture ligne RAPPEL
$ligne = <FICIN>;
print FICOUT "<LES_RAPPELS>\n";
	while ($ligne =~ /(span class="S48">.*?)<\/table>/g) {
		$rappel = $1;
		print FICOUT "<RAPPEL>\n";
			print FICOUT "<dateArticle>";
			if ($rappel =~ /span class="S48">(\d\d) (.*?)<\/span>/) {
				#~ %mon2num = qw(
				  #~ janvier 01  février 02 mars 03  avril 04  mai 05  juin 06
				  #~ juillet 07  août 08  septembre 09  octobre 10 novembre 11 décembre 12
				#~ );
				#~ $mois = $mon2num{lc $2};
				
				$jour = $1;
				
				if ($2 =~ /janvier/) { $m = "01"; }
				if ($2 =~ /f.vrier/) { $m = "02"; }
				if ($2 =~ /mars/) { $m = "03"; }
				if ($2 =~ /avril/) { $m = "04"; }
				if ($2 =~ /mai/) { $m = "05"; }
				if ($2 =~ /juin/) { $m = "06"; }
				if ($2 =~ /juillet/) { $m = "07"; }
				if ($2 =~ /ao.t/) { $m = "08"; }
				if ($2 =~ /septembre/) { $m = "09"; }
				if ($2 =~ /octobre/) { $m = "10"; }
				if ($2 =~ /novembre/) { $m = "11"; }
				if ($2 =~ /d.cembre/) { $m = "12"; }
				
				$mois = $m;
				$an = $date_fic_annee;
				
				# si date rappel = décembre et date fic = janvier 
				if ($mois == "12" && $date_fic_mois == "01") {
					$an = $date_fic_annee - 1;
				}
				
				$date_finale = $jour."/".$mois."/".$an;
				print FICOUT $date_finale;
			}
			print FICOUT "</dateArticle>\n";
			print FICOUT "<themeArticle>";
			if ($rappel =~ /<span class="S301">(.*?)<\/span>/) {
				print FICOUT $1;
			}
			print FICOUT "</themeArticle>\n";
			print FICOUT "<urlArticle>";
			if ($rappel =~ /<a href="(.*?\.html)"/) {
				print FICOUT $1;
			}
			print FICOUT "</urlArticle>\n";
			print FICOUT "<titreArticle>";
			if ($rappel =~ /class="S63">(.*?)<\/a>/) {
				print FICOUT $1;
			}
			print FICOUT "</titreArticle>\n";
		print FICOUT "</RAPPEL>\n";
	}
print FICOUT "</LES_RAPPELS>\n";

print FICOUT "</PAGE_LCI>\n";
