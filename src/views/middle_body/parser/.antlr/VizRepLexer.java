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
		T__17=18, T__18=19, T__19=20, SPHEREDIMENSIONS=21, DIMENSION3D=22, DIMENSION2D=23, 
		TEXTDIMDIGITS=24, TEXTDIMSTRING=25, PENPARAMSBOOL=26, PENPARAMS=27, STRING=28, 
		DIGITS=29, WHITESPACE=30, NEWLINE=31, BOOLEANSTR=32, OPERATOR=33;
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
			"T__17", "T__18", "T__19", "LOWERCASE", "UPPERCASE", "SPHEREDIMENSIONS", 
			"DIMENSION3D", "DIMENSION2D", "TEXTDIMDIGITS", "TEXTDIMSTRING", "PENPARAMSBOOL", 
			"PENPARAMS", "STRING", "DIGITS", "WHITESPACE", "NEWLINE", "BOOLEANSTR", 
			"OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'START'", "'END'", "'MIDDLE'", "'IF('", "')'", "'THEN'", "'ELSE'", 
			"'END IF'", "'CUBE:'", "':'", "','", "';'", "'SPHERE:'", "'PLANE:'", 
			"'TEXT:'", "'LINE:'", "'linewidth:'", "'PEN:'", "'COLOR: fill:'", "'MAP: map:'", 
			null, null, null, null, null, "'dashed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "SPHEREDIMENSIONS", 
			"DIMENSION3D", "DIMENSION2D", "TEXTDIMDIGITS", "TEXTDIMSTRING", "PENPARAMSBOOL", 
			"PENPARAMS", "STRING", "DIGITS", "WHITESPACE", "NEWLINE", "BOOLEANSTR", 
			"OPERATOR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0179\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e3\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00eb\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u00f8\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u010a\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0128\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0149\n\36\3\37\3\37\6\37\u014d\n\37\r\37\16\37\u014e"+
		"\3 \6 \u0152\n \r \16 \u0153\3!\6!\u0157\n!\r!\16!\u0158\3!\3!\3\"\5\""+
		"\u015e\n\"\3\"\3\"\6\"\u0162\n\"\r\"\16\"\u0163\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\5#\u016f\n#\3$\3$\3$\3$\3$\3$\3$\5$\u0178\n$\2\2%\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\2-\2/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#\3"+
		"\2\7\3\2c|\3\2C\\\3\2\62;\4\2\13\13\"\"\4\2>>@@\2\u018d\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5O\3\2\2\2\7S\3\2\2\2\t"+
		"Z\3\2\2\2\13^\3\2\2\2\r`\3\2\2\2\17e\3\2\2\2\21j\3\2\2\2\23q\3\2\2\2\25"+
		"w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\u0085\3\2\2\2\37\u008c"+
		"\3\2\2\2!\u0092\3\2\2\2#\u0098\3\2\2\2%\u00a3\3\2\2\2\'\u00a8\3\2\2\2"+
		")\u00b5\3\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2/\u00e2\3\2\2\2\61\u00ea"+
		"\3\2\2\2\63\u00f7\3\2\2\2\65\u0109\3\2\2\2\67\u0127\3\2\2\29\u0129\3\2"+
		"\2\2;\u0148\3\2\2\2=\u014c\3\2\2\2?\u0151\3\2\2\2A\u0156\3\2\2\2C\u0161"+
		"\3\2\2\2E\u016e\3\2\2\2G\u0177\3\2\2\2IJ\7U\2\2JK\7V\2\2KL\7C\2\2LM\7"+
		"T\2\2MN\7V\2\2N\4\3\2\2\2OP\7G\2\2PQ\7P\2\2QR\7F\2\2R\6\3\2\2\2ST\7O\2"+
		"\2TU\7K\2\2UV\7F\2\2VW\7F\2\2WX\7N\2\2XY\7G\2\2Y\b\3\2\2\2Z[\7K\2\2[\\"+
		"\7H\2\2\\]\7*\2\2]\n\3\2\2\2^_\7+\2\2_\f\3\2\2\2`a\7V\2\2ab\7J\2\2bc\7"+
		"G\2\2cd\7P\2\2d\16\3\2\2\2ef\7G\2\2fg\7N\2\2gh\7U\2\2hi\7G\2\2i\20\3\2"+
		"\2\2jk\7G\2\2kl\7P\2\2lm\7F\2\2mn\7\"\2\2no\7K\2\2op\7H\2\2p\22\3\2\2"+
		"\2qr\7E\2\2rs\7W\2\2st\7D\2\2tu\7G\2\2uv\7<\2\2v\24\3\2\2\2wx\7<\2\2x"+
		"\26\3\2\2\2yz\7.\2\2z\30\3\2\2\2{|\7=\2\2|\32\3\2\2\2}~\7U\2\2~\177\7"+
		"R\2\2\177\u0080\7J\2\2\u0080\u0081\7G\2\2\u0081\u0082\7T\2\2\u0082\u0083"+
		"\7G\2\2\u0083\u0084\7<\2\2\u0084\34\3\2\2\2\u0085\u0086\7R\2\2\u0086\u0087"+
		"\7N\2\2\u0087\u0088\7C\2\2\u0088\u0089\7P\2\2\u0089\u008a\7G\2\2\u008a"+
		"\u008b\7<\2\2\u008b\36\3\2\2\2\u008c\u008d\7V\2\2\u008d\u008e\7G\2\2\u008e"+
		"\u008f\7Z\2\2\u008f\u0090\7V\2\2\u0090\u0091\7<\2\2\u0091 \3\2\2\2\u0092"+
		"\u0093\7N\2\2\u0093\u0094\7K\2\2\u0094\u0095\7P\2\2\u0095\u0096\7G\2\2"+
		"\u0096\u0097\7<\2\2\u0097\"\3\2\2\2\u0098\u0099\7n\2\2\u0099\u009a\7k"+
		"\2\2\u009a\u009b\7p\2\2\u009b\u009c\7g\2\2\u009c\u009d\7y\2\2\u009d\u009e"+
		"\7k\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7j\2\2\u00a1"+
		"\u00a2\7<\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7R\2\2\u00a4\u00a5\7G\2\2\u00a5"+
		"\u00a6\7P\2\2\u00a6\u00a7\7<\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7E\2\2\u00a9"+
		"\u00aa\7Q\2\2\u00aa\u00ab\7N\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7T\2\2"+
		"\u00ad\u00ae\7<\2\2\u00ae\u00af\7\"\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1"+
		"\7k\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7<\2\2\u00b4"+
		"(\3\2\2\2\u00b5\u00b6\7O\2\2\u00b6\u00b7\7C\2\2\u00b7\u00b8\7R\2\2\u00b8"+
		"\u00b9\7<\2\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7c\2"+
		"\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7<\2\2\u00be*\3\2\2\2\u00bf\u00c0\t"+
		"\2\2\2\u00c0,\3\2\2\2\u00c1\u00c2\t\3\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7"+
		"t\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7f\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8"+
		"\7w\2\2\u00c8\u00e3\7u\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7k\2\2\u00cb"+
		"\u00cc\7f\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7U\2\2"+
		"\u00cf\u00d0\7g\2\2\u00d0\u00d1\7i\2\2\u00d1\u00d2\7o\2\2\u00d2\u00d3"+
		"\7g\2\2\u00d3\u00d4\7p\2\2\u00d4\u00e3\7v\2\2\u00d5\u00d6\7j\2\2\u00d6"+
		"\u00d7\7g\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7i\2\2\u00d9\u00da\7j\2\2"+
		"\u00da\u00db\7v\2\2\u00db\u00dc\7U\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de"+
		"\7i\2\2\u00de\u00df\7o\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7p\2\2\u00e1"+
		"\u00e3\7v\2\2\u00e2\u00c3\3\2\2\2\u00e2\u00c9\3\2\2\2\u00e2\u00d5\3\2"+
		"\2\2\u00e3\60\3\2\2\2\u00e4\u00eb\5\63\32\2\u00e5\u00e6\7f\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7v\2\2\u00e9\u00eb\7j\2\2\u00ea"+
		"\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb\62\3\2\2\2\u00ec\u00ed\7j\2\2"+
		"\u00ed\u00ee\7g\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7i\2\2\u00f0\u00f1"+
		"\7j\2\2\u00f1\u00f8\7v\2\2\u00f2\u00f3\7y\2\2\u00f3\u00f4\7k\2\2\u00f4"+
		"\u00f5\7f\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f8\7j\2\2\u00f7\u00ec\3\2\2"+
		"\2\u00f7\u00f2\3\2\2\2\u00f8\64\3\2\2\2\u00f9\u00fa\7z\2\2\u00fa\u00fb"+
		"\7T\2\2\u00fb\u00fc\7g\2\2\u00fc\u010a\7n\2\2\u00fd\u00fe\7{\2\2\u00fe"+
		"\u00ff\7T\2\2\u00ff\u0100\7g\2\2\u0100\u010a\7n\2\2\u0101\u0102\7|\2\2"+
		"\u0102\u0103\7T\2\2\u0103\u0104\7g\2\2\u0104\u010a\7n\2\2\u0105\u0106"+
		"\7u\2\2\u0106\u0107\7k\2\2\u0107\u0108\7|\2\2\u0108\u010a\7g\2\2\u0109"+
		"\u00f9\3\2\2\2\u0109\u00fd\3\2\2\2\u0109\u0101\3\2\2\2\u0109\u0105\3\2"+
		"\2\2\u010a\66\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d\7g\2\2\u010d\u010e"+
		"\7z\2\2\u010e\u0128\7v\2\2\u010f\u0110\7r\2\2\u0110\u0111\7q\2\2\u0111"+
		"\u0112\7u\2\2\u0112\u0113\7P\2\2\u0113\u0114\7c\2\2\u0114\u0115\7o\2\2"+
		"\u0115\u0116\7g\2\2\u0116\u0128\7Z\2\2\u0117\u0118\7r\2\2\u0118\u0119"+
		"\7q\2\2\u0119\u011a\7u\2\2\u011a\u011b\7P\2\2\u011b\u011c\7c\2\2\u011c"+
		"\u011d\7o\2\2\u011d\u011e\7g\2\2\u011e\u0128\7[\2\2\u011f\u0120\7r\2\2"+
		"\u0120\u0121\7q\2\2\u0121\u0122\7u\2\2\u0122\u0123\7P\2\2\u0123\u0124"+
		"\7c\2\2\u0124\u0125\7o\2\2\u0125\u0126\7g\2\2\u0126\u0128\7\\\2\2\u0127"+
		"\u010b\3\2\2\2\u0127\u010f\3\2\2\2\u0127\u0117\3\2\2\2\u0127\u011f\3\2"+
		"\2\2\u01288\3\2\2\2\u0129\u012a\7f\2\2\u012a\u012b\7c\2\2\u012b\u012c"+
		"\7u\2\2\u012c\u012d\7j\2\2\u012d\u012e\7g\2\2\u012e\u012f\7f\2\2\u012f"+
		":\3\2\2\2\u0130\u0131\7f\2\2\u0131\u0132\7c\2\2\u0132\u0133\7u\2\2\u0133"+
		"\u0134\7j\2\2\u0134\u0135\7U\2\2\u0135\u0136\7e\2\2\u0136\u0137\7c\2\2"+
		"\u0137\u0138\7n\2\2\u0138\u0149\7g\2\2\u0139\u013a\7i\2\2\u013a\u013b"+
		"\7c\2\2\u013b\u013c\7r\2\2\u013c\u013d\7U\2\2\u013d\u013e\7k\2\2\u013e"+
		"\u013f\7|\2\2\u013f\u0149\7g\2\2\u0140\u0141\7f\2\2\u0141\u0142\7c\2\2"+
		"\u0142\u0143\7u\2\2\u0143\u0144\7j\2\2\u0144\u0145\7U\2\2\u0145\u0146"+
		"\7k\2\2\u0146\u0147\7|\2\2\u0147\u0149\7g\2\2\u0148\u0130\3\2\2\2\u0148"+
		"\u0139\3\2\2\2\u0148\u0140\3\2\2\2\u0149<\3\2\2\2\u014a\u014d\5+\26\2"+
		"\u014b\u014d\5-\27\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f>\3\2\2\2\u0150"+
		"\u0152\t\4\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154@\3\2\2\2\u0155\u0157\t\5\2\2\u0156\u0155"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\b!\2\2\u015bB\3\2\2\2\u015c\u015e\7\17\2\2"+
		"\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162"+
		"\7\f\2\2\u0160\u0162\7\17\2\2\u0161\u015d\3\2\2\2\u0161\u0160\3\2\2\2"+
		"\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164D\3"+
		"\2\2\2\u0165\u0166\7v\2\2\u0166\u0167\7t\2\2\u0167\u0168\7w\2\2\u0168"+
		"\u016f\7g\2\2\u0169\u016a\7h\2\2\u016a\u016b\7c\2\2\u016b\u016c\7n\2\2"+
		"\u016c\u016d\7u\2\2\u016d\u016f\7g\2\2\u016e\u0165\3\2\2\2\u016e\u0169"+
		"\3\2\2\2\u016fF\3\2\2\2\u0170\u0171\7>\2\2\u0171\u0178\7?\2\2\u0172\u0173"+
		"\7?\2\2\u0173\u0178\7?\2\2\u0174\u0175\7@\2\2\u0175\u0178\7?\2\2\u0176"+
		"\u0178\t\6\2\2\u0177\u0170\3\2\2\2\u0177\u0172\3\2\2\2\u0177\u0174\3\2"+
		"\2\2\u0177\u0176\3\2\2\2\u0178H\3\2\2\2\22\2\u00e2\u00ea\u00f7\u0109\u0127"+
		"\u0148\u014c\u014e\u0153\u0158\u015d\u0161\u0163\u016e\u0177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}