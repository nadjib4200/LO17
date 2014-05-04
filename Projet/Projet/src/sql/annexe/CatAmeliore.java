package sql.annexe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CatAmeliore {

	private BufferedReader br;
	private String chaine;

	/**
	 * Constructeur : lit un fichier et construit un buffer reader
	 * @param fichier
	 */
	public CatAmeliore(String fichier) {
		br = null;
		chaine = null;
		try {
			br = new BufferedReader(new FileReader(fichier));
		} catch (FileNotFoundException e) {
			System.out.println("erreur fichier : " + fichier);
		}
	}
	
	/**
	 * Retourne la ligne suivante du fichier
	 * @return
	 */
	public String getProchaineQuestion() {
		try {
			if ((chaine = br.readLine()) != null)
				return chaine;
			else {
				br.close();
				chaine = null;
			}
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
		return chaine;
	}

	/**
	 * Retourne le buffer reader
	 * @return
	 */
	public BufferedReader getBr() {
		return br;
	}
}
