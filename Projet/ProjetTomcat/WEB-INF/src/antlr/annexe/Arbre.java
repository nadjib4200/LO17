package antlr.annexe;

public class Arbre {
	Arbre fils=null;
	Arbre frere=null;
	String categorie;
	String mot;
	
	public Arbre(String categorie,String mot) {
	this.categorie = categorie ;
	this.mot = mot ;
	}
	
	public Arbre(String categorie) {
	this.categorie = categorie ;
	this.mot = "" ;
	}
	
	public void ajouteFils(Arbre a) {
	if (fils == null)
		fils = a;
	else
		fils.ajouteFrere(a);
	}
	
	private void ajouteFrere(Arbre a) {
	Arbre tmp = frere ;
	if (frere == null)
		frere = a;
	else {
		while (tmp.frere != null)
			tmp = tmp.frere ;
		tmp.frere = a;
		}
	}
	
	void afficheCat() {
//	afficheCatAvecNl();
	System.out.println(sortArbreAvecNl());
	System.out.println();
	}

	public String sortArbre(){
	return sortArbreAvecNl();
	}

	private String sortArbreAvecNl() {
	String arbre = categorie + " " + mot +" ";
	if (fils != null) {
		arbre = arbre +" ( ";
		arbre = arbre + fils.sortArbreAvecNl();
		arbre = arbre +" )";
		}
	if (frere != null) {
		arbre = arbre + frere.sortArbreAvecNl();
		}
	return arbre;
	}

	private void afficheCatAvecNl() {
	System.out.print(categorie+" ");
	System.out.print(mot+" ");
	if (fils != null) {
		System.out.print(" ( ");
		fils.afficheCatAvecNl();
		System.out.print(") ");
		}
	if (frere != null) {
		frere.afficheCatAvecNl();
		}
	}
	private void afficheCatSansNl() {
	System.out.print(categorie+" ");
	if (fils != null) {
		System.out.print(" ( ");
		fils.afficheCatSansNl();
		System.out.print(") ");
		}
	if (frere != null) {
		frere.afficheCatSansNl();
		}
	}
	
	
}
