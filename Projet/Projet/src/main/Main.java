package main;
import java.io.StringReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.output.tal_sqlLexer;
import antlr.output.tal_sqlParser;
import sql.annexe.CatAmeliore;
import sql.lexique.Lexique;


public class Main {

	public static void main(String[] args) {
		
		// lexique
		Lexique lexique = new Lexique();
		
		// lecture fichier questions
		CatAmeliore fichierQuestions = new CatAmeliore("res/questions.txt");

		String questionEnCours = "";
		
		// on parcours chaque question
		while ((questionEnCours = fichierQuestions.getProchaineQuestion()) != null) {
			
			System.out.println("Question : " + questionEnCours);
			
			if (!questionEnCours.isEmpty()) {
		
				// requete normalisée
				String reqNormalisee = "";
				
				// tokeniser la question 
				StringTokenizer st = new StringTokenizer(questionEnCours, " ");
	//			System.out.println("Nombre de mots saisis : " + st.countTokens());
	//			System.out.println();
				
				// parcours mots question
				while (st.hasMoreTokens()) {
					String mot = st.nextToken().toLowerCase();
	//				System.out.println("================== " + mot);
					String lemme = lexique.getLemme(mot);
					// lemme exist
					if (lemme != null) {
	//					System.out.println("Ce mot est dans le lexique, son lemme est : " + lemme);
						// on prend le lemme trouvé
						reqNormalisee = reqNormalisee.concat(lemme + " ");
					// prefix
					} else {
						HashMap<String, Integer> resPrefix = lexique.getPrefixList(mot);
						if (!resPrefix.isEmpty()) {
	//						System.out.println("[Méthode préfixe] La liste des meilleurs lemmes candidats :");
	//						Lexique.afficherLemmProxBest(resPrefix);
							// par défaut on prend le premier lemme trouvé
							String lemmeChoisi = resPrefix.keySet().iterator().next();
	//						System.out.println("Lemme choisi : " + lemmeChoisi);
							reqNormalisee = reqNormalisee.concat(lemmeChoisi + " ");
						// Levenshtein
						} else {
							HashMap<String, Integer> resLev = lexique.getLevenshteinList(mot);
							if (!resLev.isEmpty()) {
	//							System.out.println("[Méthode Levenshtein] La liste des meilleurs lemmes candidats :");
	//							Lexique.afficherLemmLevenshteinBest(resLev);
								// par défaut on prend le premier lemme trouvé
								String lemmeChoisi = resLev.keySet().iterator().next();
	//							System.out.println("Lemme choisi : " + lemmeChoisi);
								reqNormalisee = reqNormalisee.concat(lemmeChoisi + " ");
							// retourne mot
							} else {
	//							System.out.println("Aucun mot n'a été trouvé.");
								reqNormalisee = reqNormalisee.concat(mot + " ");
							}
						}
					}
				}
				
				// on supprime espace début, fin de chaine 
				// et les espaces en trop
				// et on ajoute le point à la fin
				reqNormalisee = reqNormalisee.trim();
				reqNormalisee = reqNormalisee.replaceAll(" {2,}"," ");
				if (!(reqNormalisee.charAt(reqNormalisee.length() - 1) == '.')) {
					reqNormalisee = reqNormalisee.concat(".");
				}
				System.out.println("=====================================");
				System.out.println("Requête normalisée : " + reqNormalisee);
				System.out.println("=====================================");
				
				// requete normalisée => affichage arbre
		    	try{
		    		tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(reqNormalisee)));
		      		CommonTokenStream tokens = new CommonTokenStream(lexer);
					tal_sqlParser parser = new tal_sqlParser(tokens);
					String arbre = parser.listerequetes();
					System.out.println(arbre);
		    	} catch(Exception e) {  }
		    
		    	System.out.println();
			
			}
		}
		
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
