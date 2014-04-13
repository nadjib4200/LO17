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
	private static final int SEUILMIN = 3; // mot : 3 caractères min
	private static final int SEUILMAX = 8; // diff mots : 8 caractères max
	private static final int PROXMIN = 50;
	
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
	
	public static void afficherLemmProxBest() {
		Iterator<Map.Entry<String, Integer>> i = lemmProxBest.entrySet().iterator(); 
		while (i.hasNext()){
		    String key = i.next().getKey();
		    System.out.println("(lemme : " + key + ", prox : " + lemmProxBest.get(key) + ")");
		}
	}
	
	public static void afficherLemmProxBest(HashMap<String, Integer> m) {
		Iterator<Map.Entry<String, Integer>> i = m.entrySet().iterator(); 
		while (i.hasNext()){
		    String key = i.next().getKey();
		    System.out.println("(lemme : " + key + ", prox : " + m.get(key) + ")");
		}
	}
	
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
	 * Retourne une HashMap <meilleur lemme, proximité>
	 * @param mot
	 * @return
	 */
	public HashMap<String, Integer> getPrefixList(String mot) {
		// init
		lemmProx = new HashMap<String, Integer>();
		// parcours ensemble des mots du lexique et calcul proximité avec mot requete
		for (String motLex : properties.stringPropertyNames()) {
			int prox = calculProx(mot, motLex);
//			System.out.println("Prox (mot req,mot lex): " + mot + ", " + motLex + " = " + prox);
			// prox > 40%
			if (prox > PROXMIN) {
				String lemme = properties.getProperty(motLex);
				if (lemmProx.containsKey(lemme) && prox > lemmProx.get(lemme)) {
					lemmProx.put(lemme, prox);
				} else if (!lemmProx.containsKey(lemme)) {
					lemmProx.put(lemme, prox);
				}
			}
		}
//		System.out.println("START HASHMAP CANDIDATS POUR LE MOT " + mot);
//		afficherLemmProx();
//		System.out.println("FINISH HASHMAP CANDIDATS POUR LE MOT " + mot);
		
//		System.out.println("START HASHMAP MEILLEURS CANDIDATS POUR LE MOT " + mot);
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
//		System.out.println("FINISH HASHMAP MEILLEURS CANDIDATS POUR LE MOT " + mot);
		
//		System.out.println("FIN ================== " + mot);
		return lemmProxBest;
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
//			System.out.println("Long mots < " + SEUILMIN);
			return 0;
		// vérification différence maximum entre longueur mot
		} else if (Math.abs(Math.abs(long1) - Math.abs(long2)) > SEUILMAX) {
//			System.out.println("Diff mots > " + SEUILMAX);
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
//			System.out.print("Prox : " + prox);
//			System.out.println(" , lemme = " + properties.getProperty(motLex));
			return prox; 
		}
	}
}
