package main;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.output.tal_sql6Lexer;
import antlr.output.tal_sql6Parser;
import sql.annexe.CatAmeliore;
import sql.lexique.LexiqueCorpus;
import sql.lexique.LexiqueSimple;
import sql.requete.InterrogPostgresql;


public class MainModifie {

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
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    // only got here if we didn't return false
	    return true;
	}
	
	public static String getRequeteNormalisee(String requeteNaturelle, ServletContext context) {
		
		InputStream is1 = context.getResourceAsStream("res/lemm_td2.txt");
		InputStream is2 = context.getResourceAsStream("res/dic_pivot.txt");
		InputStream is3 = context.getResourceAsStream("res/stopliste.txt");
		
		// les lexiques
		LexiqueCorpus lexiqueLemmes = new LexiqueCorpus(is1);
		LexiqueSimple lexiquePivot = new LexiqueSimple(is2);
		LexiqueSimple lexiqueStop = new LexiqueSimple(is3);
		// base
		InterrogPostgresql base = new InterrogPostgresql();
		
//		System.out.println("grand -- grenade");
//		System.out.println("Coût Levenshtein : " + lexiqueLemmes.calculCoutLev("grand", "grenade"));
//		System.out.println();
//		System.out.println("grenade -- grands");
//		System.out.println("Coût Levenshtein : " + lexiqueLemmes.calculCoutLev("grenade", "grands"));
//		System.out.println();
//		System.out.println("grenade -- grand");
//		System.out.println("Coût Levenshtein : " + lexiqueLemmes.calculCoutLev("grenade", "grand"));
//		System.out.println();
//		System.out.println("grenade -- e");
//		System.out.println("Coût Levenshtein : " + lexiqueLemmes.calculCoutLev("grenade", "e"));
		
		// strings
		String questionEnCours = "";
		String motQuestionEnCours = "";
		String reqNormalisee = "";

		// liste des mots pivot
		ArrayList<String> listeMotsPivot = new ArrayList<String>();
		
		if (requeteNaturelle == null) {
			return "";
		}
	
		questionEnCours = requeteNaturelle;
	
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
			questionEnCours = questionEnCours.replaceAll("\\w\\.\\s", "");
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
				
				if (isInteger(motQuestionEnCours)) {
					reqNormalisee = reqNormalisee.concat(motQuestionEnCours + " ");
				} else {
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
			}
			
			/**
			 * Affichage requete normalisée 1
			 */
			System.out.println("Requête normalisée étape 1 : " + reqNormalisee);
			
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
			System.out.println("Requête normalisée étape 2 : " + reqNormalisee);
			
			
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
			etouListe.add("et");
			etouListe.add("ou");
			
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
					if (mot.equals("date")) {
						isOu = false;
					}
				}
			}
			
			/**
			 * Affichage requete normalisée 3
			 */
			System.out.println("Requête normalisée étape 3 : " + reqNormalisee2);
			System.out.println("=====================================");
			
			/**
			 * Requete normalisée => affichage requete sql
			 */
			System.out.println("*****************");
			String arbre = null;
			try{
	    		tal_sql6Lexer lexer = new tal_sql6Lexer(new ANTLRReaderStream(new StringReader(reqNormalisee2)));
	      		CommonTokenStream tokens = new CommonTokenStream(lexer);
	      		tal_sql6Parser parser = new tal_sql6Parser(tokens);
				arbre = parser.listerequetes();
				System.out.println(arbre);
	    	} catch(Exception e) {  }
	    	System.out.println("*****************");
	    	
//		    	arbre = arbre.replaceAll("\\(", "");
//		    	arbre = arbre.replaceAll("\\)", "");
	    	arbre = arbre.replaceAll(" {2,}"," ");
	    	arbre = arbre.trim();
	    	arbre = arbre.concat(";");
	    	
	    	System.out.println("*****************");
	    	System.out.println(arbre);
	    	System.out.println("*****************");
	    	
			base.setRequete(arbre);
			base.exec_sql();
	    
	    	System.out.println();
		
	    	return arbre;
	    	
		}
		
		return "";
	}
}
