#!/usr/bin/perl
#****************************************************************************************#
#*                			LO17 - tronc.pl					*#
#*											*#
#* date   : 28/09/2013									*#
#*											*#
#* Ce script permet de générer la liste des successeurs pour chaque lettre des		*#
#* mots d’une liste de mots.								*#
#* Le corpus doit avoir été préalablement trié et sans doublon (sort -u nom_fichier)	*#
#*											*#
#****************************************************************************************#

#$t1 = time;

@mots=<>;							# Lecture des mots du corpus
$size = @mots;							# Nombre de mots du corpus
$begin_mot = 0;							# initialisation de l'index de début des mots du corpus à analyser
foreach $m (@mots)						# Pour chaque mots du corpus (= mot analysé)
{								#
	$m =~ s/\n/ /;						# Remplacement du retour chariot par un espace
	$m =~ tr/A-Z/a-z/;					# normalisation en minuscules
	@lettre=split(//,$m);					# Extraction des lettres du mot dans une table
	$rac="";						# Initialisation de la racine du mot à vide (racine = lecture du mot jusqu'à une certaine lettre)
	$begin=$begin_mot;					# Initialisation de l'index de début des mots du corpus qui seront comparŽs au mot analysŽ
	$find=0;						# Initialisation du booléen qui permettra de savoir qu'un premier mot avec un successeur différent a été trouvé
	foreach (@lettre)					# Pour chaque lettre du mot analysé (= lettre courante)
	{							#
	unless($_ eq ' ') {					# à moins qu'on ait lu toutes les lettres
		$rac=$rac.$_;					# Ajout de la lettre courante à la racine du mot
		%nb_succ=();					# Initialisation d'un tableau associatif qui contiendra les lettres successeurs (clé)
		$nb_succ=0;					# Initialisation de la variable qui contiendra le nombre de successeurs d'une lettre
		$i=$begin;					# Initialisation de la recherche à l'index du premier mot du corpus à comparer au mot à analyser
		while (($i<$size) && ($nb_succ<9))		# Pour chaque mots du corpus (à partir de begin)
		{						#
			$elt = @mots[$i];			# mot du corpus à comparer = mot courant
			$elt =~ s/\n/ /;			#
			$elt =~ tr/A-Z/a-z/;			# normalisation en minuscules
			if ($elt =~ /^$rac(.)/)			# Si le mot courant lu jusqu'à la lettre courante est identique au mot analysé lu jusqu'à la lettre courante
			{					#
				 if (!exists($nb_succ{$1}))	# Si une lettre successeur différente de la lettre courante du mot courant n'a pas encore été rencontrée
				{				#
					$nb_succ{$1}++;		# création d'une clé = lettre successeur de la lettre courante et d'une valeur associée
					@nb_succ = keys(%nb_succ); # tableau des différentes lettres successeurs de la lettre courante
					$nb_succ =@nb_succ;	# nombre de clés (= le nombre de lettres successeurs différentes trouvées)
					if ($nb_succ == 1)	# si c'est la premire lettre successeur trouvée
					{			#
						if ($find == 0) # si c'est la première fois qu'on trouve cette lettre successeur de la lettre courante
						{		*
							$begin_mot=$i; # ce sera nécessairement le prochain mot du corpus à analyser qui servira à initialiser le $begin correspondant
							 $find++;	# et on bloque cet indice pour la prochaine analyse
						}		#
						$begin=$i;	# on incréments l'indice du prochain mot courant à analyser
					}			#
				}				#
			}					#
			elsif ($nb_succ >=1)		# Sinon (le mot courant lu jusqu'à la lettre courante) si on avait déjà trouvé au moins une lettre successeur différente
			{					#
				$i = $size;			# inutile de continuer à chercher dans la liste
			}					#
			$i++;					# incrémentation du compteur du while sur la liste des mots
		}						#
		@nb_succ = keys(%nb_succ);			# on met à jour la table des clés de %nb_succ
		$nb_succ = @nb_succ;				# juste pour compter le nombre de clés (= le nombre de lettres successeurs différentes trouvées)
		print ("$nb_succ");				# on imprime le nombre de successeurs de la lettre courante du mot analysé
	}							# fin du unless : inutile de continuer à explorer la liste
	}							#
	print "0\t$m\n";					# on imprime le mot précédé d'un nombre de successeurs = 0 qui marque la fin des successeurs du mot
}								#

# $t2 = time;
# print "Résultat retourné en ".($t2-$t1)." s\n";
