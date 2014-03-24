#!/usr/bin/perl

$corpus = "CORPUS/corpus_lemmatise.xml";

print "====Fichiers inverses====\n";

# Etape 1 : création table inverse pour les balises du corpus
print "Etape 1 (création table inverse pour les balises du corpus)\n";
@balises = ("titreArticle", "dateArticle", "urlImage", "resumeArticle", "mailto", "auteur", "themeArticle");
foreach $bal (@balises) {
	`perl scripts/index.pl $bal $corpus > res_inv/inverse_$bal.txt`;
}

# Etape 2 : création table inverse à partir d'un flux données
print "Etape 2 (création table inverse à partir d'un flux données)\n";
`cat $corpus | perl scripts/newsegmente.pl -f -a -t | perl scripts/newindexMot.pl > res_inv/inverse.txt`;
