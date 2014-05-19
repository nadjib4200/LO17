package sql.lexique;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
	public LexiqueSimple(InputStream is) {
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(is, "UTF8");
		} catch (UnsupportedEncodingException e1) {
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
