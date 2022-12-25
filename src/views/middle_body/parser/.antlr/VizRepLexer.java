// Generated from c:\Users\jonas\OneDrive\Dokumente\MSC_Wirtschaftsinformatik\semester_4\master_thesis\masterThesis\src\views\middle_body\parser\VizRep.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VizRepLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, BOOLEANSTRING=22, SPHEREDIMENSIONS=23, 
		DIMENSION3D=24, DIMENSION2D=25, TEXTDIMDIGITS=26, TEXTDIMSTRING=27, PENPARAMSBOOL=28, 
		PENPARAMS=29, VARASSVALUES=30, STRING=31, DIGITS=32, WHITESPACE=33, NEWLINE=34, 
		OPERATOR=35, SOMERULE=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "LOWERCASE", "UPPERCASE", "BOOLEANSTRING", 
			"SPHEREDIMENSIONS", "DIMENSION3D", "DIMENSION2D", "TEXTDIMDIGITS", "TEXTDIMSTRING", 
			"PENPARAMSBOOL", "PENPARAMS", "VARASSVALUES", "STRING", "DIGITS", "WHITESPACE", 
			"NEWLINE", "OPERATOR", "SOMERULE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'START'", "'END'", "'MIDDLE'", "'IF('", "')'", "'THEN'", "'ELSE'", 
			"'END IF'", "'SET: '", "':'", "','", "';'", "'CUBE:'", "'SPHERE:'", "'PLANE:'", 
			"'TEXT:'", "'LINE:'", "'lineWidth:'", "'PEN:'", "'COLOR: fill:'", "'MAP: map:'", 
			null, null, null, null, null, null, "'dashed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "BOOLEANSTRING", 
			"SPHEREDIMENSIONS", "DIMENSION3D", "DIMENSION2D", "TEXTDIMDIGITS", "TEXTDIMSTRING", 
			"PENPARAMSBOOL", "PENPARAMS", "VARASSVALUES", "STRING", "DIGITS", "WHITESPACE", 
			"NEWLINE", "OPERATOR", "SOMERULE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public VizRepLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VizRep.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u01a7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00d9\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u00fa\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0102\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u010f"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0121\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u013f\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u0160\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u017b\n!\3\"\3\"\6\"\u017f\n\"\r\""+
		"\16\"\u0180\3#\6#\u0184\n#\r#\16#\u0185\3$\6$\u0189\n$\r$\16$\u018a\3"+
		"$\3$\3%\5%\u0190\n%\3%\3%\6%\u0194\n%\r%\16%\u0195\3&\3&\3&\3&\3&\3&\3"+
		"&\5&\u019f\n&\3\'\3\'\3\'\6\'\u01a4\n\'\r\'\16\'\u01a5\2\2(\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\2/\2\61\30\63\31\65\32\67\339\34;\35=\36?\37A "+
		"C!E\"G#I$K%M&\3\2\7\3\2c|\3\2C\\\3\2\62;\4\2\13\13\"\"\4\2>>@@\2\u01bf"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\3O\3\2\2\2\5U\3\2\2\2\7Y\3\2\2\2\t`\3\2\2\2\13d\3\2\2\2"+
		"\rf\3\2\2\2\17k\3\2\2\2\21p\3\2\2\2\23w\3\2\2\2\25}\3\2\2\2\27\177\3\2"+
		"\2\2\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0089\3\2\2\2\37\u0091\3\2\2"+
		"\2!\u0098\3\2\2\2#\u009e\3\2\2\2%\u00a4\3\2\2\2\'\u00af\3\2\2\2)\u00b4"+
		"\3\2\2\2+\u00c1\3\2\2\2-\u00cb\3\2\2\2/\u00cd\3\2\2\2\61\u00d8\3\2\2\2"+
		"\63\u00f9\3\2\2\2\65\u0101\3\2\2\2\67\u010e\3\2\2\29\u0120\3\2\2\2;\u013e"+
		"\3\2\2\2=\u0140\3\2\2\2?\u015f\3\2\2\2A\u017a\3\2\2\2C\u017e\3\2\2\2E"+
		"\u0183\3\2\2\2G\u0188\3\2\2\2I\u0193\3\2\2\2K\u019e\3\2\2\2M\u01a3\3\2"+
		"\2\2OP\7U\2\2PQ\7V\2\2QR\7C\2\2RS\7T\2\2ST\7V\2\2T\4\3\2\2\2UV\7G\2\2"+
		"VW\7P\2\2WX\7F\2\2X\6\3\2\2\2YZ\7O\2\2Z[\7K\2\2[\\\7F\2\2\\]\7F\2\2]^"+
		"\7N\2\2^_\7G\2\2_\b\3\2\2\2`a\7K\2\2ab\7H\2\2bc\7*\2\2c\n\3\2\2\2de\7"+
		"+\2\2e\f\3\2\2\2fg\7V\2\2gh\7J\2\2hi\7G\2\2ij\7P\2\2j\16\3\2\2\2kl\7G"+
		"\2\2lm\7N\2\2mn\7U\2\2no\7G\2\2o\20\3\2\2\2pq\7G\2\2qr\7P\2\2rs\7F\2\2"+
		"st\7\"\2\2tu\7K\2\2uv\7H\2\2v\22\3\2\2\2wx\7U\2\2xy\7G\2\2yz\7V\2\2z{"+
		"\7<\2\2{|\7\"\2\2|\24\3\2\2\2}~\7<\2\2~\26\3\2\2\2\177\u0080\7.\2\2\u0080"+
		"\30\3\2\2\2\u0081\u0082\7=\2\2\u0082\32\3\2\2\2\u0083\u0084\7E\2\2\u0084"+
		"\u0085\7W\2\2\u0085\u0086\7D\2\2\u0086\u0087\7G\2\2\u0087\u0088\7<\2\2"+
		"\u0088\34\3\2\2\2\u0089\u008a\7U\2\2\u008a\u008b\7R\2\2\u008b\u008c\7"+
		"J\2\2\u008c\u008d\7G\2\2\u008d\u008e\7T\2\2\u008e\u008f\7G\2\2\u008f\u0090"+
		"\7<\2\2\u0090\36\3\2\2\2\u0091\u0092\7R\2\2\u0092\u0093\7N\2\2\u0093\u0094"+
		"\7C\2\2\u0094\u0095\7P\2\2\u0095\u0096\7G\2\2\u0096\u0097\7<\2\2\u0097"+
		" \3\2\2\2\u0098\u0099\7V\2\2\u0099\u009a\7G\2\2\u009a\u009b\7Z\2\2\u009b"+
		"\u009c\7V\2\2\u009c\u009d\7<\2\2\u009d\"\3\2\2\2\u009e\u009f\7N\2\2\u009f"+
		"\u00a0\7K\2\2\u00a0\u00a1\7P\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7<\2\2"+
		"\u00a3$\3\2\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2"+
		"\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7Y\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab"+
		"\7f\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7<\2\2\u00ae"+
		"&\3\2\2\2\u00af\u00b0\7R\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2\7P\2\2\u00b2"+
		"\u00b3\7<\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7E\2\2\u00b5\u00b6\7Q\2\2\u00b6"+
		"\u00b7\7N\2\2\u00b7\u00b8\7Q\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7<\2\2"+
		"\u00ba\u00bb\7\"\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be"+
		"\7n\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7<\2\2\u00c0*\3\2\2\2\u00c1\u00c2"+
		"\7O\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4\7R\2\2\u00c4\u00c5\7<\2\2\u00c5"+
		"\u00c6\7\"\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7r\2"+
		"\2\u00c9\u00ca\7<\2\2\u00ca,\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc.\3\2\2"+
		"\2\u00cd\u00ce\t\3\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7V\2\2\u00d0\u00d1"+
		"\7t\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d9\7g\2\2\u00d3\u00d4\7H\2\2\u00d4"+
		"\u00d5\7c\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d9\7g\2\2"+
		"\u00d8\u00cf\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d9\62\3\2\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7k\2\2\u00de"+
		"\u00df\7w\2\2\u00df\u00fa\7u\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7k\2\2"+
		"\u00e2\u00e3\7f\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6"+
		"\7U\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7i\2\2\u00e8\u00e9\7o\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7p\2\2\u00eb\u00fa\7v\2\2\u00ec\u00ed\7j\2\2"+
		"\u00ed\u00ee\7g\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7i\2\2\u00f0\u00f1"+
		"\7j\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7U\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7i\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7p\2\2"+
		"\u00f8\u00fa\7v\2\2\u00f9\u00da\3\2\2\2\u00f9\u00e0\3\2\2\2\u00f9\u00ec"+
		"\3\2\2\2\u00fa\64\3\2\2\2\u00fb\u0102\5\67\34\2\u00fc\u00fd\7f\2\2\u00fd"+
		"\u00fe\7g\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7v\2\2\u0100\u0102\7j\2\2"+
		"\u0101\u00fb\3\2\2\2\u0101\u00fc\3\2\2\2\u0102\66\3\2\2\2\u0103\u0104"+
		"\7j\2\2\u0104\u0105\7g\2\2\u0105\u0106\7k\2\2\u0106\u0107\7i\2\2\u0107"+
		"\u0108\7j\2\2\u0108\u010f\7v\2\2\u0109\u010a\7y\2\2\u010a\u010b\7k\2\2"+
		"\u010b\u010c\7f\2\2\u010c\u010d\7v\2\2\u010d\u010f\7j\2\2\u010e\u0103"+
		"\3\2\2\2\u010e\u0109\3\2\2\2\u010f8\3\2\2\2\u0110\u0111\7z\2\2\u0111\u0112"+
		"\7T\2\2\u0112\u0113\7g\2\2\u0113\u0121\7n\2\2\u0114\u0115\7{\2\2\u0115"+
		"\u0116\7T\2\2\u0116\u0117\7g\2\2\u0117\u0121\7n\2\2\u0118\u0119\7|\2\2"+
		"\u0119\u011a\7T\2\2\u011a\u011b\7g\2\2\u011b\u0121\7n\2\2\u011c\u011d"+
		"\7u\2\2\u011d\u011e\7k\2\2\u011e\u011f\7|\2\2\u011f\u0121\7g\2\2\u0120"+
		"\u0110\3\2\2\2\u0120\u0114\3\2\2\2\u0120\u0118\3\2\2\2\u0120\u011c\3\2"+
		"\2\2\u0121:\3\2\2\2\u0122\u0123\7v\2\2\u0123\u0124\7g\2\2\u0124\u0125"+
		"\7z\2\2\u0125\u013f\7v\2\2\u0126\u0127\7r\2\2\u0127\u0128\7q\2\2\u0128"+
		"\u0129\7u\2\2\u0129\u012a\7P\2\2\u012a\u012b\7c\2\2\u012b\u012c\7o\2\2"+
		"\u012c\u012d\7g\2\2\u012d\u013f\7Z\2\2\u012e\u012f\7r\2\2\u012f\u0130"+
		"\7q\2\2\u0130\u0131\7u\2\2\u0131\u0132\7P\2\2\u0132\u0133\7c\2\2\u0133"+
		"\u0134\7o\2\2\u0134\u0135\7g\2\2\u0135\u013f\7[\2\2\u0136\u0137\7r\2\2"+
		"\u0137\u0138\7q\2\2\u0138\u0139\7u\2\2\u0139\u013a\7P\2\2\u013a\u013b"+
		"\7c\2\2\u013b\u013c\7o\2\2\u013c\u013d\7g\2\2\u013d\u013f\7\\\2\2\u013e"+
		"\u0122\3\2\2\2\u013e\u0126\3\2\2\2\u013e\u012e\3\2\2\2\u013e\u0136\3\2"+
		"\2\2\u013f<\3\2\2\2\u0140\u0141\7f\2\2\u0141\u0142\7c\2\2\u0142\u0143"+
		"\7u\2\2\u0143\u0144\7j\2\2\u0144\u0145\7g\2\2\u0145\u0146\7f\2\2\u0146"+
		">\3\2\2\2\u0147\u0148\7f\2\2\u0148\u0149\7c\2\2\u0149\u014a\7u\2\2\u014a"+
		"\u014b\7j\2\2\u014b\u014c\7U\2\2\u014c\u014d\7e\2\2\u014d\u014e\7c\2\2"+
		"\u014e\u014f\7n\2\2\u014f\u0160\7g\2\2\u0150\u0151\7i\2\2\u0151\u0152"+
		"\7c\2\2\u0152\u0153\7r\2\2\u0153\u0154\7U\2\2\u0154\u0155\7k\2\2\u0155"+
		"\u0156\7|\2\2\u0156\u0160\7g\2\2\u0157\u0158\7f\2\2\u0158\u0159\7c\2\2"+
		"\u0159\u015a\7u\2\2\u015a\u015b\7j\2\2\u015b\u015c\7U\2\2\u015c\u015d"+
		"\7k\2\2\u015d\u015e\7|\2\2\u015e\u0160\7g\2\2\u015f\u0147\3\2\2\2\u015f"+
		"\u0150\3\2\2\2\u015f\u0157\3\2\2\2\u0160@\3\2\2\2\u0161\u0162\7k\2\2\u0162"+
		"\u0163\7p\2\2\u0163\u0164\7u\2\2\u0164\u0165\7v\2\2\u0165\u0166\7c\2\2"+
		"\u0166\u0167\7p\2\2\u0167\u0168\7e\2\2\u0168\u0169\7g\2\2\u0169\u016a"+
		"\7C\2\2\u016a\u016b\7f\2\2\u016b\u016c\7c\2\2\u016c\u016d\7r\2\2\u016d"+
		"\u016e\7v\2\2\u016e\u016f\7c\2\2\u016f\u0170\7d\2\2\u0170\u0171\7n\2\2"+
		"\u0171\u017b\7g\2\2\u0172\u0173\7k\2\2\u0173\u0174\7u\2\2\u0174\u0175"+
		"\7F\2\2\u0175\u0176\7{\2\2\u0176\u0177\7p\2\2\u0177\u0178\7x\2\2\u0178"+
		"\u0179\7c\2\2\u0179\u017b\7n\2\2\u017a\u0161\3\2\2\2\u017a\u0172\3\2\2"+
		"\2\u017bB\3\2\2\2\u017c\u017f\5-\27\2\u017d\u017f\5/\30\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181D\3\2\2\2\u0182\u0184\t\4\2\2\u0183\u0182\3\2\2\2"+
		"\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186F\3"+
		"\2\2\2\u0187\u0189\t\5\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\b$"+
		"\2\2\u018dH\3\2\2\2\u018e\u0190\7\17\2\2\u018f\u018e\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0194\7\f\2\2\u0192\u0194\7\17\2\2"+
		"\u0193\u018f\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196J\3\2\2\2\u0197\u0198\7>\2\2\u0198\u019f"+
		"\7?\2\2\u0199\u019a\7?\2\2\u019a\u019f\7?\2\2\u019b\u019c\7@\2\2\u019c"+
		"\u019f\7?\2\2\u019d\u019f\t\6\2\2\u019e\u0197\3\2\2\2\u019e\u0199\3\2"+
		"\2\2\u019e\u019b\3\2\2\2\u019e\u019d\3\2\2\2\u019fL\3\2\2\2\u01a0\u01a4"+
		"\5C\"\2\u01a1\u01a4\5E#\2\u01a2\u01a4\7/\2\2\u01a3\u01a0\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6N\3\2\2\2\25\2\u00d8\u00f9\u0101\u010e\u0120"+
		"\u013e\u015f\u017a\u017e\u0180\u0185\u018a\u018f\u0193\u0195\u019e\u01a3"+
		"\u01a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}