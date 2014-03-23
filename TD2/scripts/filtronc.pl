#!/usr/bin/perl

if ($ARGV[0] =~ /-v/) {
	shift(@ARGV);
	$bavard=1;
	}
while (<>) {
	chop;
	($tronc,$mot)=split(/\t/);
	$limite="2";
	while ($tronc =~ /(...*1)([$limite-9])/) {
		$tronc=$1.$2;
		$limite=$2+1;
		}
	$res = substr ($mot,0,length($tronc));
	if ($bavard==1) {
			print "$mot\t";
			}
	print $res."\n";

	}
