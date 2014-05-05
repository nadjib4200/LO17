package main;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.output.tal_sqlLexer;
import antlr.output.tal_sqlParser;
import sql.annexe.CatAmeliore;
import sql.lexique.LexiqueCorpus;
import sql.lexique.LexiqueSimple;


public class Main {

	/**
	 * 
	 * @param value
	 * @param prodNames
	 * @return
	 */
	public static boolean search(String value, List<String> prodNames) {
	    for (String name : prodNames) {
	        if (name.equals(value)) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		
		// les lexiques
		LexiqueCorpus lexiqueLemmes = new LexiqueCorpus();
		LexiqueSimple lexiquePivot = new LexiqueSimple("res/dic_pivot.txt");
		LexiqueSimple lexiqueStop = new LexiqueSimple("res/stopliste.txt");
		
		// strings
		String questionEnCours = "";
		String motQuestionEnCours = "";
		String reqNormalisee = "";

		// lecture fichier questions
		CatAmeliore fichierQuestions = new CatAmeliore("res/questions.txt");
		
		// liste des mots pivot
		ArrayList<String> listeMotsPivot = new ArrayList<String>();
		
		// on parcours chaque question
		while ((questionEnCours = fichierQuestions.getProchaineQuestion()) != null) {
			
			if (!questionEnCours.trim().isEmpty()) {
				
				System.out.println("=====================================");
				
				System.out.println("Question : " + questionEnCours);
				
				// requete normalisée
				reqNormalisee = "";
				
				// init liste mots pivot
				listeMotsPivot = new ArrayList<String>();
				
				// question en minuscules
				questionEnCours = questionEnCours.toLowerCase();
				
				/**
				 * Traitements sur la question
				 */
				
				// suppression des caractères spéciaux + ponctuation
//				questionEnCours = questionEnCours.replaceAll("[\\p{Punct}ÀÁÂÄÇÈÉÊËÌÍÎÏÑÒÓÔÕÖÙÚÛÜÝàáâãäçèéêëìíîïñòóôõöùúûüýÿ]", "");
				
				// suppression du .
				questionEnCours = questionEnCours.replaceAll("\\.", "");
				// suppression du ?
				questionEnCours = questionEnCours.replaceAll("\\?", "");
				// suppression du !
				questionEnCours = questionEnCours.replaceAll("\\!", "");
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
					motQuestionEnCours = "";
					motQuestionEnCours = st.nextToken();
					
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
					
//					System.out.println("===***=============== " + motQuestionEnCours);
					
					// on traite seulement les mots d'au moins 2 lettres
					if (motQuestionEnCours.length() > 1) {
						if (lexiqueStop.getValeur(motQuestionEnCours) != null) {
							reqNormalisee = reqNormalisee.concat(lexiqueStop.getValeur(motQuestionEnCours) + " ");
//							System.out.println(motQuestionEnCours + " > stop mot");
						} else {
							if (lexiquePivot.getValeur(motQuestionEnCours) != null) {
								String motPivot = lexiquePivot.getValeur(motQuestionEnCours);
								// on ajoute le nouveau mot pivot dans la liste 
								if (!search(motPivot, listeMotsPivot)) {
									reqNormalisee = reqNormalisee.concat(motPivot + " ");
									listeMotsPivot.add(motPivot);
//									System.out.println("ajout pivot > " + motPivot);
								} else { // mot pivot déjà existant, on ajoute le mot lui-même
//									System.out.println("pivot déjà existant > " + motPivot);
									reqNormalisee = reqNormalisee.concat(motQuestionEnCours + " ");
								}
							} else {
								/**
								 *  On récupère le lemme - méthode simple
								 */
								String lemme = lexiqueLemmes.getLemme(motQuestionEnCours);
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
									HashMap<String, Integer> resPrefix = lexiqueLemmes.getPrefixList(motQuestionEnCours);
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
										HashMap<String, Integer> resLev = lexiqueLemmes.getLevenshteinList(motQuestionEnCours);
										if (!resLev.isEmpty()) {
				//							System.out.println("[Méthode Levenshtein] La liste des meilleurs lemmes candidats :");
//											Lexique.afficherLemmLevenshteinBest(resLev);
											// par défaut on prend le premier lemme trouvé
											String lemmeChoisi = resLev.keySet().iterator().next();
//											System.out.println("Lemme choisi : " + lemmeChoisi);
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
						}
					}
				}
				
				/**
				 * Affichage requete normalisée 1
				 */
				System.out.println("Requête normalisée 1 : " + reqNormalisee);
				
				/**
				 * Quelques traitements sur la requete normalisée
				 * 
				 * on supprime les "stop"
				 * on supprime espace début, fin de chaine (trim)
				 * et les espaces en trop
				 * et on ajoute le point à la fin s'il n'y est pas
				 */
				reqNormalisee = reqNormalisee.replaceAll("stop", "");
				reqNormalisee = reqNormalisee.trim();
				reqNormalisee = reqNormalisee.replaceAll(" {2,}"," ");
				if (!(reqNormalisee.charAt(reqNormalisee.length() - 1) == '.')) {
					reqNormalisee = reqNormalisee.concat(".");
				}
				
				/**
				 * Affichage requete normalisée 2
				 */
				System.out.println("Requête normalisée 2 : " + reqNormalisee);
				
				
				/**
				 * Ajout des conjoctions sur requete normalisée finale
				 */
				
				// tokeniser la requete
				StringTokenizer st2 = new StringTokenizer(reqNormalisee, " ");
				StringTokenizer st3 = new StringTokenizer(reqNormalisee, " ");
				
				String reqNormalisee2 = "";

				boolean isEt = false;
				boolean isOu = false;
				
				ArrayList<String> etListe = new ArrayList<String>();
				etListe.add("titre");
				etListe.add("theme");
				etListe.add("mot");
				
				ArrayList<String> ouListe = new ArrayList<String>();
				ouListe.add("date");
				ouListe.add("email");
				
				ArrayList<String> etouListe = new ArrayList<String>();
				etouListe.addAll(etListe);
				etouListe.addAll(ouListe);
				
				String motSuivant = st3.nextToken();
				
				// parcours mots requete
				while (st2.hasMoreTokens()) {
					String mot = st2.nextToken();
					
					try {
						motSuivant = st3.nextToken(); // indice + 1
						
						// on a déjà rencontré un type param
						if (isEt && (!search(mot, etouListe)) && !search(motSuivant, etouListe)) {
//							System.out.println("now => " + mot + " et ");
							reqNormalisee2 = reqNormalisee2.concat(mot + " et ");
						} else if (isOu && (!search(mot, etouListe)) && !search(motSuivant, etouListe)) {
//							System.out.println("now => " + mot + " ou ");
							reqNormalisee2 = reqNormalisee2.concat(mot + " ou ");
						} else {
//							System.out.println("now => " + mot);
							reqNormalisee2 = reqNormalisee2.concat(mot + " ");
						}
					} catch (Exception e) {
//						System.out.println("now => " + mot);
						reqNormalisee2 = reqNormalisee2.concat(mot + " ");
					}
					
					// switch entre "et" et "ou"
					if (search(mot, etListe)) {
						isEt = true;
						isOu = false;
					} else if (search(mot, ouListe)) {
						isOu = true;
						isEt = false;
					}
				}
				
				/**
				 * Affichage requete normalisée 3
				 */
				System.out.println("Requête normalisée 3 : " + reqNormalisee2);
				System.out.println("=====================================");
				
				/**
				 * Requete normalisée => affichage requete sql
				 */
				System.out.println("*****************");
		    	try{
		    		tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(reqNormalisee2)));
		      		CommonTokenStream tokens = new CommonTokenStream(lexer);
					tal_sqlParser parser = new tal_sqlParser(tokens);
					String arbre = parser.listerequetes();
					System.out.println(arbre);
		    	} catch(Exception e) {  }
		    	System.out.println("*****************");
		    
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
