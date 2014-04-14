// $ANTLR 3.5 /Users/joanne/Desktop/tal_sql.g 2014-04-14 14:59:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int CONJ=5;
	public static final int MOT=6;
	public static final int PAGE=7;
	public static final int POINT=8;
	public static final int SELECT=9;
	public static final int VAR=10;
	public static final int WS=11;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/joanne/Desktop/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Desktop/tal_sql.g:3:8: ( 'vouloir' )
			// /Users/joanne/Desktop/tal_sql.g:3:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Desktop/tal_sql.g:6:9: ( 'article' )
			// /Users/joanne/Desktop/tal_sql.g:6:11: 'article'
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

	// $ANTLR start "PAGE"
	public final void mPAGE() throws RecognitionException {
		try {
			int _type = PAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Desktop/tal_sql.g:9:6: ( 'page' )
			// /Users/joanne/Desktop/tal_sql.g:9:8: 'page'
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

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Desktop/tal_sql.g:12:6: ( 'et' | 'ou' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='e') ) {
				alt1=1;
			}
			else if ( (LA1_0=='o') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/joanne/Desktop/tal_sql.g:12:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/joanne/Desktop/tal_sql.g:12:15: 'ou'
					{
					match("ou"); 

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
	// $ANTLR end "CONJ"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Desktop/tal_sql.g:15:7: ( '.' )
			// /Users/joanne/Desktop/tal_sql.g:15:9: '.'
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

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Desktop/tal_sql.g:18:5: ( 'mot' | 'contenir' | 'parler' )
			int alt2=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt2=1;
				}
				break;
			case 'c':
				{
				alt2=2;
				}
				break;
			case 'p':
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/joanne/Desktop/tal_sql.g:18:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /Users/joanne/Desktop/tal_sql.g:18:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /Users/joanne/Desktop/tal_sql.g:18:28: 'parler'
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Desktop/tal_sql.g:21:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\t'||LA4_0=='\r'||LA4_0==' '||LA4_0=='d'||LA4_0=='j'||LA4_0=='q') ) {
				alt4=1;
			}
			else if ( (LA4_0=='\n') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/joanne/Desktop/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /Users/joanne/Desktop/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt3=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt3=1;
						}
						break;
					case '\t':
						{
						alt3=2;
						}
						break;
					case '\r':
						{
						alt3=3;
						}
						break;
					case 'j':
						{
						alt3=4;
						}
						break;
					case 'q':
						{
						alt3=5;
						}
						break;
					case 'd':
						{
						alt3=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// /Users/joanne/Desktop/tal_sql.g:21:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /Users/joanne/Desktop/tal_sql.g:21:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /Users/joanne/Desktop/tal_sql.g:21:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /Users/joanne/Desktop/tal_sql.g:21:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /Users/joanne/Desktop/tal_sql.g:21:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /Users/joanne/Desktop/tal_sql.g:21:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /Users/joanne/Desktop/tal_sql.g:21:62: '\\n'
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

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/joanne/Desktop/tal_sql.g:24:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /Users/joanne/Desktop/tal_sql.g:24:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/joanne/Desktop/tal_sql.g:24:30: ( 'a' .. 'z' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/joanne/Desktop/tal_sql.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/joanne/Desktop/tal_sql.g:1:8: ( SELECT | ARTICLE | PAGE | CONJ | POINT | MOT | WS | VAR )
		int alt6=8;
		switch ( input.LA(1) ) {
		case 'v':
			{
			int LA6_1 = input.LA(2);
			if ( (LA6_1=='o') ) {
				int LA6_14 = input.LA(3);
				if ( (LA6_14=='u') ) {
					int LA6_24 = input.LA(4);
					if ( (LA6_24=='l') ) {
						int LA6_33 = input.LA(5);
						if ( (LA6_33=='o') ) {
							int LA6_40 = input.LA(6);
							if ( (LA6_40=='i') ) {
								int LA6_45 = input.LA(7);
								if ( (LA6_45=='r') ) {
									int LA6_49 = input.LA(8);
									if ( ((LA6_49 >= 'a' && LA6_49 <= 'z')) ) {
										alt6=8;
									}

									else {
										alt6=1;
									}

								}

								else {
									alt6=8;
								}

							}

							else {
								alt6=8;
							}

						}

						else {
							alt6=8;
						}

					}

					else {
						alt6=8;
					}

				}

				else {
					alt6=8;
				}

			}
			else if ( ((LA6_1 >= 'a' && LA6_1 <= 'n')||(LA6_1 >= 'p' && LA6_1 <= 'z')) ) {
				alt6=8;
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
		case 'a':
			{
			int LA6_2 = input.LA(2);
			if ( (LA6_2=='r') ) {
				int LA6_15 = input.LA(3);
				if ( (LA6_15=='t') ) {
					int LA6_25 = input.LA(4);
					if ( (LA6_25=='i') ) {
						int LA6_34 = input.LA(5);
						if ( (LA6_34=='c') ) {
							int LA6_41 = input.LA(6);
							if ( (LA6_41=='l') ) {
								int LA6_46 = input.LA(7);
								if ( (LA6_46=='e') ) {
									int LA6_50 = input.LA(8);
									if ( ((LA6_50 >= 'a' && LA6_50 <= 'z')) ) {
										alt6=8;
									}

									else {
										alt6=2;
									}

								}

								else {
									alt6=8;
								}

							}

							else {
								alt6=8;
							}

						}

						else {
							alt6=8;
						}

					}

					else {
						alt6=8;
					}

				}

				else {
					alt6=8;
				}

			}
			else if ( ((LA6_2 >= 'a' && LA6_2 <= 'q')||(LA6_2 >= 's' && LA6_2 <= 'z')) ) {
				alt6=8;
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
		case 'p':
			{
			int LA6_3 = input.LA(2);
			if ( (LA6_3=='a') ) {
				switch ( input.LA(3) ) {
				case 'g':
					{
					int LA6_26 = input.LA(4);
					if ( (LA6_26=='e') ) {
						int LA6_35 = input.LA(5);
						if ( ((LA6_35 >= 'a' && LA6_35 <= 'z')) ) {
							alt6=8;
						}

						else {
							alt6=3;
						}

					}

					else {
						alt6=8;
					}

					}
					break;
				case 'r':
					{
					int LA6_27 = input.LA(4);
					if ( (LA6_27=='l') ) {
						int LA6_36 = input.LA(5);
						if ( (LA6_36=='e') ) {
							int LA6_43 = input.LA(6);
							if ( (LA6_43=='r') ) {
								int LA6_47 = input.LA(7);
								if ( ((LA6_47 >= 'a' && LA6_47 <= 'z')) ) {
									alt6=8;
								}

								else {
									alt6=6;
								}

							}

							else {
								alt6=8;
							}

						}

						else {
							alt6=8;
						}

					}

					else {
						alt6=8;
					}

					}
					break;
				default:
					alt6=8;
				}
			}
			else if ( ((LA6_3 >= 'b' && LA6_3 <= 'z')) ) {
				alt6=8;
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
		case 'e':
			{
			int LA6_4 = input.LA(2);
			if ( (LA6_4=='t') ) {
				int LA6_17 = input.LA(3);
				if ( ((LA6_17 >= 'a' && LA6_17 <= 'z')) ) {
					alt6=8;
				}

				else {
					alt6=4;
				}

			}
			else if ( ((LA6_4 >= 'a' && LA6_4 <= 's')||(LA6_4 >= 'u' && LA6_4 <= 'z')) ) {
				alt6=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 6, 4, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'o':
			{
			int LA6_5 = input.LA(2);
			if ( (LA6_5=='u') ) {
				int LA6_18 = input.LA(3);
				if ( ((LA6_18 >= 'a' && LA6_18 <= 'z')) ) {
					alt6=8;
				}

				else {
					alt6=4;
				}

			}
			else if ( ((LA6_5 >= 'a' && LA6_5 <= 't')||(LA6_5 >= 'v' && LA6_5 <= 'z')) ) {
				alt6=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 6, 5, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '.':
			{
			alt6=5;
			}
			break;
		case 'm':
			{
			int LA6_7 = input.LA(2);
			if ( (LA6_7=='o') ) {
				int LA6_19 = input.LA(3);
				if ( (LA6_19=='t') ) {
					int LA6_29 = input.LA(4);
					if ( ((LA6_29 >= 'a' && LA6_29 <= 'z')) ) {
						alt6=8;
					}

					else {
						alt6=6;
					}

				}

				else {
					alt6=8;
				}

			}
			else if ( ((LA6_7 >= 'a' && LA6_7 <= 'n')||(LA6_7 >= 'p' && LA6_7 <= 'z')) ) {
				alt6=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 6, 7, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'c':
			{
			int LA6_8 = input.LA(2);
			if ( (LA6_8=='o') ) {
				int LA6_20 = input.LA(3);
				if ( (LA6_20=='n') ) {
					int LA6_30 = input.LA(4);
					if ( (LA6_30=='t') ) {
						int LA6_38 = input.LA(5);
						if ( (LA6_38=='e') ) {
							int LA6_44 = input.LA(6);
							if ( (LA6_44=='n') ) {
								int LA6_48 = input.LA(7);
								if ( (LA6_48=='i') ) {
									int LA6_51 = input.LA(8);
									if ( (LA6_51=='r') ) {
										int LA6_54 = input.LA(9);
										if ( ((LA6_54 >= 'a' && LA6_54 <= 'z')) ) {
											alt6=8;
										}

										else {
											alt6=6;
										}

									}

									else {
										alt6=8;
									}

								}

								else {
									alt6=8;
								}

							}

							else {
								alt6=8;
							}

						}

						else {
							alt6=8;
						}

					}

					else {
						alt6=8;
					}

				}

				else {
					alt6=8;
				}

			}
			else if ( ((LA6_8 >= 'a' && LA6_8 <= 'n')||(LA6_8 >= 'p' && LA6_8 <= 'z')) ) {
				alt6=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 6, 8, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt6=7;
			}
			break;
		case 'j':
			{
			int LA6_10 = input.LA(2);
			if ( (LA6_10=='e') ) {
				int LA6_21 = input.LA(3);
				if ( ((LA6_21 >= 'a' && LA6_21 <= 'z')) ) {
					alt6=8;
				}

				else {
					alt6=7;
				}

			}
			else if ( ((LA6_10 >= 'a' && LA6_10 <= 'd')||(LA6_10 >= 'f' && LA6_10 <= 'z')) ) {
				alt6=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 6, 10, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'q':
			{
			int LA6_11 = input.LA(2);
			if ( (LA6_11=='u') ) {
				int LA6_22 = input.LA(3);
				if ( (LA6_22=='i') ) {
					int LA6_31 = input.LA(4);
					if ( ((LA6_31 >= 'a' && LA6_31 <= 'z')) ) {
						alt6=8;
					}

					else {
						alt6=7;
					}

				}

				else {
					alt6=8;
				}

			}
			else if ( ((LA6_11 >= 'a' && LA6_11 <= 't')||(LA6_11 >= 'v' && LA6_11 <= 'z')) ) {
				alt6=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 6, 11, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'd':
			{
			int LA6_12 = input.LA(2);
			if ( (LA6_12=='o') ) {
				int LA6_23 = input.LA(3);
				if ( (LA6_23=='n') ) {
					int LA6_32 = input.LA(4);
					if ( (LA6_32=='t') ) {
						int LA6_39 = input.LA(5);
						if ( ((LA6_39 >= 'a' && LA6_39 <= 'z')) ) {
							alt6=8;
						}

						else {
							alt6=7;
						}

					}

					else {
						alt6=8;
					}

				}

				else {
					alt6=8;
				}

			}
			else if ( ((LA6_12 >= 'a' && LA6_12 <= 'n')||(LA6_12 >= 'p' && LA6_12 <= 'z')) ) {
				alt6=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 6, 12, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'b':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'k':
		case 'l':
		case 'n':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt6=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 6, 0, input);
			throw nvae;
		}
		switch (alt6) {
			case 1 :
				// /Users/joanne/Desktop/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /Users/joanne/Desktop/tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /Users/joanne/Desktop/tal_sql.g:1:25: PAGE
				{
				mPAGE(); 

				}
				break;
			case 4 :
				// /Users/joanne/Desktop/tal_sql.g:1:30: CONJ
				{
				mCONJ(); 

				}
				break;
			case 5 :
				// /Users/joanne/Desktop/tal_sql.g:1:35: POINT
				{
				mPOINT(); 

				}
				break;
			case 6 :
				// /Users/joanne/Desktop/tal_sql.g:1:41: MOT
				{
				mMOT(); 

				}
				break;
			case 7 :
				// /Users/joanne/Desktop/tal_sql.g:1:45: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// /Users/joanne/Desktop/tal_sql.g:1:48: VAR
				{
				mVAR(); 

				}
				break;

		}
	}



}
