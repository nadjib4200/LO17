package antlr.output;

// $ANTLR 3.5.1 /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g 2014-05-11 13:38:34

import org.antlr.runtime.*;

import antlr.annexe.Arbre;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sql6Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "COUNT", "DATE", 
		"EMAIL", "ET", "JJ", "JOUR", "MOIS", "MOT", "OU", "PAGE", "POINT", "RUBRIQUE", 
		"SELECT", "THEME", "TITRE", "VAR", "VAREMAIL", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int COUNT=6;
	public static final int DATE=7;
	public static final int EMAIL=8;
	public static final int ET=9;
	public static final int JJ=10;
	public static final int JOUR=11;
	public static final int MOIS=12;
	public static final int MOT=13;
	public static final int OU=14;
	public static final int PAGE=15;
	public static final int POINT=16;
	public static final int RUBRIQUE=17;
	public static final int SELECT=18;
	public static final int THEME=19;
	public static final int TITRE=20;
	public static final int VAR=21;
	public static final int VAREMAIL=22;
	public static final int WS=23;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sql6Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sql6Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sql6Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g"; }



	// $ANTLR start "listerequetes"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:74:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:75:25: (r= requete POINT )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:76:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes541);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes543); 

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
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:83:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT | COUNT ) PAGE ( DATE ps= datPage | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot ) ( DATE ps= datPage | ET DATE ps= datPage | OU DATE ps= datPage | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )* | ( SELECT | COUNT ) ( ARTICLE | RUBRIQUE ) ( DATE ps= dat | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot )+ ( DATE ps= dat ET DATE ps= dat | OU DATE ps= dat | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )* );
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:84:26: ( ( SELECT | COUNT ) PAGE ( DATE ps= datPage | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot ) ( DATE ps= datPage | ET DATE ps= datPage | OU DATE ps= datPage | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )* | ( SELECT | COUNT ) ( ARTICLE | RUBRIQUE ) ( DATE ps= dat | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot )+ ( DATE ps= dat ET DATE ps= dat | OU DATE ps= dat | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )* )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==SELECT) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==PAGE) ) {
					alt8=1;
				}
				else if ( (LA8_1==ARTICLE||LA8_1==RUBRIQUE) ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA8_0==COUNT) ) {
				int LA8_2 = input.LA(2);
				if ( (LA8_2==PAGE) ) {
					alt8=1;
				}
				else if ( (LA8_2==ARTICLE||LA8_2==RUBRIQUE) ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:86:3: ( SELECT | COUNT ) PAGE ( DATE ps= datPage | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot ) ( DATE ps= datPage | ET DATE ps= datPage | OU DATE ps= datPage | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )*
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:86:3: ( SELECT | COUNT )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==SELECT) ) {
						alt1=1;
					}
					else if ( (LA1_0==COUNT) ) {
						alt1=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:87:3: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete576); 
							req_arbre.ajouteFils(new Arbre("","select distinct"));
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:88:5: COUNT
							{
							match(input,COUNT,FOLLOW_COUNT_in_requete584); 
							req_arbre.ajouteFils(new Arbre("","select count(*)"));
							}
							break;

					}

					match(input,PAGE,FOLLOW_PAGE_in_requete597); 
					req_arbre.ajouteFils(new Arbre("","page"));
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:92:3: ( DATE ps= datPage | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot )
					int alt2=5;
					switch ( input.LA(1) ) {
					case DATE:
						{
						alt2=1;
						}
						break;
					case EMAIL:
						{
						alt2=2;
						}
						break;
					case THEME:
						{
						alt2=3;
						}
						break;
					case MOT:
						{
						alt2=4;
						}
						break;
					case TITRE:
						{
						alt2=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:93:3: DATE ps= datPage
							{
							match(input,DATE,FOLLOW_DATE_in_requete607); 
							pushFollow(FOLLOW_datPage_in_requete613);
							ps=datPage();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","from datepage"));
										req_arbre.ajouteFils(new Arbre("","where"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);	
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:100:3: EMAIL ps= paramsEmail
							{
							match(input,EMAIL,FOLLOW_EMAIL_in_requete622); 
							pushFollow(FOLLOW_paramsEmail_in_requete628);
							ps=paramsEmail();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:107:3: THEME ps= paramsTheme
							{
							match(input,THEME,FOLLOW_THEME_in_requete638); 
							pushFollow(FOLLOW_paramsTheme_in_requete644);
							ps=paramsTheme();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 4 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:114:3: MOT ps= paramsMot
							{
							match(input,MOT,FOLLOW_MOT_in_requete654); 
							pushFollow(FOLLOW_paramsMot_in_requete660);
							ps=paramsMot();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 5 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:121:3: TITRE ps= paramsMot
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete670); 
							pushFollow(FOLLOW_paramsMot_in_requete676);
							ps=paramsMot();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from titre"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;

					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:131:3: ( DATE ps= datPage | ET DATE ps= datPage | OU DATE ps= datPage | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )*
					loop3:
					while (true) {
						int alt3=12;
						switch ( input.LA(1) ) {
						case DATE:
							{
							alt3=1;
							}
							break;
						case ET:
							{
							switch ( input.LA(2) ) {
							case DATE:
								{
								alt3=2;
								}
								break;
							case EMAIL:
								{
								alt3=4;
								}
								break;
							case THEME:
								{
								alt3=6;
								}
								break;
							case MOT:
								{
								alt3=8;
								}
								break;
							case TITRE:
								{
								alt3=10;
								}
								break;
							}
							}
							break;
						case OU:
							{
							switch ( input.LA(2) ) {
							case DATE:
								{
								alt3=3;
								}
								break;
							case EMAIL:
								{
								alt3=5;
								}
								break;
							case THEME:
								{
								alt3=7;
								}
								break;
							case MOT:
								{
								alt3=9;
								}
								break;
							case TITRE:
								{
								alt3=11;
								}
								break;
							}
							}
							break;
						}
						switch (alt3) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:132:3: DATE ps= datPage
							{
							match(input,DATE,FOLLOW_DATE_in_requete699); 
							pushFollow(FOLLOW_datPage_in_requete705);
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:140:3: ET DATE ps= datPage
							{
							match(input,ET,FOLLOW_ET_in_requete714); 
							match(input,DATE,FOLLOW_DATE_in_requete716); 
							pushFollow(FOLLOW_datPage_in_requete722);
							ps=datPage();
							state._fsp--;


									req_arbre.ajouteFils(new Arbre("","AND"));
									req_arbre.ajouteFils(new Arbre("","from datepage"));
									req_arbre.ajouteFils(new Arbre("","where"));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);	
									
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:148:3: OU DATE ps= datPage
							{
							match(input,OU,FOLLOW_OU_in_requete731); 
							match(input,DATE,FOLLOW_DATE_in_requete733); 
							pushFollow(FOLLOW_datPage_in_requete739);
							ps=datPage();
							state._fsp--;


									req_arbre.ajouteFils(new Arbre("","AND"));
									req_arbre.ajouteFils(new Arbre("","from datepage"));
									req_arbre.ajouteFils(new Arbre("","where"));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);	
									
							}
							break;
						case 4 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:156:3: ET EMAIL ps= paramsEmail
							{
							match(input,ET,FOLLOW_ET_in_requete748); 
							match(input,EMAIL,FOLLOW_EMAIL_in_requete750); 
							pushFollow(FOLLOW_paramsEmail_in_requete756);
							ps=paramsEmail();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 5 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:164:3: OU EMAIL ps= paramsEmail
							{
							match(input,OU,FOLLOW_OU_in_requete766); 
							match(input,EMAIL,FOLLOW_EMAIL_in_requete768); 
							pushFollow(FOLLOW_paramsEmail_in_requete774);
							ps=paramsEmail();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 6 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:172:3: ET THEME ps= paramsTheme
							{
							match(input,ET,FOLLOW_ET_in_requete784); 
							match(input,THEME,FOLLOW_THEME_in_requete786); 
							pushFollow(FOLLOW_paramsTheme_in_requete792);
							ps=paramsTheme();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 7 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:180:3: OU THEME ps= paramsTheme
							{
							match(input,OU,FOLLOW_OU_in_requete802); 
							match(input,THEME,FOLLOW_THEME_in_requete804); 
							pushFollow(FOLLOW_paramsTheme_in_requete810);
							ps=paramsTheme();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 8 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:188:3: ET MOT ps= paramsMot
							{
							match(input,ET,FOLLOW_ET_in_requete820); 
							match(input,MOT,FOLLOW_MOT_in_requete822); 
							pushFollow(FOLLOW_paramsMot_in_requete828);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 9 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:196:3: OU MOT ps= paramsMot
							{
							match(input,OU,FOLLOW_OU_in_requete838); 
							match(input,MOT,FOLLOW_MOT_in_requete840); 
							pushFollow(FOLLOW_paramsMot_in_requete846);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","OR"));
									  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 10 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:204:3: ET TITRE ps= paramsMot
							{
							match(input,ET,FOLLOW_ET_in_requete856); 
							match(input,TITRE,FOLLOW_TITRE_in_requete858); 
							pushFollow(FOLLOW_paramsMot_in_requete864);
							ps=paramsMot();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from titre"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 11 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:212:3: OU TITRE ps= paramsMot
							{
							match(input,OU,FOLLOW_OU_in_requete874); 
							match(input,TITRE,FOLLOW_TITRE_in_requete876); 
							pushFollow(FOLLOW_paramsMot_in_requete882);
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
							break loop3;
						}
					}

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:225:3: ( SELECT | COUNT ) ( ARTICLE | RUBRIQUE ) ( DATE ps= dat | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot )+ ( DATE ps= dat ET DATE ps= dat | OU DATE ps= dat | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )*
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:225:3: ( SELECT | COUNT )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==SELECT) ) {
						alt4=1;
					}
					else if ( (LA4_0==COUNT) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:226:3: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete912); 
							req_arbre.ajouteFils(new Arbre("","select distinct"));
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:227:5: COUNT
							{
							match(input,COUNT,FOLLOW_COUNT_in_requete920); 
							req_arbre.ajouteFils(new Arbre("","select count(*)"));
							}
							break;

					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:230:3: ( ARTICLE | RUBRIQUE )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ARTICLE) ) {
						alt5=1;
					}
					else if ( (LA5_0==RUBRIQUE) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:230:4: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete934); 
							req_arbre.ajouteFils(new Arbre("","article"));
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:231:6: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete943); 
							req_arbre.ajouteFils(new Arbre("","rubrique"));
							}
							break;

					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:234:3: ( DATE ps= dat | EMAIL ps= paramsEmail | THEME ps= paramsTheme | MOT ps= paramsMot | TITRE ps= paramsMot )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=6;
						switch ( input.LA(1) ) {
						case DATE:
							{
							switch ( input.LA(2) ) {
							case ANNEE:
								{
								int LA6_7 = input.LA(3);
								if ( (LA6_7==ET) ) {
									int LA6_10 = input.LA(4);
									if ( (LA6_10==EMAIL||LA6_10==MOT||(LA6_10 >= THEME && LA6_10 <= TITRE)) ) {
										alt6=1;
									}

								}
								else if ( ((LA6_7 >= DATE && LA6_7 <= EMAIL)||(LA6_7 >= MOT && LA6_7 <= OU)||LA6_7==POINT||(LA6_7 >= THEME && LA6_7 <= TITRE)) ) {
									alt6=1;
								}

								}
								break;
							case MOIS:
								{
								int LA6_8 = input.LA(3);
								if ( (LA6_8==ANNEE) ) {
									int LA6_12 = input.LA(4);
									if ( (LA6_12==ET) ) {
										int LA6_10 = input.LA(5);
										if ( (LA6_10==EMAIL||LA6_10==MOT||(LA6_10 >= THEME && LA6_10 <= TITRE)) ) {
											alt6=1;
										}

									}
									else if ( ((LA6_12 >= DATE && LA6_12 <= EMAIL)||(LA6_12 >= MOT && LA6_12 <= OU)||LA6_12==POINT||(LA6_12 >= THEME && LA6_12 <= TITRE)) ) {
										alt6=1;
									}

								}

								}
								break;
							case JJ:
								{
								int LA6_9 = input.LA(3);
								if ( (LA6_9==MOIS) ) {
									int LA6_13 = input.LA(4);
									if ( (LA6_13==ANNEE) ) {
										int LA6_14 = input.LA(5);
										if ( (LA6_14==ET) ) {
											int LA6_10 = input.LA(6);
											if ( (LA6_10==EMAIL||LA6_10==MOT||(LA6_10 >= THEME && LA6_10 <= TITRE)) ) {
												alt6=1;
											}

										}
										else if ( ((LA6_14 >= DATE && LA6_14 <= EMAIL)||(LA6_14 >= MOT && LA6_14 <= OU)||LA6_14==POINT||(LA6_14 >= THEME && LA6_14 <= TITRE)) ) {
											alt6=1;
										}

									}

								}

								}
								break;
							}
							}
							break;
						case EMAIL:
							{
							alt6=2;
							}
							break;
						case THEME:
							{
							alt6=3;
							}
							break;
						case MOT:
							{
							alt6=4;
							}
							break;
						case TITRE:
							{
							alt6=5;
							}
							break;
						}
						switch (alt6) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:235:3: DATE ps= dat
							{
							match(input,DATE,FOLLOW_DATE_in_requete961); 
							pushFollow(FOLLOW_dat_in_requete967);
							ps=dat();
							state._fsp--;


									req_arbre.ajouteFils(new Arbre("","from datearticle"));
									req_arbre.ajouteFils(new Arbre("","where"));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:242:3: EMAIL ps= paramsEmail
							{
							match(input,EMAIL,FOLLOW_EMAIL_in_requete976); 
							pushFollow(FOLLOW_paramsEmail_in_requete982);
							ps=paramsEmail();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:249:3: THEME ps= paramsTheme
							{
							match(input,THEME,FOLLOW_THEME_in_requete992); 
							pushFollow(FOLLOW_paramsTheme_in_requete998);
							ps=paramsTheme();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 4 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:256:3: MOT ps= paramsMot
							{
							match(input,MOT,FOLLOW_MOT_in_requete1008); 
							pushFollow(FOLLOW_paramsMot_in_requete1014);
							ps=paramsMot();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from titreresume"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 5 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:263:3: TITRE ps= paramsMot
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete1024); 
							pushFollow(FOLLOW_paramsMot_in_requete1030);
							ps=paramsMot();
							state._fsp--;


									  	req_arbre.ajouteFils(new Arbre("","from titre"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:273:3: ( DATE ps= dat ET DATE ps= dat | OU DATE ps= dat | ET EMAIL ps= paramsEmail | OU EMAIL ps= paramsEmail | ET THEME ps= paramsTheme | OU THEME ps= paramsTheme | ET MOT ps= paramsMot | OU MOT ps= paramsMot | ET TITRE ps= paramsMot | OU TITRE ps= paramsMot )*
					loop7:
					while (true) {
						int alt7=11;
						switch ( input.LA(1) ) {
						case DATE:
							{
							alt7=1;
							}
							break;
						case OU:
							{
							switch ( input.LA(2) ) {
							case DATE:
								{
								alt7=2;
								}
								break;
							case EMAIL:
								{
								alt7=4;
								}
								break;
							case THEME:
								{
								alt7=6;
								}
								break;
							case MOT:
								{
								alt7=8;
								}
								break;
							case TITRE:
								{
								alt7=10;
								}
								break;
							}
							}
							break;
						case ET:
							{
							switch ( input.LA(2) ) {
							case EMAIL:
								{
								alt7=3;
								}
								break;
							case THEME:
								{
								alt7=5;
								}
								break;
							case MOT:
								{
								alt7=7;
								}
								break;
							case TITRE:
								{
								alt7=9;
								}
								break;
							}
							}
							break;
						}
						switch (alt7) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:274:3: DATE ps= dat ET DATE ps= dat
							{
							match(input,DATE,FOLLOW_DATE_in_requete1054); 
							pushFollow(FOLLOW_dat_in_requete1060);
							ps=dat();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
										req_arbre.ajouteFils(new Arbre("","from datearticle"));
										req_arbre.ajouteFils(new Arbre("","where"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							match(input,ET,FOLLOW_ET_in_requete1065); 
							match(input,DATE,FOLLOW_DATE_in_requete1067); 
							pushFollow(FOLLOW_dat_in_requete1073);
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:289:3: OU DATE ps= dat
							{
							match(input,OU,FOLLOW_OU_in_requete1082); 
							match(input,DATE,FOLLOW_DATE_in_requete1084); 
							pushFollow(FOLLOW_dat_in_requete1090);
							ps=dat();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
										req_arbre.ajouteFils(new Arbre("","from datearticle"));
										req_arbre.ajouteFils(new Arbre("","where"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:297:3: ET EMAIL ps= paramsEmail
							{
							match(input,ET,FOLLOW_ET_in_requete1099); 
							match(input,EMAIL,FOLLOW_EMAIL_in_requete1101); 
							pushFollow(FOLLOW_paramsEmail_in_requete1107);
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:305:3: OU EMAIL ps= paramsEmail
							{
							match(input,OU,FOLLOW_OU_in_requete1117); 
							match(input,EMAIL,FOLLOW_EMAIL_in_requete1119); 
							pushFollow(FOLLOW_paramsEmail_in_requete1125);
							ps=paramsEmail();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","AND"));
									  	req_arbre.ajouteFils(new Arbre("","from email"));
									      	req_arbre.ajouteFils(new Arbre("","where"));
									  	ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 5 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:313:3: ET THEME ps= paramsTheme
							{
							match(input,ET,FOLLOW_ET_in_requete1135); 
							match(input,THEME,FOLLOW_THEME_in_requete1137); 
							pushFollow(FOLLOW_paramsTheme_in_requete1143);
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:321:3: OU THEME ps= paramsTheme
							{
							match(input,OU,FOLLOW_OU_in_requete1153); 
							match(input,THEME,FOLLOW_THEME_in_requete1155); 
							pushFollow(FOLLOW_paramsTheme_in_requete1161);
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:329:3: ET MOT ps= paramsMot
							{
							match(input,ET,FOLLOW_ET_in_requete1171); 
							match(input,MOT,FOLLOW_MOT_in_requete1173); 
							pushFollow(FOLLOW_paramsMot_in_requete1179);
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:337:3: OU MOT ps= paramsMot
							{
							match(input,OU,FOLLOW_OU_in_requete1189); 
							match(input,MOT,FOLLOW_MOT_in_requete1191); 
							pushFollow(FOLLOW_paramsMot_in_requete1197);
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:345:3: ET TITRE ps= paramsMot
							{
							match(input,ET,FOLLOW_ET_in_requete1207); 
							match(input,TITRE,FOLLOW_TITRE_in_requete1209); 
							pushFollow(FOLLOW_paramsMot_in_requete1215);
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:353:3: OU TITRE ps= paramsMot
							{
							match(input,OU,FOLLOW_OU_in_requete1225); 
							match(input,TITRE,FOLLOW_TITRE_in_requete1227); 
							pushFollow(FOLLOW_paramsMot_in_requete1233);
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
							break loop7;
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



	// $ANTLR start "paramsMot"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:371:1: paramsMot returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramMot ( ( ET par2= paramMot | OU par2= paramMot ) )* ;
	public final Arbre paramsMot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:372:40: (par1= paramMot ( ( ET par2= paramMot | OU par2= paramMot ) )* )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:373:3: par1= paramMot ( ( ET par2= paramMot | OU par2= paramMot ) )*
			{
			pushFollow(FOLLOW_paramMot_in_paramsMot1274);
			par1=paramMot();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:377:3: ( ( ET par2= paramMot | OU par2= paramMot ) )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==ET) ) {
					int LA10_2 = input.LA(2);
					if ( (LA10_2==VAR) ) {
						alt10=1;
					}

				}
				else if ( (LA10_0==OU) ) {
					int LA10_3 = input.LA(2);
					if ( (LA10_3==VAR) ) {
						alt10=1;
					}

				}

				switch (alt10) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:377:4: ( ET par2= paramMot | OU par2= paramMot )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:377:4: ( ET par2= paramMot | OU par2= paramMot )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==ET) ) {
						alt9=1;
					}
					else if ( (LA9_0==OU) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:377:5: ET par2= paramMot
							{
							match(input,ET,FOLLOW_ET_in_paramsMot1282); 
							pushFollow(FOLLOW_paramMot_in_paramsMot1288);
							par2=paramMot();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:382:5: OU par2= paramMot
							{
							match(input,OU,FOLLOW_OU_in_paramsMot1295); 
							pushFollow(FOLLOW_paramMot_in_paramsMot1301);
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
					break loop10;
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
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:390:1: paramMot returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramMot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:390:54: (a= VAR )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:391:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramMot1326); 
			 
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
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:400:1: paramsEmail returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramEmail ( ( ET par2= paramEmail | OU par2= paramEmail ) )* ;
	public final Arbre paramsEmail() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:401:40: (par1= paramEmail ( ( ET par2= paramEmail | OU par2= paramEmail ) )* )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:402:3: par1= paramEmail ( ( ET par2= paramEmail | OU par2= paramEmail ) )*
			{
			pushFollow(FOLLOW_paramEmail_in_paramsEmail1361);
			par1=paramEmail();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:406:3: ( ( ET par2= paramEmail | OU par2= paramEmail ) )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==ET) ) {
					int LA12_2 = input.LA(2);
					if ( (LA12_2==VAREMAIL) ) {
						alt12=1;
					}

				}
				else if ( (LA12_0==OU) ) {
					int LA12_3 = input.LA(2);
					if ( (LA12_3==VAREMAIL) ) {
						alt12=1;
					}

				}

				switch (alt12) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:406:4: ( ET par2= paramEmail | OU par2= paramEmail )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:406:4: ( ET par2= paramEmail | OU par2= paramEmail )
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:406:5: ET par2= paramEmail
							{
							match(input,ET,FOLLOW_ET_in_paramsEmail1369); 
							pushFollow(FOLLOW_paramEmail_in_paramsEmail1375);
							par2=paramEmail();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:411:5: OU par2= paramEmail
							{
							match(input,OU,FOLLOW_OU_in_paramsEmail1382); 
							pushFollow(FOLLOW_paramEmail_in_paramsEmail1388);
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
	// $ANTLR end "paramsEmail"



	// $ANTLR start "paramEmail"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:419:1: paramEmail returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAREMAIL ;
	public final Arbre paramEmail() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:419:56: (a= VAREMAIL )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:420:2: a= VAREMAIL
			{
			a=(Token)match(input,VAREMAIL,FOLLOW_VAREMAIL_in_paramEmail1413); 
			 
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
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:426:1: paramsTheme returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramTheme ( ( ET par2= paramTheme | OU par2= paramTheme ) )* ;
	public final Arbre paramsTheme() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:427:40: (par1= paramTheme ( ( ET par2= paramTheme | OU par2= paramTheme ) )* )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:428:3: par1= paramTheme ( ( ET par2= paramTheme | OU par2= paramTheme ) )*
			{
			pushFollow(FOLLOW_paramTheme_in_paramsTheme1445);
			par1=paramTheme();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:432:3: ( ( ET par2= paramTheme | OU par2= paramTheme ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==ET) ) {
					int LA14_2 = input.LA(2);
					if ( (LA14_2==VAR) ) {
						alt14=1;
					}

				}
				else if ( (LA14_0==OU) ) {
					int LA14_3 = input.LA(2);
					if ( (LA14_3==VAR) ) {
						alt14=1;
					}

				}

				switch (alt14) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:432:4: ( ET par2= paramTheme | OU par2= paramTheme )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:432:4: ( ET par2= paramTheme | OU par2= paramTheme )
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:432:5: ET par2= paramTheme
							{
							match(input,ET,FOLLOW_ET_in_paramsTheme1453); 
							pushFollow(FOLLOW_paramTheme_in_paramsTheme1459);
							par2=paramTheme();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:437:5: OU par2= paramTheme
							{
							match(input,OU,FOLLOW_OU_in_paramsTheme1466); 
							pushFollow(FOLLOW_paramTheme_in_paramsTheme1472);
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
	// $ANTLR end "paramsTheme"



	// $ANTLR start "paramTheme"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:445:1: paramTheme returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramTheme() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:445:56: (a= VAR )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:446:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramTheme1497); 
			 
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
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:453:1: paramsDatPage returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= datPage ( ( ET par2= datPage | OU par2= datPage ) )* ;
	public final Arbre paramsDatPage() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:454:40: (par1= datPage ( ( ET par2= datPage | OU par2= datPage ) )* )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:455:3: par1= datPage ( ( ET par2= datPage | OU par2= datPage ) )*
			{
			pushFollow(FOLLOW_datPage_in_paramsDatPage1530);
			par1=datPage();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:459:3: ( ( ET par2= datPage | OU par2= datPage ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==ET||LA16_0==OU) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:459:4: ( ET par2= datPage | OU par2= datPage )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:459:4: ( ET par2= datPage | OU par2= datPage )
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:459:5: ET par2= datPage
							{
							match(input,ET,FOLLOW_ET_in_paramsDatPage1538); 
							pushFollow(FOLLOW_datPage_in_paramsDatPage1544);
							par2=datPage();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:464:5: OU par2= datPage
							{
							match(input,OU,FOLLOW_OU_in_paramsDatPage1551); 
							pushFollow(FOLLOW_datPage_in_paramsDatPage1557);
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
	// $ANTLR end "paramsDatPage"



	// $ANTLR start "paramsDat"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:473:1: paramsDat returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= dat ( ( ET par2= dat | OU par2= dat ) )* ;
	public final Arbre paramsDat() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:474:40: (par1= dat ( ( ET par2= dat | OU par2= dat ) )* )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:475:3: par1= dat ( ( ET par2= dat | OU par2= dat ) )*
			{
			pushFollow(FOLLOW_dat_in_paramsDat1591);
			par1=dat();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
					
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:479:3: ( ( ET par2= dat | OU par2= dat ) )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==ET||LA18_0==OU) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:479:4: ( ET par2= dat | OU par2= dat )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:479:4: ( ET par2= dat | OU par2= dat )
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:479:5: ET par2= dat
							{
							match(input,ET,FOLLOW_ET_in_paramsDat1598); 
							pushFollow(FOLLOW_dat_in_paramsDat1604);
							par2=dat();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											les_pars_arbre.ajouteFils(par2_arbre);
									
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:484:5: OU par2= dat
							{
							match(input,OU,FOLLOW_OU_in_paramsDat1611); 
							pushFollow(FOLLOW_dat_in_paramsDat1617);
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
	// $ANTLR end "paramsDat"



	// $ANTLR start "datPage"
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:494:1: datPage returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= ANNEE |m= MOIS a= ANNEE |j= JJ m= MOIS a= ANNEE |j= JOUR m= MOIS a= ANNEE );
	public final Arbre datPage() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");
		Arbre les_pars_arbre =  new Arbre("");


		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:494:53: (a= ANNEE |m= MOIS a= ANNEE |j= JJ m= MOIS a= ANNEE |j= JOUR m= MOIS a= ANNEE )
			int alt19=4;
			switch ( input.LA(1) ) {
			case ANNEE:
				{
				alt19=1;
				}
				break;
			case MOIS:
				{
				alt19=2;
				}
				break;
			case JJ:
				{
				alt19=3;
				}
				break;
			case JOUR:
				{
				alt19=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:495:2: a= ANNEE
					{
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_datPage1644); 

							les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:498:4: m= MOIS a= ANNEE
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_datPage1655); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_datPage1661); 

							les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:502:4: j= JJ m= MOIS a= ANNEE
					{
					j=(Token)match(input,JJ,FOLLOW_JJ_in_datPage1672); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_datPage1678); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_datPage1684); 

							les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:507:4: j= JOUR m= MOIS a= ANNEE
					{
					j=(Token)match(input,JOUR,FOLLOW_JOUR_in_datPage1695); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_datPage1701); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_datPage1707); 

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
	// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:516:1: dat returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= ANNEE |m= MOIS a= ANNEE |j= JJ m= MOIS a= ANNEE );
	public final Arbre dat() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");
		Arbre les_pars_arbre =  new Arbre("");

		
		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:516:49: (a= ANNEE |m= MOIS a= ANNEE |j= JJ m= MOIS a= ANNEE )
			int alt20=3;
			switch ( input.LA(1) ) {
			case ANNEE:
				{
				alt20=1;
				}
				break;
			case MOIS:
				{
				alt20=2;
				}
				break;
			case JJ:
				{
				alt20=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:517:2: a= ANNEE
					{
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dat1729); 

							les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:520:4: m= MOIS a= ANNEE
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1740); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dat1746); 

							les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:524:4: j= JJ m= MOIS a= ANNEE
					{
					j=(Token)match(input,JJ,FOLLOW_JJ_in_dat1757); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1763); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dat1769); 

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



	public static final BitSet FOLLOW_requete_in_listerequetes541 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete576 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_COUNT_in_requete584 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_PAGE_in_requete597 = new BitSet(new long[]{0x0000000000182180L});
	public static final BitSet FOLLOW_DATE_in_requete607 = new BitSet(new long[]{0x0000000000001C10L});
	public static final BitSet FOLLOW_datPage_in_requete613 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_EMAIL_in_requete622 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete628 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_THEME_in_requete638 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete644 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_MOT_in_requete654 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete660 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_TITRE_in_requete670 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete676 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_DATE_in_requete699 = new BitSet(new long[]{0x0000000000001C10L});
	public static final BitSet FOLLOW_datPage_in_requete705 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_ET_in_requete714 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete716 = new BitSet(new long[]{0x0000000000001C10L});
	public static final BitSet FOLLOW_datPage_in_requete722 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_OU_in_requete731 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete733 = new BitSet(new long[]{0x0000000000001C10L});
	public static final BitSet FOLLOW_datPage_in_requete739 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_ET_in_requete748 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EMAIL_in_requete750 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete756 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_OU_in_requete766 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EMAIL_in_requete768 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete774 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_ET_in_requete784 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_THEME_in_requete786 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete792 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_OU_in_requete802 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_THEME_in_requete804 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete810 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_ET_in_requete820 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete822 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete828 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_OU_in_requete838 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete840 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete846 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_ET_in_requete856 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_TITRE_in_requete858 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete864 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_OU_in_requete874 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_TITRE_in_requete876 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete882 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_SELECT_in_requete912 = new BitSet(new long[]{0x0000000000020020L});
	public static final BitSet FOLLOW_COUNT_in_requete920 = new BitSet(new long[]{0x0000000000020020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete934 = new BitSet(new long[]{0x0000000000182180L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete943 = new BitSet(new long[]{0x0000000000182180L});
	public static final BitSet FOLLOW_DATE_in_requete961 = new BitSet(new long[]{0x0000000000001410L});
	public static final BitSet FOLLOW_dat_in_requete967 = new BitSet(new long[]{0x0000000000186382L});
	public static final BitSet FOLLOW_EMAIL_in_requete976 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete982 = new BitSet(new long[]{0x0000000000186382L});
	public static final BitSet FOLLOW_THEME_in_requete992 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete998 = new BitSet(new long[]{0x0000000000186382L});
	public static final BitSet FOLLOW_MOT_in_requete1008 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1014 = new BitSet(new long[]{0x0000000000186382L});
	public static final BitSet FOLLOW_TITRE_in_requete1024 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1030 = new BitSet(new long[]{0x0000000000186382L});
	public static final BitSet FOLLOW_DATE_in_requete1054 = new BitSet(new long[]{0x0000000000001410L});
	public static final BitSet FOLLOW_dat_in_requete1060 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ET_in_requete1065 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete1067 = new BitSet(new long[]{0x0000000000001410L});
	public static final BitSet FOLLOW_dat_in_requete1073 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_OU_in_requete1082 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete1084 = new BitSet(new long[]{0x0000000000001410L});
	public static final BitSet FOLLOW_dat_in_requete1090 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_ET_in_requete1099 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EMAIL_in_requete1101 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete1107 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_OU_in_requete1117 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EMAIL_in_requete1119 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_paramsEmail_in_requete1125 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_ET_in_requete1135 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_THEME_in_requete1137 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete1143 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_OU_in_requete1153 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_THEME_in_requete1155 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsTheme_in_requete1161 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_ET_in_requete1171 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete1173 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1179 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_OU_in_requete1189 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOT_in_requete1191 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1197 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_ET_in_requete1207 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_TITRE_in_requete1209 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1215 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_OU_in_requete1225 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_TITRE_in_requete1227 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramsMot_in_requete1233 = new BitSet(new long[]{0x0000000000004282L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1274 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_ET_in_paramsMot1282 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1288 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_OU_in_paramsMot1295 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramMot_in_paramsMot1301 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_VAR_in_paramMot1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramEmail_in_paramsEmail1361 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_ET_in_paramsEmail1369 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_paramEmail_in_paramsEmail1375 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_OU_in_paramsEmail1382 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_paramEmail_in_paramsEmail1388 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_VAREMAIL_in_paramEmail1413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramTheme_in_paramsTheme1445 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_ET_in_paramsTheme1453 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramTheme_in_paramsTheme1459 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_OU_in_paramsTheme1466 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramTheme_in_paramsTheme1472 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_VAR_in_paramTheme1497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datPage_in_paramsDatPage1530 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_ET_in_paramsDatPage1538 = new BitSet(new long[]{0x0000000000001C10L});
	public static final BitSet FOLLOW_datPage_in_paramsDatPage1544 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_OU_in_paramsDatPage1551 = new BitSet(new long[]{0x0000000000001C10L});
	public static final BitSet FOLLOW_datPage_in_paramsDatPage1557 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_dat_in_paramsDat1591 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_ET_in_paramsDat1598 = new BitSet(new long[]{0x0000000000001410L});
	public static final BitSet FOLLOW_dat_in_paramsDat1604 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_OU_in_paramsDat1611 = new BitSet(new long[]{0x0000000000001410L});
	public static final BitSet FOLLOW_dat_in_paramsDat1617 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_ANNEE_in_datPage1644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_datPage1655 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_datPage1661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JJ_in_datPage1672 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_datPage1678 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_datPage1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_datPage1695 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_datPage1701 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_datPage1707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_dat1729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat1740 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_dat1746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JJ_in_dat1757 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_dat1763 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_dat1769 = new BitSet(new long[]{0x0000000000000002L});
}
