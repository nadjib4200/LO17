#!/usr/bin/perl

use Unicode::String qw(utf8 latin1);

# spécifie le format par défaut des chaînes en entrée
Unicode::String->stringify_as('utf8');

while(<>) {

  # convertir la ligne DOCTYPE .. UTF-8 en DOCTYPE .. iso8859-1
  # pour que le document converti puisse toujours
  # être affiché correctement par un navigateur
  (/DOCTYPE HTML/) && (s/[Uu][Tt][Ff]\-8/iso8859-1/);

  # instancier la chaîne en objet au format "neutre"
  $u = Unicode::String->new($_);

  # rendre la chaîne sous un format iso8859-1
  print $u->latin1;

}

