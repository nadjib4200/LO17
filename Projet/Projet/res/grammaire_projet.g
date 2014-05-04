grammar grammaire_projet;

SELECT : 'vouloir'
;

ARTICLE : 'article'
;

RUBRIQUE : 'rubrique'
;

PAGE : 'page'
;

DATE : 'date'
;

ET : 'et' 
;

OU : 'ou'
;

POINT : '.'
;

MOT : 'mot' | 'contenir' | 'parler'
;

EMAIL 	: 'auteur' | 'email'
; 
 
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

VAR 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+
;

VAREMAIL 	: ('a'..'z')+('@')('a'..'z')+('.')+('a'..'z')+
;

JJ : ('0'..'9')('0'..'9');
ANNEE : ('1'..'9')('0'..'9')('0'..'9')('0'..'9'); 
MOIS : 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'septembre' | 'octobre' | 'novembre' | 'décembre'
|'janv' | 'fév' | 'juil' | 'aout' | 'sept' | 'oct' | 'nov' | 'déc'
|'janv.' | 'fév.' | 'juil.' | 'sept.' | 'oct.' | 'nov.' | 'déc.'
;
JOUR : 'lundi' |'mardi'|'mercredi'|'jeudi'|'vendredi'|'samedi'|'dimanche'
;
	 

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
		SELECT PAGE DATE ps = datPage{
		req_arbre.ajouteFils(new Arbre("","select distinct"));
		req_arbre.ajouteFils(new Arbre("","page"));	
		req_arbre.ajouteFils(new Arbre("","from datepage"));
		req_arbre.ajouteFils(new Arbre("","where"));
		ps_arbre = $ps.les_pars_arbre;
		req_arbre.ajouteFils(ps_arbre);	
		} 
		
		| 
		SELECT {req_arbre.ajouteFils(new Arbre("","select distinct"));}
		
		(ARTICLE {req_arbre.ajouteFils(new Arbre("","article"));}
		 | RUBRIQUE {req_arbre.ajouteFils(new Arbre("","rubrique"));}	
		)+
		
		 (MOT ps = paramsMot {
		  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
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
		})+
;

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


datPage returns [Arbre les_pars_arbre = new Arbre("")] :
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



datArticle returns [Arbre les_pars_arbre = new Arbre("")] :
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
