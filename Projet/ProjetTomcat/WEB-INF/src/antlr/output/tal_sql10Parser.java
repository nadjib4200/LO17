package antlr.output;

// $ANTLR 3.5.1 /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g 2014-06-02 16:15:38

import org.antlr.runtime.*;

import antlr.annexe.Arbre;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sql10Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "COUNT", "DATE", 
		"DERNIER", "EMAIL", "ET", "JJ", "JOUR", "MOIS", "MOT", "OU", "PAGE", "POINT", 
		"PREMIER", "RUBRIQUE", "SELECT", "THEME", "TITRE", "VAR", "VARCHIFFRE", 
		"VAREMAIL", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int COUNT=6;
	public static final int DATE=7;
	public static final int DERNIER=8;
	public static final int EMAIL=9;
	public static final int ET=10;
	public static final int JJ=11;
	public static final int JOUR=12;
	public static final int MOIS=13;
	public static final int MOT=14;
	public static final int OU=15;
	public static final int PAGE=16;
	public static final int POINT=17;
	public static final int PREMIER=18;
	public static final int RUBRIQUE=19;
	public static final int SELECT=20;
	public static final int THEME=21;
	public static final int TITRE=22;
	public static final int VAR=23;
	public static final int VARCHIFFRE=24;
	public static final int VAREMAIL=25;
	public static final int WS=26;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sql10Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sql10Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sql10Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g"; }



	// $ANTLR start "listerequetes"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:81:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:82:25: (r= requete POINT )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:83:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes662);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes664); 

							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:90:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT | COUNT )? ( PAGE )? ( DATE ps= datPage | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot ) ( ET DATE ps= datPage | OU DATE ps= datPage | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )* | ( SELECT | COUNT )? ( PREMIER |ps= paramsTop PREMIER | DERNIER |ps= paramsTop DERNIER )? ( ARTICLE | RUBRIQUE ) ( DATE ps= dat | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot )? ( ET DATE ps= dat | OU DATE ps= dat | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )* );
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:91:26: ( ( SELECT | COUNT )? ( PAGE )? ( DATE ps= datPage | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot ) ( ET DATE ps= datPage | OU DATE ps= datPage | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )* | ( SELECT | COUNT )? ( PREMIER |ps= paramsTop PREMIER | DERNIER |ps= paramsTop DERNIER )? ( ARTICLE | RUBRIQUE ) ( DATE ps= dat | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot )? ( ET DATE ps= dat | OU DATE ps= dat | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )* )
			int alt10=2;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				int LA10_1 = input.LA(2);
				if ( (LA10_1==DATE||LA10_1==EMAIL||LA10_1==MOT||LA10_1==PAGE||(LA10_1 >= THEME && LA10_1 <= TITRE)) ) {
					alt10=1;
				}
				else if ( (LA10_1==ARTICLE||LA10_1==DERNIER||(LA10_1 >= PREMIER && LA10_1 <= RUBRIQUE)||LA10_1==VARCHIFFRE) ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COUNT:
				{
				int LA10_2 = input.LA(2);
				if ( (LA10_2==DATE||LA10_2==EMAIL||LA10_2==MOT||LA10_2==PAGE||(LA10_2 >= THEME && LA10_2 <= TITRE)) ) {
					alt10=1;
				}
				else if ( (LA10_2==ARTICLE||LA10_2==DERNIER||(LA10_2 >= PREMIER && LA10_2 <= RUBRIQUE)||LA10_2==VARCHIFFRE) ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DATE:
			case EMAIL:
			case MOT:
			case PAGE:
			case THEME:
			case TITRE:
				{
				alt10=1;
				}
				break;
			case ARTICLE:
			case DERNIER:
			case PREMIER:
			case RUBRIQUE:
			case VARCHIFFRE:
				{
				alt10=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:93:3: ( SELECT | COUNT )? ( PAGE )? ( DATE ps= datPage | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot ) ( ET DATE ps= datPage | OU DATE ps= datPage | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )*
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:93:3: ( SELECT | COUNT )?
					int alt1=3;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==SELECT) ) {
						alt1=1;
					}
					else if ( (LA1_0==COUNT) ) {
						alt1=2;
					}
					switch (alt1) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:94:3: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete697); 
							req_arbre.ajouteFils(new Arbre("","select distinct"));
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:95:5: COUNT
							{
							match(input,COUNT,FOLLOW_COUNT_in_requete705); 
							req_arbre.ajouteFils(new Arbre("","select count(*)"));
							}
							break;

					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:98:3: ( PAGE )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==PAGE) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:98:4: PAGE
							{
							match(input,PAGE,FOLLOW_PAGE_in_requete720); 
							req_arbre.ajouteFils(new Arbre("","page"));
							}
							break;

					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:101:3: ( DATE ps= datPage | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot )
					int alt3=5;
					switch ( input.LA(1) ) {
					case DATE:
						{
						alt3=1;
						}
						break;
					case EMAIL:
						{
						alt3=2;
						}
						break;
					case THEME:
						{
						alt3=3;
						}
						break;
					case MOT:
						{
						alt3=4;
						}
						break;
					case TITRE:
						{
						alt3=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:102:3: DATE ps= datPage
							{
							match(input,DATE,FOLLOW_DATE_in_requete738); 
							pushFollow(FOLLOW_datPage_in_requete744);
							ps=datPage();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","from datepage"));
										req_arbre.ajouteFils(new Arbre("","where"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);	
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:109:3: EMAIL ps= paramsEmail
							{
							match(input,EMAIL,FOLLOW_EMAIL_in_requete753); 
							pushFollow(FOLLOW_paramsEmail_in_requete759);
							ps=paramsEmail();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:116:3: THEME ps= paramsTheme
							{
							match(input,THEME,FOLLOW_THEME_in_requete769); 
							pushFollow(FOLLOW_paramsTheme_in_requete775);
							ps=paramsTheme();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 4 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:123:3: MOT ps= paramsMot
							{
							match(input,MOT,FOLLOW_MOT_in_requete785); 
							pushFollow(FOLLOW_paramsMot_in_requete791);
							ps=paramsMot();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 5 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:130:3: TITRE ps= paramsMot
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete801); 
							pushFollow(FOLLOW_paramsMot_in_requete807);
							ps=paramsMot();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from titre"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;

					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:140:3: ( ET DATE ps= datPage | OU DATE ps= datPage | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )*
					loop4:
					while (true) {
						int alt4=11;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==ET) ) {
							switch ( input.LA(2) ) {
							case DATE:
								{
								alt4=1;
								}
								break;
							case EMAIL:
								{
								alt4=3;
								}
								break;
							case THEME:
								{
								alt4=5;
								}
								break;
							case MOT:
								{
								alt4=7;
								}
								break;
							case TITRE:
								{
								alt4=9;
								}
								break;
							}
						}
						else if ( (LA4_0==OU) ) {
							switch ( input.LA(2) ) {
							case DATE:
								{
								alt4=2;
								}
								break;
							case EMAIL:
								{
								alt4=4;
								}
								break;
							case THEME:
								{
								alt4=6;
								}
								break;
							case MOT:
								{
								alt4=8;
								}
								break;
							case TITRE:
								{
								alt4=10;
								}
								break;
							}
						}

						switch (alt4) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:141:3: ET DATE ps= datPage
							{
							match(input,ET,FOLLOW_ET_in_requete830); 
							match(input,DATE,FOLLOW_DATE_in_requete832); 
							pushFollow(FOLLOW_datPage_in_requete838);
							ps=datPage();
							state._fsp--;


									req_arbre.ajouteFils(new Arbre("","AND"));
									req_arbre.ajouteFils(new Arbre("","from datepage"));
									req_arbre.ajouteFils(new Arbre("","where"));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);	
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:149:3: OU DATE ps= datPage
							{
							match(input,OU,FOLLOW_OU_in_requete847); 
							match(input,DATE,FOLLOW_DATE_in_requete849); 
							pushFollow(FOLLOW_datPage_in_requete855);
							ps=datPage();
							state._fsp--;


									req_arbre.ajouteFils(new Arbre("","OR"));
									req_arbre.ajouteFils(new Arbre("","from datepage"));
									req_arbre.ajouteFils(new Arbre("","where"));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);	
									
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:157:3: ET EMAIL ps= paramsEmail
							{
							match(input,ET,FOLLOW_ET_in_requete864); 
							match(input,EMAIL,FOLLOW_EMAIL_in_requete866); 
							pushFollow(FOLLOW_paramsEmail_in_requete872);
							ps=paramsEmail();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 4 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:165:3: OU EMAIL ps= paramsEmail
							{
							match(input,OU,FOLLOW_OU_in_requete882); 
							match(input,EMAIL,FOLLOW_EMAIL_in_requete884); 
							pushFollow(FOLLOW_paramsEmail_in_requete890);
							ps=paramsEmail();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 5 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:173:3: ET THEME ps= paramsTheme
							{
							match(input,ET,FOLLOW_ET_in_requete900); 
							match(input,THEME,FOLLOW_THEME_in_requete902); 
							pushFollow(FOLLOW_paramsTheme_in_requete908);
							ps=paramsTheme();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 6 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:181:3: OU THEME ps= paramsTheme
							{
							match(input,OU,FOLLOW_OU_in_requete918); 
							match(input,THEME,FOLLOW_THEME_in_requete920); 
							pushFollow(FOLLOW_paramsTheme_in_requete926);
							ps=paramsTheme();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 7 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:189:3: ET MOT ps= paramsMot
							{
							match(input,ET,FOLLOW_ET_in_requete936); 
							match(input,MOT,FOLLOW_MOT_in_requete938); 
							pushFollow(FOLLOW_paramsMot_in_requete944);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 8 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:197:3: OU MOT ps= paramsMot
							{
							match(input,OU,FOLLOW_OU_in_requete954); 
							match(input,MOT,FOLLOW_MOT_in_requete956); 
							pushFollow(FOLLOW_paramsMot_in_requete962);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
									  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 9 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:205:3: ET TITRE ps= paramsMot
							{
							match(input,ET,FOLLOW_ET_in_requete972); 
							match(input,TITRE,FOLLOW_TITRE_in_requete974); 
							pushFollow(FOLLOW_paramsMot_in_requete980);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from titre"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 10 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:213:3: OU TITRE ps= paramsMot
							{
							match(input,OU,FOLLOW_OU_in_requete990); 
							match(input,TITRE,FOLLOW_TITRE_in_requete992); 
							pushFollow(FOLLOW_paramsMot_in_requete998);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
									  	req_arbre.ajouteFils(new Arbre("","from titre"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:226:3: ( SELECT | COUNT )? ( PREMIER |ps= paramsTop PREMIER | DERNIER |ps= paramsTop DERNIER )? ( ARTICLE | RUBRIQUE ) ( DATE ps= dat | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot )? ( ET DATE ps= dat | OU DATE ps= dat | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )*
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:226:3: ( SELECT | COUNT )?
					int alt5=3;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==SELECT) ) {
						alt5=1;
					}
					else if ( (LA5_0==COUNT) ) {
						alt5=2;
					}
					switch (alt5) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:227:3: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete1028); 
							req_arbre.ajouteFils(new Arbre("","select distinct"));
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:228:5: COUNT
							{
							match(input,COUNT,FOLLOW_COUNT_in_requete1036); 
							req_arbre.ajouteFils(new Arbre("","select count(*)"));
							}
							break;

					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:232:3: ( PREMIER |ps= paramsTop PREMIER | DERNIER |ps= paramsTop DERNIER )?
					int alt6=5;
					switch ( input.LA(1) ) {
						case PREMIER:
							{
							alt6=1;
							}
							break;
						case VARCHIFFRE:
							{
							int LA6_2 = input.LA(2);
							if ( (LA6_2==PREMIER) ) {
								alt6=2;
							}
							else if ( (LA6_2==DERNIER) ) {
								alt6=4;
							}
							}
							break;
						case DERNIER:
							{
							alt6=3;
							}
							break;
					}
					switch (alt6) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:232:4: PREMIER
							{
							match(input,PREMIER,FOLLOW_PREMIER_in_requete1052); 

										req_arbre.ajouteFils(new Arbre("","top 1"));
										req_arbre.ajouteFils(new Arbre("","order by date ASC"));
										
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:237:3: ps= paramsTop PREMIER
							{
							pushFollow(FOLLOW_paramsTop_in_requete1066);
							ps=paramsTop();
							state._fsp--;

							match(input,PREMIER,FOLLOW_PREMIER_in_requete1068); 

										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
										req_arbre.ajouteFils(new Arbre("","order by date ASC"));
										
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:243:3: DERNIER
							{
							match(input,DERNIER,FOLLOW_DERNIER_in_requete1078); 

										req_arbre.ajouteFils(new Arbre("","top 1"));
										req_arbre.ajouteFils(new Arbre("","order by date DESC"));
										
							}
							break;
						case 4 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:248:3: ps= paramsTop DERNIER
							{
							pushFollow(FOLLOW_paramsTop_in_requete1091);
							ps=paramsTop();
							state._fsp--;

							match(input,DERNIER,FOLLOW_DERNIER_in_requete1093); 

										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
										req_arbre.ajouteFils(new Arbre("","order by date DESC"));
										
							}
							break;

					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:256:3: ( ARTICLE | RUBRIQUE )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==ARTICLE) ) {
						alt7=1;
					}
					else if ( (LA7_0==RUBRIQUE) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:256:4: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1107); 
							req_arbre.ajouteFils(new Arbre("","article"));
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:257:6: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1116); 
							req_arbre.ajouteFils(new Arbre("","rubrique"));
							}
							break;

					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:260:3: ( DATE ps= dat | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot )?
					int alt8=6;
					switch ( input.LA(1) ) {
						case DATE:
							{
							alt8=1;
							}
							break;
						case EMAIL:
							{
							alt8=2;
							}
							break;
						case THEME:
							{
							alt8=3;
							}
							break;
						case MOT:
							{
							alt8=4;
							}
							break;
						case TITRE:
							{
							alt8=5;
							}
							break;
					}
					switch (alt8) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:261:3: DATE ps= dat
							{
							match(input,DATE,FOLLOW_DATE_in_requete1134); 
							pushFollow(FOLLOW_dat_in_requete1140);
							ps=dat();
							state._fsp--;


									req_arbre.ajouteFils(new Arbre("","from datearticle"));
									req_arbre.ajouteFils(new Arbre("","where"));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:268:3: EMAIL ps= paramsEmail
							{
							match(input,EMAIL,FOLLOW_EMAIL_in_requete1149); 
							pushFollow(FOLLOW_paramsEmail_in_requete1155);
							ps=paramsEmail();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:275:3: THEME ps= paramsTheme
							{
							match(input,THEME,FOLLOW_THEME_in_requete1165); 
							pushFollow(FOLLOW_paramsTheme_in_requete1171);
							ps=paramsTheme();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 4 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:282:3: MOT ps= paramsMot
							{
							match(input,MOT,FOLLOW_MOT_in_requete1181); 
							pushFollow(FOLLOW_paramsMot_in_requete1187);
							ps=paramsMot();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 5 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:289:3: TITRE ps= paramsMot
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete1197); 
							pushFollow(FOLLOW_paramsMot_in_requete1203);
							ps=paramsMot();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from titre"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;

					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:299:3: ( ET DATE ps= dat | OU DATE ps= dat | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )*
					loop9:
					while (true) {
						int alt9=11;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==ET) ) {
							switch ( input.LA(2) ) {
							case DATE:
								{
								alt9=1;
								}
								break;
							case EMAIL:
								{
								alt9=3;
								}
								break;
							case THEME:
								{
								alt9=5;
								}
								break;
							case MOT:
								{
								alt9=7;
								}
								break;
							case TITRE:
								{
								alt9=9;
								}
								break;
							}
						}
						else if ( (LA9_0==OU) ) {
							switch ( input.LA(2) ) {
							case DATE:
								{
								alt9=2;
								}
								break;
							case EMAIL:
								{
								alt9=4;
								}
								break;
							case THEME:
								{
								alt9=6;
								}
								break;
							case MOT:
								{
								alt9=8;
								}
								break;
							case TITRE:
								{
								alt9=10;
								}
								break;
							}
						}

						switch (alt9) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:300:3: ET DATE ps= dat
							{
							match(input,ET,FOLLOW_ET_in_requete1227); 
							match(input,DATE,FOLLOW_DATE_in_requete1229); 
							pushFollow(FOLLOW_dat_in_requete1235);
							ps=dat();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
										req_arbre.ajouteFils(new Arbre("","from datearticle"));
										req_arbre.ajouteFils(new Arbre("","where"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:308:3: OU DATE ps= dat
							{
							match(input,OU,FOLLOW_OU_in_requete1244); 
							match(input,DATE,FOLLOW_DATE_in_requete1246); 
							pushFollow(FOLLOW_dat_in_requete1252);
							ps=dat();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
										req_arbre.ajouteFils(new Arbre("","from datearticle"));
										req_arbre.ajouteFils(new Arbre("","where"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:316:3: ET EMAIL ps= paramsEmail
							{
							match(input,ET,FOLLOW_ET_in_requete1261); 
							match(input,EMAIL,FOLLOW_EMAIL_in_requete1263); 
							pushFollow(FOLLOW_paramsEmail_in_requete1269);
							ps=paramsEmail();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 4 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:324:3: OU EMAIL ps= paramsEmail
							{
							match(input,OU,FOLLOW_OU_in_requete1279); 
							match(input,EMAIL,FOLLOW_EMAIL_in_requete1281); 
							pushFollow(FOLLOW_paramsEmail_in_requete1287);
							ps=paramsEmail();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 5 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:332:3: ET THEME ps= paramsTheme
							{
							match(input,ET,FOLLOW_ET_in_requete1297); 
							match(input,THEME,FOLLOW_THEME_in_requete1299); 
							pushFollow(FOLLOW_paramsTheme_in_requete1305);
							ps=paramsTheme();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 6 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:340:3: OU THEME ps= paramsTheme
							{
							match(input,OU,FOLLOW_OU_in_requete1315); 
							match(input,THEME,FOLLOW_THEME_in_requete1317); 
							pushFollow(FOLLOW_paramsTheme_in_requete1323);
							ps=paramsTheme();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 7 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:348:3: ET MOT ps= paramsMot
							{
							match(input,ET,FOLLOW_ET_in_requete1333); 
							match(input,MOT,FOLLOW_MOT_in_requete1335); 
							pushFollow(FOLLOW_paramsMot_in_requete1341);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 8 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:356:3: OU MOT ps= paramsMot
							{
							match(input,OU,FOLLOW_OU_in_requete1351); 
							match(input,MOT,FOLLOW_MOT_in_requete1353); 
							pushFollow(FOLLOW_paramsMot_in_requete1359);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
									  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 9 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:364:3: ET TITRE ps= paramsMot
							{
							match(input,ET,FOLLOW_ET_in_requete1369); 
							match(input,TITRE,FOLLOW_TITRE_in_requete1371); 
							pushFollow(FOLLOW_paramsMot_in_requete1377);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from titre"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 10 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:372:3: OU TITRE ps= paramsMot
							{
							match(input,OU,FOLLOW_OU_in_requete1387); 
							match(input,TITRE,FOLLOW_TITRE_in_requete1389); 
							pushFollow(FOLLOW_paramsMot_in_requete1395);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
									  	req_arbre.ajouteFils(new Arbre("","from titre"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "paramsTop"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:385:1: paramsTop returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramTop ;
	public final Arbre paramsTop() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;

		Arbre par1_arbre,par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:386:39: (par1= paramTop )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:387:3: par1= paramTop
			{
			pushFollow(FOLLOW_paramTop_in_paramsTop1431);
			par1=paramTop();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsTop"



	// $ANTLR start "paramTop"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:393:1: paramTop returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VARCHIFFRE ;
	public final Arbre paramTop() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:393:54: (a= VARCHIFFRE )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:394:2: a= VARCHIFFRE
			{
			a=(Token)match(input,VARCHIFFRE,FOLLOW_VARCHIFFRE_in_paramTop1451); 
			 
					lepar_arbre.ajouteFils(new Arbre("top ", a.getText()));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "paramTop"



	// $ANTLR start "paramsMot"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:402:1: paramsMot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramMot ( ( ET par2= paramMot | OU par2= paramMot ) )* ;
	public final Arbre paramsMot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:403:40: (par1= paramMot ( ( ET par2= paramMot | OU par2= paramMot ) )* )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:404:3: par1= paramMot ( ( ET par2= paramMot | OU par2= paramMot ) )*
			{
			pushFollow(FOLLOW_paramMot_in_paramsMot1485);
			par1=paramMot();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:408:3: ( ( ET par2= paramMot | OU par2= paramMot ) )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==ET) ) {
					int LA12_1 = input.LA(2);
					if ( (LA12_1==VAR) ) {
						alt12=1;
					}

				}
				else if ( (LA12_0==OU) ) {
					int LA12_2 = input.LA(2);
					if ( (LA12_2==VAR) ) {
						alt12=1;
					}

				}

				switch (alt12) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:408:4: ( ET par2= paramMot | OU par2= paramMot )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:408:4: ( ET par2= paramMot | OU par2= paramMot )
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ET) ) {
						alt11=1;
					}
					else if ( (LA11_0==OU) ) {
						alt11=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:408:5: ET par2= paramMot
							{
							match(input,ET,FOLLOW_ET_in_paramsMot1493); 
							pushFollow(FOLLOW_paramMot_in_paramsMot1499);
							par2=paramMot();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:413:5: OU par2= paramMot
							{
							match(input,OU,FOLLOW_OU_in_paramsMot1506); 
							pushFollow(FOLLOW_paramMot_in_paramsMot1512);
							par2=paramMot();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;

					}

					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsMot"



	// $ANTLR start "paramMot"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:421:1: paramMot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramMot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:421:54: (a= VAR )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:422:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramMot1537); 
			 
					lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "paramMot"



	// $ANTLR start "paramsEmail"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:431:1: paramsEmail returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramEmail ( ( ET par2= paramEmail | OU par2= paramEmail ) )* ;
	public final Arbre paramsEmail() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:432:40: (par1= paramEmail ( ( ET par2= paramEmail | OU par2= paramEmail ) )* )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:433:3: par1= paramEmail ( ( ET par2= paramEmail | OU par2= paramEmail ) )*
			{
			pushFollow(FOLLOW_paramEmail_in_paramsEmail1572);
			par1=paramEmail();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:437:3: ( ( ET par2= paramEmail | OU par2= paramEmail ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==ET) ) {
					int LA14_1 = input.LA(2);
					if ( (LA14_1==VAREMAIL) ) {
						alt14=1;
					}

				}
				else if ( (LA14_0==OU) ) {
					int LA14_2 = input.LA(2);
					if ( (LA14_2==VAREMAIL) ) {
						alt14=1;
					}

				}

				switch (alt14) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:437:4: ( ET par2= paramEmail | OU par2= paramEmail )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:437:4: ( ET par2= paramEmail | OU par2= paramEmail )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==ET) ) {
						alt13=1;
					}
					else if ( (LA13_0==OU) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:437:5: ET par2= paramEmail
							{
							match(input,ET,FOLLOW_ET_in_paramsEmail1580); 
							pushFollow(FOLLOW_paramEmail_in_paramsEmail1586);
							par2=paramEmail();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:442:5: OU par2= paramEmail
							{
							match(input,OU,FOLLOW_OU_in_paramsEmail1593); 
							pushFollow(FOLLOW_paramEmail_in_paramsEmail1599);
							par2=paramEmail();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;

					}

					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsEmail"



	// $ANTLR start "paramEmail"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:450:1: paramEmail returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAREMAIL ;
	public final Arbre paramEmail() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:450:56: (a= VAREMAIL )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:451:2: a= VAREMAIL
			{
			a=(Token)match(input,VAREMAIL,FOLLOW_VAREMAIL_in_paramEmail1624); 
			 
					lepar_arbre.ajouteFils(new Arbre("email =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "paramEmail"



	// $ANTLR start "paramsTheme"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:457:1: paramsTheme returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramTheme ( ( ET par2= paramTheme | OU par2= paramTheme ) )* ;
	public final Arbre paramsTheme() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:458:40: (par1= paramTheme ( ( ET par2= paramTheme | OU par2= paramTheme ) )* )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:459:3: par1= paramTheme ( ( ET par2= paramTheme | OU par2= paramTheme ) )*
			{
			pushFollow(FOLLOW_paramTheme_in_paramsTheme1656);
			par1=paramTheme();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:463:3: ( ( ET par2= paramTheme | OU par2= paramTheme ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==ET) ) {
					int LA16_1 = input.LA(2);
					if ( (LA16_1==VAR) ) {
						alt16=1;
					}

				}
				else if ( (LA16_0==OU) ) {
					int LA16_2 = input.LA(2);
					if ( (LA16_2==VAR) ) {
						alt16=1;
					}

				}

				switch (alt16) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:463:4: ( ET par2= paramTheme | OU par2= paramTheme )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:463:4: ( ET par2= paramTheme | OU par2= paramTheme )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ET) ) {
						alt15=1;
					}
					else if ( (LA15_0==OU) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:463:5: ET par2= paramTheme
							{
							match(input,ET,FOLLOW_ET_in_paramsTheme1664); 
							pushFollow(FOLLOW_paramTheme_in_paramsTheme1670);
							par2=paramTheme();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:468:5: OU par2= paramTheme
							{
							match(input,OU,FOLLOW_OU_in_paramsTheme1677); 
							pushFollow(FOLLOW_paramTheme_in_paramsTheme1683);
							par2=paramTheme();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;

					}

					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsTheme"



	// $ANTLR start "paramTheme"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:476:1: paramTheme returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramTheme() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:476:56: (a= VAR )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:477:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramTheme1708); 
			 
					lepar_arbre.ajouteFils(new Arbre("theme =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "paramTheme"



	// $ANTLR start "paramsDatPage"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:484:1: paramsDatPage returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= datPage ( ( ET par2= datPage | OU par2= datPage ) )* ;
	public final Arbre paramsDatPage() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:485:40: (par1= datPage ( ( ET par2= datPage | OU par2= datPage ) )* )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:486:3: par1= datPage ( ( ET par2= datPage | OU par2= datPage ) )*
			{
			pushFollow(FOLLOW_datPage_in_paramsDatPage1741);
			par1=datPage();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:490:3: ( ( ET par2= datPage | OU par2= datPage ) )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==ET||LA18_0==OU) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:490:4: ( ET par2= datPage | OU par2= datPage )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:490:4: ( ET par2= datPage | OU par2= datPage )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ET) ) {
						alt17=1;
					}
					else if ( (LA17_0==OU) ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:490:5: ET par2= datPage
							{
							match(input,ET,FOLLOW_ET_in_paramsDatPage1749); 
							pushFollow(FOLLOW_datPage_in_paramsDatPage1755);
							par2=datPage();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:495:5: OU par2= datPage
							{
							match(input,OU,FOLLOW_OU_in_paramsDatPage1762); 
							pushFollow(FOLLOW_datPage_in_paramsDatPage1768);
							par2=datPage();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;

					}

					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsDatPage"



	// $ANTLR start "paramsDat"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:504:1: paramsDat returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= dat ( ( ET par2= dat | OU par2= dat ) )* ;
	public final Arbre paramsDat() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:505:40: (par1= dat ( ( ET par2= dat | OU par2= dat ) )* )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:506:3: par1= dat ( ( ET par2= dat | OU par2= dat ) )*
			{
			pushFollow(FOLLOW_dat_in_paramsDat1802);
			par1=dat();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:510:3: ( ( ET par2= dat | OU par2= dat ) )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==ET||LA20_0==OU) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:510:4: ( ET par2= dat | OU par2= dat )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:510:4: ( ET par2= dat | OU par2= dat )
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ET) ) {
						alt19=1;
					}
					else if ( (LA19_0==OU) ) {
						alt19=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}

					switch (alt19) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:510:5: ET par2= dat
							{
							match(input,ET,FOLLOW_ET_in_paramsDat1809); 
							pushFollow(FOLLOW_dat_in_paramsDat1815);
							par2=dat();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:515:5: OU par2= dat
							{
							match(input,OU,FOLLOW_OU_in_paramsDat1822); 
							pushFollow(FOLLOW_dat_in_paramsDat1828);
							par2=dat();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;

					}

					}
					break;

				default :
					break loop20;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramsDat"



	// $ANTLR start "datPage"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:525:1: datPage returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= ANNEE |m= MOIS a= ANNEE |j= JJ m= MOIS a= ANNEE |j= JOUR m= MOIS a= ANNEE );
	public final Arbre datPage() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");
		Arbre les_pars_arbre =  new Arbre("");


		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:525:53: (a= ANNEE |m= MOIS a= ANNEE |j= JJ m= MOIS a= ANNEE |j= JOUR m= MOIS a= ANNEE )
			int alt21=4;
			switch ( input.LA(1) ) {
			case ANNEE:
				{
				alt21=1;
				}
				break;
			case MOIS:
				{
				alt21=2;
				}
				break;
			case JJ:
				{
				alt21=3;
				}
				break;
			case JOUR:
				{
				alt21=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:526:2: a= ANNEE
					{
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_datPage1855); 

							les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:529:4: m= MOIS a= ANNEE
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_datPage1866); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_datPage1872); 

							les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:533:4: j= JJ m= MOIS a= ANNEE
					{
					j=(Token)match(input,JJ,FOLLOW_JJ_in_datPage1883); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_datPage1889); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_datPage1895); 

							les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:538:4: j= JOUR m= MOIS a= ANNEE
					{
					j=(Token)match(input,JOUR,FOLLOW_JOUR_in_datPage1906); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_datPage1912); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_datPage1918); 

							les_pars_arbre.ajouteFils(new Arbre("", "jour = '" + j.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "datPage"



	// $ANTLR start "dat"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:547:1: dat returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= ANNEE |m= MOIS a= ANNEE |j= JJ m= MOIS a= ANNEE );
	public final Arbre dat() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");
		Arbre les_pars_arbre =  new Arbre("");


		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:547:49: (a= ANNEE |m= MOIS a= ANNEE |j= JJ m= MOIS a= ANNEE )
			int alt22=3;
			switch ( input.LA(1) ) {
			case ANNEE:
				{
				alt22=1;
				}
				break;
			case MOIS:
				{
				alt22=2;
				}
				break;
			case JJ:
				{
				alt22=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:548:2: a= ANNEE
					{
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dat1940); 

							les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:551:4: m= MOIS a= ANNEE
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1951); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dat1957); 

							les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:555:4: j= JJ m= MOIS a= ANNEE
					{
					j=(Token)match(input,JJ,FOLLOW_JJ_in_dat1968); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1974); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dat1980); 

							les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "dat"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes662 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete697 = new BitSet(new long[]{0x0000000000614280L});
	public static final BitSet FOLLOW_COUNT_in_requete705 = new BitSet(new long[]{0x0000000000614280L});
	public static final BitSet FOLLOW_PAGE_in_requete720 = new BitSet(new long[]{0x0000000000604280L});
	public static final BitSet FOLLOW_DATE_in_requete738 = new BitSet(new long[]{0x0000000000003810L});
	public static final BitSet FOLLOW_datPage_in_requete744 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_EMAIL_in_requete753 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete759 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_THEME_in_requete769 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete775 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_MOT_in_requete785 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete791 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_TITRE_in_requete801 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete807 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_requete830 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete832 = new BitSet(new long[]{0x0000000000003810L});
	public static final BitSet FOLLOW_datPage_in_requete838 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_requete847 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete849 = new BitSet(new long[]{0x0000000000003810L});
	public static final BitSet FOLLOW_datPage_in_requete855 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_requete864 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_EMAIL_in_requete866 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete872 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_requete882 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_EMAIL_in_requete884 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete890 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_requete900 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_THEME_in_requete902 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete908 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_requete918 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_THEME_in_requete920 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete926 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_requete936 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOT_in_requete938 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete944 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_requete954 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOT_in_requete956 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete962 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_requete972 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TITRE_in_requete974 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete980 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_requete990 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TITRE_in_requete992 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete998 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_SELECT_in_requete1028 = new BitSet(new long[]{0x00000000010C0120L});
	public static final BitSet FOLLOW_COUNT_in_requete1036 = new BitSet(new long[]{0x00000000010C0120L});
	public static final BitSet FOLLOW_PREMIER_in_requete1052 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_paramsTop_in_requete1066 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PREMIER_in_requete1068 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_DERNIER_in_requete1078 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_paramsTop_in_requete1091 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DERNIER_in_requete1093 = new BitSet(new long[]{0x0000000000080020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1107 = new BitSet(new long[]{0x000000000060C682L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1116 = new BitSet(new long[]{0x000000000060C682L});
	public static final BitSet FOLLOW_DATE_in_requete1134 = new BitSet(new long[]{0x0000000000002810L});
	public static final BitSet FOLLOW_dat_in_requete1140 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_EMAIL_in_requete1149 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete1155 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_THEME_in_requete1165 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete1171 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_MOT_in_requete1181 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1187 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_TITRE_in_requete1197 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1203 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_requete1227 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete1229 = new BitSet(new long[]{0x0000000000002810L});
	public static final BitSet FOLLOW_dat_in_requete1235 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_requete1244 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete1246 = new BitSet(new long[]{0x0000000000002810L});
	public static final BitSet FOLLOW_dat_in_requete1252 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_requete1261 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_EMAIL_in_requete1263 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete1269 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_requete1279 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_EMAIL_in_requete1281 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete1287 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_requete1297 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_THEME_in_requete1299 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete1305 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_requete1315 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_THEME_in_requete1317 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete1323 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_requete1333 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOT_in_requete1335 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1341 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_requete1351 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOT_in_requete1353 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1359 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_requete1369 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TITRE_in_requete1371 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1377 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_requete1387 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TITRE_in_requete1389 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1395 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_paramTop_in_paramsTop1431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARCHIFFRE_in_paramTop1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1485 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_paramsMot1493 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1499 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_paramsMot1506 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1512 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_VAR_in_paramMot1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramEmail_in_paramsEmail1572 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_paramsEmail1580 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_paramEmail_in_paramsEmail1586 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_paramsEmail1593 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_paramEmail_in_paramsEmail1599 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_VAREMAIL_in_paramEmail1624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramTheme_in_paramsTheme1656 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_paramsTheme1664 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramTheme_in_paramsTheme1670 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_paramsTheme1677 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_paramTheme_in_paramsTheme1683 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_VAR_in_paramTheme1708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datPage_in_paramsDatPage1741 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_paramsDatPage1749 = new BitSet(new long[]{0x0000000000003810L});
	public static final BitSet FOLLOW_datPage_in_paramsDatPage1755 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_paramsDatPage1762 = new BitSet(new long[]{0x0000000000003810L});
	public static final BitSet FOLLOW_datPage_in_paramsDatPage1768 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_dat_in_paramsDat1802 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ET_in_paramsDat1809 = new BitSet(new long[]{0x0000000000002810L});
	public static final BitSet FOLLOW_dat_in_paramsDat1815 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_OU_in_paramsDat1822 = new BitSet(new long[]{0x0000000000002810L});
	public static final BitSet FOLLOW_dat_in_paramsDat1828 = new BitSet(new long[]{0x0000000000008402L});
	public static final BitSet FOLLOW_ANNEE_in_datPage1855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_datPage1866 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_datPage1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JJ_in_datPage1883 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOIS_in_datPage1889 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_datPage1895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_datPage1906 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOIS_in_datPage1912 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_datPage1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_dat1940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat1951 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_dat1957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JJ_in_dat1968 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOIS_in_dat1974 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_dat1980 = new BitSet(new long[]{0x0000000000000002L});
}
