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
			// proximité
			} else {
				HashMap<String, Integer> res = lex.getPrefixList(mot);
				if (!res.isEmpty()) {
					System.out.println("Les préfixes :");
					Lexique.afficherLemmProxBest(res);
				// levanstein
				} else {
					
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
