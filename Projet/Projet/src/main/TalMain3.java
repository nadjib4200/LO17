package main;

import java.io.StringReader;
import java.util.Scanner;

//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import antlr.output.tal_sql6Lexer;
import antlr.output.tal_sql6Parser;


public class TalMain3 {

public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Texte : ");
        String s = scanner.nextLine();
        System.out.println(s);
        while (!s.equals("*")) {
        	try{
        		tal_sql6Lexer lexer = new tal_sql6Lexer(new ANTLRReaderStream(new StringReader(s)));
          		CommonTokenStream tokens = new CommonTokenStream(lexer);
          		tal_sql6Parser parser = new tal_sql6Parser(tokens);
				String arbre = parser.listerequetes();
				System.out.println(arbre);
          } catch(Exception e) {  }
          System.out.print("Texte : ");
          s = scanner.nextLine();
        }
        scanner.close();
    }
}
