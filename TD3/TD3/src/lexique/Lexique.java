package lexique;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Lexique {
	
	/**
	 * HashMap clé(mot)=valeur(lemme)
	 */
	private static Properties properties = new Properties();
	/**
	 * Liste lemmes candidats : Proxmité entre les mots
	 */
	private static HashMap<String, Integer> lemmProx = new HashMap<>();
	/**
	 * Liste lemmes meilleurs candidats : Proxmité entre les mots
	 */
	private static HashMap<String, Integer> lemmProxBest = new HashMap<>();
	/**
	 * Liste lemmes candidats : Levenshtein
	 */
	private static HashMap<String, Integer> lemmLevenshtein = new HashMap<>();
	/**
	 * Liste lemmes meilleurs candidats : Levenshtein
	 */
	private static HashMap<String, Integer> lemmLevenshteinBest = new HashMap<>();
	private static final int SEUILMIN = 3; // mot : 3 caractères min
	private static final int SEUILMAX = 8; // diff mots : 8 caractères max
	private static final int PROXMIN = 50;
	private static final int SEUILLEVENSHTEIN = 3;
	
	/**
	 * Recupère le lemme associé à un mot
	 * @param mot
	 * @return
	 */
	public String getLemme(String mot) {
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream("res/extrait_lexicA12.txt"), "UTF8");
		} catch (UnsupportedEncodingException | FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			properties.load(isr);
		} catch (IOException e) {
			System.out.println(e);
		}
//		afficherLexique();
		return properties.getProperty(mot);
	}
	
	/**
	 * Retourne une HashMap <meilleur lemme, proximité>
	 * @param mot
	 * @return
	 */
	public HashMap<String, Integer> getPrefixList(String mot) {
		// init
		lemmProx = new HashMap<String, Integer>();
		// parcours ensemble des mots du lexique 
		// et calcul proximité avec mot requete
		for (String motLex : properties.stringPropertyNames()) {
			int prox = calculProx(mot, motLex);
//			System.out.println("Prox (mot req,mot lex): " + mot + ", " + motLex + " = " + prox);
			if (prox > PROXMIN) {
				String lemme = properties.getProperty(motLex);
				if (lemmProx.containsKey(lemme) && prox > lemmProx.get(lemme)) {
					lemmProx.put(lemme, prox);
				} else if (!lemmProx.containsKey(lemme)) {
					lemmProx.put(lemme, prox);
				}
			}
		}
		return constructLemmProxBest();
	}

	/**
	 * Retourne la proximité entre mot requete et mot lexique
	 * @param mot
	 * @param motLex
	 * @return
	 */
	private int calculProx(String mot, String motLex) {
		int long1 = mot.length();
		int long2 = motLex.length();

		// vérification longueur minimum mot
		if ((Math.abs(long1) < SEUILMIN) || (Math.abs(long2) < SEUILMIN)) {
			return 0;
		// vérification différence maximum entre longueur mot
		} else if (Math.abs(Math.abs(long1) - Math.abs(long2)) > SEUILMAX) {
			return 0;
		} else {
			int i = 0;
			while ((i < Math.min(Math.abs(long1), Math.abs(long2))) && (mot.charAt(i) == motLex.charAt(i))) {
				i++;
			}
			// nb lettres communes >= 3 
			if (i < 3) {
				return 0;
			}
//			System.out.println("Lettres communes = " +i);
			int prox =  (i * 100) / ((Math.abs(long1) + Math.abs(long2))/2);
			return prox; 
		}
	}
	
	/**
	 * Retourne une HashMap <meilleur lemme, coût Levenshtein>
	 * @param mot
	 * @return
	 */
	public HashMap<String, Integer> getLevenshteinList(String mot) {
		// init
		lemmLevenshtein = new HashMap<String, Integer>();
		
		// parcours ensemble des mots du lexique 
		// et calcul levenshtein avec mot requete
		for (String motLex : properties.stringPropertyNames()) {

			int distance = calculCoutLev(mot, motLex);
//			System.out.println("Distance = " + mot + " - " + motLex + " => " + distance);
			
			if (distance < SEUILLEVENSHTEIN) {
				String lemme = properties.getProperty(motLex);
				if (lemmLevenshtein.containsKey(lemme) && distance < lemmLevenshtein.get(lemme)) {
					lemmLevenshtein.put(lemme, distance);
				} else if (!lemmLevenshtein.containsKey(lemme)) {
					lemmLevenshtein.put(lemme, distance);
				}
			}
		}
		
		return constructLemmLevenshteinBest();
	}
	
	/**
	 * Retourne le cout Levenshtein entre mot requete et mot lexique
	 * @param mot
	 * @param motLex
	 * @return
	 */
	private int calculCoutLev(String mot, String motLex) {
		int long1 = mot.length();
		int long2 = motLex.length();
		int d1 = 0, d2 = 0, d3 = 0, distance = 0;

//		System.out.println("mot : " + mot + " (taille : " + long1 + ") - motLex : " + motLex + " (taille : " + long2 + ")");
		
		int[][] dist = new int[long1 + 1][long2 + 1];
		dist[0][0] = 0;
		
		// initialisation de la première colonne
		for (int i = 1; i <= Math.abs(long1); i++) {
			dist[i][0] = dist[i - 1][0] + cout(mot.charAt(i - 1),'\0');
		}
		
		// initialisation de la première ligne
		for (int j = 1; j <= Math.abs(long2); j++) {
			dist[0][j] = dist[0][j - 1] + cout('\0', motLex.charAt(j - 1));
		}
		
		// calcul de la distance de Levenshtein
		for (int i = 1; i <= Math.abs(long1); i++) {
			for (int j = 1; j <= Math.abs(long2); j++) {
				d1 = dist[i -1][j - 1] + cout(mot.charAt(i - 1), motLex.charAt(j - 1));
				d2 = dist[i -1][j] + cout(mot.charAt(i - 1), '\0');
				d3 = dist[i][j - 1] + cout('\0', motLex.charAt(j - 1));
				//System.out.print("d1 = " + d1 + " d2 = " + d2 + " d3 = " + d3);
				
				d1 = Math.min(d1, d2);
				dist[i][j] = Math.min(d1, d3);
				//System.out.println(" => d = " + dist[i][j]);
			}
		}
		
		// affichage tableau levenshtein
//		for (int i = 0; i <= Math.abs(long1); i++) {
//			for (int j = 0; j <= Math.abs(long2); j++) {
//				System.out.print("(" + i + "," + j + ") = " + dist[i][j] + " "); 
//			}
//			System.out.println();
//		}
		
		distance = dist[long1][long2];
//		System.out.println("Distance entre " + mot + " et " + motLex + " = " + distance);

		return distance;
	}
	
	/**
	 * Afficher lexique
	 */
	public static void afficherLexique() {
		for (String key : properties.stringPropertyNames()) {
			String value = properties.getProperty(key);
			System.out.println(key + " => " + value);
		}
	}

	/**
	 * Afficher lemm prox
	 */
	public static void afficherLemmProx() {
		Iterator<Map.Entry<String, Integer>> i = lemmProx.entrySet().iterator(); 
		while(i.hasNext()){
		    String key = i.next().getKey();
		    System.out.println("Lemme : " + key + ", Prox : " + lemmProx.get(key));
		}
	}
	
	/**
	 * Afficher lemm prox best
	 */
	public static void afficherLemmProxBest() {
		Iterator<Map.Entry<String, Integer>> i = lemmProxBest.entrySet().iterator(); 
		while (i.hasNext()){
		    String key = i.next().getKey();
		    System.out.println("(lemme : " + key + ", prox : " + lemmProxBest.get(key) + ")");
		}
	}
	
	/**
	 * Afficher lemm prox best
	 */
	public static void afficherLemmProxBest(HashMap<String, Integer> m) {
		Iterator<Map.Entry<String, Integer>> i = m.entrySet().iterator(); 
		while (i.hasNext()){
		    String key = i.next().getKey();
		    System.out.println("(lemme : " + key + ", prox : " + m.get(key) + ")");
		}
	}
	
	/**
	 * Afficher lemm prox best
	 */
	public static void afficherLemmLevenshteinBest() {
		Iterator<Map.Entry<String, Integer>> i = lemmLevenshteinBest.entrySet().iterator(); 
		while (i.hasNext()){
		    String key = i.next().getKey();
		    System.out.println("(lemme : " + key + ", cout lev : " + lemmLevenshteinBest.get(key) + ")");
		}
	}
	
	/**
	 * Afficher lemm lev best
	 */
	public static void afficherLemmLevenshteinBest(HashMap<String, Integer> m) {
		Iterator<Map.Entry<String, Integer>> i = m.entrySet().iterator(); 
		while (i.hasNext()){
		    String key = i.next().getKey();
		    System.out.println("(lemme : " + key + ", cout lev : " + m.get(key) + ")");
		}
	}
	
	/**
	 * Retourne maximum proximité
	 * @return
	 */
	public int getMaxLemmProx() {
		Iterator<Map.Entry<String, Integer>> i = lemmProx.entrySet().iterator(); 
		int proxMax = 0;
		while (i.hasNext()){
		    int prox = i.next().getValue();
		    if (prox > proxMax) {
		    	proxMax = prox;
		    }
		}
		return proxMax;
	}
	
	/**
	 * Construction sous-liste meilleurs lemmes
	 * @return
	 */
	public HashMap<String, Integer> constructLemmProxBest() {
		// init
		lemmProxBest = new HashMap<String, Integer>();
		int proxMax = getMaxLemmProx();
		Iterator<Map.Entry<String, Integer>> i = lemmProx.entrySet().iterator(); 
		while (i.hasNext()) {
			String lemme = i.next().getKey();
			int prox = lemmProx.get(lemme);
		    if (prox == proxMax) {
		    	lemmProxBest.put(lemme, prox);
		    }
		}
		return lemmProxBest;
	}
	
	/**
	 * Retourne mininum Levenshtein
	 * @return
	 */
	public int getMinLemmLevenshtein() {
		Iterator<Map.Entry<String, Integer>> i = lemmLevenshtein.entrySet().iterator(); 
		int levMin = SEUILLEVENSHTEIN;
		while (i.hasNext()) {
		    int lev = i.next().getValue();
		    if (lev < levMin) {
		    	levMin = lev;
		    }
		}
		return levMin;
	}
	
	/**
	 * Construction sous-liste meilleurs lemmes
	 * @return
	 */
	public HashMap<String, Integer> constructLemmLevenshteinBest() {
		// init
		lemmLevenshteinBest = new HashMap<String, Integer>();
		int levMin = getMinLemmLevenshtein();
		Iterator<Map.Entry<String, Integer>> i = lemmLevenshtein.entrySet().iterator(); 
		while (i.hasNext()) {
			String lemme = i.next().getKey();
			int lev = lemmLevenshtein.get(lemme);
		    if (lev == levMin) {
		    	lemmLevenshteinBest.put(lemme, lev);
		    }
		}
		return lemmLevenshteinBest;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private int cout(char a, char b) {
		if (a == '\0' || b == '\0'){
			return 1;
		} else {
			if (a == b) {
				return 0;
			}
		}
		return 1;
	}
}
