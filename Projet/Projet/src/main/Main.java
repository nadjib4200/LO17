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
		Lexique lexique = new Lexique("res/lemm_td2.txt");
		
		// requete normalisée
		String reqNormalisee = "";
		
		// mot question
		String motQuestionEnCours = "";
		
		// question
		String questionEnCours = "";

		// lecture fichier questions
		CatAmeliore fichierQuestions = new CatAmeliore("res/questions.txt");
		
		// on parcours chaque question
		while ((questionEnCours = fichierQuestions.getProchaineQuestion()) != null) {
			
			if (!questionEnCours.isEmpty()) {
				
				System.out.println("=====================================");
				System.out.println("Question : " + questionEnCours);
				System.out.println("=====================================");
				
				// requete normalisée
				reqNormalisee = "";
				
				// question en minuscules
				questionEnCours = questionEnCours.toLowerCase();
				
				/**
				 * Traitements sur la question
				 */
				// suppression du .
				questionEnCours = questionEnCours.replaceAll("\\.", "");
				// suppression du ?
				questionEnCours = questionEnCours.replaceAll("\\?", "");
				// suppression du "
				questionEnCours = questionEnCours.replaceAll("\"", "");
				// suppression du ,
				questionEnCours = questionEnCours.replaceAll(",", "");
				// suppression du ;
				questionEnCours = questionEnCours.replaceAll(";", "");
				
				// tokeniser la question 
				StringTokenizer st = new StringTokenizer(questionEnCours, " ");
	//			System.out.println("Nombre de mots saisis : " + st.countTokens());
	//			System.out.println();
				
				// parcours mots question
				while (st.hasMoreTokens()) {
					motQuestionEnCours = st.nextToken();
//					System.out.println("================== " + mot);
					
					/**
					 * Traitements sur chaque token
					 */
					// suppression du d'
					if ((motQuestionEnCours.charAt(0) == 'd') && (motQuestionEnCours.charAt(1) == '\'')) {
						motQuestionEnCours = motQuestionEnCours.replaceAll("d'", "");
					}
					// suppression du l'
					if ((motQuestionEnCours.charAt(0) == 'l') && (motQuestionEnCours.charAt(1) == '\'')) {
						motQuestionEnCours = motQuestionEnCours.replaceAll("l'", "");
					}
					// suppression du j'
					if ((motQuestionEnCours.charAt(0) == 'j') && (motQuestionEnCours.charAt(1) == '\'')) {
						motQuestionEnCours = motQuestionEnCours.replaceAll("j'", "");
					}
					
//					System.out.println("===***=============== " + mot);
					
					/**
					 *  On récupère le lemme - méthode simple
					 */
					String lemme = lexique.getLemme(motQuestionEnCours);
					// lemme exist
					if (lemme != null) {
	//					System.out.println("Ce mot est dans le lexique, son lemme est : " + lemme);
						// on prend le lemme trouvé
						reqNormalisee = reqNormalisee.concat(lemme + " ");
					// prefix
					} else {
						/**
						 * On récupère liste lemmes - méthode préfix
						 */
						HashMap<String, Integer> resPrefix = lexique.getPrefixList(motQuestionEnCours);
						if (!resPrefix.isEmpty()) {
	//						System.out.println("[Méthode préfixe] La liste des meilleurs lemmes candidats :");
	//						Lexique.afficherLemmProxBest(resPrefix);
							// par défaut on prend le premier lemme trouvé
							String lemmeChoisi = resPrefix.keySet().iterator().next();
	//						System.out.println("Lemme choisi : " + lemmeChoisi);
							reqNormalisee = reqNormalisee.concat(lemmeChoisi + " ");
						// Levenshtein
						} else {
							/**
							 * On récupère liste lemmes - méthode levenshtein
							 */
							HashMap<String, Integer> resLev = lexique.getLevenshteinList(motQuestionEnCours);
							if (!resLev.isEmpty()) {
	//							System.out.println("[Méthode Levenshtein] La liste des meilleurs lemmes candidats :");
	//							Lexique.afficherLemmLevenshteinBest(resLev);
								// par défaut on prend le premier lemme trouvé
								String lemmeChoisi = resLev.keySet().iterator().next();
	//							System.out.println("Lemme choisi : " + lemmeChoisi);
								reqNormalisee = reqNormalisee.concat(lemmeChoisi + " ");
							// retourne mot
							} else {
								/**
								 * On retourne le mot
								 */
	//							System.out.println("Aucun mot n'a été trouvé.");
								reqNormalisee = reqNormalisee.concat(motQuestionEnCours + " ");
							}
						}
					}
				}
				

				/**
				 * Quelques traitements sur la requete normalisée
				 * 
				 * on supprime espace début, fin de chaine (trim)
				 * et les espaces en trop
				 * et on ajoute le point à la fin s'il n'y est pas
				 */
				reqNormalisee = reqNormalisee.trim();
				reqNormalisee = reqNormalisee.replaceAll(" {2,}"," ");
				if (!(reqNormalisee.charAt(reqNormalisee.length() - 1) == '.')) {
					reqNormalisee = reqNormalisee.concat(".");
				}
				
				/**
				 * Affichage requete normalisée
				 */
				System.out.println("=====================================");
				System.out.println("Requête normalisée : " + reqNormalisee);
				System.out.println("=====================================");
				
				/**
				 * Requete normalisée => affichage requete sql
				 */
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
