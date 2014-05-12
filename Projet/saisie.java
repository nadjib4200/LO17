import java.io.*;

public class saisie  {

   public static void main(String args[]) {

	String requete ="";
	BufferedReader br=null;

	try {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("saisie : ");
			requete=br.readLine();
			System.out.println("j'ai saisi "+requete);
		} 
		catch(EOFException e) {
			br.close();
		}
	} 
	catch(IOException e) {
		System.out.println("IO Exception");
	}

   }
   
}
