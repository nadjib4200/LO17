#!/usr/bin/perl

while (<>) {
	chomp();
	/(\d+)\s/;
	# récupère nombre (df) et calcul idf
	print $' . "\t" . log(328 / $1) . "\n";
}
