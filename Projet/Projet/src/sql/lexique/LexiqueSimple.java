package sql.lexique;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class LexiqueSimple {
	
	/**
	 * HashMap clé(mot)=valeur(lemme)
	 */
	private Properties properties = new Properties();
	
	/**
	 * Constructor
	 */
	public LexiqueSimple(String fichierLexique) {
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream(fichierLexique), "UTF8");
		} catch (UnsupportedEncodingException | FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			properties.load(isr);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	/**
	 * Recupère la valeur associé à une clé
	 * @param mot
	 * @return
	 */
	public String getValeur(String mot) {
		return properties.getProperty(mot);
	}
}
