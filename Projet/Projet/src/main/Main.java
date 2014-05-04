package main;
import java.io.StringReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.output.tal_sqlLexer;
import antlr.output.tal_sqlParser;
import sql.annexe.Saisie;
import sql.lexique.Lexique;


public class Main {

	public static void main(String[] args) {
		
		// lexique
		Lexique lex = new Lexique();
		
		// requete normalisée
		String reqNormalisee = "";
		
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
				System.out.println("Ce mot est dans le lexique, son lemme est : " + lemme);
				// on prend le lemme trouvé
				reqNormalisee = reqNormalisee.concat(lemme + " ");
			// prefix
			} else {
				HashMap<String, Integer> resPrefix = lex.getPrefixList(mot);
				if (!resPrefix.isEmpty()) {
					System.out.println("[Méthode préfixe] La liste des meilleurs lemmes candidats :");
					Lexique.afficherLemmProxBest(resPrefix);
					// par défaut on prend le premier lemme trouvé
					String lemmeChoisi = resPrefix.keySet().iterator().next();
					System.out.println("Lemme choisi : " + lemmeChoisi);
					reqNormalisee = reqNormalisee.concat(lemmeChoisi + " ");
				// Levenshtein
				} else {
					HashMap<String, Integer> resLev = lex.getLevenshteinList(mot);
					if (!resLev.isEmpty()) {
						System.out.println("[Méthode Levenshtein] La liste des meilleurs lemmes candidats :");
						Lexique.afficherLemmLevenshteinBest(resLev);
						// par défaut on prend le premier lemme trouvé
						String lemmeChoisi = resLev.keySet().iterator().next();
						System.out.println("Lemme choisi : " + lemmeChoisi);
						reqNormalisee = reqNormalisee.concat(lemmeChoisi + " ");
					// retourne mot
					} else {
						System.out.println("Aucun mot n'a été trouvé.");
						reqNormalisee = reqNormalisee.concat(mot + " ");
					}
				}
			}
			System.out.println();
		}
		
		// on supprime le dernier espace et on ajoute le point à la fin
		reqNormalisee = reqNormalisee.trim();
		reqNormalisee = reqNormalisee.concat(".");
		System.out.println("resultat : " + reqNormalisee);
		
		// requete normalisée => affichage arbre
    	try{
    		tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(reqNormalisee)));
      		CommonTokenStream tokens = new CommonTokenStream(lexer);
			tal_sqlParser parser = new tal_sqlParser(tokens);
			String arbre = parser.listerequetes();
			System.out.println(arbre);
      } catch(Exception e) {  }
		
		
    	/**
    	 * ALGORITHME DU DESSUS
    	 */		
		// lire requete LN
		// tokeniser requete
		// lire chaque mot
			// IF et ELSE
				// lexique.retournerLemme(mot)
				// lexique.prefixe(mot)
				// lexique.levenshtein(mot)
			// Si rien trouvé, retourner mot
    	
//		System.out.println("Coût Levenshtein : " + lex.calculCoutLev("abcdefgh", "abbcc"));
	}

}
