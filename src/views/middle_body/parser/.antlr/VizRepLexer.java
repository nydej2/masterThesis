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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, BOOLEANSTRING=23, SPHEREDIMENSIONS=24, 
		DIMENSION3D=25, DIMENSION3DDYN=26, DIMENSION2D=27, TEXTDIMDIGITS=28, TEXTDIMSTRING=29, 
		PENPARAMSBOOL=30, PENPARAMS=31, VARASSVALUES=32, DIGITS=33, STRING=34, 
		MAP=35, WHITESPACE=36, NEWLINE=37, OPERATOR=38, SOMERULE=39;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "LOWERCASE", "UPPERCASE", 
			"BOOLEANSTRING", "SPHEREDIMENSIONS", "DIMENSION3D", "DIMENSION3DDYN", 
			"DIMENSION2D", "TEXTDIMDIGITS", "TEXTDIMSTRING", "PENPARAMSBOOL", "PENPARAMS", 
			"VARASSVALUES", "DIGITS", "STRING", "MAP", "WHITESPACE", "NEWLINE", "OPERATOR", 
			"SOMERULE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'START'", "'END'", "'MIDDLE'", "'IF('", "')'", "'THEN'", "'ELSE'", 
			"'END IF'", "'SET: '", "':'", "','", "';'", "'CUBE:'", "'GET:'", "'SPHERE:'", 
			"'PLANE:'", "'TEXT:'", "'LINE:'", "'lineWidth:'", "'PEN:'", "'COLOR: fill:'", 
			"'MAP: map:'", null, null, null, null, null, null, null, "'dashed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "BOOLEANSTRING", 
			"SPHEREDIMENSIONS", "DIMENSION3D", "DIMENSION3DDYN", "DIMENSION2D", "TEXTDIMDIGITS", 
			"TEXTDIMSTRING", "PENPARAMSBOOL", "PENPARAMS", "VARASSVALUES", "DIGITS", 
			"STRING", "MAP", "WHITESPACE", "NEWLINE", "OPERATOR", "SOMERULE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u01d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u00e4\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0105\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u010d\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0128\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0135\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0147\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \5 \u0165\n \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u0186\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01a1\n#\3$\6$\u01a4\n$\r$\16$\u01a5\3%\3"+
		"%\3%\6%\u01ab\n%\r%\16%\u01ac\3&\6&\u01b0\n&\r&\16&\u01b1\3\'\6\'\u01b5"+
		"\n\'\r\'\16\'\u01b6\3\'\3\'\3(\5(\u01bc\n(\3(\3(\6(\u01c0\n(\r(\16(\u01c1"+
		"\3)\3)\3)\3)\3)\3)\3)\5)\u01cb\n)\3*\3*\3*\6*\u01d0\n*\r*\16*\u01d1\2"+
		"\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\31\65\32\67\339\34;"+
		"\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)\3\2\b\3\2c|\3\2C\\\4\2/\60\62;\b\2-"+
		"-\60;??C\\aac|\4\2\13\13\"\"\4\2>>@@\2\u01ef\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5[\3\2\2\2\7_\3\2\2\2\tf\3\2\2\2\13j\3"+
		"\2\2\2\rl\3\2\2\2\17q\3\2\2\2\21v\3\2\2\2\23}\3\2\2\2\25\u0083\3\2\2\2"+
		"\27\u0085\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2\2\35\u008f\3\2\2\2\37"+
		"\u0094\3\2\2\2!\u009c\3\2\2\2#\u00a3\3\2\2\2%\u00a9\3\2\2\2\'\u00af\3"+
		"\2\2\2)\u00ba\3\2\2\2+\u00bf\3\2\2\2-\u00cc\3\2\2\2/\u00d6\3\2\2\2\61"+
		"\u00d8\3\2\2\2\63\u00e3\3\2\2\2\65\u0104\3\2\2\2\67\u010c\3\2\2\29\u0127"+
		"\3\2\2\2;\u0134\3\2\2\2=\u0146\3\2\2\2?\u0164\3\2\2\2A\u0166\3\2\2\2C"+
		"\u0185\3\2\2\2E\u01a0\3\2\2\2G\u01a3\3\2\2\2I\u01aa\3\2\2\2K\u01af\3\2"+
		"\2\2M\u01b4\3\2\2\2O\u01bf\3\2\2\2Q\u01ca\3\2\2\2S\u01cf\3\2\2\2UV\7U"+
		"\2\2VW\7V\2\2WX\7C\2\2XY\7T\2\2YZ\7V\2\2Z\4\3\2\2\2[\\\7G\2\2\\]\7P\2"+
		"\2]^\7F\2\2^\6\3\2\2\2_`\7O\2\2`a\7K\2\2ab\7F\2\2bc\7F\2\2cd\7N\2\2de"+
		"\7G\2\2e\b\3\2\2\2fg\7K\2\2gh\7H\2\2hi\7*\2\2i\n\3\2\2\2jk\7+\2\2k\f\3"+
		"\2\2\2lm\7V\2\2mn\7J\2\2no\7G\2\2op\7P\2\2p\16\3\2\2\2qr\7G\2\2rs\7N\2"+
		"\2st\7U\2\2tu\7G\2\2u\20\3\2\2\2vw\7G\2\2wx\7P\2\2xy\7F\2\2yz\7\"\2\2"+
		"z{\7K\2\2{|\7H\2\2|\22\3\2\2\2}~\7U\2\2~\177\7G\2\2\177\u0080\7V\2\2\u0080"+
		"\u0081\7<\2\2\u0081\u0082\7\"\2\2\u0082\24\3\2\2\2\u0083\u0084\7<\2\2"+
		"\u0084\26\3\2\2\2\u0085\u0086\7.\2\2\u0086\30\3\2\2\2\u0087\u0088\7=\2"+
		"\2\u0088\32\3\2\2\2\u0089\u008a\7E\2\2\u008a\u008b\7W\2\2\u008b\u008c"+
		"\7D\2\2\u008c\u008d\7G\2\2\u008d\u008e\7<\2\2\u008e\34\3\2\2\2\u008f\u0090"+
		"\7I\2\2\u0090\u0091\7G\2\2\u0091\u0092\7V\2\2\u0092\u0093\7<\2\2\u0093"+
		"\36\3\2\2\2\u0094\u0095\7U\2\2\u0095\u0096\7R\2\2\u0096\u0097\7J\2\2\u0097"+
		"\u0098\7G\2\2\u0098\u0099\7T\2\2\u0099\u009a\7G\2\2\u009a\u009b\7<\2\2"+
		"\u009b \3\2\2\2\u009c\u009d\7R\2\2\u009d\u009e\7N\2\2\u009e\u009f\7C\2"+
		"\2\u009f\u00a0\7P\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7<\2\2\u00a2\"\3"+
		"\2\2\2\u00a3\u00a4\7V\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\7Z\2\2\u00a6"+
		"\u00a7\7V\2\2\u00a7\u00a8\7<\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7N\2\2\u00aa"+
		"\u00ab\7K\2\2\u00ab\u00ac\7P\2\2\u00ac\u00ad\7G\2\2\u00ad\u00ae\7<\2\2"+
		"\u00ae&\3\2\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2"+
		"\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7Y\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6"+
		"\7f\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7<\2\2\u00b9"+
		"(\3\2\2\2\u00ba\u00bb\7R\2\2\u00bb\u00bc\7G\2\2\u00bc\u00bd\7P\2\2\u00bd"+
		"\u00be\7<\2\2\u00be*\3\2\2\2\u00bf\u00c0\7E\2\2\u00c0\u00c1\7Q\2\2\u00c1"+
		"\u00c2\7N\2\2\u00c2\u00c3\7Q\2\2\u00c3\u00c4\7T\2\2\u00c4\u00c5\7<\2\2"+
		"\u00c5\u00c6\7\"\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9"+
		"\7n\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7<\2\2\u00cb,\3\2\2\2\u00cc\u00cd"+
		"\7O\2\2\u00cd\u00ce\7C\2\2\u00ce\u00cf\7R\2\2\u00cf\u00d0\7<\2\2\u00d0"+
		"\u00d1\7\"\2\2\u00d1\u00d2\7o\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7r\2"+
		"\2\u00d4\u00d5\7<\2\2\u00d5.\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7\60\3\2"+
		"\2\2\u00d8\u00d9\t\3\2\2\u00d9\62\3\2\2\2\u00da\u00db\7V\2\2\u00db\u00dc"+
		"\7t\2\2\u00dc\u00dd\7w\2\2\u00dd\u00e4\7g\2\2\u00de\u00df\7H\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e4\7g\2\2"+
		"\u00e3\u00da\3\2\2\2\u00e3\u00de\3\2\2\2\u00e4\64\3\2\2\2\u00e5\u00e6"+
		"\7t\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00ea\7w\2\2\u00ea\u0105\7u\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed\7k\2\2"+
		"\u00ed\u00ee\7f\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7j\2\2\u00f0\u00f1"+
		"\7U\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7i\2\2\u00f3\u00f4\7o\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7p\2\2\u00f6\u0105\7v\2\2\u00f7\u00f8\7j\2\2"+
		"\u00f8\u00f9\7g\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7i\2\2\u00fb\u00fc"+
		"\7j\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7U\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7i\2\2\u0100\u0101\7o\2\2\u0101\u0102\7g\2\2\u0102\u0103\7p\2\2"+
		"\u0103\u0105\7v\2\2\u0104\u00e5\3\2\2\2\u0104\u00eb\3\2\2\2\u0104\u00f7"+
		"\3\2\2\2\u0105\66\3\2\2\2\u0106\u010d\5;\36\2\u0107\u0108\7f\2\2\u0108"+
		"\u0109\7g\2\2\u0109\u010a\7r\2\2\u010a\u010b\7v\2\2\u010b\u010d\7j\2\2"+
		"\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010d8\3\2\2\2\u010e\u010f\7"+
		"j\2\2\u010f\u0110\7g\2\2\u0110\u0111\7k\2\2\u0111\u0112\7i\2\2\u0112\u0113"+
		"\7j\2\2\u0113\u0114\7v\2\2\u0114\u0115\7F\2\2\u0115\u0116\7{\2\2\u0116"+
		"\u0128\7p\2\2\u0117\u0118\7f\2\2\u0118\u0119\7g\2\2\u0119\u011a\7r\2\2"+
		"\u011a\u011b\7v\2\2\u011b\u011c\7j\2\2\u011c\u011d\7F\2\2\u011d\u011e"+
		"\7{\2\2\u011e\u0128\7p\2\2\u011f\u0120\7y\2\2\u0120\u0121\7k\2\2\u0121"+
		"\u0122\7f\2\2\u0122\u0123\7v\2\2\u0123\u0124\7j\2\2\u0124\u0125\7F\2\2"+
		"\u0125\u0126\7{\2\2\u0126\u0128\7p\2\2\u0127\u010e\3\2\2\2\u0127\u0117"+
		"\3\2\2\2\u0127\u011f\3\2\2\2\u0128:\3\2\2\2\u0129\u012a\7j\2\2\u012a\u012b"+
		"\7g\2\2\u012b\u012c\7k\2\2\u012c\u012d\7i\2\2\u012d\u012e\7j\2\2\u012e"+
		"\u0135\7v\2\2\u012f\u0130\7y\2\2\u0130\u0131\7k\2\2\u0131\u0132\7f\2\2"+
		"\u0132\u0133\7v\2\2\u0133\u0135\7j\2\2\u0134\u0129\3\2\2\2\u0134\u012f"+
		"\3\2\2\2\u0135<\3\2\2\2\u0136\u0137\7z\2\2\u0137\u0138\7T\2\2\u0138\u0139"+
		"\7g\2\2\u0139\u0147\7n\2\2\u013a\u013b\7{\2\2\u013b\u013c\7T\2\2\u013c"+
		"\u013d\7g\2\2\u013d\u0147\7n\2\2\u013e\u013f\7|\2\2\u013f\u0140\7T\2\2"+
		"\u0140\u0141\7g\2\2\u0141\u0147\7n\2\2\u0142\u0143\7u\2\2\u0143\u0144"+
		"\7k\2\2\u0144\u0145\7|\2\2\u0145\u0147\7g\2\2\u0146\u0136\3\2\2\2\u0146"+
		"\u013a\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u0142\3\2\2\2\u0147>\3\2\2\2"+
		"\u0148\u0149\7v\2\2\u0149\u014a\7g\2\2\u014a\u014b\7z\2\2\u014b\u0165"+
		"\7v\2\2\u014c\u014d\7r\2\2\u014d\u014e\7q\2\2\u014e\u014f\7u\2\2\u014f"+
		"\u0150\7P\2\2\u0150\u0151\7c\2\2\u0151\u0152\7o\2\2\u0152\u0153\7g\2\2"+
		"\u0153\u0165\7Z\2\2\u0154\u0155\7r\2\2\u0155\u0156\7q\2\2\u0156\u0157"+
		"\7u\2\2\u0157\u0158\7P\2\2\u0158\u0159\7c\2\2\u0159\u015a\7o\2\2\u015a"+
		"\u015b\7g\2\2\u015b\u0165\7[\2\2\u015c\u015d\7r\2\2\u015d\u015e\7q\2\2"+
		"\u015e\u015f\7u\2\2\u015f\u0160\7P\2\2\u0160\u0161\7c\2\2\u0161\u0162"+
		"\7o\2\2\u0162\u0163\7g\2\2\u0163\u0165\7\\\2\2\u0164\u0148\3\2\2\2\u0164"+
		"\u014c\3\2\2\2\u0164\u0154\3\2\2\2\u0164\u015c\3\2\2\2\u0165@\3\2\2\2"+
		"\u0166\u0167\7f\2\2\u0167\u0168\7c\2\2\u0168\u0169\7u\2\2\u0169\u016a"+
		"\7j\2\2\u016a\u016b\7g\2\2\u016b\u016c\7f\2\2\u016cB\3\2\2\2\u016d\u016e"+
		"\7f\2\2\u016e\u016f\7c\2\2\u016f\u0170\7u\2\2\u0170\u0171\7j\2\2\u0171"+
		"\u0172\7U\2\2\u0172\u0173\7e\2\2\u0173\u0174\7c\2\2\u0174\u0175\7n\2\2"+
		"\u0175\u0186\7g\2\2\u0176\u0177\7i\2\2\u0177\u0178\7c\2\2\u0178\u0179"+
		"\7r\2\2\u0179\u017a\7U\2\2\u017a\u017b\7k\2\2\u017b\u017c\7|\2\2\u017c"+
		"\u0186\7g\2\2\u017d\u017e\7f\2\2\u017e\u017f\7c\2\2\u017f\u0180\7u\2\2"+
		"\u0180\u0181\7j\2\2\u0181\u0182\7U\2\2\u0182\u0183\7k\2\2\u0183\u0184"+
		"\7|\2\2\u0184\u0186\7g\2\2\u0185\u016d\3\2\2\2\u0185\u0176\3\2\2\2\u0185"+
		"\u017d\3\2\2\2\u0186D\3\2\2\2\u0187\u0188\7k\2\2\u0188\u0189\7p\2\2\u0189"+
		"\u018a\7u\2\2\u018a\u018b\7v\2\2\u018b\u018c\7c\2\2\u018c\u018d\7p\2\2"+
		"\u018d\u018e\7e\2\2\u018e\u018f\7g\2\2\u018f\u0190\7C\2\2\u0190\u0191"+
		"\7f\2\2\u0191\u0192\7c\2\2\u0192\u0193\7r\2\2\u0193\u0194\7v\2\2\u0194"+
		"\u0195\7c\2\2\u0195\u0196\7d\2\2\u0196\u0197\7n\2\2\u0197\u01a1\7g\2\2"+
		"\u0198\u0199\7k\2\2\u0199\u019a\7u\2\2\u019a\u019b\7F\2\2\u019b\u019c"+
		"\7{\2\2\u019c\u019d\7p\2\2\u019d\u019e\7x\2\2\u019e\u019f\7c\2\2\u019f"+
		"\u01a1\7n\2\2\u01a0\u0187\3\2\2\2\u01a0\u0198\3\2\2\2\u01a1F\3\2\2\2\u01a2"+
		"\u01a4\t\4\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6H\3\2\2\2\u01a7\u01ab\5/\30\2\u01a8\u01ab"+
		"\5\61\31\2\u01a9\u01ab\7a\2\2\u01aa\u01a7\3\2\2\2\u01aa\u01a8\3\2\2\2"+
		"\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad"+
		"\3\2\2\2\u01adJ\3\2\2\2\u01ae\u01b0\t\5\2\2\u01af\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2L\3\2\2\2"+
		"\u01b3\u01b5\t\6\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\b\'\2\2\u01b9"+
		"N\3\2\2\2\u01ba\u01bc\7\17\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2"+
		"\u01bc\u01bd\3\2\2\2\u01bd\u01c0\7\f\2\2\u01be\u01c0\7\17\2\2\u01bf\u01bb"+
		"\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2P\3\2\2\2\u01c3\u01c4\7>\2\2\u01c4\u01cb\7?\2\2\u01c5"+
		"\u01c6\7?\2\2\u01c6\u01cb\7?\2\2\u01c7\u01c8\7@\2\2\u01c8\u01cb\7?\2\2"+
		"\u01c9\u01cb\t\7\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01c5\3\2\2\2\u01ca\u01c7"+
		"\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cbR\3\2\2\2\u01cc\u01d0\5I%\2\u01cd\u01d0"+
		"\5G$\2\u01ce\u01d0\7/\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2T\3\2\2\2\27\2\u00e3\u0104\u010c\u0127\u0134\u0146\u0164\u0185"+
		"\u01a0\u01a5\u01aa\u01ac\u01b1\u01b6\u01bb\u01bf\u01c1\u01ca\u01cf\u01d1"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}