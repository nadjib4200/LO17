package annexe;
import java.io.*;

public class Saisie {
     public static String lireRequete() {
	     BufferedReader br=null;
	     String chaine = null;
	     try {
	          try {
	              br = new BufferedReader(new InputStreamReader(System.in));
	              System.out.print("Saisie : ");
	              chaine=br.readLine();
	              System.out.println("J'ai saisi : "+chaine);
	               } 
	          catch(EOFException e) {
	               br.close();
	               }
	     } catch(IOException e) {
	          System.out.println("IO Exception");
	     }
	     return chaine;
     }
}
