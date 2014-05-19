package antlr.output;

// $ANTLR 3.5.1 /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g 2014-05-11 13:38:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sql6Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sql6Lexer() {} 
	public tal_sql6Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sql6Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g"; }

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:4:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
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
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:4:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:4:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
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
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:4:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:4:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:4:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:4:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:4:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:4:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:4:62: '\\n'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:8:4: ( 'et' | 'en même temps' | 'aussi' | 'également' )
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
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:8:6: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:8:13: 'en même temps'
					{
					match("en même temps"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:8:31: 'aussi'
					{
					match("aussi"); 

					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:8:41: 'également'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:11:4: ( 'ou' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:11:6: 'ou'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:14:7: ( '.' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:14:9: '.'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:19:8: ( 'vouloir' | 'liste' | 'lister' )
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
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:19:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:19:22: 'liste'
					{
					match("liste"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:19:32: 'lister'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:22:7: ( 'compter' | 'combien' | 'nombre' )
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
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:22:9: 'compter'
					{
					match("compter"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:22:21: 'combien'
					{
					match("combien"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:22:33: 'nombre'
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

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:25:9: ( 'article' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:25:11: 'article'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:28:10: ( 'rubrique' | 'gros titres' | 'gros titre' | 'une' | 'unes' | 'focus' | 'rapels' | 'a voir aussi' | 'à voir aussi' | 'voir aussi' )
			int alt6=10;
			switch ( input.LA(1) ) {
			case 'r':
				{
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='u') ) {
					alt6=1;
				}
				else if ( (LA6_1=='a') ) {
					alt6=7;
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
				break;
			case 'g':
				{
				int LA6_2 = input.LA(2);
				if ( (LA6_2=='r') ) {
					int LA6_10 = input.LA(3);
					if ( (LA6_10=='o') ) {
						int LA6_12 = input.LA(4);
						if ( (LA6_12=='s') ) {
							int LA6_14 = input.LA(5);
							if ( (LA6_14==' ') ) {
								int LA6_17 = input.LA(6);
								if ( (LA6_17=='t') ) {
									int LA6_18 = input.LA(7);
									if ( (LA6_18=='i') ) {
										int LA6_19 = input.LA(8);
										if ( (LA6_19=='t') ) {
											int LA6_20 = input.LA(9);
											if ( (LA6_20=='r') ) {
												int LA6_21 = input.LA(10);
												if ( (LA6_21=='e') ) {
													int LA6_22 = input.LA(11);
													if ( (LA6_22=='s') ) {
														alt6=2;
													}

													else {
														alt6=3;
													}

												}

												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 6, 21, input);
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
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 6, 19, input);
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
												new NoViableAltException("", 6, 18, input);
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
											new NoViableAltException("", 6, 17, input);
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'u':
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3=='n') ) {
					int LA6_11 = input.LA(3);
					if ( (LA6_11=='e') ) {
						int LA6_13 = input.LA(4);
						if ( (LA6_13=='s') ) {
							alt6=5;
						}

						else {
							alt6=4;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt6=6;
				}
				break;
			case 'a':
				{
				alt6=8;
				}
				break;
			case '\u00E0':
				{
				alt6=9;
				}
				break;
			case 'v':
				{
				alt6=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:28:12: 'rubrique'
					{
					match("rubrique"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:29:3: 'gros titres'
					{
					match("gros titres"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:29:19: 'gros titre'
					{
					match("gros titre"); 

					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:29:34: 'une'
					{
					match("une"); 

					}
					break;
				case 5 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:29:42: 'unes'
					{
					match("unes"); 

					}
					break;
				case 6 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:29:51: 'focus'
					{
					match("focus"); 

					}
					break;
				case 7 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:29:61: 'rapels'
					{
					match("rapels"); 

					}
					break;
				case 8 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:29:72: 'a voir aussi'
					{
					match("a voir aussi"); 

					}
					break;
				case 9 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:29:89: 'à voir aussi'
					{
					match("à voir aussi"); 

					}
					break;
				case 10 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:29:106: 'voir aussi'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:32:6: ( 'page' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:32:8: 'page'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:37:6: ( 'date' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:37:8: 'date'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:40:5: ( 'mot' | 'contenir' | 'parler' )
			int alt7=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt7=1;
				}
				break;
			case 'c':
				{
				alt7=2;
				}
				break;
			case 'p':
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:40:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:40:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:40:28: 'parler'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:43:7: ( 'titre' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:43:9: 'titre'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:46:8: ( 'auteur' | 'email' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='a') ) {
				alt8=1;
			}
			else if ( (LA8_0=='e') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:46:10: 'auteur'
					{
					match("auteur"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:46:21: 'email'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:49:7: ( 'theme' | 'thematique' | 'domaine' )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='t') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='h') ) {
					int LA9_3 = input.LA(3);
					if ( (LA9_3=='e') ) {
						int LA9_4 = input.LA(4);
						if ( (LA9_4=='m') ) {
							int LA9_5 = input.LA(5);
							if ( (LA9_5=='e') ) {
								alt9=1;
							}
							else if ( (LA9_5=='a') ) {
								alt9=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 5, input);
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
									new NoViableAltException("", 9, 4, input);
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
								new NoViableAltException("", 9, 3, input);
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
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA9_0=='d') ) {
				alt9=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:49:9: 'theme'
					{
					match("theme"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:49:19: 'thematique'
					{
					match("thematique"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:49:34: 'domaine'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:6: ( 'janvier' | 'février' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'août' | 'septembre' | 'octobre' | 'novembre' | 'décembre' | 'janv' | 'fév' | 'juil' | 'aout' | 'sept' | 'oct' | 'nov' | 'déc' | 'janv.' | 'fév.' | 'juil.' | 'sept.' | 'oct.' | 'nov.' | 'déc.' )
			int alt10=27;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='a') ) {
					int LA10_9 = input.LA(3);
					if ( (LA10_9=='n') ) {
						int LA10_19 = input.LA(4);
						if ( (LA10_19=='v') ) {
							switch ( input.LA(5) ) {
							case 'i':
								{
								alt10=1;
								}
								break;
							case '.':
								{
								alt10=21;
								}
								break;
							default:
								alt10=13;
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 19, input);
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
								new NoViableAltException("", 10, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA10_1=='u') ) {
					int LA10_10 = input.LA(3);
					if ( (LA10_10=='i') ) {
						int LA10_20 = input.LA(4);
						if ( (LA10_20=='n') ) {
							alt10=6;
						}
						else if ( (LA10_20=='l') ) {
							switch ( input.LA(5) ) {
							case 'l':
								{
								alt10=7;
								}
								break;
							case '.':
								{
								alt10=23;
								}
								break;
							default:
								alt10=15;
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 20, input);
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
								new NoViableAltException("", 10, 10, input);
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
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				int LA10_2 = input.LA(2);
				if ( (LA10_2=='\u00E9') ) {
					int LA10_11 = input.LA(3);
					if ( (LA10_11=='v') ) {
						switch ( input.LA(4) ) {
						case 'r':
							{
							alt10=2;
							}
							break;
						case '.':
							{
							alt10=22;
							}
							break;
						default:
							alt10=14;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 11, input);
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
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'm':
				{
				int LA10_3 = input.LA(2);
				if ( (LA10_3=='a') ) {
					int LA10_12 = input.LA(3);
					if ( (LA10_12=='r') ) {
						alt10=3;
					}
					else if ( (LA10_12=='i') ) {
						alt10=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 12, input);
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
							new NoViableAltException("", 10, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA10_4 = input.LA(2);
				if ( (LA10_4=='v') ) {
					alt10=4;
				}
				else if ( (LA10_4=='o') ) {
					int LA10_14 = input.LA(3);
					if ( (LA10_14=='\u00FB') ) {
						alt10=8;
					}
					else if ( (LA10_14=='u') ) {
						alt10=16;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 14, input);
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
							new NoViableAltException("", 10, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				int LA10_5 = input.LA(2);
				if ( (LA10_5=='e') ) {
					int LA10_15 = input.LA(3);
					if ( (LA10_15=='p') ) {
						int LA10_26 = input.LA(4);
						if ( (LA10_26=='t') ) {
							switch ( input.LA(5) ) {
							case 'e':
								{
								alt10=9;
								}
								break;
							case '.':
								{
								alt10=24;
								}
								break;
							default:
								alt10=17;
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 26, input);
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
								new NoViableAltException("", 10, 15, input);
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
							new NoViableAltException("", 10, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'o':
				{
				int LA10_6 = input.LA(2);
				if ( (LA10_6=='c') ) {
					int LA10_16 = input.LA(3);
					if ( (LA10_16=='t') ) {
						switch ( input.LA(4) ) {
						case 'o':
							{
							alt10=10;
							}
							break;
						case '.':
							{
							alt10=25;
							}
							break;
						default:
							alt10=18;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 16, input);
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
							new NoViableAltException("", 10, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'n':
				{
				int LA10_7 = input.LA(2);
				if ( (LA10_7=='o') ) {
					int LA10_17 = input.LA(3);
					if ( (LA10_17=='v') ) {
						switch ( input.LA(4) ) {
						case 'e':
							{
							alt10=11;
							}
							break;
						case '.':
							{
							alt10=26;
							}
							break;
						default:
							alt10=19;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 17, input);
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
							new NoViableAltException("", 10, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				int LA10_8 = input.LA(2);
				if ( (LA10_8=='\u00E9') ) {
					int LA10_18 = input.LA(3);
					if ( (LA10_18=='c') ) {
						switch ( input.LA(4) ) {
						case 'e':
							{
							alt10=12;
							}
							break;
						case '.':
							{
							alt10=27;
							}
							break;
						default:
							alt10=20;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 18, input);
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
							new NoViableAltException("", 10, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:8: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:20: 'février'
					{
					match("février"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:32: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:41: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:51: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:59: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:68: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:80: 'août'
					{
					match("août"); 

					}
					break;
				case 9 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:89: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:103: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:115: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:54:128: 'décembre'
					{
					match("décembre"); 

					}
					break;
				case 13 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:55:2: 'janv'
					{
					match("janv"); 

					}
					break;
				case 14 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:55:11: 'fév'
					{
					match("fév"); 

					}
					break;
				case 15 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:55:19: 'juil'
					{
					match("juil"); 

					}
					break;
				case 16 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:55:28: 'aout'
					{
					match("aout"); 

					}
					break;
				case 17 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:55:37: 'sept'
					{
					match("sept"); 

					}
					break;
				case 18 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:55:46: 'oct'
					{
					match("oct"); 

					}
					break;
				case 19 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:55:54: 'nov'
					{
					match("nov"); 

					}
					break;
				case 20 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:55:62: 'déc'
					{
					match("déc"); 

					}
					break;
				case 21 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:56:2: 'janv.'
					{
					match("janv."); 

					}
					break;
				case 22 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:56:12: 'fév.'
					{
					match("fév."); 

					}
					break;
				case 23 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:56:21: 'juil.'
					{
					match("juil."); 

					}
					break;
				case 24 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:56:31: 'sept.'
					{
					match("sept."); 

					}
					break;
				case 25 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:56:41: 'oct.'
					{
					match("oct."); 

					}
					break;
				case 26 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:56:50: 'nov.'
					{
					match("nov."); 

					}
					break;
				case 27 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:56:59: 'déc.'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:58:6: ( 'lundi' | 'mardi' | 'mercredi' | 'jeudi' | 'vendredi' | 'samedi' | 'dimanche' )
			int alt11=7;
			switch ( input.LA(1) ) {
			case 'l':
				{
				alt11=1;
				}
				break;
			case 'm':
				{
				int LA11_2 = input.LA(2);
				if ( (LA11_2=='a') ) {
					alt11=2;
				}
				else if ( (LA11_2=='e') ) {
					alt11=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'j':
				{
				alt11=4;
				}
				break;
			case 'v':
				{
				alt11=5;
				}
				break;
			case 's':
				{
				alt11=6;
				}
				break;
			case 'd':
				{
				alt11=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:58:8: 'lundi'
					{
					match("lundi"); 

					}
					break;
				case 2 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:58:17: 'mardi'
					{
					match("mardi"); 

					}
					break;
				case 3 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:58:25: 'mercredi'
					{
					match("mercredi"); 

					}
					break;
				case 4 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:58:36: 'jeudi'
					{
					match("jeudi"); 

					}
					break;
				case 5 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:58:44: 'vendredi'
					{
					match("vendredi"); 

					}
					break;
				case 6 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:58:55: 'samedi'
					{
					match("samedi"); 

					}
					break;
				case 7 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:58:64: 'dimanche'
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:61:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:61:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:61:47: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='-'||(LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'a' && LA12_0 <= 'z')||(LA12_0 >= '\u00A0' && LA12_0 <= '\u00FF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:
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
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:64:11: ( ( 'a' .. 'z' )+ ( '@' ) ( 'a' .. 'z' )+ ( '.' )+ ( 'a' .. 'z' )+ )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:64:13: ( 'a' .. 'z' )+ ( '@' ) ( 'a' .. 'z' )+ ( '.' )+ ( 'a' .. 'z' )+
			{
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:64:13: ( 'a' .. 'z' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:64:24: ( '@' )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:64:25: '@'
			{
			match('@'); 
			}

			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:64:29: ( 'a' .. 'z' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= 'a' && LA14_0 <= 'z')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:64:40: ( '.' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='.') ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:64:41: '.'
					{
					match('.'); 
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:64:46: ( 'a' .. 'z' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= 'a' && LA16_0 <= 'z')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:67:4: ( ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:67:6: ( '0' .. '9' ) ( '0' .. '9' )
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
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:68:7: ( ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:68:9: ( '1' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:8: ( WS | ET | OU | POINT | SELECT | COUNT | ARTICLE | RUBRIQUE | PAGE | DATE | MOT | TITRE | EMAIL | THEME | MOIS | JOUR | VAR | VAREMAIL | JJ | ANNEE )
		int alt17=20;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:10: WS
				{
				mWS(); 

				}
				break;
			case 2 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:13: ET
				{
				mET(); 

				}
				break;
			case 3 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:16: OU
				{
				mOU(); 

				}
				break;
			case 4 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:19: POINT
				{
				mPOINT(); 

				}
				break;
			case 5 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:25: SELECT
				{
				mSELECT(); 

				}
				break;
			case 6 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:32: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 7 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:38: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 8 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:46: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 9 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:55: PAGE
				{
				mPAGE(); 

				}
				break;
			case 10 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:60: DATE
				{
				mDATE(); 

				}
				break;
			case 11 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:65: MOT
				{
				mMOT(); 

				}
				break;
			case 12 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:69: TITRE
				{
				mTITRE(); 

				}
				break;
			case 13 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:75: EMAIL
				{
				mEMAIL(); 

				}
				break;
			case 14 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:81: THEME
				{
				mTHEME(); 

				}
				break;
			case 15 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:87: MOIS
				{
				mMOIS(); 

				}
				break;
			case 16 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:92: JOUR
				{
				mJOUR(); 

				}
				break;
			case 17 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:97: VAR
				{
				mVAR(); 

				}
				break;
			case 18 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:101: VAREMAIL
				{
				mVAREMAIL(); 

				}
				break;
			case 19 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:110: JJ
				{
				mJJ(); 

				}
				break;
			case 20 :
				// /Users/joanne/Documents/1.Cours&autresdocsUTC/P14/2.LO17/2. Grammaire/tal_sql6.g:1:113: ANNEE
				{
				mANNEE(); 

				}
				break;

		}
	}


	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA17_eotS =
		"\33\uffff\1\1\3\30\1\uffff\5\30\1\116\4\30\1\uffff\3\30\1\127\25\30\1"+
		"\32\3\30\1\1\3\30\1\173\1\30\1\uffff\10\30\1\uffff\1\173\10\30\1\173\3"+
		"\30\1\52\1\30\1\173\2\30\1\u0098\1\30\1\173\5\30\1\uffff\1\30\3\173\1"+
		"\1\1\30\1\u00a4\1\30\1\uffff\6\30\2\173\17\30\1\52\2\30\1\u00bb\1\30\1"+
		"\uffff\1\173\4\30\1\173\1\30\1\u00c4\3\30\1\uffff\2\30\1\u00ca\1\116\2"+
		"\30\1\173\4\30\1\u00d2\1\u00c4\7\30\1\52\1\30\1\uffff\1\30\1\u00c4\1\30"+
		"\1\u00dd\1\u00de\3\30\1\uffff\5\30\1\uffff\1\u00ca\5\30\1\u00d2\1\uffff"+
		"\3\30\1\u00ef\2\30\1\52\1\30\1\u0098\1\30\2\uffff\2\30\1\u00c4\2\173\1"+
		"\u00de\2\30\1\u00f8\1\30\1\173\1\u00d2\1\30\2\u00ef\1\30\1\uffff\2\30"+
		"\1\173\3\30\1\173\1\u00c4\1\uffff\1\30\1\u00c4\1\u0098\1\173\1\52\1\u00c4"+
		"\2\30\1\116\1\30\1\173\1\u00de";
	static final String DFA17_eofS =
		"\u0105\uffff";
	static final String DFA17_minS =
		"\1\11\1\uffff\4\55\1\40\2\55\1\uffff\10\55\1\40\5\55\1\uffff\1\60\1\uffff"+
		"\1\55\3\100\1\uffff\3\100\1\143\1\100\1\55\1\40\3\100\1\uffff\2\100\1"+
		"\141\1\55\14\100\1\166\10\100\1\60\3\100\1\55\3\100\1\55\1\100\1\uffff"+
		"\5\100\1\164\1\100\1\154\1\uffff\1\55\10\100\1\55\3\100\1\55\1\100\1\55"+
		"\2\100\1\55\1\100\1\55\5\100\1\uffff\1\100\4\55\1\100\1\55\1\155\1\uffff"+
		"\6\100\2\55\1\145\2\100\1\40\12\100\1\40\1\55\1\100\1\151\1\55\1\100\1"+
		"\uffff\1\55\4\100\1\55\1\100\1\55\3\100\1\uffff\1\142\1\100\2\55\2\100"+
		"\1\55\1\155\3\100\2\55\7\100\1\55\1\145\1\uffff\1\100\1\55\1\100\2\55"+
		"\3\100\1\uffff\3\100\1\162\1\100\1\uffff\1\55\1\100\1\145\3\100\1\55\1"+
		"\uffff\3\100\1\55\2\100\1\55\1\162\1\55\1\100\2\uffff\2\100\4\55\1\145"+
		"\1\100\1\55\1\156\2\55\1\100\2\55\1\100\1\uffff\2\100\1\55\3\100\2\55"+
		"\1\uffff\1\164\5\55\2\100\1\55\1\100\2\55";
	static final String DFA17_maxS =
		"\1\u00ff\1\uffff\7\u00ff\1\uffff\16\u00ff\1\uffff\1\71\1\uffff\1\u00ff"+
		"\3\172\1\uffff\3\172\1\143\1\172\1\u00ff\4\172\1\uffff\1\172\1\u00fb\1"+
		"\141\1\u00ff\14\172\1\166\10\172\1\71\3\172\1\u00ff\3\172\1\u00ff\1\172"+
		"\1\uffff\5\172\1\164\1\172\1\154\1\uffff\1\u00ff\10\172\1\u00ff\3\172"+
		"\1\u00ff\1\172\1\u00ff\2\172\1\u00ff\1\172\1\u00ff\5\172\1\uffff\1\172"+
		"\4\u00ff\1\172\1\u00ff\1\155\1\uffff\6\172\2\u00ff\1\145\16\172\1\u00ff"+
		"\1\172\1\151\1\u00ff\1\172\1\uffff\1\u00ff\4\172\1\u00ff\1\172\1\u00ff"+
		"\3\172\1\uffff\1\142\1\172\2\u00ff\2\172\1\u00ff\1\155\3\172\2\u00ff\7"+
		"\172\1\u00ff\1\145\1\uffff\1\172\1\u00ff\1\172\2\u00ff\3\172\1\uffff\3"+
		"\172\1\162\1\172\1\uffff\1\u00ff\1\172\1\145\3\172\1\u00ff\1\uffff\3\172"+
		"\1\u00ff\2\172\1\u00ff\1\162\1\u00ff\1\172\2\uffff\2\172\4\u00ff\1\145"+
		"\1\172\1\u00ff\1\156\2\u00ff\1\172\2\u00ff\1\172\1\uffff\2\172\1\u00ff"+
		"\3\172\2\u00ff\1\uffff\1\164\5\u00ff\2\172\1\u00ff\1\172\2\u00ff";
	static final String DFA17_acceptS =
		"\1\uffff\1\1\7\uffff\1\4\16\uffff\1\21\1\uffff\1\23\4\uffff\1\22\12\uffff"+
		"\1\10\43\uffff\1\2\10\uffff\1\3\32\uffff\1\24\10\uffff\1\17\34\uffff\1"+
		"\13\13\uffff\1\12\26\uffff\1\11\10\uffff\1\20\5\uffff\1\15\7\uffff\1\5"+
		"\12\uffff\1\14\1\16\20\uffff\1\6\10\uffff\1\7\14\uffff";
	static final String DFA17_specialS =
		"\u0105\uffff}>";
	static final String[] DFA17_transitionS = {
			"\2\1\2\uffff\1\1\22\uffff\1\1\15\uffff\1\11\1\uffff\1\32\11\31\7\uffff"+
			"\32\30\6\uffff\1\6\1\27\1\14\1\4\1\5\1\21\1\17\2\27\1\2\1\27\1\13\1\24"+
			"\1\15\1\10\1\23\1\3\1\16\1\26\1\25\1\20\1\12\4\27\45\uffff\100\30\1\22"+
			"\10\30\1\7\26\30",
			"",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\1\34\3\36\1\33\17\36\1\35"+
			"\5\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\24\36\1\40\5\36\45\uffff\140"+
			"\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\1\42\7\36\1\44\5\36\1\41\13"+
			"\36\45\uffff\111\30\1\43\26\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\14\36\1\47\1\46\5\36\1\45"+
			"\6\36\45\uffff\140\30",
			"\1\52\14\uffff\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\16\36\1\54\2"+
			"\36\1\51\2\36\1\50\1\53\4\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\6\30\1\55\23\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\2\36\1\57\21\36\1\56\5\36"+
			"\45\uffff\140\30",
			"",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\4\36\1\61\11\36\1\60\13\36"+
			"\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\10\36\1\62\13\36\1\63\5\36"+
			"\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\16\36\1\64\13\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\16\36\1\65\13\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\1\67\23\36\1\66\5\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\21\36\1\70\10\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\15\36\1\71\14\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\16\36\1\72\13\36\45\uffff"+
			"\111\30\1\73\26\30",
			"\1\52\14\uffff\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\1\74\31\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\1\76\3\36\1\77\11\36\1\75"+
			"\13\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\7\36\1\101\1\100\21\36\45"+
			"\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\1\103\3\36\1\102\25\36\45"+
			"\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"",
			"\12\104",
			"",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\24\36\1\105\5\36\45\uffff"+
			"\140\30",
			"\1\37\40\uffff\15\36\1\106\14\36",
			"\1\37\40\uffff\10\36\1\107\21\36",
			"\1\37\40\uffff\32\36",
			"",
			"\1\37\40\uffff\10\36\1\110\21\36",
			"\1\37\40\uffff\14\36\1\112\1\111\14\36",
			"\1\37\40\uffff\23\36\1\113\6\36",
			"\1\114",
			"\1\37\40\uffff\14\36\1\115\15\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\116\37\uffff\1\37\40\uffff\32\36",
			"\1\37\40\uffff\1\117\31\36",
			"\1\37\40\uffff\22\36\1\120\1\121\6\36",
			"\1\37\40\uffff\23\36\1\122\6\36",
			"",
			"\1\37\40\uffff\21\36\1\123\10\36",
			"\1\37\40\uffff\24\36\1\125\5\36\u0080\uffff\1\124",
			"\1\126",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\23\36\1\130\6\36",
			"\1\37\40\uffff\10\36\1\132\13\36\1\131\5\36",
			"\1\37\40\uffff\15\36\1\133\14\36",
			"\1\37\40\uffff\22\36\1\134\7\36",
			"\1\37\40\uffff\15\36\1\135\14\36",
			"\1\37\40\uffff\14\36\1\136\1\137\14\36",
			"\1\37\40\uffff\14\36\1\140\10\36\1\141\4\36",
			"\1\37\40\uffff\1\36\1\142\30\36",
			"\1\37\40\uffff\17\36\1\143\12\36",
			"\1\37\40\uffff\16\36\1\144\13\36",
			"\1\37\40\uffff\4\36\1\145\25\36",
			"\1\37\40\uffff\2\36\1\146\27\36",
			"\1\147",
			"\1\37\40\uffff\6\36\1\150\12\36\1\151\10\36",
			"\1\37\40\uffff\23\36\1\152\6\36",
			"\1\37\40\uffff\10\36\1\154\10\36\1\153\10\36",
			"\1\37\40\uffff\21\36\1\155\10\36",
			"\1\37\40\uffff\23\36\1\156\6\36",
			"\1\37\40\uffff\4\36\1\157\25\36",
			"\1\37\40\uffff\17\36\1\160\12\36",
			"\1\37\40\uffff\14\36\1\161\15\36",
			"\12\162",
			"\1\37\40\uffff\3\36\1\163\26\36",
			"\1\37\40\uffff\25\36\1\164\4\36",
			"\1\37\40\uffff\13\36\1\166\1\36\1\165\14\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\23\36\1\167\6\36",
			"\1\37\40\uffff\1\170\31\36",
			"\1\37\40\uffff\4\36\1\171\25\36",
			"\1\30\2\uffff\12\30\47\uffff\4\30\1\172\25\30\45\uffff\140\30",
			"\1\37\40\uffff\1\174\31\36",
			"",
			"\1\37\40\uffff\10\36\1\175\21\36",
			"\1\37\40\uffff\22\36\1\176\7\36",
			"\1\37\40\uffff\4\36\1\177\25\36",
			"\1\37\40\uffff\10\36\1\u0080\21\36",
			"\1\37\40\uffff\10\36\1\u0081\21\36",
			"\1\u0082",
			"\1\37\40\uffff\23\36\1\u0083\6\36",
			"\1\u0084",
			"",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\16\36\1\u0085\13\36\45\uffff"+
			"\140\30",
			"\1\37\40\uffff\13\36\1\u0086\16\36",
			"\1\37\40\uffff\21\36\1\u0087\10\36",
			"\1\37\40\uffff\3\36\1\u0088\26\36",
			"\1\37\40\uffff\23\36\1\u0089\6\36",
			"\1\37\40\uffff\3\36\1\u008a\26\36",
			"\1\37\40\uffff\1\36\1\u008c\15\36\1\u008b\12\36",
			"\1\37\40\uffff\23\36\1\u008d\6\36",
			"\1\37\40\uffff\1\36\1\u008e\30\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\4\36\1\u008f\25\36\45\uffff"+
			"\140\30",
			"\1\37\40\uffff\21\36\1\u0090\10\36",
			"\1\37\40\uffff\4\36\1\u0091\25\36",
			"\1\37\40\uffff\22\36\1\u0092\7\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\22\36\1\u0093\7\36\45\uffff"+
			"\140\30",
			"\1\37\40\uffff\24\36\1\u0094\5\36",
			"\1\30\2\uffff\12\30\47\uffff\21\30\1\u0095\10\30\45\uffff\140\30",
			"\1\37\40\uffff\4\36\1\u0096\25\36",
			"\1\37\40\uffff\13\36\1\u0097\16\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\3\36\1\u009a\16\36\1\u0099\7\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\2\36\1\u009b\27\36",
			"\1\37\40\uffff\21\36\1\u009c\10\36",
			"\1\37\40\uffff\14\36\1\u009d\15\36",
			"\1\37\40\uffff\23\36\1\u009e\6\36",
			"\1\37\40\uffff\4\36\1\u009f\25\36",
			"",
			"\1\37\40\uffff\10\36\1\u00a0\21\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\10\36\1\u00a1\21\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\13\36\1\u00a2\16\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\10\36\1\u00a3\21\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00a5",
			"",
			"\1\37\40\uffff\15\36\1\u00a6\14\36",
			"\1\37\40\uffff\13\36\1\u00a7\16\36",
			"\1\37\40\uffff\10\36\1\u00a8\21\36",
			"\1\37\40\uffff\24\36\1\u00a9\5\36",
			"\1\37\40\uffff\2\36\1\u00aa\27\36",
			"\1\37\40\uffff\13\36\1\u00ab\16\36",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00ac",
			"\1\37\40\uffff\1\36\1\u00ad\30\36",
			"\1\37\40\uffff\16\36\1\u00ae\13\36",
			"\1\52\37\uffff\1\37\40\uffff\32\36",
			"\1\37\40\uffff\21\36\1\u00af\10\36",
			"\1\37\40\uffff\4\36\1\u00b0\25\36",
			"\1\37\40\uffff\10\36\1\u00b1\21\36",
			"\1\37\40\uffff\23\36\1\u00b2\6\36",
			"\1\37\40\uffff\10\36\1\u00b3\21\36",
			"\1\37\40\uffff\4\36\1\u00b4\25\36",
			"\1\37\40\uffff\21\36\1\u00b5\10\36",
			"\1\37\40\uffff\14\36\1\u00b6\15\36",
			"\1\37\40\uffff\10\36\1\u00b7\21\36",
			"\1\37\40\uffff\13\36\1\u00b8\16\36",
			"\1\52\37\uffff\1\37\40\uffff\32\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\22\36\1\u00b9\7\36",
			"\1\u00ba",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\4\36\1\u00bc\25\36",
			"",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\10\36\1\u00bd\21\36",
			"\1\37\40\uffff\21\36\1\u00be\10\36",
			"\1\37\40\uffff\4\36\1\u00bf\25\36",
			"\1\37\40\uffff\1\u00c1\3\36\1\u00c0\25\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\4\36\1\u00c2\25\36\45\uffff"+
			"\140\30",
			"\1\37\40\uffff\3\36\1\u00c3\26\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\4\36\1\u00c5\25\36",
			"\1\37\40\uffff\4\36\1\u00c6\25\36",
			"\1\37\40\uffff\15\36\1\u00c7\14\36",
			"",
			"\1\u00c8",
			"\1\37\40\uffff\2\36\1\u00c9\27\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\21\36\1\u00cb\10\36",
			"\1\37\40\uffff\13\36\1\u00cc\16\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00cd",
			"\1\37\40\uffff\21\36\1\u00ce\10\36",
			"\1\37\40\uffff\10\36\1\u00cf\21\36",
			"\1\37\40\uffff\4\36\1\u00d0\25\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\21\36\1\u00d1\10\36\45\uffff"+
			"\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\4\36\1\u00d3\25\36",
			"\1\37\40\uffff\4\36\1\u00d4\25\36",
			"\1\37\40\uffff\15\36\1\u00d5\14\36",
			"\1\37\40\uffff\4\36\1\u00d6\25\36",
			"\1\37\40\uffff\1\36\1\u00d7\30\36",
			"\1\37\40\uffff\20\36\1\u00d8\11\36",
			"\1\37\40\uffff\22\36\1\u00d9\7\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00da",
			"",
			"\1\37\40\uffff\21\36\1\u00db\10\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\4\36\1\u00dc\25\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\23\36\1\u00df\6\36",
			"\1\37\40\uffff\14\36\1\u00e0\15\36",
			"\1\37\40\uffff\10\36\1\u00e1\21\36",
			"",
			"\1\37\40\uffff\21\36\1\u00e2\10\36",
			"\1\37\40\uffff\23\36\1\u00e3\6\36",
			"\1\37\40\uffff\4\36\1\u00e4\25\36",
			"\1\u00e5",
			"\1\37\40\uffff\7\36\1\u00e6\22\36",
			"",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\4\36\1\u00e7\25\36",
			"\1\u00e8",
			"\1\37\40\uffff\4\36\1\u00e9\25\36",
			"\1\37\40\uffff\21\36\1\u00ea\10\36",
			"\1\37\40\uffff\3\36\1\u00eb\26\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"",
			"\1\37\40\uffff\21\36\1\u00ec\10\36",
			"\1\37\40\uffff\15\36\1\u00ed\14\36",
			"\1\37\40\uffff\10\36\1\u00ee\21\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\21\36\1\u00f0\10\36",
			"\1\37\40\uffff\24\36\1\u00f1\5\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00f2",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\3\36\1\u00f3\26\36",
			"",
			"",
			"\1\37\40\uffff\10\36\1\u00f4\21\36",
			"\1\37\40\uffff\1\36\1\u00f5\30\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00f6",
			"\1\37\40\uffff\4\36\1\u00f7\25\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\u00f9",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\10\36\1\u00fa\21\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\21\36\1\u00fb\10\36",
			"",
			"\1\37\40\uffff\4\36\1\u00fc\25\36",
			"\1\37\40\uffff\4\36\1\u00fd\25\36",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\37\40\uffff\10\36\1\u00fe\21\36",
			"\1\37\40\uffff\20\36\1\u00ff\11\36",
			"\1\37\40\uffff\21\36\1\u0100\10\36",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"",
			"\1\u0101",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\37\40\uffff\24\36\1\u0102\5\36",
			"\1\37\40\uffff\4\36\1\u0103\25\36",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\37\40\uffff\4\36\1\u0104\25\36",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30",
			"\1\30\2\uffff\12\30\6\uffff\1\37\40\uffff\32\36\45\uffff\140\30"
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WS | ET | OU | POINT | SELECT | COUNT | ARTICLE | RUBRIQUE | PAGE | DATE | MOT | TITRE | EMAIL | THEME | MOIS | JOUR | VAR | VAREMAIL | JJ | ANNEE );";
		}
	}

}
