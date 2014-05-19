grammar tal_sql6;

// Stop list
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

// Conjonctions, ponctuation
ET : 'et' | 'en même temps' | 'aussi' | 'également'
;

OU : 'ou'
;

POINT : '.'
;


// Mots Pivots  
SELECT : 'vouloir' | 'liste' | 'lister'
;

COUNT : 'compter' | 'combien' | 'nombre'
;

ARTICLE : 'article'
;

RUBRIQUE : 'rubrique' 
| 'gros titres' | 'gros titre' | 'une' | 'unes' | 'focus' | 'rapels' | 'a voir aussi' | 'à voir aussi' | 'voir aussi'
;

PAGE : 'page'
;


// Paramètres
DATE : 'date'
;

MOT : 'mot' | 'contenir' | 'parler'
;

TITRE : 'titre' 
;

EMAIL 	: 'auteur' | 'email'
; 
 
THEME	: 'theme' | 'thematique' | 'domaine' 
;  


// Variables
MOIS : 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'septembre' | 'octobre' | 'novembre' | 'décembre'
|'janv' | 'fév' | 'juil' | 'aout' | 'sept' | 'oct' | 'nov' | 'déc'
|'janv.' | 'fév.' | 'juil.' | 'sept.' | 'oct.' | 'nov.' | 'déc.'
;
JOUR : 'lundi' |'mardi'|'mercredi'|'jeudi'|'vendredi'|'samedi'|'dimanche'
;

VAR : ('A'..'Z' | 'a'..'z'|'\u00a0'..'\u00ff')(('a'..'z')|('0'..'9')|'-'|('\u00a0'..'\u00ff'))+
;

VAREMAIL 	: ('a'..'z')+('@')('a'..'z')+('.')+('a'..'z')+
;

JJ : ('0'..'9')('0'..'9');
ANNEE : ('1'..'9')('0'..'9')('0'..'9')('0'..'9'); 

 


// Règles Grammaticales
listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} : 
	// requete PAGE
		(
		SELECT {req_arbre.ajouteFils(new Arbre("","select distinct"));}
		| COUNT {req_arbre.ajouteFils(new Arbre("","select count(*)"));}
		)
		
		PAGE {req_arbre.ajouteFils(new Arbre("","page"));}
		(
		DATE ps = datPage{
			req_arbre.ajouteFils(new Arbre("","from datepage"));
			req_arbre.ajouteFils(new Arbre("","where"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);	
		}
		|
		EMAIL ps = paramsEmail {
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		THEME ps = paramsTheme {
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		MOT ps = paramsMot {
		  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		TITRE ps = paramsMot {
		  	req_arbre.ajouteFils(new Arbre("","from titre"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		)
		
		
		// deuxieme bloc
		(
		DATE ps = datPage{
		req_arbre.ajouteFils(new Arbre("","AND"));
		req_arbre.ajouteFils(new Arbre("","from datepage"));
		req_arbre.ajouteFils(new Arbre("","where"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);	
		}
		|
		ET DATE ps = datPage{
		req_arbre.ajouteFils(new Arbre("","AND"));
		req_arbre.ajouteFils(new Arbre("","from datepage"));
		req_arbre.ajouteFils(new Arbre("","where"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);	
		}
		|
		OU DATE ps = datPage{
		req_arbre.ajouteFils(new Arbre("","AND"));
		req_arbre.ajouteFils(new Arbre("","from datepage"));
		req_arbre.ajouteFils(new Arbre("","where"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);	
		}
		|
		ET EMAIL ps = paramsEmail {
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		OU EMAIL ps = paramsEmail {
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		ET THEME ps = paramsTheme {
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		OU THEME ps = paramsTheme {
			req_arbre.ajouteFils(new Arbre("","OR"));
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		ET MOT ps = paramsMot {
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		OU MOT ps = paramsMot {
			req_arbre.ajouteFils(new Arbre("","OR"));
		  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		ET TITRE ps = paramsMot {
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","from titre"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		OU TITRE ps = paramsMot {
			req_arbre.ajouteFils(new Arbre("","OR"));
		  	req_arbre.ajouteFils(new Arbre("","from titre"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		)*
		
		
		
	// requete ARTICLE et rubrique
		|
		(
		SELECT {req_arbre.ajouteFils(new Arbre("","select distinct"));}
		| COUNT {req_arbre.ajouteFils(new Arbre("","select count(*)"));}
		)
		
		(ARTICLE {req_arbre.ajouteFils(new Arbre("","article"));}
		 | RUBRIQUE {req_arbre.ajouteFils(new Arbre("","rubrique"));}	
		)
		
		(
		DATE ps = dat{
		req_arbre.ajouteFils(new Arbre("","from datearticle"));
		req_arbre.ajouteFils(new Arbre("","where"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);
		}
		|
		EMAIL ps = paramsEmail {
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		THEME ps = paramsTheme {
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		MOT ps = paramsMot {
		  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		TITRE ps = paramsMot {
		  	req_arbre.ajouteFils(new Arbre("","from titre"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		)+
		
		
		// Deuxième Bloc 
		(
		DATE ps = dat{
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("","from datearticle"));
			req_arbre.ajouteFils(new Arbre("","where"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		ET DATE ps = dat{
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("","from datearticle"));
			req_arbre.ajouteFils(new Arbre("","where"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		OU DATE ps = dat{
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("","from datearticle"));
			req_arbre.ajouteFils(new Arbre("","where"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		ET EMAIL ps = paramsEmail {
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		OU EMAIL ps = paramsEmail {
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		ET THEME ps = paramsTheme {
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		OU THEME ps = paramsTheme {
			req_arbre.ajouteFils(new Arbre("","OR"));
		  	req_arbre.ajouteFils(new Arbre("","from email"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		ET MOT ps = paramsMot {
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		OU MOT ps = paramsMot {
			req_arbre.ajouteFils(new Arbre("","OR"));
		  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		ET TITRE ps = paramsMot {
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","from titre"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		|
		OU TITRE ps = paramsMot {
			req_arbre.ajouteFils(new Arbre("","OR"));
		  	req_arbre.ajouteFils(new Arbre("","from titre"));
		      	req_arbre.ajouteFils(new Arbre("","where"));
		  	ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		)*
;








// Mots
paramsMot returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = paramMot {
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
		}
		((ET par2 = paramMot{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
		}
		| OU par2 = paramMot{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
		}
		))*
;

paramMot returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR{ 
		lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}			
;





// Emails
paramsEmail returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = paramEmail {
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
		}
		((ET par2 = paramEmail{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
		}
		| OU par2 = paramEmail{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
		}
		))*
;

paramEmail returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAREMAIL{ 
		lepar_arbre.ajouteFils(new Arbre("email =", "'"+a.getText()+"'"));}			
;


// Theme
paramsTheme returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = paramTheme {
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
		}
		((ET par2 = paramTheme{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
		}
		| OU par2 = paramTheme{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
		}
		))*
;

paramTheme returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR{ 
		lepar_arbre.ajouteFils(new Arbre("theme =", "'"+a.getText()+"'"));}			
;



// ******** DATE
paramsDatPage returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = datPage {
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
		}
		((ET par2 = datPage{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
		}
		| OU par2 = datPage{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
		}
		))*
;


paramsDat returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = dat{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
		}
		((ET par2 = dat{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
		}
		| OU par2 = dat{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
		}
		))*
;


// Date des pages
datPage returns [Arbre lepar_arbre = new Arbre("")] :
	a = ANNEE {
		les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
	}
	| m = MOIS a = ANNEE {
		les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
	}
	| j = JJ m = MOIS a = ANNEE {
		les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
	}
	| j = JOUR m = MOIS a = ANNEE {
		les_pars_arbre.ajouteFils(new Arbre("", "jour = '" + j.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
	};



// Date des articles ou rubriques
dat returns [Arbre lepar_arbre = new Arbre("")] :
	a = ANNEE {
		les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
	}
	| m = MOIS a = ANNEE {
		les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
	}
	| j = JJ m = MOIS a = ANNEE {
		les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
	};


