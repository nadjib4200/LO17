package antlr.output;

// $ANTLR 3.5.1 /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g 2014-06-02 16:15:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sql10Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sql10Lexer() {} 
	public tal_sql10Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sql10Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g"; }

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:4:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\t'||LA2_0=='\r'||LA2_0==' '||LA2_0=='d'||LA2_0=='j'||LA2_0=='q') ) {
				alt2=1;
			}
			else if ( (LA2_0=='\n') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:4:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:4:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt1=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt1=1;
						}
						break;
					case '\t':
						{
						alt1=2;
						}
						break;
					case '\r':
						{
						alt1=3;
						}
						break;
					case 'j':
						{
						alt1=4;
						}
						break;
					case 'q':
						{
						alt1=5;
						}
						break;
					case 'd':
						{
						alt1=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}
					switch (alt1) {
						case 1 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:4:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:4:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:4:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:4:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:4:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:4:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:4:62: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ET"
	public final void mET() throws RecognitionException {
		try {
			int _type = ET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:8:4: ( 'et' | 'en même temps' | 'aussi' | 'également' )
			int alt3=4;
			switch ( input.LA(1) ) {
			case 'e':
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='t') ) {
					alt3=1;
				}
				else if ( (LA3_1=='n') ) {
					alt3=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				alt3=3;
				}
				break;
			case '\u00E9':
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:8:6: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:8:13: 'en même temps'
					{
					match("en même temps"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:8:31: 'aussi'
					{
					match("aussi"); 

					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:8:41: 'également'
					{
					match("également"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ET"

	// $ANTLR start "OU"
	public final void mOU() throws RecognitionException {
		try {
			int _type = OU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:11:4: ( 'ou' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:11:6: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OU"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:14:7: ( '.' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:14:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:19:8: ( 'vouloir' | 'liste' | 'lister' )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='v') ) {
				alt4=1;
			}
			else if ( (LA4_0=='l') ) {
				int LA4_2 = input.LA(2);
				if ( (LA4_2=='i') ) {
					int LA4_3 = input.LA(3);
					if ( (LA4_3=='s') ) {
						int LA4_4 = input.LA(4);
						if ( (LA4_4=='t') ) {
							int LA4_5 = input.LA(5);
							if ( (LA4_5=='e') ) {
								int LA4_6 = input.LA(6);
								if ( (LA4_6=='r') ) {
									alt4=3;
								}

								else {
									alt4=2;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 4, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:19:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:19:22: 'liste'
					{
					match("liste"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:19:32: 'lister'
					{
					match("lister"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:22:7: ( 'compter' | 'combien' | 'nombre' )
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='c') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='o') ) {
					int LA5_3 = input.LA(3);
					if ( (LA5_3=='m') ) {
						int LA5_4 = input.LA(4);
						if ( (LA5_4=='p') ) {
							alt5=1;
						}
						else if ( (LA5_4=='b') ) {
							alt5=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA5_0=='n') ) {
				alt5=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:22:9: 'compter'
					{
					match("compter"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:22:21: 'combien'
					{
					match("combien"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:22:33: 'nombre'
					{
					match("nombre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "DERNIER"
	public final void mDERNIER() throws RecognitionException {
		try {
			int _type = DERNIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:9: ( 'dernier' | 'derniers' | 'derniere' | 'dernieres' | 'dernière' | 'dernières' | 'récent' | 'récents' | 'recent' | 'recents' )
			int alt6=10;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='d') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='e') ) {
					int LA6_3 = input.LA(3);
					if ( (LA6_3=='r') ) {
						int LA6_6 = input.LA(4);
						if ( (LA6_6=='n') ) {
							int LA6_9 = input.LA(5);
							if ( (LA6_9=='i') ) {
								int LA6_12 = input.LA(6);
								if ( (LA6_12=='e') ) {
									int LA6_15 = input.LA(7);
									if ( (LA6_15=='r') ) {
										switch ( input.LA(8) ) {
										case 's':
											{
											alt6=2;
											}
											break;
										case 'e':
											{
											int LA6_26 = input.LA(9);
											if ( (LA6_26=='s') ) {
												alt6=4;
											}

											else {
												alt6=3;
											}

											}
											break;
										default:
											alt6=1;
										}
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 6, 15, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA6_12=='\u00E8') ) {
									int LA6_16 = input.LA(7);
									if ( (LA6_16=='r') ) {
										int LA6_20 = input.LA(8);
										if ( (LA6_20=='e') ) {
											int LA6_28 = input.LA(9);
											if ( (LA6_28=='s') ) {
												alt6=6;
											}

											else {
												alt6=5;
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 6, 20, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 6, 16, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 6, 12, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA6_0=='r') ) {
				int LA6_2 = input.LA(2);
				if ( (LA6_2=='\u00E9') ) {
					int LA6_4 = input.LA(3);
					if ( (LA6_4=='c') ) {
						int LA6_7 = input.LA(4);
						if ( (LA6_7=='e') ) {
							int LA6_10 = input.LA(5);
							if ( (LA6_10=='n') ) {
								int LA6_13 = input.LA(6);
								if ( (LA6_13=='t') ) {
									int LA6_17 = input.LA(7);
									if ( (LA6_17=='s') ) {
										alt6=8;
									}

									else {
										alt6=7;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 6, 13, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA6_2=='e') ) {
					int LA6_5 = input.LA(3);
					if ( (LA6_5=='c') ) {
						int LA6_8 = input.LA(4);
						if ( (LA6_8=='e') ) {
							int LA6_11 = input.LA(5);
							if ( (LA6_11=='n') ) {
								int LA6_14 = input.LA(6);
								if ( (LA6_14=='t') ) {
									int LA6_18 = input.LA(7);
									if ( (LA6_18=='s') ) {
										alt6=10;
									}

									else {
										alt6=9;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 6, 14, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:11: 'dernier'
					{
					match("dernier"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:23: 'derniers'
					{
					match("derniers"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:36: 'derniere'
					{
					match("derniere"); 

					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:49: 'dernieres'
					{
					match("dernieres"); 

					}
					break;
				case 5 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:63: 'dernière'
					{
					match("dernière"); 

					}
					break;
				case 6 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:76: 'dernières'
					{
					match("dernières"); 

					}
					break;
				case 7 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:90: 'récent'
					{
					match("récent"); 

					}
					break;
				case 8 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:101: 'récents'
					{
					match("récents"); 

					}
					break;
				case 9 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:113: 'recent'
					{
					match("recent"); 

					}
					break;
				case 10 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:25:124: 'recents'
					{
					match("recents"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DERNIER"

	// $ANTLR start "PREMIER"
	public final void mPREMIER() throws RecognitionException {
		try {
			int _type = PREMIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:9: ( 'premier' | 'premiers' | 'première' | 'premières' | 'premiere' | 'premieres' | 'ancien' | 'anciens' | 'ancienne' | 'anciennes' )
			int alt7=10;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='p') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='r') ) {
					int LA7_3 = input.LA(3);
					if ( (LA7_3=='e') ) {
						int LA7_5 = input.LA(4);
						if ( (LA7_5=='m') ) {
							int LA7_7 = input.LA(5);
							if ( (LA7_7=='i') ) {
								int LA7_9 = input.LA(6);
								if ( (LA7_9=='e') ) {
									int LA7_11 = input.LA(7);
									if ( (LA7_11=='r') ) {
										switch ( input.LA(8) ) {
										case 's':
											{
											alt7=2;
											}
											break;
										case 'e':
											{
											int LA7_20 = input.LA(9);
											if ( (LA7_20=='s') ) {
												alt7=6;
											}

											else {
												alt7=5;
											}

											}
											break;
										default:
											alt7=1;
										}
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 7, 11, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA7_9=='\u00E8') ) {
									int LA7_12 = input.LA(7);
									if ( (LA7_12=='r') ) {
										int LA7_15 = input.LA(8);
										if ( (LA7_15=='e') ) {
											int LA7_22 = input.LA(9);
											if ( (LA7_22=='s') ) {
												alt7=4;
											}

											else {
												alt7=3;
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 7, 15, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 7, 12, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 7, 9, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA7_0=='a') ) {
				int LA7_2 = input.LA(2);
				if ( (LA7_2=='n') ) {
					int LA7_4 = input.LA(3);
					if ( (LA7_4=='c') ) {
						int LA7_6 = input.LA(4);
						if ( (LA7_6=='i') ) {
							int LA7_8 = input.LA(5);
							if ( (LA7_8=='e') ) {
								int LA7_10 = input.LA(6);
								if ( (LA7_10=='n') ) {
									switch ( input.LA(7) ) {
									case 's':
										{
										alt7=8;
										}
										break;
									case 'n':
										{
										int LA7_17 = input.LA(8);
										if ( (LA7_17=='e') ) {
											int LA7_23 = input.LA(9);
											if ( (LA7_23=='s') ) {
												alt7=10;
											}

											else {
												alt7=9;
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 7, 17, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

										}
										break;
									default:
										alt7=7;
									}
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 7, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:11: 'premier'
					{
					match("premier"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:23: 'premiers'
					{
					match("premiers"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:36: 'première'
					{
					match("première"); 

					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:49: 'premières'
					{
					match("premières"); 

					}
					break;
				case 5 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:63: 'premiere'
					{
					match("premiere"); 

					}
					break;
				case 6 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:75: 'premieres'
					{
					match("premieres"); 

					}
					break;
				case 7 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:88: 'ancien'
					{
					match("ancien"); 

					}
					break;
				case 8 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:99: 'anciens'
					{
					match("anciens"); 

					}
					break;
				case 9 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:111: 'ancienne'
					{
					match("ancienne"); 

					}
					break;
				case 10 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:28:124: 'anciennes'
					{
					match("anciennes"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREMIER"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:31:9: ( 'article' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:31:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:34:10: ( 'rubrique' | 'gros titres' | 'gros titre' | 'une' | 'unes' | 'focus' | 'rapels' | 'a voir aussi' | 'à voir aussi' | 'voir aussi' )
			int alt8=10;
			switch ( input.LA(1) ) {
			case 'r':
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='u') ) {
					alt8=1;
				}
				else if ( (LA8_1=='a') ) {
					alt8=7;
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
				break;
			case 'g':
				{
				int LA8_2 = input.LA(2);
				if ( (LA8_2=='r') ) {
					int LA8_10 = input.LA(3);
					if ( (LA8_10=='o') ) {
						int LA8_12 = input.LA(4);
						if ( (LA8_12=='s') ) {
							int LA8_14 = input.LA(5);
							if ( (LA8_14==' ') ) {
								int LA8_17 = input.LA(6);
								if ( (LA8_17=='t') ) {
									int LA8_18 = input.LA(7);
									if ( (LA8_18=='i') ) {
										int LA8_19 = input.LA(8);
										if ( (LA8_19=='t') ) {
											int LA8_20 = input.LA(9);
											if ( (LA8_20=='r') ) {
												int LA8_21 = input.LA(10);
												if ( (LA8_21=='e') ) {
													int LA8_22 = input.LA(11);
													if ( (LA8_22=='s') ) {
														alt8=2;
													}

													else {
														alt8=3;
													}

												}

												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 8, 21, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 8, 20, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 8, 19, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 8, 18, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 8, 17, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 8, 14, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

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
				break;
			case 'u':
				{
				int LA8_3 = input.LA(2);
				if ( (LA8_3=='n') ) {
					int LA8_11 = input.LA(3);
					if ( (LA8_11=='e') ) {
						int LA8_13 = input.LA(4);
						if ( (LA8_13=='s') ) {
							alt8=5;
						}

						else {
							alt8=4;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt8=6;
				}
				break;
			case 'a':
				{
				alt8=8;
				}
				break;
			case '\u00E0':
				{
				alt8=9;
				}
				break;
			case 'v':
				{
				alt8=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:34:12: 'rubrique'
					{
					match("rubrique"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:35:3: 'gros titres'
					{
					match("gros titres"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:35:19: 'gros titre'
					{
					match("gros titre"); 

					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:35:34: 'une'
					{
					match("une"); 

					}
					break;
				case 5 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:35:42: 'unes'
					{
					match("unes"); 

					}
					break;
				case 6 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:35:51: 'focus'
					{
					match("focus"); 

					}
					break;
				case 7 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:35:61: 'rapels'
					{
					match("rapels"); 

					}
					break;
				case 8 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:35:72: 'a voir aussi'
					{
					match("a voir aussi"); 

					}
					break;
				case 9 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:35:89: 'à voir aussi'
					{
					match("à voir aussi"); 

					}
					break;
				case 10 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:35:106: 'voir aussi'
					{
					match("voir aussi"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "PAGE"
	public final void mPAGE() throws RecognitionException {
		try {
			int _type = PAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:38:6: ( 'page' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:38:8: 'page'
			{
			match("page"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAGE"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:43:6: ( 'date' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:43:8: 'date'
			{
			match("date"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:46:5: ( 'mot' | 'contenir' | 'parler' )
			int alt9=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt9=1;
				}
				break;
			case 'c':
				{
				alt9=2;
				}
				break;
			case 'p':
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:46:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:46:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:46:28: 'parler'
					{
					match("parler"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:49:7: ( 'titre' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:49:9: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "EMAIL"
	public final void mEMAIL() throws RecognitionException {
		try {
			int _type = EMAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:52:8: ( 'auteur' | 'email' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='a') ) {
				alt10=1;
			}
			else if ( (LA10_0=='e') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:52:10: 'auteur'
					{
					match("auteur"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:52:21: 'email'
					{
					match("email"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EMAIL"

	// $ANTLR start "THEME"
	public final void mTHEME() throws RecognitionException {
		try {
			int _type = THEME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:55:7: ( 'theme' | 'thematique' | 'domaine' )
			int alt11=3;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='t') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='h') ) {
					int LA11_3 = input.LA(3);
					if ( (LA11_3=='e') ) {
						int LA11_4 = input.LA(4);
						if ( (LA11_4=='m') ) {
							int LA11_5 = input.LA(5);
							if ( (LA11_5=='e') ) {
								alt11=1;
							}
							else if ( (LA11_5=='a') ) {
								alt11=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA11_0=='d') ) {
				alt11=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:55:9: 'theme'
					{
					match("theme"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:55:19: 'thematique'
					{
					match("thematique"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:55:34: 'domaine'
					{
					match("domaine"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEME"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:6: ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'septembre' | 'octobre' | 'novembre' | 'décembre' | 'janv' | 'fév' | 'juil' | 'aout' | 'sept' | 'oct' | 'nov' | 'déc' | 'janv.' | 'fév.' | 'juil.' | 'sept.' | 'oct.' | 'nov.' | 'déc.' )
			int alt12=27;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA12_1 = input.LA(2);
				if ( (LA12_1=='a') ) {
					int LA12_9 = input.LA(3);
					if ( (LA12_9=='n') ) {
						int LA12_19 = input.LA(4);
						if ( (LA12_19=='v') ) {
							switch ( input.LA(5) ) {
							case 'i':
								{
								alt12=1;
								}
								break;
							case '.':
								{
								alt12=21;
								}
								break;
							default:
								alt12=13;
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 12, 19, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA12_1=='u') ) {
					int LA12_10 = input.LA(3);
					if ( (LA12_10=='i') ) {
						int LA12_20 = input.LA(4);
						if ( (LA12_20=='n') ) {
							alt12=6;
						}
						else if ( (LA12_20=='l') ) {
							switch ( input.LA(5) ) {
							case 'l':
								{
								alt12=7;
								}
								break;
							case '.':
								{
								alt12=23;
								}
								break;
							default:
								alt12=15;
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 12, 20, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				int LA12_2 = input.LA(2);
				if ( (LA12_2=='\u00E9') ) {
					int LA12_11 = input.LA(3);
					if ( (LA12_11=='v') ) {
						switch ( input.LA(4) ) {
						case 'r':
							{
							alt12=2;
							}
							break;
						case '.':
							{
							alt12=22;
							}
							break;
						default:
							alt12=14;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'm':
				{
				int LA12_3 = input.LA(2);
				if ( (LA12_3=='a') ) {
					int LA12_12 = input.LA(3);
					if ( (LA12_12=='r') ) {
						alt12=3;
					}
					else if ( (LA12_12=='i') ) {
						alt12=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA12_4 = input.LA(2);
				if ( (LA12_4=='v') ) {
					alt12=4;
				}
				else if ( (LA12_4=='o') ) {
					int LA12_14 = input.LA(3);
					if ( (LA12_14=='\u00FB') ) {
						alt12=8;
					}
					else if ( (LA12_14=='u') ) {
						alt12=16;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				int LA12_5 = input.LA(2);
				if ( (LA12_5=='e') ) {
					int LA12_15 = input.LA(3);
					if ( (LA12_15=='p') ) {
						int LA12_26 = input.LA(4);
						if ( (LA12_26=='t') ) {
							switch ( input.LA(5) ) {
							case 'e':
								{
								alt12=9;
								}
								break;
							case '.':
								{
								alt12=24;
								}
								break;
							default:
								alt12=17;
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 12, 26, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'o':
				{
				int LA12_6 = input.LA(2);
				if ( (LA12_6=='c') ) {
					int LA12_16 = input.LA(3);
					if ( (LA12_16=='t') ) {
						switch ( input.LA(4) ) {
						case 'o':
							{
							alt12=10;
							}
							break;
						case '.':
							{
							alt12=25;
							}
							break;
						default:
							alt12=18;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'n':
				{
				int LA12_7 = input.LA(2);
				if ( (LA12_7=='o') ) {
					int LA12_17 = input.LA(3);
					if ( (LA12_17=='v') ) {
						switch ( input.LA(4) ) {
						case 'e':
							{
							alt12=11;
							}
							break;
						case '.':
							{
							alt12=26;
							}
							break;
						default:
							alt12=19;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				int LA12_8 = input.LA(2);
				if ( (LA12_8=='\u00E9') ) {
					int LA12_18 = input.LA(3);
					if ( (LA12_18=='c') ) {
						switch ( input.LA(4) ) {
						case 'e':
							{
							alt12=12;
							}
							break;
						case '.':
							{
							alt12=27;
							}
							break;
						default:
							alt12=20;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:8: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:20: 'février'
					{
					match("février"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:32: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:41: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:51: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:59: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:68: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:80: 'août'
					{
					match("août"); 

					}
					break;
				case 9 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:89: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:103: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:115: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:60:128: 'décembre'
					{
					match("décembre"); 

					}
					break;
				case 13 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:61:2: 'janv'
					{
					match("janv"); 

					}
					break;
				case 14 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:61:11: 'fév'
					{
					match("fév"); 

					}
					break;
				case 15 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:61:19: 'juil'
					{
					match("juil"); 

					}
					break;
				case 16 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:61:28: 'aout'
					{
					match("aout"); 

					}
					break;
				case 17 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:61:37: 'sept'
					{
					match("sept"); 

					}
					break;
				case 18 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:61:46: 'oct'
					{
					match("oct"); 

					}
					break;
				case 19 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:61:54: 'nov'
					{
					match("nov"); 

					}
					break;
				case 20 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:61:62: 'déc'
					{
					match("déc"); 

					}
					break;
				case 21 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:62:2: 'janv.'
					{
					match("janv."); 

					}
					break;
				case 22 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:62:12: 'fév.'
					{
					match("fév."); 

					}
					break;
				case 23 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:62:21: 'juil.'
					{
					match("juil."); 

					}
					break;
				case 24 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:62:31: 'sept.'
					{
					match("sept."); 

					}
					break;
				case 25 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:62:41: 'oct.'
					{
					match("oct."); 

					}
					break;
				case 26 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:62:50: 'nov.'
					{
					match("nov."); 

					}
					break;
				case 27 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:62:59: 'déc.'
					{
					match("déc."); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOIS"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:64:6: ( 'lundi' | 'mardi' | 'mercredi' | 'jeudi' | 'vendredi' | 'samedi' | 'dimanche' )
			int alt13=7;
			switch ( input.LA(1) ) {
			case 'l':
				{
				alt13=1;
				}
				break;
			case 'm':
				{
				int LA13_2 = input.LA(2);
				if ( (LA13_2=='a') ) {
					alt13=2;
				}
				else if ( (LA13_2=='e') ) {
					alt13=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'j':
				{
				alt13=4;
				}
				break;
			case 'v':
				{
				alt13=5;
				}
				break;
			case 's':
				{
				alt13=6;
				}
				break;
			case 'd':
				{
				alt13=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:64:8: 'lundi'
					{
					match("lundi"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:64:17: 'mardi'
					{
					match("mardi"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:64:25: 'mercredi'
					{
					match("mercredi"); 

					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:64:36: 'jeudi'
					{
					match("jeudi"); 

					}
					break;
				case 5 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:64:44: 'vendredi'
					{
					match("vendredi"); 

					}
					break;
				case 6 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:64:55: 'samedi'
					{
					match("samedi"); 

					}
					break;
				case 7 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:64:64: 'dimanche'
					{
					match("dimanche"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOUR"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:67:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:67:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:67:47: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='-'||(LA14_0 >= '0' && LA14_0 <= '9')||(LA14_0 >= 'a' && LA14_0 <= 'z')||(LA14_0 >= '\u00A0' && LA14_0 <= '\u00FF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "VAREMAIL"
	public final void mVAREMAIL() throws RecognitionException {
		try {
			int _type = VAREMAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:70:11: ( ( 'a' .. 'z' | '0' .. '9' )+ ( '@' ) ( 'a' .. 'z' | '0' .. '9' )+ ( '.' )+ ( 'a' .. 'z' | '0' .. '9' )+ )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:70:13: ( 'a' .. 'z' | '0' .. '9' )+ ( '@' ) ( 'a' .. 'z' | '0' .. '9' )+ ( '.' )+ ( 'a' .. 'z' | '0' .. '9' )+
			{
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:70:13: ( 'a' .. 'z' | '0' .. '9' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')||(LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:70:35: ( '@' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:70:36: '@'
			{
			match('@'); 
			}

			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:70:40: ( 'a' .. 'z' | '0' .. '9' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= 'a' && LA16_0 <= 'z')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:70:62: ( '.' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='.') ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:70:63: '.'
					{
					match('.'); 
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:70:68: ( 'a' .. 'z' | '0' .. '9' )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'a' && LA18_0 <= 'z')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAREMAIL"

	// $ANTLR start "JJ"
	public final void mJJ() throws RecognitionException {
		try {
			int _type = JJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:73:4: ( ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:73:6: ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JJ"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:74:7: ( ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:74:9: ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "VARCHIFFRE"
	public final void mVARCHIFFRE() throws RecognitionException {
		try {
			int _type = VARCHIFFRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:76:12: ( ( '0' .. '9' )+ )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:76:14: ( '0' .. '9' )+
			{
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:76:14: ( '0' .. '9' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARCHIFFRE"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:8: ( WS | ET | OU | POINT | SELECT | COUNT | DERNIER | PREMIER | ARTICLE | RUBRIQUE | PAGE | DATE | MOT | TITRE | EMAIL | THEME | MOIS | JOUR | VAR | VAREMAIL | JJ | ANNEE | VARCHIFFRE )
		int alt20=23;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:10: WS
				{
				mWS(); 

				}
				break;
			case 2 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:13: ET
				{
				mET(); 

				}
				break;
			case 3 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:16: OU
				{
				mOU(); 

				}
				break;
			case 4 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:19: POINT
				{
				mPOINT(); 

				}
				break;
			case 5 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:25: SELECT
				{
				mSELECT(); 

				}
				break;
			case 6 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:32: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 7 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:38: DERNIER
				{
				mDERNIER(); 

				}
				break;
			case 8 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:46: PREMIER
				{
				mPREMIER(); 

				}
				break;
			case 9 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:54: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 10 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:62: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 11 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:71: PAGE
				{
				mPAGE(); 

				}
				break;
			case 12 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:76: DATE
				{
				mDATE(); 

				}
				break;
			case 13 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:81: MOT
				{
				mMOT(); 

				}
				break;
			case 14 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:85: TITRE
				{
				mTITRE(); 

				}
				break;
			case 15 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:91: EMAIL
				{
				mEMAIL(); 

				}
				break;
			case 16 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:97: THEME
				{
				mTHEME(); 

				}
				break;
			case 17 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:103: MOIS
				{
				mMOIS(); 

				}
				break;
			case 18 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:108: JOUR
				{
				mJOUR(); 

				}
				break;
			case 19 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:113: VAR
				{
				mVAR(); 

				}
				break;
			case 20 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:117: VAREMAIL
				{
				mVAREMAIL(); 

				}
				break;
			case 21 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:126: JJ
				{
				mJJ(); 

				}
				break;
			case 22 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:129: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 23 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql10.g:1:135: VARCHIFFRE
				{
				mVARCHIFFRE(); 

				}
				break;

		}
	}


	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA20_eotS =
		"\31\uffff\2\112\1\1\3\30\1\uffff\6\30\1\126\5\30\1\uffff\3\30\1\140\30"+
		"\30\1\177\1\uffff\1\177\3\30\1\1\4\30\1\u008a\1\30\1\uffff\11\30\1\uffff"+
		"\1\u008a\10\30\1\u008a\10\30\1\54\1\30\1\u008a\1\u00ab\1\30\1\u008a\5"+
		"\30\1\112\1\uffff\1\112\1\30\3\u008a\1\1\2\30\1\u00b9\1\30\1\uffff\7\30"+
		"\2\u008a\21\30\1\u00d2\2\30\1\54\2\30\1\uffff\1\u008a\4\30\1\u008a\1\30"+
		"\1\u00dd\1\u00de\4\30\1\uffff\2\30\1\u00e6\1\126\3\30\1\u008a\4\30\1\u00ef"+
		"\1\u00de\12\30\1\uffff\1\30\1\54\1\30\1\u00de\1\30\1\u00fe\1\u00ff\3\30"+
		"\2\uffff\7\30\1\uffff\1\u00e6\1\u010c\5\30\1\u00ef\1\uffff\3\30\1\u0115"+
		"\1\30\2\u0118\1\30\1\54\2\30\1\u00ab\2\30\2\uffff\2\30\1\u00de\2\u008a"+
		"\1\u00ff\1\u0118\3\30\1\u010c\1\30\1\uffff\1\u0127\1\30\1\u008a\1\u00ef"+
		"\1\30\2\u0115\1\30\1\uffff\1\30\1\u0118\1\uffff\1\u0118\1\30\1\u010c\1"+
		"\30\1\u008a\3\30\3\u0118\1\u008a\1\u00de\1\u010c\1\uffff\1\30\1\u00de"+
		"\1\u00ab\1\u008a\1\54\3\u010c\1\u00de\2\30\2\u0118\1\u010c\1\126\2\u010c"+
		"\1\30\1\u008a\1\u00ff";
	static final String DFA20_eofS =
		"\u013c\uffff";
	static final String DFA20_minS =
		"\1\11\1\uffff\4\55\1\40\2\55\1\uffff\11\55\1\40\4\55\1\uffff\2\60\1\55"+
		"\3\60\1\uffff\4\60\1\143\1\60\1\55\1\40\4\60\1\uffff\2\60\1\141\1\55\7"+
		"\60\1\143\10\60\1\166\10\60\1\uffff\4\60\1\55\4\60\1\55\1\60\1\uffff\6"+
		"\60\1\164\1\60\1\154\1\uffff\1\55\10\60\1\55\1\145\7\60\1\55\1\60\2\55"+
		"\1\60\1\55\6\60\1\uffff\2\60\4\55\2\60\1\55\1\155\1\uffff\7\60\2\55\1"+
		"\145\2\60\1\40\10\60\1\156\4\60\1\55\1\60\1\40\1\55\1\60\1\151\1\uffff"+
		"\1\55\4\60\1\55\2\60\1\55\4\60\1\uffff\1\142\1\60\2\55\3\60\1\55\1\155"+
		"\3\60\2\55\5\60\1\164\4\60\1\uffff\1\60\1\55\1\145\1\55\1\60\2\55\3\60"+
		"\2\uffff\4\60\2\162\1\60\1\uffff\2\55\1\60\1\145\3\60\1\55\1\uffff\3\60"+
		"\1\55\1\60\2\55\1\60\1\55\1\60\1\162\1\55\1\162\1\60\2\uffff\2\60\5\55"+
		"\2\145\1\60\1\55\1\60\1\uffff\1\55\1\156\2\55\1\60\2\55\1\60\1\uffff\1"+
		"\60\1\55\1\uffff\1\55\1\60\1\55\1\145\1\55\3\60\6\55\1\uffff\1\164\10"+
		"\55\2\60\6\55\1\60\2\55";
	static final String DFA20_maxS =
		"\1\u00ff\1\uffff\7\u00ff\1\uffff\16\u00ff\1\uffff\2\172\1\u00ff\3\172"+
		"\1\uffff\4\172\1\143\1\172\1\u00ff\5\172\1\uffff\1\172\1\u00fb\1\141\1"+
		"\u00ff\7\172\1\143\10\172\1\166\10\172\1\uffff\4\172\1\u00ff\4\172\1\u00ff"+
		"\1\172\1\uffff\6\172\1\164\1\172\1\154\1\uffff\1\u00ff\10\172\1\u00ff"+
		"\1\145\7\172\1\u00ff\1\172\2\u00ff\1\172\1\u00ff\6\172\1\uffff\2\172\4"+
		"\u00ff\2\172\1\u00ff\1\155\1\uffff\7\172\2\u00ff\1\145\13\172\1\156\4"+
		"\172\1\u00ff\2\172\1\u00ff\1\172\1\151\1\uffff\1\u00ff\4\172\1\u00ff\2"+
		"\172\1\u00ff\3\172\1\u00e8\1\uffff\1\142\1\172\2\u00ff\3\172\1\u00ff\1"+
		"\155\3\172\2\u00ff\5\172\1\164\3\172\1\u00e8\1\uffff\1\172\1\u00ff\1\145"+
		"\1\u00ff\1\172\2\u00ff\3\172\2\uffff\4\172\2\162\1\172\1\uffff\2\u00ff"+
		"\1\172\1\145\3\172\1\u00ff\1\uffff\3\172\1\u00ff\1\172\2\u00ff\1\172\1"+
		"\u00ff\1\172\1\162\1\u00ff\1\162\1\172\2\uffff\2\172\5\u00ff\2\145\1\172"+
		"\1\u00ff\1\172\1\uffff\1\u00ff\1\156\2\u00ff\1\172\2\u00ff\1\172\1\uffff"+
		"\1\172\1\u00ff\1\uffff\1\u00ff\1\172\1\u00ff\1\145\1\u00ff\3\172\6\u00ff"+
		"\1\uffff\1\164\10\u00ff\2\172\6\u00ff\1\172\2\u00ff";
	static final String DFA20_acceptS =
		"\1\uffff\1\1\7\uffff\1\4\16\uffff\1\23\6\uffff\1\24\14\uffff\1\12\35\uffff"+
		"\1\27\13\uffff\1\2\11\uffff\1\3\36\uffff\1\25\12\uffff\1\21\40\uffff\1"+
		"\15\15\uffff\1\14\30\uffff\1\13\12\uffff\1\26\1\22\7\uffff\1\17\10\uffff"+
		"\1\5\16\uffff\1\16\1\20\14\uffff\1\10\10\uffff\1\6\2\uffff\1\7\16\uffff"+
		"\1\11\24\uffff";
	static final String DFA20_specialS =
		"\u013c\uffff}>";
	static final String[] DFA20_transitionS = {
			"\2\1\2\uffff\1\1\22\uffff\1\1\15\uffff\1\11\1\uffff\1\32\11\31\7\uffff"+
			"\32\30\6\uffff\1\6\1\27\1\14\1\4\1\5\1\22\1\20\2\27\1\2\1\27\1\13\1\24"+
			"\1\15\1\10\1\17\1\3\1\16\1\26\1\25\1\21\1\12\4\27\45\uffff\100\30\1\23"+
			"\10\30\1\7\26\30",
			"",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\1\34\3\36\1\33\17\36\1\35"+
			"\5\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\24\36\1\40\5\36\45\uffff\140"+
			"\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\1\43\3\36\1\42\3\36\1\45\5"+
			"\36\1\41\13\36\45\uffff\111\30\1\44\26\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\14\36\1\50\1\47\5\36\1\46"+
			"\6\36\45\uffff\140\30",
			"\1\54\14\uffff\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\15\36\1\52\1"+
			"\56\2\36\1\53\2\36\1\51\1\55\4\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\6\30\1\57\23\30\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\2\36\1\61\21\36\1\60\5\36"+
			"\45\uffff\140\30",
			"",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\4\36\1\63\11\36\1\62\13\36"+
			"\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\10\36\1\64\13\36\1\65\5\36"+
			"\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\16\36\1\66\13\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\16\36\1\67\13\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\1\73\3\36\1\71\17\36\1\72"+
			"\5\36\45\uffff\111\30\1\70\26\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\1\75\20\36\1\74\10\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\21\36\1\76\10\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\15\36\1\77\14\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\16\36\1\100\13\36\45\uffff"+
			"\111\30\1\101\26\30",
			"\1\54\14\uffff\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\1\103\3\36\1\104\11\36\1\102"+
			"\13\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\7\36\1\106\1\105\21\36\45"+
			"\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\1\110\3\36\1\107\25\36\45"+
			"\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"",
			"\12\111\6\uffff\1\37\40\uffff\32\37",
			"\12\113\6\uffff\1\37\40\uffff\32\37",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\24\36\1\114\5\36\45\uffff"+
			"\140\30",
			"\12\36\6\uffff\1\37\40\uffff\15\36\1\115\14\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\116\21\36",
			"\12\36\6\uffff\1\37\40\uffff\32\36",
			"",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\117\21\36",
			"\12\36\6\uffff\1\37\40\uffff\14\36\1\121\1\120\14\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\122\10\36",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\123\6\36",
			"\1\124",
			"\12\36\6\uffff\1\37\40\uffff\14\36\1\125\15\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\126\17\uffff\12\36\6\uffff\1\37\40\uffff\32\36",
			"\12\36\6\uffff\1\37\40\uffff\1\127\31\36",
			"\12\36\6\uffff\1\37\40\uffff\22\36\1\130\1\131\6\36",
			"\12\36\6\uffff\1\37\40\uffff\2\36\1\132\27\36",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\133\6\36",
			"",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\134\10\36",
			"\12\36\6\uffff\1\37\40\uffff\24\36\1\136\5\36\u0080\uffff\1\135",
			"\1\137",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\141\6\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\143\13\36\1\142\5\36",
			"\12\36\6\uffff\1\37\40\uffff\15\36\1\144\14\36",
			"\12\36\6\uffff\1\37\40\uffff\22\36\1\145\7\36",
			"\12\36\6\uffff\1\37\40\uffff\15\36\1\146\14\36",
			"\12\36\6\uffff\1\37\40\uffff\14\36\1\147\1\150\14\36",
			"\12\36\6\uffff\1\37\40\uffff\14\36\1\151\10\36\1\152\4\36",
			"\1\153",
			"\12\36\6\uffff\1\37\40\uffff\2\36\1\154\27\36",
			"\12\36\6\uffff\1\37\40\uffff\1\36\1\155\30\36",
			"\12\36\6\uffff\1\37\40\uffff\17\36\1\156\12\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\157\25\36",
			"\12\36\6\uffff\1\37\40\uffff\6\36\1\160\12\36\1\161\10\36",
			"\12\36\6\uffff\1\37\40\uffff\16\36\1\162\13\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\163\25\36",
			"\12\36\6\uffff\1\37\40\uffff\2\36\1\164\27\36",
			"\1\165",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\166\6\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\170\10\36\1\167\10\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\171\10\36",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\172\6\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\173\25\36",
			"\12\36\6\uffff\1\37\40\uffff\17\36\1\174\12\36",
			"\12\36\6\uffff\1\37\40\uffff\14\36\1\175\15\36",
			"\12\176\6\uffff\1\37\40\uffff\32\37",
			"",
			"\12\u0080\6\uffff\1\37\40\uffff\32\37",
			"\12\36\6\uffff\1\37\40\uffff\3\36\1\u0081\26\36",
			"\12\36\6\uffff\1\37\40\uffff\25\36\1\u0082\4\36",
			"\12\36\6\uffff\1\37\40\uffff\13\36\1\u0084\1\36\1\u0083\14\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\u0085\6\36",
			"\12\36\6\uffff\1\37\40\uffff\1\u0086\31\36",
			"\12\36\6\uffff\1\37\40\uffff\15\36\1\u0087\14\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u0088\25\36",
			"\1\30\2\uffff\12\30\47\uffff\4\30\1\u0089\25\30\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\1\u008b\31\36",
			"",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u008c\21\36",
			"\12\36\6\uffff\1\37\40\uffff\22\36\1\u008d\7\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u008e\25\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u008f\21\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u0090\21\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u0091\21\36",
			"\1\u0092",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\u0093\6\36",
			"\1\u0094",
			"",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\16\36\1\u0095\13\36\45\uffff"+
			"\140\30",
			"\12\36\6\uffff\1\37\40\uffff\13\36\1\u0096\16\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u0097\10\36",
			"\12\36\6\uffff\1\37\40\uffff\3\36\1\u0098\26\36",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\u0099\6\36",
			"\12\36\6\uffff\1\37\40\uffff\3\36\1\u009a\26\36",
			"\12\36\6\uffff\1\37\40\uffff\1\36\1\u009c\15\36\1\u009b\12\36",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\u009d\6\36",
			"\12\36\6\uffff\1\37\40\uffff\1\36\1\u009e\30\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\4\36\1\u009f\25\36\45\uffff"+
			"\140\30",
			"\1\u00a0",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00a1\25\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u00a2\10\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00a3\25\36",
			"\12\36\6\uffff\1\37\40\uffff\14\36\1\u00a4\15\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00a5\25\36",
			"\12\36\6\uffff\1\37\40\uffff\13\36\1\u00a6\16\36",
			"\12\36\6\uffff\1\37\40\uffff\22\36\1\u00a7\7\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\22\36\1\u00a8\7\36\45\uffff"+
			"\140\30",
			"\12\36\6\uffff\1\37\40\uffff\24\36\1\u00a9\5\36",
			"\1\30\2\uffff\12\30\47\uffff\21\30\1\u00aa\10\30\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\3\36\1\u00ad\16\36\1\u00ac\7\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\2\36\1\u00ae\27\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u00af\10\36",
			"\12\36\6\uffff\1\37\40\uffff\14\36\1\u00b0\15\36",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\u00b1\6\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00b2\25\36",
			"\12\u00b3\6\uffff\1\37\40\uffff\32\37",
			"",
			"\12\u0080\6\uffff\1\37\40\uffff\32\37",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u00b4\21\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\10\36\1\u00b5\21\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\13\36\1\u00b6\16\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u00b7\21\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u00b8\21\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00ba",
			"",
			"\12\36\6\uffff\1\37\40\uffff\15\36\1\u00bb\14\36",
			"\12\36\6\uffff\1\37\40\uffff\13\36\1\u00bc\16\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u00bd\21\36",
			"\12\36\6\uffff\1\37\40\uffff\24\36\1\u00be\5\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00bf\25\36",
			"\12\36\6\uffff\1\37\40\uffff\2\36\1\u00c0\27\36",
			"\12\36\6\uffff\1\37\40\uffff\13\36\1\u00c1\16\36",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00c2",
			"\12\36\6\uffff\1\37\40\uffff\1\36\1\u00c3\30\36",
			"\12\36\6\uffff\1\37\40\uffff\16\36\1\u00c4\13\36",
			"\1\54\17\uffff\12\36\6\uffff\1\37\40\uffff\32\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u00c5\10\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00c6\25\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u00c7\21\36",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\u00c8\6\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u00c9\21\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00ca\25\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u00cb\10\36",
			"\12\36\6\uffff\1\37\40\uffff\14\36\1\u00cc\15\36",
			"\1\u00cd",
			"\12\36\6\uffff\1\37\40\uffff\15\36\1\u00ce\14\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u00cf\21\36",
			"\12\36\6\uffff\1\37\40\uffff\13\36\1\u00d0\16\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u00d1\21\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00d3\25\36",
			"\1\54\17\uffff\12\36\6\uffff\1\37\40\uffff\32\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\22\36\1\u00d4\7\36",
			"\1\u00d5",
			"",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u00d6\21\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u00d7\10\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00d8\25\36",
			"\12\36\6\uffff\1\37\40\uffff\1\u00da\3\36\1\u00d9\25\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\4\36\1\u00db\25\36\45\uffff"+
			"\140\30",
			"\12\36\6\uffff\1\37\40\uffff\3\36\1\u00dc\26\36",
			"\12\u0080\6\uffff\1\37\40\uffff\32\37",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00df\25\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00e0\25\36",
			"\12\36\6\uffff\1\37\40\uffff\15\36\1\u00e1\14\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00e2\25\36\155\uffff\1\u00e3",
			"",
			"\1\u00e4",
			"\12\36\6\uffff\1\37\40\uffff\2\36\1\u00e5\27\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u00e7\10\36",
			"\12\36\6\uffff\1\37\40\uffff\15\36\1\u00e8\14\36",
			"\12\36\6\uffff\1\37\40\uffff\13\36\1\u00e9\16\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00ea",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u00eb\10\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u00ec\21\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00ed\25\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\21\36\1\u00ee\10\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00f0\25\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00f1\25\36",
			"\12\36\6\uffff\1\37\40\uffff\15\36\1\u00f2\14\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00f3\25\36",
			"\12\36\6\uffff\1\37\40\uffff\1\36\1\u00f4\30\36",
			"\1\u00f5",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\u00f6\6\36",
			"\12\36\6\uffff\1\37\40\uffff\20\36\1\u00f7\11\36",
			"\12\36\6\uffff\1\37\40\uffff\22\36\1\u00f8\7\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00f9\25\36\155\uffff\1\u00fa",
			"",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u00fb\10\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00fc",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u00fd\25\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\u0100\6\36",
			"\12\36\6\uffff\1\37\40\uffff\14\36\1\u0101\15\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u0102\21\36",
			"",
			"",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u0103\10\36",
			"\12\36\6\uffff\1\37\40\uffff\23\36\1\u0104\6\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u0105\25\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u0106\10\36",
			"\1\u0107",
			"\1\u0108",
			"\12\36\6\uffff\1\37\40\uffff\7\36\1\u0109\22\36",
			"",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\15\36\1\u010b\4\36\1\u010a"+
			"\7\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u010d\25\36",
			"\1\u010e",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u010f\25\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u0110\10\36",
			"\12\36\6\uffff\1\37\40\uffff\3\36\1\u0111\26\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u0112\10\36",
			"\12\36\6\uffff\1\37\40\uffff\15\36\1\u0113\14\36",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u0114\21\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u0116\10\36",
			"\1\30\2\uffff\12\30\47\uffff\22\30\1\u0117\7\30\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\22\36\1\u0119\7\36\45\uffff"+
			"\140\30",
			"\12\36\6\uffff\1\37\40\uffff\24\36\1\u011a\5\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u011b\10\36",
			"\1\u011c",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u011d",
			"\12\36\6\uffff\1\37\40\uffff\3\36\1\u011e\26\36",
			"",
			"",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u011f\21\36",
			"\12\36\6\uffff\1\37\40\uffff\1\36\1\u0120\30\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\4\36\1\u0122\15\36\1\u0121"+
			"\7\36\45\uffff\140\30",
			"\1\u0123",
			"\1\u0124",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u0125\25\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u0126\25\36",
			"",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u0128",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u0129\21\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u012a\10\36",
			"",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u012b\25\36",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u012c\25\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\4\36\1\u012e\15\36\1\u012d"+
			"\7\36\45\uffff\140\30",
			"\1\u012f",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\10\36\1\u0130\21\36",
			"\12\36\6\uffff\1\37\40\uffff\20\36\1\u0131\11\36",
			"\12\36\6\uffff\1\37\40\uffff\21\36\1\u0132\10\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\22\36\1\u0133\7\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\30\47\uffff\22\30\1\u0134\7\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\22\36\1\u0135\7\36\45\uffff"+
			"\140\30",
			"",
			"\1\u0136",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\22\36\1\u0137\7\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\30\47\uffff\22\30\1\u0138\7\30\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\24\36\1\u0139\5\36",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u013a\25\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\12\36\6\uffff\1\37\40\uffff\4\36\1\u013b\25\36",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\36\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30"
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WS | ET | OU | POINT | SELECT | COUNT | DERNIER | PREMIER | ARTICLE | RUBRIQUE | PAGE | DATE | MOT | TITRE | EMAIL | THEME | MOIS | JOUR | VAR | VAREMAIL | JJ | ANNEE | VARCHIFFRE );";
		}
	}

}
