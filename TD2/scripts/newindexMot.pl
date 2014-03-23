#!/usr/bin/perl

#$balise = shift(@ARGV);
while (<>) {
	chop;
	($mot,$fic,$rub,$art) = split (/\t/);
	$tabindex{$mot} = $tabindex{$mot}."\t".$fic."\t".$rub."\t".$art;
	}
@cleindex = keys %tabindex ;
foreach (@cleindex) {
	print $_."\t".$tabindex{$_}."\n";
	}
