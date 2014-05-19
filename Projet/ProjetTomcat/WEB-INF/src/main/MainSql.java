package main;

import sql.requete.InterrogPostgresql;

public class MainSql {

	public static void main(String[] args) {
		
		InterrogPostgresql base = new InterrogPostgresql();
		
		String requete;
		requete = "select distinct page,rubrique from titre where mot='pape';";
		
		base.setRequete(requete);
		base.exec_sql();
	}
}
