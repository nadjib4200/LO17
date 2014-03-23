#!/usr/bin/perl

$balise = shift(@ARGV);
print STDERR "création d'index pour la balise <$balise>...\n";

while (<>) {
	if (/<FICHIER>(.*)<\/FICHIER>/) {
		$fichier="\t".$1;
		$rubrique="";
		$url="";
		$index="";
	} elsif (/<(UNE|VOIRAUSSI|FOCUS|GROSTITRE|RAPPEL)>/) {
		$rubrique="\t".$1;
		$url="";
		$index="";
	} elsif (/<urlArticle>(.+\.html).*?<\/urlArticle>/i) {
		$url="\t".$1;
	} elsif (/<$balise>(.*)<\/$balise>/) {
		$index = $1;
	}
	if ($index && $fichier && $rubrique && $url) {
		$tabindex{$index} .= "$fichier$rubrique$url";
		$index="";
	}
}

@cleindex = keys %tabindex ;
foreach $index (@cleindex) {
	print $index.$tabindex{$index}."\n";
}
