package main;
import java.util.HashMap;
import java.util.StringTokenizer;

import lexique.Lexique;
import annexe.Saisie;


public class Main {

	public static void main(String[] args) {
		
		// lexique
		Lexique lex = new Lexique();
		
		// lire et tokeniser requete 
		String requete = Saisie.lireRequete();
		StringTokenizer st = new StringTokenizer(requete, " ");
		System.out.println("Nombre de mots saisis : " + st.countTokens());
		System.out.println();
		
		// parcours mots requete
		while (st.hasMoreTokens()) {
			String mot = st.nextToken().toLowerCase();
			System.out.println("================== " + mot);
			String lemme = lex.getLemme(mot);
			// lemme exist
			if (lemme != null) {
				System.out.println("Lemme trouvé : " + mot + " = " + lemme);
			// prefix
			} else {
				HashMap<String, Integer> resPrefix = lex.getPrefixList(mot);
				if (!resPrefix.isEmpty()) {
					System.out.println("Les préfixes :");
					Lexique.afficherLemmProxBest(resPrefix);
				// Levenshtein
				} else {
					HashMap<String, Integer> resLev = lex.getLevenshteinList(mot);
					if (!resLev.isEmpty()) {
						System.out.println("Les couts Levenshtein sont :");
						Lexique.afficherLemmLevenshteinBest(resLev);
					// retourne mot
					} else {
						System.out.println("Aucun mot n'a été trouvé.");
					}
				}
			}
			System.out.println();
		}
		
		// lire requete LN
		// tokeniser requete
		// lire chaque mot
			// IF et ELSE
				// lexique.retournerLemme(mot)
				// lexique.prefixe(mot)
				// lexique.levenshtein(mot)
			// Si rien trouvé, retourner mot
	}

}
