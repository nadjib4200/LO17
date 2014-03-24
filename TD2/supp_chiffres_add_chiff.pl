#!/usr/bin/perl

$stoplistechiff = "res/stopliste_chiff.txt";

open(FICCH, ">$stoplistechiff") || die ("Erreur d'ouverture du fichier");

while (<>) {
	unless(/^\d/) {
		print;
	} else {
		print FICCH $_;
	}
}
