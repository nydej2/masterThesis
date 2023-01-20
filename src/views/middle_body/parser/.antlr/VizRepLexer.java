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
		T__17=18, T__18=19, T__19=20, BOOLEANSTRING=21, SPHEREPARAMS=22, DIMENSION3D=23, 
		DIMENSION2D=24, TEXTPARAMDIGITS=25, TEXTPARAMSTRING=26, PENPARAMSBOOL=27, 
		PENPARAMS=28, VARASSPARAMS=29, DIGITS=30, STRING=31, MAPLEXER=32, WHITESPACE=33, 
		NEWLINE=34, OPERATOR=35, DYNVALSTRING=36, DYNINPUT=37;
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
			"T__17", "T__18", "T__19", "LOWERCASE", "UPPERCASE", "BOOLEANSTRING", 
			"SPHEREPARAMS", "DIMENSION3D", "DIMENSION2D", "TEXTPARAMDIGITS", "TEXTPARAMSTRING", 
			"PENPARAMSBOOL", "PENPARAMS", "VARASSPARAMS", "DIGITS", "STRING", "MAPLEXER", 
			"WHITESPACE", "NEWLINE", "OPERATOR", "DYNVALSTRING", "DYNINPUT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'START'", "'END'", "'IF('", "')'", "'THEN'", "'ELSE'", "'END IF'", 
			"'SET: '", "':'", "','", "';'", "'CUBE:'", "'SPHERE:'", "'PLANE:'", "'TEXT:'", 
			"'LINE:'", "'lineWidth:'", "'COLOR: fill:'", "'PEN:'", "'MAP: map:'", 
			null, null, null, null, null, null, "'dashed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "BOOLEANSTRING", 
			"SPHEREPARAMS", "DIMENSION3D", "DIMENSION2D", "TEXTPARAMDIGITS", "TEXTPARAMSTRING", 
			"PENPARAMSBOOL", "PENPARAMS", "VARASSPARAMS", "DIGITS", "STRING", "MAPLEXER", 
			"WHITESPACE", "NEWLINE", "OPERATOR", "DYNVALSTRING", "DYNINPUT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u01ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00d4\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f5\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u00fd\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u010a\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u011c\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u013a\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u015b\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0176\n \3!\6!\u0179"+
		"\n!\r!\16!\u017a\3\"\3\"\3\"\6\"\u0180\n\"\r\"\16\"\u0181\3#\6#\u0185"+
		"\n#\r#\16#\u0186\3$\6$\u018a\n$\r$\16$\u018b\3$\3$\3%\5%\u0191\n%\3%\3"+
		"%\6%\u0195\n%\r%\16%\u0196\3&\3&\3&\3&\3&\3&\3&\5&\u01a0\n&\3\'\3\'\3"+
		"\'\6\'\u01a5\n\'\r\'\16\'\u01a6\3(\3(\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\2-\2/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&"+
		"O\'\3\2\b\3\2c|\3\2C\\\4\2/\60\62;\b\2--\60;??C\\aac|\4\2\13\13\"\"\4"+
		"\2>>@@\2\u01c6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5W\3\2\2\2\7[\3\2\2"+
		"\2\t_\3\2\2\2\13a\3\2\2\2\rf\3\2\2\2\17k\3\2\2\2\21r\3\2\2\2\23x\3\2\2"+
		"\2\25z\3\2\2\2\27|\3\2\2\2\31~\3\2\2\2\33\u0084\3\2\2\2\35\u008c\3\2\2"+
		"\2\37\u0093\3\2\2\2!\u0099\3\2\2\2#\u009f\3\2\2\2%\u00aa\3\2\2\2\'\u00b7"+
		"\3\2\2\2)\u00bc\3\2\2\2+\u00c6\3\2\2\2-\u00c8\3\2\2\2/\u00d3\3\2\2\2\61"+
		"\u00f4\3\2\2\2\63\u00fc\3\2\2\2\65\u0109\3\2\2\2\67\u011b\3\2\2\29\u0139"+
		"\3\2\2\2;\u013b\3\2\2\2=\u015a\3\2\2\2?\u0175\3\2\2\2A\u0178\3\2\2\2C"+
		"\u017f\3\2\2\2E\u0184\3\2\2\2G\u0189\3\2\2\2I\u0194\3\2\2\2K\u019f\3\2"+
		"\2\2M\u01a4\3\2\2\2O\u01a8\3\2\2\2QR\7U\2\2RS\7V\2\2ST\7C\2\2TU\7T\2\2"+
		"UV\7V\2\2V\4\3\2\2\2WX\7G\2\2XY\7P\2\2YZ\7F\2\2Z\6\3\2\2\2[\\\7K\2\2\\"+
		"]\7H\2\2]^\7*\2\2^\b\3\2\2\2_`\7+\2\2`\n\3\2\2\2ab\7V\2\2bc\7J\2\2cd\7"+
		"G\2\2de\7P\2\2e\f\3\2\2\2fg\7G\2\2gh\7N\2\2hi\7U\2\2ij\7G\2\2j\16\3\2"+
		"\2\2kl\7G\2\2lm\7P\2\2mn\7F\2\2no\7\"\2\2op\7K\2\2pq\7H\2\2q\20\3\2\2"+
		"\2rs\7U\2\2st\7G\2\2tu\7V\2\2uv\7<\2\2vw\7\"\2\2w\22\3\2\2\2xy\7<\2\2"+
		"y\24\3\2\2\2z{\7.\2\2{\26\3\2\2\2|}\7=\2\2}\30\3\2\2\2~\177\7E\2\2\177"+
		"\u0080\7W\2\2\u0080\u0081\7D\2\2\u0081\u0082\7G\2\2\u0082\u0083\7<\2\2"+
		"\u0083\32\3\2\2\2\u0084\u0085\7U\2\2\u0085\u0086\7R\2\2\u0086\u0087\7"+
		"J\2\2\u0087\u0088\7G\2\2\u0088\u0089\7T\2\2\u0089\u008a\7G\2\2\u008a\u008b"+
		"\7<\2\2\u008b\34\3\2\2\2\u008c\u008d\7R\2\2\u008d\u008e\7N\2\2\u008e\u008f"+
		"\7C\2\2\u008f\u0090\7P\2\2\u0090\u0091\7G\2\2\u0091\u0092\7<\2\2\u0092"+
		"\36\3\2\2\2\u0093\u0094\7V\2\2\u0094\u0095\7G\2\2\u0095\u0096\7Z\2\2\u0096"+
		"\u0097\7V\2\2\u0097\u0098\7<\2\2\u0098 \3\2\2\2\u0099\u009a\7N\2\2\u009a"+
		"\u009b\7K\2\2\u009b\u009c\7P\2\2\u009c\u009d\7G\2\2\u009d\u009e\7<\2\2"+
		"\u009e\"\3\2\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p"+
		"\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7Y\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7f\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7<\2\2\u00a9"+
		"$\3\2\2\2\u00aa\u00ab\7E\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7N\2\2\u00ad"+
		"\u00ae\7Q\2\2\u00ae\u00af\7T\2\2\u00af\u00b0\7<\2\2\u00b0\u00b1\7\"\2"+
		"\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5"+
		"\7n\2\2\u00b5\u00b6\7<\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7R\2\2\u00b8\u00b9"+
		"\7G\2\2\u00b9\u00ba\7P\2\2\u00ba\u00bb\7<\2\2\u00bb(\3\2\2\2\u00bc\u00bd"+
		"\7O\2\2\u00bd\u00be\7C\2\2\u00be\u00bf\7R\2\2\u00bf\u00c0\7<\2\2\u00c0"+
		"\u00c1\7\"\2\2\u00c1\u00c2\7o\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7r\2"+
		"\2\u00c4\u00c5\7<\2\2\u00c5*\3\2\2\2\u00c6\u00c7\t\2\2\2\u00c7,\3\2\2"+
		"\2\u00c8\u00c9\t\3\2\2\u00c9.\3\2\2\2\u00ca\u00cb\7V\2\2\u00cb\u00cc\7"+
		"t\2\2\u00cc\u00cd\7w\2\2\u00cd\u00d4\7g\2\2\u00ce\u00cf\7H\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d4\7g\2\2\u00d3"+
		"\u00ca\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7t\2\2"+
		"\u00d6\u00d7\7c\2\2\u00d7\u00d8\7f\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da"+
		"\7w\2\2\u00da\u00f5\7u\2\2\u00db\u00dc\7y\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7f\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7j\2\2\u00e0\u00e1\7U\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\u00e3\7i\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5\u00e6\7p\2\2\u00e6\u00f5\7v\2\2\u00e7\u00e8\7j\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7i\2\2\u00eb\u00ec\7j\2\2"+
		"\u00ec\u00ed\7v\2\2\u00ed\u00ee\7U\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0"+
		"\7i\2\2\u00f0\u00f1\7o\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7p\2\2\u00f3"+
		"\u00f5\7v\2\2\u00f4\u00d5\3\2\2\2\u00f4\u00db\3\2\2\2\u00f4\u00e7\3\2"+
		"\2\2\u00f5\62\3\2\2\2\u00f6\u00fd\5\65\33\2\u00f7\u00f8\7f\2\2\u00f8\u00f9"+
		"\7g\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fd\7j\2\2\u00fc"+
		"\u00f6\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fd\64\3\2\2\2\u00fe\u00ff\7j\2\2"+
		"\u00ff\u0100\7g\2\2\u0100\u0101\7k\2\2\u0101\u0102\7i\2\2\u0102\u0103"+
		"\7j\2\2\u0103\u010a\7v\2\2\u0104\u0105\7y\2\2\u0105\u0106\7k\2\2\u0106"+
		"\u0107\7f\2\2\u0107\u0108\7v\2\2\u0108\u010a\7j\2\2\u0109\u00fe\3\2\2"+
		"\2\u0109\u0104\3\2\2\2\u010a\66\3\2\2\2\u010b\u010c\7z\2\2\u010c\u010d"+
		"\7T\2\2\u010d\u010e\7g\2\2\u010e\u011c\7n\2\2\u010f\u0110\7{\2\2\u0110"+
		"\u0111\7T\2\2\u0111\u0112\7g\2\2\u0112\u011c\7n\2\2\u0113\u0114\7|\2\2"+
		"\u0114\u0115\7T\2\2\u0115\u0116\7g\2\2\u0116\u011c\7n\2\2\u0117\u0118"+
		"\7u\2\2\u0118\u0119\7k\2\2\u0119\u011a\7|\2\2\u011a\u011c\7g\2\2\u011b"+
		"\u010b\3\2\2\2\u011b\u010f\3\2\2\2\u011b\u0113\3\2\2\2\u011b\u0117\3\2"+
		"\2\2\u011c8\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7z\2\2\u0120\u013a\7v\2\2\u0121\u0122\7r\2\2\u0122\u0123\7q\2\2\u0123"+
		"\u0124\7u\2\2\u0124\u0125\7P\2\2\u0125\u0126\7c\2\2\u0126\u0127\7o\2\2"+
		"\u0127\u0128\7g\2\2\u0128\u013a\7Z\2\2\u0129\u012a\7r\2\2\u012a\u012b"+
		"\7q\2\2\u012b\u012c\7u\2\2\u012c\u012d\7P\2\2\u012d\u012e\7c\2\2\u012e"+
		"\u012f\7o\2\2\u012f\u0130\7g\2\2\u0130\u013a\7[\2\2\u0131\u0132\7r\2\2"+
		"\u0132\u0133\7q\2\2\u0133\u0134\7u\2\2\u0134\u0135\7P\2\2\u0135\u0136"+
		"\7c\2\2\u0136\u0137\7o\2\2\u0137\u0138\7g\2\2\u0138\u013a\7\\\2\2\u0139"+
		"\u011d\3\2\2\2\u0139\u0121\3\2\2\2\u0139\u0129\3\2\2\2\u0139\u0131\3\2"+
		"\2\2\u013a:\3\2\2\2\u013b\u013c\7f\2\2\u013c\u013d\7c\2\2\u013d\u013e"+
		"\7u\2\2\u013e\u013f\7j\2\2\u013f\u0140\7g\2\2\u0140\u0141\7f\2\2\u0141"+
		"<\3\2\2\2\u0142\u0143\7f\2\2\u0143\u0144\7c\2\2\u0144\u0145\7u\2\2\u0145"+
		"\u0146\7j\2\2\u0146\u0147\7U\2\2\u0147\u0148\7e\2\2\u0148\u0149\7c\2\2"+
		"\u0149\u014a\7n\2\2\u014a\u015b\7g\2\2\u014b\u014c\7i\2\2\u014c\u014d"+
		"\7c\2\2\u014d\u014e\7r\2\2\u014e\u014f\7U\2\2\u014f\u0150\7k\2\2\u0150"+
		"\u0151\7|\2\2\u0151\u015b\7g\2\2\u0152\u0153\7f\2\2\u0153\u0154\7c\2\2"+
		"\u0154\u0155\7u\2\2\u0155\u0156\7j\2\2\u0156\u0157\7U\2\2\u0157\u0158"+
		"\7k\2\2\u0158\u0159\7|\2\2\u0159\u015b\7g\2\2\u015a\u0142\3\2\2\2\u015a"+
		"\u014b\3\2\2\2\u015a\u0152\3\2\2\2\u015b>\3\2\2\2\u015c\u015d\7k\2\2\u015d"+
		"\u015e\7p\2\2\u015e\u015f\7u\2\2\u015f\u0160\7v\2\2\u0160\u0161\7c\2\2"+
		"\u0161\u0162\7p\2\2\u0162\u0163\7e\2\2\u0163\u0164\7g\2\2\u0164\u0165"+
		"\7C\2\2\u0165\u0166\7f\2\2\u0166\u0167\7c\2\2\u0167\u0168\7r\2\2\u0168"+
		"\u0169\7v\2\2\u0169\u016a\7c\2\2\u016a\u016b\7d\2\2\u016b\u016c\7n\2\2"+
		"\u016c\u0176\7g\2\2\u016d\u016e\7k\2\2\u016e\u016f\7u\2\2\u016f\u0170"+
		"\7F\2\2\u0170\u0171\7{\2\2\u0171\u0172\7p\2\2\u0172\u0173\7x\2\2\u0173"+
		"\u0174\7c\2\2\u0174\u0176\7n\2\2\u0175\u015c\3\2\2\2\u0175\u016d\3\2\2"+
		"\2\u0176@\3\2\2\2\u0177\u0179\t\4\2\2\u0178\u0177\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017bB\3\2\2\2\u017c"+
		"\u0180\5+\26\2\u017d\u0180\5-\27\2\u017e\u0180\7a\2\2\u017f\u017c\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182D\3\2\2\2\u0183\u0185\t\5\2\2"+
		"\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187F\3\2\2\2\u0188\u018a\t\6\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018e\b$\2\2\u018eH\3\2\2\2\u018f\u0191\7\17\2\2\u0190\u018f"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0195\7\f\2\2\u0193"+
		"\u0195\7\17\2\2\u0194\u0190\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3"+
		"\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197J\3\2\2\2\u0198\u0199"+
		"\7>\2\2\u0199\u01a0\7?\2\2\u019a\u019b\7?\2\2\u019b\u01a0\7?\2\2\u019c"+
		"\u019d\7@\2\2\u019d\u01a0\7?\2\2\u019e\u01a0\t\7\2\2\u019f\u0198\3\2\2"+
		"\2\u019f\u019a\3\2\2\2\u019f\u019c\3\2\2\2\u019f\u019e\3\2\2\2\u01a0L"+
		"\3\2\2\2\u01a1\u01a5\5C\"\2\u01a2\u01a5\5A!\2\u01a3\u01a5\7/\2\2\u01a4"+
		"\u01a1\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7N\3\2\2\2\u01a8\u01a9"+
		"\7*\2\2\u01a9\u01aa\5C\"\2\u01aa\u01ab\7+\2\2\u01abP\3\2\2\2\26\2\u00d3"+
		"\u00f4\u00fc\u0109\u011b\u0139\u015a\u0175\u017a\u017f\u0181\u0186\u018b"+
		"\u0190\u0194\u0196\u019f\u01a4\u01a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}