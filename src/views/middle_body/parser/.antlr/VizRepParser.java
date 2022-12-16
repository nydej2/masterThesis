// Generated from c:\Users\jonas\OneDrive\Dokumente\MSC_Wirtschaftsinformatik\semester_4\master_thesis\masterThesis\src\views\middle_body\parser\VizRep.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VizRepParser extends Parser {
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
	public static final int
		RULE_commandChain = 0, RULE_relation = 1, RULE_relMiddle = 2, RULE_condition = 3, 
		RULE_ifBlock = 4, RULE_elseBlock = 5, RULE_ifCommand = 6, RULE_elseCommand = 7, 
		RULE_command = 8, RULE_shapeCommand = 9, RULE_styleCommand = 10, RULE_relCommandFrom = 11, 
		RULE_relCommandTo = 12, RULE_cube = 13, RULE_relCube = 14, RULE_ifCube = 15, 
		RULE_elseCube = 16, RULE_sphere = 17, RULE_relSphere = 18, RULE_ifSphere = 19, 
		RULE_elseSphere = 20, RULE_plane = 21, RULE_relPane = 22, RULE_ifPlane = 23, 
		RULE_elsePlane = 24, RULE_text = 25, RULE_relText = 26, RULE_ifText = 27, 
		RULE_elseText = 28, RULE_line = 29, RULE_ifLine = 30, RULE_elseLine = 31, 
		RULE_pen = 32, RULE_ifPen = 33, RULE_elsePen = 34, RULE_color = 35, RULE_ifColor = 36, 
		RULE_elseColor = 37, RULE_map = 38, RULE_ifMap = 39, RULE_elseMap = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"commandChain", "relation", "relMiddle", "condition", "ifBlock", "elseBlock", 
			"ifCommand", "elseCommand", "command", "shapeCommand", "styleCommand", 
			"relCommandFrom", "relCommandTo", "cube", "relCube", "ifCube", "elseCube", 
			"sphere", "relSphere", "ifSphere", "elseSphere", "plane", "relPane", 
			"ifPlane", "elsePlane", "text", "relText", "ifText", "elseText", "line", 
			"ifLine", "elseLine", "pen", "ifPen", "elsePen", "color", "ifColor", 
			"elseColor", "map", "ifMap", "elseMap"
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

	@Override
	public String getGrammarFileName() { return "VizRep.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VizRepParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CommandChainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VizRepParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(VizRepParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VizRepParser.NEWLINE, i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public CommandChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandChain; }
	}

	public final CommandChainContext commandChain() throws RecognitionException {
		CommandChainContext _localctx = new CommandChainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commandChain);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(86);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
					case T__12:
					case T__13:
					case T__14:
					case T__17:
					case T__18:
					case T__19:
						{
						setState(82);
						command();
						}
						break;
					case NEWLINE:
						{
						setState(83);
						match(NEWLINE);
						}
						break;
					case T__15:
						{
						setState(84);
						relation();
						}
						break;
					case T__3:
						{
						setState(85);
						condition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<RelCommandFromContext> relCommandFrom() {
			return getRuleContexts(RelCommandFromContext.class);
		}
		public RelCommandFromContext relCommandFrom(int i) {
			return getRuleContext(RelCommandFromContext.class,i);
		}
		public List<RelCommandToContext> relCommandTo() {
			return getRuleContexts(RelCommandToContext.class);
		}
		public RelCommandToContext relCommandTo(int i) {
			return getRuleContext(RelCommandToContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(VizRepParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VizRepParser.NEWLINE, i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_relation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			line();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(93);
				match(NEWLINE);
				}
			}

			setState(96);
			match(T__0);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(97);
				match(NEWLINE);
				}
			}

			setState(100);
			relCommandFrom();
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(101);
				match(NEWLINE);
				}
				break;
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(104);
				relCommandFrom();
				}
			}

			setState(108); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(107);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(112);
			match(T__1);
			setState(114); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(113);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(118);
			relCommandTo();
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(119);
				match(NEWLINE);
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(122);
				relCommandTo();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelMiddleContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<ShapeCommandContext> shapeCommand() {
			return getRuleContexts(ShapeCommandContext.class);
		}
		public ShapeCommandContext shapeCommand(int i) {
			return getRuleContext(ShapeCommandContext.class,i);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(VizRepParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VizRepParser.NEWLINE, i);
		}
		public RelMiddleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relMiddle; }
	}

	public final RelMiddleContext relMiddle() throws RecognitionException {
		RelMiddleContext _localctx = new RelMiddleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_relMiddle);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			line();
			setState(127); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(126);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(129); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(131);
			match(T__0);
			setState(133); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(132);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(137);
			shapeCommand();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(138);
				shapeCommand();
				}
			}

			setState(141);
			match(T__2);
			setState(143); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(142);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(145); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(147);
			text();
			setState(148);
			match(T__1);
			setState(150); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(149);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(154);
			shapeCommand();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(155);
				shapeCommand();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public TerminalNode OPERATOR() { return getToken(VizRepParser.OPERATOR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(VizRepParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VizRepParser.NEWLINE, i);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__3);
			setState(159);
			match(DIGITS);
			setState(160);
			match(OPERATOR);
			setState(161);
			match(DIGITS);
			setState(162);
			match(T__4);
			setState(163);
			match(NEWLINE);
			setState(164);
			match(T__5);
			setState(165);
			match(NEWLINE);
			setState(166);
			ifBlock();
			setState(167);
			match(NEWLINE);
			setState(168);
			match(T__6);
			setState(169);
			elseBlock();
			setState(170);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public List<IfCommandContext> ifCommand() {
			return getRuleContexts(IfCommandContext.class);
		}
		public IfCommandContext ifCommand(int i) {
			return getRuleContext(IfCommandContext.class,i);
		}
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(VizRepParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VizRepParser.NEWLINE, i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(175);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
					case T__12:
					case T__13:
					case T__14:
					case T__17:
					case T__18:
					case T__19:
						{
						setState(172);
						ifCommand();
						}
						break;
					case T__15:
						{
						setState(173);
						relation();
						}
						break;
					case NEWLINE:
						{
						setState(174);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public List<ElseCommandContext> elseCommand() {
			return getRuleContexts(ElseCommandContext.class);
		}
		public ElseCommandContext elseCommand(int i) {
			return getRuleContext(ElseCommandContext.class,i);
		}
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(VizRepParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VizRepParser.NEWLINE, i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__12:
				case T__13:
				case T__14:
				case T__17:
				case T__18:
				case T__19:
					{
					setState(179);
					elseCommand();
					}
					break;
				case T__15:
					{
					setState(180);
					relation();
					}
					break;
				case NEWLINE:
					{
					setState(181);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCommandContext extends ParserRuleContext {
		public IfCubeContext ifCube() {
			return getRuleContext(IfCubeContext.class,0);
		}
		public IfSphereContext ifSphere() {
			return getRuleContext(IfSphereContext.class,0);
		}
		public IfPlaneContext ifPlane() {
			return getRuleContext(IfPlaneContext.class,0);
		}
		public IfTextContext ifText() {
			return getRuleContext(IfTextContext.class,0);
		}
		public IfColorContext ifColor() {
			return getRuleContext(IfColorContext.class,0);
		}
		public IfMapContext ifMap() {
			return getRuleContext(IfMapContext.class,0);
		}
		public IfPenContext ifPen() {
			return getRuleContext(IfPenContext.class,0);
		}
		public IfCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCommand; }
	}

	public final IfCommandContext ifCommand() throws RecognitionException {
		IfCommandContext _localctx = new IfCommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(186);
				ifCube();
				}
				break;
			case T__12:
				{
				setState(187);
				ifSphere();
				}
				break;
			case T__13:
				{
				setState(188);
				ifPlane();
				}
				break;
			case T__14:
				{
				setState(189);
				ifText();
				}
				break;
			case T__18:
				{
				setState(190);
				ifColor();
				}
				break;
			case T__19:
				{
				setState(191);
				ifMap();
				}
				break;
			case T__17:
				{
				setState(192);
				ifPen();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseCommandContext extends ParserRuleContext {
		public ElseCubeContext elseCube() {
			return getRuleContext(ElseCubeContext.class,0);
		}
		public ElseSphereContext elseSphere() {
			return getRuleContext(ElseSphereContext.class,0);
		}
		public ElsePlaneContext elsePlane() {
			return getRuleContext(ElsePlaneContext.class,0);
		}
		public ElseTextContext elseText() {
			return getRuleContext(ElseTextContext.class,0);
		}
		public ElseColorContext elseColor() {
			return getRuleContext(ElseColorContext.class,0);
		}
		public ElseMapContext elseMap() {
			return getRuleContext(ElseMapContext.class,0);
		}
		public ElsePenContext elsePen() {
			return getRuleContext(ElsePenContext.class,0);
		}
		public ElseCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCommand; }
	}

	public final ElseCommandContext elseCommand() throws RecognitionException {
		ElseCommandContext _localctx = new ElseCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(195);
				elseCube();
				}
				break;
			case T__12:
				{
				setState(196);
				elseSphere();
				}
				break;
			case T__13:
				{
				setState(197);
				elsePlane();
				}
				break;
			case T__14:
				{
				setState(198);
				elseText();
				}
				break;
			case T__18:
				{
				setState(199);
				elseColor();
				}
				break;
			case T__19:
				{
				setState(200);
				elseMap();
				}
				break;
			case T__17:
				{
				setState(201);
				elsePen();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public ShapeCommandContext shapeCommand() {
			return getRuleContext(ShapeCommandContext.class,0);
		}
		public StyleCommandContext styleCommand() {
			return getRuleContext(StyleCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_command);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				shapeCommand();
				}
				break;
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				styleCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeCommandContext extends ParserRuleContext {
		public CubeContext cube() {
			return getRuleContext(CubeContext.class,0);
		}
		public SphereContext sphere() {
			return getRuleContext(SphereContext.class,0);
		}
		public PlaneContext plane() {
			return getRuleContext(PlaneContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ShapeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeCommand; }
	}

	public final ShapeCommandContext shapeCommand() throws RecognitionException {
		ShapeCommandContext _localctx = new ShapeCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_shapeCommand);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				cube();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				sphere();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				plane();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				text();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleCommandContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public PenContext pen() {
			return getRuleContext(PenContext.class,0);
		}
		public StyleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleCommand; }
	}

	public final StyleCommandContext styleCommand() throws RecognitionException {
		StyleCommandContext _localctx = new StyleCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_styleCommand);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				color();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				map();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				pen();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelCommandFromContext extends ParserRuleContext {
		public RelCubeContext relCube() {
			return getRuleContext(RelCubeContext.class,0);
		}
		public RelSphereContext relSphere() {
			return getRuleContext(RelSphereContext.class,0);
		}
		public RelPaneContext relPane() {
			return getRuleContext(RelPaneContext.class,0);
		}
		public RelTextContext relText() {
			return getRuleContext(RelTextContext.class,0);
		}
		public RelCommandFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relCommandFrom; }
	}

	public final RelCommandFromContext relCommandFrom() throws RecognitionException {
		RelCommandFromContext _localctx = new RelCommandFromContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relCommandFrom);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				relCube();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				relSphere();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				relPane();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				relText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelCommandToContext extends ParserRuleContext {
		public RelCubeContext relCube() {
			return getRuleContext(RelCubeContext.class,0);
		}
		public RelSphereContext relSphere() {
			return getRuleContext(RelSphereContext.class,0);
		}
		public RelPaneContext relPane() {
			return getRuleContext(RelPaneContext.class,0);
		}
		public RelTextContext relText() {
			return getRuleContext(RelTextContext.class,0);
		}
		public RelCommandToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relCommandTo; }
	}

	public final RelCommandToContext relCommandTo() throws RecognitionException {
		RelCommandToContext _localctx = new RelCommandToContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relCommandTo);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				relCube();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				relSphere();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				relPane();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				relText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CubeContext extends ParserRuleContext {
		public List<TerminalNode> DIMENSION3D() { return getTokens(VizRepParser.DIMENSION3D); }
		public TerminalNode DIMENSION3D(int i) {
			return getToken(VizRepParser.DIMENSION3D, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public CubeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cube; }
	}

	public final CubeContext cube() throws RecognitionException {
		CubeContext _localctx = new CubeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cube);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__8);
			setState(232);
			match(DIMENSION3D);
			setState(233);
			match(T__9);
			setState(234);
			match(DIGITS);
			setState(235);
			match(T__10);
			setState(236);
			match(DIMENSION3D);
			setState(237);
			match(T__9);
			setState(238);
			match(DIGITS);
			setState(239);
			match(T__10);
			setState(240);
			match(DIMENSION3D);
			setState(241);
			match(T__9);
			setState(242);
			match(DIGITS);
			setState(243);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelCubeContext extends ParserRuleContext {
		public List<TerminalNode> DIMENSION3D() { return getTokens(VizRepParser.DIMENSION3D); }
		public TerminalNode DIMENSION3D(int i) {
			return getToken(VizRepParser.DIMENSION3D, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public RelCubeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relCube; }
	}

	public final RelCubeContext relCube() throws RecognitionException {
		RelCubeContext _localctx = new RelCubeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relCube);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__8);
			setState(246);
			match(DIMENSION3D);
			setState(247);
			match(T__9);
			setState(248);
			match(DIGITS);
			setState(249);
			match(T__10);
			setState(250);
			match(DIMENSION3D);
			setState(251);
			match(T__9);
			setState(252);
			match(DIGITS);
			setState(253);
			match(T__10);
			setState(254);
			match(DIMENSION3D);
			setState(255);
			match(T__9);
			setState(256);
			match(DIGITS);
			setState(257);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCubeContext extends ParserRuleContext {
		public List<TerminalNode> DIMENSION3D() { return getTokens(VizRepParser.DIMENSION3D); }
		public TerminalNode DIMENSION3D(int i) {
			return getToken(VizRepParser.DIMENSION3D, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public IfCubeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCube; }
	}

	public final IfCubeContext ifCube() throws RecognitionException {
		IfCubeContext _localctx = new IfCubeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifCube);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__8);
			setState(260);
			match(DIMENSION3D);
			setState(261);
			match(T__9);
			setState(262);
			match(DIGITS);
			setState(263);
			match(T__10);
			setState(264);
			match(DIMENSION3D);
			setState(265);
			match(T__9);
			setState(266);
			match(DIGITS);
			setState(267);
			match(T__10);
			setState(268);
			match(DIMENSION3D);
			setState(269);
			match(T__9);
			setState(270);
			match(DIGITS);
			setState(271);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseCubeContext extends ParserRuleContext {
		public List<TerminalNode> DIMENSION3D() { return getTokens(VizRepParser.DIMENSION3D); }
		public TerminalNode DIMENSION3D(int i) {
			return getToken(VizRepParser.DIMENSION3D, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public ElseCubeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCube; }
	}

	public final ElseCubeContext elseCube() throws RecognitionException {
		ElseCubeContext _localctx = new ElseCubeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseCube);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__8);
			setState(274);
			match(DIMENSION3D);
			setState(275);
			match(T__9);
			setState(276);
			match(DIGITS);
			setState(277);
			match(T__10);
			setState(278);
			match(DIMENSION3D);
			setState(279);
			match(T__9);
			setState(280);
			match(DIGITS);
			setState(281);
			match(T__10);
			setState(282);
			match(DIMENSION3D);
			setState(283);
			match(T__9);
			setState(284);
			match(DIGITS);
			setState(285);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SphereContext extends ParserRuleContext {
		public List<TerminalNode> SPHEREDIMENSIONS() { return getTokens(VizRepParser.SPHEREDIMENSIONS); }
		public TerminalNode SPHEREDIMENSIONS(int i) {
			return getToken(VizRepParser.SPHEREDIMENSIONS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public SphereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sphere; }
	}

	public final SphereContext sphere() throws RecognitionException {
		SphereContext _localctx = new SphereContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sphere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__12);
			setState(288);
			match(SPHEREDIMENSIONS);
			setState(289);
			match(T__9);
			setState(290);
			match(DIGITS);
			setState(291);
			match(T__10);
			setState(292);
			match(SPHEREDIMENSIONS);
			setState(293);
			match(T__9);
			setState(294);
			match(DIGITS);
			setState(295);
			match(T__10);
			setState(296);
			match(SPHEREDIMENSIONS);
			setState(297);
			match(T__9);
			setState(298);
			match(DIGITS);
			setState(299);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelSphereContext extends ParserRuleContext {
		public List<TerminalNode> SPHEREDIMENSIONS() { return getTokens(VizRepParser.SPHEREDIMENSIONS); }
		public TerminalNode SPHEREDIMENSIONS(int i) {
			return getToken(VizRepParser.SPHEREDIMENSIONS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public RelSphereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relSphere; }
	}

	public final RelSphereContext relSphere() throws RecognitionException {
		RelSphereContext _localctx = new RelSphereContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relSphere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__12);
			setState(302);
			match(SPHEREDIMENSIONS);
			setState(303);
			match(T__9);
			setState(304);
			match(DIGITS);
			setState(305);
			match(T__10);
			setState(306);
			match(SPHEREDIMENSIONS);
			setState(307);
			match(T__9);
			setState(308);
			match(DIGITS);
			setState(309);
			match(T__10);
			setState(310);
			match(SPHEREDIMENSIONS);
			setState(311);
			match(T__9);
			setState(312);
			match(DIGITS);
			setState(313);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfSphereContext extends ParserRuleContext {
		public List<TerminalNode> SPHEREDIMENSIONS() { return getTokens(VizRepParser.SPHEREDIMENSIONS); }
		public TerminalNode SPHEREDIMENSIONS(int i) {
			return getToken(VizRepParser.SPHEREDIMENSIONS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public IfSphereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSphere; }
	}

	public final IfSphereContext ifSphere() throws RecognitionException {
		IfSphereContext _localctx = new IfSphereContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifSphere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__12);
			setState(316);
			match(SPHEREDIMENSIONS);
			setState(317);
			match(T__9);
			setState(318);
			match(DIGITS);
			setState(319);
			match(T__10);
			setState(320);
			match(SPHEREDIMENSIONS);
			setState(321);
			match(T__9);
			setState(322);
			match(DIGITS);
			setState(323);
			match(T__10);
			setState(324);
			match(SPHEREDIMENSIONS);
			setState(325);
			match(T__9);
			setState(326);
			match(DIGITS);
			setState(327);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseSphereContext extends ParserRuleContext {
		public List<TerminalNode> SPHEREDIMENSIONS() { return getTokens(VizRepParser.SPHEREDIMENSIONS); }
		public TerminalNode SPHEREDIMENSIONS(int i) {
			return getToken(VizRepParser.SPHEREDIMENSIONS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public ElseSphereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseSphere; }
	}

	public final ElseSphereContext elseSphere() throws RecognitionException {
		ElseSphereContext _localctx = new ElseSphereContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseSphere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__12);
			setState(330);
			match(SPHEREDIMENSIONS);
			setState(331);
			match(T__9);
			setState(332);
			match(DIGITS);
			setState(333);
			match(T__10);
			setState(334);
			match(SPHEREDIMENSIONS);
			setState(335);
			match(T__9);
			setState(336);
			match(DIGITS);
			setState(337);
			match(T__10);
			setState(338);
			match(SPHEREDIMENSIONS);
			setState(339);
			match(T__9);
			setState(340);
			match(DIGITS);
			setState(341);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaneContext extends ParserRuleContext {
		public List<TerminalNode> DIMENSION3D() { return getTokens(VizRepParser.DIMENSION3D); }
		public TerminalNode DIMENSION3D(int i) {
			return getToken(VizRepParser.DIMENSION3D, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public PlaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plane; }
	}

	public final PlaneContext plane() throws RecognitionException {
		PlaneContext _localctx = new PlaneContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_plane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__13);
			setState(344);
			match(DIMENSION3D);
			setState(345);
			match(T__9);
			setState(346);
			match(DIGITS);
			setState(347);
			match(T__10);
			setState(348);
			match(DIMENSION3D);
			setState(349);
			match(T__9);
			setState(350);
			match(DIGITS);
			setState(351);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelPaneContext extends ParserRuleContext {
		public List<TerminalNode> DIMENSION3D() { return getTokens(VizRepParser.DIMENSION3D); }
		public TerminalNode DIMENSION3D(int i) {
			return getToken(VizRepParser.DIMENSION3D, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public RelPaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relPane; }
	}

	public final RelPaneContext relPane() throws RecognitionException {
		RelPaneContext _localctx = new RelPaneContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relPane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__13);
			setState(354);
			match(DIMENSION3D);
			setState(355);
			match(T__9);
			setState(356);
			match(DIGITS);
			setState(357);
			match(T__10);
			setState(358);
			match(DIMENSION3D);
			setState(359);
			match(T__9);
			setState(360);
			match(DIGITS);
			setState(361);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfPlaneContext extends ParserRuleContext {
		public List<TerminalNode> DIMENSION3D() { return getTokens(VizRepParser.DIMENSION3D); }
		public TerminalNode DIMENSION3D(int i) {
			return getToken(VizRepParser.DIMENSION3D, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public IfPlaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifPlane; }
	}

	public final IfPlaneContext ifPlane() throws RecognitionException {
		IfPlaneContext _localctx = new IfPlaneContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifPlane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__13);
			setState(364);
			match(DIMENSION3D);
			setState(365);
			match(T__9);
			setState(366);
			match(DIGITS);
			setState(367);
			match(T__10);
			setState(368);
			match(DIMENSION3D);
			setState(369);
			match(T__9);
			setState(370);
			match(DIGITS);
			setState(371);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsePlaneContext extends ParserRuleContext {
		public List<TerminalNode> DIMENSION3D() { return getTokens(VizRepParser.DIMENSION3D); }
		public TerminalNode DIMENSION3D(int i) {
			return getToken(VizRepParser.DIMENSION3D, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public ElsePlaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePlane; }
	}

	public final ElsePlaneContext elsePlane() throws RecognitionException {
		ElsePlaneContext _localctx = new ElsePlaneContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elsePlane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__13);
			setState(374);
			match(DIMENSION3D);
			setState(375);
			match(T__9);
			setState(376);
			match(DIGITS);
			setState(377);
			match(T__10);
			setState(378);
			match(DIMENSION3D);
			setState(379);
			match(T__9);
			setState(380);
			match(DIGITS);
			setState(381);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> TEXTDIMDIGITS() { return getTokens(VizRepParser.TEXTDIMDIGITS); }
		public TerminalNode TEXTDIMDIGITS(int i) {
			return getToken(VizRepParser.TEXTDIMDIGITS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public List<TerminalNode> TEXTDIMSTRING() { return getTokens(VizRepParser.TEXTDIMSTRING); }
		public TerminalNode TEXTDIMSTRING(int i) {
			return getToken(VizRepParser.TEXTDIMSTRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(VizRepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VizRepParser.STRING, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__14);
			setState(384);
			match(TEXTDIMDIGITS);
			setState(385);
			match(T__9);
			setState(386);
			match(DIGITS);
			setState(387);
			match(T__10);
			setState(388);
			match(TEXTDIMDIGITS);
			setState(389);
			match(T__9);
			setState(390);
			match(DIGITS);
			setState(391);
			match(T__10);
			setState(392);
			match(TEXTDIMDIGITS);
			setState(393);
			match(T__9);
			setState(394);
			match(DIGITS);
			setState(395);
			match(T__10);
			setState(396);
			match(TEXTDIMDIGITS);
			setState(397);
			match(T__9);
			setState(398);
			match(DIGITS);
			setState(399);
			match(T__10);
			setState(400);
			match(TEXTDIMSTRING);
			setState(401);
			match(T__9);
			setState(402);
			match(STRING);
			setState(403);
			match(T__10);
			setState(404);
			match(TEXTDIMSTRING);
			setState(405);
			match(T__9);
			setState(406);
			match(STRING);
			setState(407);
			match(T__10);
			setState(408);
			match(TEXTDIMSTRING);
			setState(409);
			match(T__9);
			setState(410);
			match(STRING);
			setState(411);
			match(T__10);
			setState(412);
			match(TEXTDIMSTRING);
			setState(413);
			match(T__9);
			setState(414);
			match(STRING);
			setState(415);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelTextContext extends ParserRuleContext {
		public List<TerminalNode> TEXTDIMDIGITS() { return getTokens(VizRepParser.TEXTDIMDIGITS); }
		public TerminalNode TEXTDIMDIGITS(int i) {
			return getToken(VizRepParser.TEXTDIMDIGITS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public List<TerminalNode> TEXTDIMSTRING() { return getTokens(VizRepParser.TEXTDIMSTRING); }
		public TerminalNode TEXTDIMSTRING(int i) {
			return getToken(VizRepParser.TEXTDIMSTRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(VizRepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VizRepParser.STRING, i);
		}
		public RelTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relText; }
	}

	public final RelTextContext relText() throws RecognitionException {
		RelTextContext _localctx = new RelTextContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_relText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__14);
			setState(418);
			match(TEXTDIMDIGITS);
			setState(419);
			match(T__9);
			setState(420);
			match(DIGITS);
			setState(421);
			match(T__10);
			setState(422);
			match(TEXTDIMDIGITS);
			setState(423);
			match(T__9);
			setState(424);
			match(DIGITS);
			setState(425);
			match(T__10);
			setState(426);
			match(TEXTDIMDIGITS);
			setState(427);
			match(T__9);
			setState(428);
			match(DIGITS);
			setState(429);
			match(T__10);
			setState(430);
			match(TEXTDIMDIGITS);
			setState(431);
			match(T__9);
			setState(432);
			match(DIGITS);
			setState(433);
			match(T__10);
			setState(434);
			match(TEXTDIMSTRING);
			setState(435);
			match(T__9);
			setState(436);
			match(STRING);
			setState(437);
			match(T__10);
			setState(438);
			match(TEXTDIMSTRING);
			setState(439);
			match(T__9);
			setState(440);
			match(STRING);
			setState(441);
			match(T__10);
			setState(442);
			match(TEXTDIMSTRING);
			setState(443);
			match(T__9);
			setState(444);
			match(STRING);
			setState(445);
			match(T__10);
			setState(446);
			match(TEXTDIMSTRING);
			setState(447);
			match(T__9);
			setState(448);
			match(STRING);
			setState(449);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfTextContext extends ParserRuleContext {
		public List<TerminalNode> TEXTDIMDIGITS() { return getTokens(VizRepParser.TEXTDIMDIGITS); }
		public TerminalNode TEXTDIMDIGITS(int i) {
			return getToken(VizRepParser.TEXTDIMDIGITS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public List<TerminalNode> TEXTDIMSTRING() { return getTokens(VizRepParser.TEXTDIMSTRING); }
		public TerminalNode TEXTDIMSTRING(int i) {
			return getToken(VizRepParser.TEXTDIMSTRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(VizRepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VizRepParser.STRING, i);
		}
		public IfTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifText; }
	}

	public final IfTextContext ifText() throws RecognitionException {
		IfTextContext _localctx = new IfTextContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__14);
			setState(452);
			match(TEXTDIMDIGITS);
			setState(453);
			match(T__9);
			setState(454);
			match(DIGITS);
			setState(455);
			match(T__10);
			setState(456);
			match(TEXTDIMDIGITS);
			setState(457);
			match(T__9);
			setState(458);
			match(DIGITS);
			setState(459);
			match(T__10);
			setState(460);
			match(TEXTDIMDIGITS);
			setState(461);
			match(T__9);
			setState(462);
			match(DIGITS);
			setState(463);
			match(T__10);
			setState(464);
			match(TEXTDIMDIGITS);
			setState(465);
			match(T__9);
			setState(466);
			match(DIGITS);
			setState(467);
			match(T__10);
			setState(468);
			match(TEXTDIMSTRING);
			setState(469);
			match(T__9);
			setState(470);
			match(STRING);
			setState(471);
			match(T__10);
			setState(472);
			match(TEXTDIMSTRING);
			setState(473);
			match(T__9);
			setState(474);
			match(STRING);
			setState(475);
			match(T__10);
			setState(476);
			match(TEXTDIMSTRING);
			setState(477);
			match(T__9);
			setState(478);
			match(STRING);
			setState(479);
			match(T__10);
			setState(480);
			match(TEXTDIMSTRING);
			setState(481);
			match(T__9);
			setState(482);
			match(STRING);
			setState(483);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseTextContext extends ParserRuleContext {
		public List<TerminalNode> TEXTDIMDIGITS() { return getTokens(VizRepParser.TEXTDIMDIGITS); }
		public TerminalNode TEXTDIMDIGITS(int i) {
			return getToken(VizRepParser.TEXTDIMDIGITS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public List<TerminalNode> TEXTDIMSTRING() { return getTokens(VizRepParser.TEXTDIMSTRING); }
		public TerminalNode TEXTDIMSTRING(int i) {
			return getToken(VizRepParser.TEXTDIMSTRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(VizRepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VizRepParser.STRING, i);
		}
		public ElseTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseText; }
	}

	public final ElseTextContext elseText() throws RecognitionException {
		ElseTextContext _localctx = new ElseTextContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elseText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__14);
			setState(486);
			match(TEXTDIMDIGITS);
			setState(487);
			match(T__9);
			setState(488);
			match(DIGITS);
			setState(489);
			match(T__10);
			setState(490);
			match(TEXTDIMDIGITS);
			setState(491);
			match(T__9);
			setState(492);
			match(DIGITS);
			setState(493);
			match(T__10);
			setState(494);
			match(TEXTDIMDIGITS);
			setState(495);
			match(T__9);
			setState(496);
			match(DIGITS);
			setState(497);
			match(T__10);
			setState(498);
			match(TEXTDIMDIGITS);
			setState(499);
			match(T__9);
			setState(500);
			match(DIGITS);
			setState(501);
			match(T__10);
			setState(502);
			match(TEXTDIMSTRING);
			setState(503);
			match(T__9);
			setState(504);
			match(STRING);
			setState(505);
			match(T__10);
			setState(506);
			match(TEXTDIMSTRING);
			setState(507);
			match(T__9);
			setState(508);
			match(STRING);
			setState(509);
			match(T__10);
			setState(510);
			match(TEXTDIMSTRING);
			setState(511);
			match(T__9);
			setState(512);
			match(STRING);
			setState(513);
			match(T__10);
			setState(514);
			match(TEXTDIMSTRING);
			setState(515);
			match(T__9);
			setState(516);
			match(STRING);
			setState(517);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(VizRepParser.DIGITS, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(T__15);
			setState(520);
			match(T__16);
			setState(521);
			match(DIGITS);
			setState(522);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfLineContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(VizRepParser.DIGITS, 0); }
		public IfLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLine; }
	}

	public final IfLineContext ifLine() throws RecognitionException {
		IfLineContext _localctx = new IfLineContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(T__15);
			setState(525);
			match(T__16);
			setState(526);
			match(DIGITS);
			setState(527);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseLineContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(VizRepParser.DIGITS, 0); }
		public ElseLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseLine; }
	}

	public final ElseLineContext elseLine() throws RecognitionException {
		ElseLineContext _localctx = new ElseLineContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elseLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(T__15);
			setState(530);
			match(T__16);
			setState(531);
			match(DIGITS);
			setState(532);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PenContext extends ParserRuleContext {
		public TerminalNode PENPARAMSBOOL() { return getToken(VizRepParser.PENPARAMSBOOL, 0); }
		public TerminalNode STRING() { return getToken(VizRepParser.STRING, 0); }
		public List<TerminalNode> PENPARAMS() { return getTokens(VizRepParser.PENPARAMS); }
		public TerminalNode PENPARAMS(int i) {
			return getToken(VizRepParser.PENPARAMS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public PenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pen; }
	}

	public final PenContext pen() throws RecognitionException {
		PenContext _localctx = new PenContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(T__17);
			setState(535);
			match(PENPARAMSBOOL);
			setState(536);
			match(T__9);
			setState(537);
			match(STRING);
			setState(538);
			match(T__10);
			setState(539);
			match(PENPARAMS);
			setState(540);
			match(T__9);
			setState(541);
			match(DIGITS);
			setState(542);
			match(T__10);
			setState(543);
			match(PENPARAMS);
			setState(544);
			match(T__9);
			setState(545);
			match(DIGITS);
			setState(546);
			match(T__10);
			setState(547);
			match(PENPARAMS);
			setState(548);
			match(T__9);
			setState(549);
			match(DIGITS);
			setState(550);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfPenContext extends ParserRuleContext {
		public TerminalNode PENPARAMSBOOL() { return getToken(VizRepParser.PENPARAMSBOOL, 0); }
		public TerminalNode STRING() { return getToken(VizRepParser.STRING, 0); }
		public List<TerminalNode> PENPARAMS() { return getTokens(VizRepParser.PENPARAMS); }
		public TerminalNode PENPARAMS(int i) {
			return getToken(VizRepParser.PENPARAMS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public IfPenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifPen; }
	}

	public final IfPenContext ifPen() throws RecognitionException {
		IfPenContext _localctx = new IfPenContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifPen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__17);
			setState(553);
			match(PENPARAMSBOOL);
			setState(554);
			match(T__9);
			setState(555);
			match(STRING);
			setState(556);
			match(T__10);
			setState(557);
			match(PENPARAMS);
			setState(558);
			match(T__9);
			setState(559);
			match(DIGITS);
			setState(560);
			match(T__10);
			setState(561);
			match(PENPARAMS);
			setState(562);
			match(T__9);
			setState(563);
			match(DIGITS);
			setState(564);
			match(T__10);
			setState(565);
			match(PENPARAMS);
			setState(566);
			match(T__9);
			setState(567);
			match(DIGITS);
			setState(568);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsePenContext extends ParserRuleContext {
		public TerminalNode PENPARAMSBOOL() { return getToken(VizRepParser.PENPARAMSBOOL, 0); }
		public TerminalNode STRING() { return getToken(VizRepParser.STRING, 0); }
		public List<TerminalNode> PENPARAMS() { return getTokens(VizRepParser.PENPARAMS); }
		public TerminalNode PENPARAMS(int i) {
			return getToken(VizRepParser.PENPARAMS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public ElsePenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePen; }
	}

	public final ElsePenContext elsePen() throws RecognitionException {
		ElsePenContext _localctx = new ElsePenContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elsePen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(T__17);
			setState(571);
			match(PENPARAMSBOOL);
			setState(572);
			match(T__9);
			setState(573);
			match(STRING);
			setState(574);
			match(T__10);
			setState(575);
			match(PENPARAMS);
			setState(576);
			match(T__9);
			setState(577);
			match(DIGITS);
			setState(578);
			match(T__10);
			setState(579);
			match(PENPARAMS);
			setState(580);
			match(T__9);
			setState(581);
			match(DIGITS);
			setState(582);
			match(T__10);
			setState(583);
			match(PENPARAMS);
			setState(584);
			match(T__9);
			setState(585);
			match(DIGITS);
			setState(586);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VizRepParser.STRING, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(T__18);
			setState(589);
			match(STRING);
			setState(590);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VizRepParser.STRING, 0); }
		public IfColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifColor; }
	}

	public final IfColorContext ifColor() throws RecognitionException {
		IfColorContext _localctx = new IfColorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ifColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(T__18);
			setState(593);
			match(STRING);
			setState(594);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VizRepParser.STRING, 0); }
		public ElseColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseColor; }
	}

	public final ElseColorContext elseColor() throws RecognitionException {
		ElseColorContext _localctx = new ElseColorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elseColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(T__18);
			setState(597);
			match(STRING);
			setState(598);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VizRepParser.STRING, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(T__19);
			setState(601);
			match(STRING);
			setState(602);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfMapContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VizRepParser.STRING, 0); }
		public IfMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifMap; }
	}

	public final IfMapContext ifMap() throws RecognitionException {
		IfMapContext _localctx = new IfMapContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ifMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(T__19);
			setState(605);
			match(STRING);
			setState(606);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseMapContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VizRepParser.STRING, 0); }
		public ElseMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseMap; }
	}

	public final ElseMapContext elseMap() throws RecognitionException {
		ElseMapContext _localctx = new ElseMapContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_elseMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(T__19);
			setState(609);
			match(STRING);
			setState(610);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0267\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\6\2Y\n\2\r\2\16\2Z\3\2\3\2\3\3\3\3\5\3a\n\3\3\3\3\3\5\3e\n\3"+
		"\3\3\3\3\5\3i\n\3\3\3\5\3l\n\3\3\3\6\3o\n\3\r\3\16\3p\3\3\3\3\6\3u\n\3"+
		"\r\3\16\3v\3\3\3\3\5\3{\n\3\3\3\5\3~\n\3\3\4\3\4\6\4\u0082\n\4\r\4\16"+
		"\4\u0083\3\4\3\4\6\4\u0088\n\4\r\4\16\4\u0089\3\4\3\4\5\4\u008e\n\4\3"+
		"\4\3\4\6\4\u0092\n\4\r\4\16\4\u0093\3\4\3\4\3\4\6\4\u0099\n\4\r\4\16\4"+
		"\u009a\3\4\3\4\5\4\u009f\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6\u00b2\n\6\r\6\16\6\u00b3\3\7\3\7\3\7\6"+
		"\7\u00b9\n\7\r\7\16\7\u00ba\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c4\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cd\n\t\3\n\3\n\5\n\u00d1\n\n\3\13"+
		"\3\13\3\13\3\13\5\13\u00d7\n\13\3\f\3\f\3\f\5\f\u00dc\n\f\3\r\3\r\3\r"+
		"\3\r\5\r\u00e2\n\r\3\16\3\16\3\16\3\16\5\16\u00e8\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\bpv\u0083"+
		"\u0089\u0093\u009a\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPR\2\3\3\3!!\2\u026d\2X\3\2\2\2\4^\3\2\2\2\6\177"+
		"\3\2\2\2\b\u00a0\3\2\2\2\n\u00b1\3\2\2\2\f\u00b8\3\2\2\2\16\u00c3\3\2"+
		"\2\2\20\u00cc\3\2\2\2\22\u00d0\3\2\2\2\24\u00d6\3\2\2\2\26\u00db\3\2\2"+
		"\2\30\u00e1\3\2\2\2\32\u00e7\3\2\2\2\34\u00e9\3\2\2\2\36\u00f7\3\2\2\2"+
		" \u0105\3\2\2\2\"\u0113\3\2\2\2$\u0121\3\2\2\2&\u012f\3\2\2\2(\u013d\3"+
		"\2\2\2*\u014b\3\2\2\2,\u0159\3\2\2\2.\u0163\3\2\2\2\60\u016d\3\2\2\2\62"+
		"\u0177\3\2\2\2\64\u0181\3\2\2\2\66\u01a3\3\2\2\28\u01c5\3\2\2\2:\u01e7"+
		"\3\2\2\2<\u0209\3\2\2\2>\u020e\3\2\2\2@\u0213\3\2\2\2B\u0218\3\2\2\2D"+
		"\u022a\3\2\2\2F\u023c\3\2\2\2H\u024e\3\2\2\2J\u0252\3\2\2\2L\u0256\3\2"+
		"\2\2N\u025a\3\2\2\2P\u025e\3\2\2\2R\u0262\3\2\2\2TY\5\22\n\2UY\7!\2\2"+
		"VY\5\4\3\2WY\5\b\5\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2"+
		"ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\t\2\2\2]\3\3\2\2\2^`\5<\37\2_a\7!\2"+
		"\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\7\3\2\2ce\7!\2\2dc\3\2\2\2de\3\2\2"+
		"\2ef\3\2\2\2fh\5\30\r\2gi\7!\2\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2jl\5\30"+
		"\r\2kj\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\7!\2\2nm\3\2\2\2op\3\2\2\2pq\3\2"+
		"\2\2pn\3\2\2\2qr\3\2\2\2rt\7\4\2\2su\7!\2\2ts\3\2\2\2uv\3\2\2\2vw\3\2"+
		"\2\2vt\3\2\2\2wx\3\2\2\2xz\5\32\16\2y{\7!\2\2zy\3\2\2\2z{\3\2\2\2{}\3"+
		"\2\2\2|~\5\32\16\2}|\3\2\2\2}~\3\2\2\2~\5\3\2\2\2\177\u0081\5<\37\2\u0080"+
		"\u0082\7!\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\7\3\2\2\u0086"+
		"\u0088\7!\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\5\24\13\2\u008c"+
		"\u008e\5\24\13\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0091\7\5\2\2\u0090\u0092\7!\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\5\64\33\2\u0096\u0098\7\4\2\2\u0097\u0099\7!\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\5\24\13\2\u009d\u009f\5\24\13\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\7\3\2\2\2\u00a0\u00a1\7\6\2\2"+
		"\u00a1\u00a2\7\37\2\2\u00a2\u00a3\7#\2\2\u00a3\u00a4\7\37\2\2\u00a4\u00a5"+
		"\7\7\2\2\u00a5\u00a6\7!\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\7!\2\2\u00a8"+
		"\u00a9\5\n\6\2\u00a9\u00aa\7!\2\2\u00aa\u00ab\7\t\2\2\u00ab\u00ac\5\f"+
		"\7\2\u00ac\u00ad\7\n\2\2\u00ad\t\3\2\2\2\u00ae\u00b2\5\16\b\2\u00af\u00b2"+
		"\5\4\3\2\u00b0\u00b2\7!\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\13\3\2\2\2\u00b5\u00b9\5\20\t\2\u00b6\u00b9\5\4\3\2\u00b7\u00b9"+
		"\7!\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\r\3\2\2\2"+
		"\u00bc\u00c4\5 \21\2\u00bd\u00c4\5(\25\2\u00be\u00c4\5\60\31\2\u00bf\u00c4"+
		"\58\35\2\u00c0\u00c4\5J&\2\u00c1\u00c4\5P)\2\u00c2\u00c4\5D#\2\u00c3\u00bc"+
		"\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\17\3\2\2"+
		"\2\u00c5\u00cd\5\"\22\2\u00c6\u00cd\5*\26\2\u00c7\u00cd\5\62\32\2\u00c8"+
		"\u00cd\5:\36\2\u00c9\u00cd\5L\'\2\u00ca\u00cd\5R*\2\u00cb\u00cd\5F$\2"+
		"\u00cc\u00c5\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8"+
		"\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\21\3\2\2\2\u00ce\u00d1\5\24\13\2\u00cf\u00d1\5\26\f\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00cf\3\2\2\2\u00d1\23\3\2\2\2\u00d2\u00d7\5\34\17\2\u00d3"+
		"\u00d7\5$\23\2\u00d4\u00d7\5,\27\2\u00d5\u00d7\5\64\33\2\u00d6\u00d2\3"+
		"\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\25\3\2\2\2\u00d8\u00dc\5H%\2\u00d9\u00dc\5N(\2\u00da\u00dc\5B\"\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\27\3\2\2"+
		"\2\u00dd\u00e2\5\36\20\2\u00de\u00e2\5&\24\2\u00df\u00e2\5.\30\2\u00e0"+
		"\u00e2\5\66\34\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\31\3\2\2\2\u00e3\u00e8\5\36\20\2\u00e4"+
		"\u00e8\5&\24\2\u00e5\u00e8\5.\30\2\u00e6\u00e8\5\66\34\2\u00e7\u00e3\3"+
		"\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\33\3\2\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb\7\30\2\2\u00eb\u00ec\7\f"+
		"\2\2\u00ec\u00ed\7\37\2\2\u00ed\u00ee\7\r\2\2\u00ee\u00ef\7\30\2\2\u00ef"+
		"\u00f0\7\f\2\2\u00f0\u00f1\7\37\2\2\u00f1\u00f2\7\r\2\2\u00f2\u00f3\7"+
		"\30\2\2\u00f3\u00f4\7\f\2\2\u00f4\u00f5\7\37\2\2\u00f5\u00f6\7\16\2\2"+
		"\u00f6\35\3\2\2\2\u00f7\u00f8\7\13\2\2\u00f8\u00f9\7\30\2\2\u00f9\u00fa"+
		"\7\f\2\2\u00fa\u00fb\7\37\2\2\u00fb\u00fc\7\r\2\2\u00fc\u00fd\7\30\2\2"+
		"\u00fd\u00fe\7\f\2\2\u00fe\u00ff\7\37\2\2\u00ff\u0100\7\r\2\2\u0100\u0101"+
		"\7\30\2\2\u0101\u0102\7\f\2\2\u0102\u0103\7\37\2\2\u0103\u0104\7\16\2"+
		"\2\u0104\37\3\2\2\2\u0105\u0106\7\13\2\2\u0106\u0107\7\30\2\2\u0107\u0108"+
		"\7\f\2\2\u0108\u0109\7\37\2\2\u0109\u010a\7\r\2\2\u010a\u010b\7\30\2\2"+
		"\u010b\u010c\7\f\2\2\u010c\u010d\7\37\2\2\u010d\u010e\7\r\2\2\u010e\u010f"+
		"\7\30\2\2\u010f\u0110\7\f\2\2\u0110\u0111\7\37\2\2\u0111\u0112\7\16\2"+
		"\2\u0112!\3\2\2\2\u0113\u0114\7\13\2\2\u0114\u0115\7\30\2\2\u0115\u0116"+
		"\7\f\2\2\u0116\u0117\7\37\2\2\u0117\u0118\7\r\2\2\u0118\u0119\7\30\2\2"+
		"\u0119\u011a\7\f\2\2\u011a\u011b\7\37\2\2\u011b\u011c\7\r\2\2\u011c\u011d"+
		"\7\30\2\2\u011d\u011e\7\f\2\2\u011e\u011f\7\37\2\2\u011f\u0120\7\16\2"+
		"\2\u0120#\3\2\2\2\u0121\u0122\7\17\2\2\u0122\u0123\7\27\2\2\u0123\u0124"+
		"\7\f\2\2\u0124\u0125\7\37\2\2\u0125\u0126\7\r\2\2\u0126\u0127\7\27\2\2"+
		"\u0127\u0128\7\f\2\2\u0128\u0129\7\37\2\2\u0129\u012a\7\r\2\2\u012a\u012b"+
		"\7\27\2\2\u012b\u012c\7\f\2\2\u012c\u012d\7\37\2\2\u012d\u012e\7\16\2"+
		"\2\u012e%\3\2\2\2\u012f\u0130\7\17\2\2\u0130\u0131\7\27\2\2\u0131\u0132"+
		"\7\f\2\2\u0132\u0133\7\37\2\2\u0133\u0134\7\r\2\2\u0134\u0135\7\27\2\2"+
		"\u0135\u0136\7\f\2\2\u0136\u0137\7\37\2\2\u0137\u0138\7\r\2\2\u0138\u0139"+
		"\7\27\2\2\u0139\u013a\7\f\2\2\u013a\u013b\7\37\2\2\u013b\u013c\7\16\2"+
		"\2\u013c\'\3\2\2\2\u013d\u013e\7\17\2\2\u013e\u013f\7\27\2\2\u013f\u0140"+
		"\7\f\2\2\u0140\u0141\7\37\2\2\u0141\u0142\7\r\2\2\u0142\u0143\7\27\2\2"+
		"\u0143\u0144\7\f\2\2\u0144\u0145\7\37\2\2\u0145\u0146\7\r\2\2\u0146\u0147"+
		"\7\27\2\2\u0147\u0148\7\f\2\2\u0148\u0149\7\37\2\2\u0149\u014a\7\16\2"+
		"\2\u014a)\3\2\2\2\u014b\u014c\7\17\2\2\u014c\u014d\7\27\2\2\u014d\u014e"+
		"\7\f\2\2\u014e\u014f\7\37\2\2\u014f\u0150\7\r\2\2\u0150\u0151\7\27\2\2"+
		"\u0151\u0152\7\f\2\2\u0152\u0153\7\37\2\2\u0153\u0154\7\r\2\2\u0154\u0155"+
		"\7\27\2\2\u0155\u0156\7\f\2\2\u0156\u0157\7\37\2\2\u0157\u0158\7\16\2"+
		"\2\u0158+\3\2\2\2\u0159\u015a\7\20\2\2\u015a\u015b\7\30\2\2\u015b\u015c"+
		"\7\f\2\2\u015c\u015d\7\37\2\2\u015d\u015e\7\r\2\2\u015e\u015f\7\30\2\2"+
		"\u015f\u0160\7\f\2\2\u0160\u0161\7\37\2\2\u0161\u0162\7\16\2\2\u0162-"+
		"\3\2\2\2\u0163\u0164\7\20\2\2\u0164\u0165\7\30\2\2\u0165\u0166\7\f\2\2"+
		"\u0166\u0167\7\37\2\2\u0167\u0168\7\r\2\2\u0168\u0169\7\30\2\2\u0169\u016a"+
		"\7\f\2\2\u016a\u016b\7\37\2\2\u016b\u016c\7\16\2\2\u016c/\3\2\2\2\u016d"+
		"\u016e\7\20\2\2\u016e\u016f\7\30\2\2\u016f\u0170\7\f\2\2\u0170\u0171\7"+
		"\37\2\2\u0171\u0172\7\r\2\2\u0172\u0173\7\30\2\2\u0173\u0174\7\f\2\2\u0174"+
		"\u0175\7\37\2\2\u0175\u0176\7\16\2\2\u0176\61\3\2\2\2\u0177\u0178\7\20"+
		"\2\2\u0178\u0179\7\30\2\2\u0179\u017a\7\f\2\2\u017a\u017b\7\37\2\2\u017b"+
		"\u017c\7\r\2\2\u017c\u017d\7\30\2\2\u017d\u017e\7\f\2\2\u017e\u017f\7"+
		"\37\2\2\u017f\u0180\7\16\2\2\u0180\63\3\2\2\2\u0181\u0182\7\21\2\2\u0182"+
		"\u0183\7\32\2\2\u0183\u0184\7\f\2\2\u0184\u0185\7\37\2\2\u0185\u0186\7"+
		"\r\2\2\u0186\u0187\7\32\2\2\u0187\u0188\7\f\2\2\u0188\u0189\7\37\2\2\u0189"+
		"\u018a\7\r\2\2\u018a\u018b\7\32\2\2\u018b\u018c\7\f\2\2\u018c\u018d\7"+
		"\37\2\2\u018d\u018e\7\r\2\2\u018e\u018f\7\32\2\2\u018f\u0190\7\f\2\2\u0190"+
		"\u0191\7\37\2\2\u0191\u0192\7\r\2\2\u0192\u0193\7\33\2\2\u0193\u0194\7"+
		"\f\2\2\u0194\u0195\7\36\2\2\u0195\u0196\7\r\2\2\u0196\u0197\7\33\2\2\u0197"+
		"\u0198\7\f\2\2\u0198\u0199\7\36\2\2\u0199\u019a\7\r\2\2\u019a\u019b\7"+
		"\33\2\2\u019b\u019c\7\f\2\2\u019c\u019d\7\36\2\2\u019d\u019e\7\r\2\2\u019e"+
		"\u019f\7\33\2\2\u019f\u01a0\7\f\2\2\u01a0\u01a1\7\36\2\2\u01a1\u01a2\7"+
		"\16\2\2\u01a2\65\3\2\2\2\u01a3\u01a4\7\21\2\2\u01a4\u01a5\7\32\2\2\u01a5"+
		"\u01a6\7\f\2\2\u01a6\u01a7\7\37\2\2\u01a7\u01a8\7\r\2\2\u01a8\u01a9\7"+
		"\32\2\2\u01a9\u01aa\7\f\2\2\u01aa\u01ab\7\37\2\2\u01ab\u01ac\7\r\2\2\u01ac"+
		"\u01ad\7\32\2\2\u01ad\u01ae\7\f\2\2\u01ae\u01af\7\37\2\2\u01af\u01b0\7"+
		"\r\2\2\u01b0\u01b1\7\32\2\2\u01b1\u01b2\7\f\2\2\u01b2\u01b3\7\37\2\2\u01b3"+
		"\u01b4\7\r\2\2\u01b4\u01b5\7\33\2\2\u01b5\u01b6\7\f\2\2\u01b6\u01b7\7"+
		"\36\2\2\u01b7\u01b8\7\r\2\2\u01b8\u01b9\7\33\2\2\u01b9\u01ba\7\f\2\2\u01ba"+
		"\u01bb\7\36\2\2\u01bb\u01bc\7\r\2\2\u01bc\u01bd\7\33\2\2\u01bd\u01be\7"+
		"\f\2\2\u01be\u01bf\7\36\2\2\u01bf\u01c0\7\r\2\2\u01c0\u01c1\7\33\2\2\u01c1"+
		"\u01c2\7\f\2\2\u01c2\u01c3\7\36\2\2\u01c3\u01c4\7\16\2\2\u01c4\67\3\2"+
		"\2\2\u01c5\u01c6\7\21\2\2\u01c6\u01c7\7\32\2\2\u01c7\u01c8\7\f\2\2\u01c8"+
		"\u01c9\7\37\2\2\u01c9\u01ca\7\r\2\2\u01ca\u01cb\7\32\2\2\u01cb\u01cc\7"+
		"\f\2\2\u01cc\u01cd\7\37\2\2\u01cd\u01ce\7\r\2\2\u01ce\u01cf\7\32\2\2\u01cf"+
		"\u01d0\7\f\2\2\u01d0\u01d1\7\37\2\2\u01d1\u01d2\7\r\2\2\u01d2\u01d3\7"+
		"\32\2\2\u01d3\u01d4\7\f\2\2\u01d4\u01d5\7\37\2\2\u01d5\u01d6\7\r\2\2\u01d6"+
		"\u01d7\7\33\2\2\u01d7\u01d8\7\f\2\2\u01d8\u01d9\7\36\2\2\u01d9\u01da\7"+
		"\r\2\2\u01da\u01db\7\33\2\2\u01db\u01dc\7\f\2\2\u01dc\u01dd\7\36\2\2\u01dd"+
		"\u01de\7\r\2\2\u01de\u01df\7\33\2\2\u01df\u01e0\7\f\2\2\u01e0\u01e1\7"+
		"\36\2\2\u01e1\u01e2\7\r\2\2\u01e2\u01e3\7\33\2\2\u01e3\u01e4\7\f\2\2\u01e4"+
		"\u01e5\7\36\2\2\u01e5\u01e6\7\16\2\2\u01e69\3\2\2\2\u01e7\u01e8\7\21\2"+
		"\2\u01e8\u01e9\7\32\2\2\u01e9\u01ea\7\f\2\2\u01ea\u01eb\7\37\2\2\u01eb"+
		"\u01ec\7\r\2\2\u01ec\u01ed\7\32\2\2\u01ed\u01ee\7\f\2\2\u01ee\u01ef\7"+
		"\37\2\2\u01ef\u01f0\7\r\2\2\u01f0\u01f1\7\32\2\2\u01f1\u01f2\7\f\2\2\u01f2"+
		"\u01f3\7\37\2\2\u01f3\u01f4\7\r\2\2\u01f4\u01f5\7\32\2\2\u01f5\u01f6\7"+
		"\f\2\2\u01f6\u01f7\7\37\2\2\u01f7\u01f8\7\r\2\2\u01f8\u01f9\7\33\2\2\u01f9"+
		"\u01fa\7\f\2\2\u01fa\u01fb\7\36\2\2\u01fb\u01fc\7\r\2\2\u01fc\u01fd\7"+
		"\33\2\2\u01fd\u01fe\7\f\2\2\u01fe\u01ff\7\36\2\2\u01ff\u0200\7\r\2\2\u0200"+
		"\u0201\7\33\2\2\u0201\u0202\7\f\2\2\u0202\u0203\7\36\2\2\u0203\u0204\7"+
		"\r\2\2\u0204\u0205\7\33\2\2\u0205\u0206\7\f\2\2\u0206\u0207\7\36\2\2\u0207"+
		"\u0208\7\16\2\2\u0208;\3\2\2\2\u0209\u020a\7\22\2\2\u020a\u020b\7\23\2"+
		"\2\u020b\u020c\7\37\2\2\u020c\u020d\7\16\2\2\u020d=\3\2\2\2\u020e\u020f"+
		"\7\22\2\2\u020f\u0210\7\23\2\2\u0210\u0211\7\37\2\2\u0211\u0212\7\16\2"+
		"\2\u0212?\3\2\2\2\u0213\u0214\7\22\2\2\u0214\u0215\7\23\2\2\u0215\u0216"+
		"\7\37\2\2\u0216\u0217\7\16\2\2\u0217A\3\2\2\2\u0218\u0219\7\24\2\2\u0219"+
		"\u021a\7\34\2\2\u021a\u021b\7\f\2\2\u021b\u021c\7\36\2\2\u021c\u021d\7"+
		"\r\2\2\u021d\u021e\7\35\2\2\u021e\u021f\7\f\2\2\u021f\u0220\7\37\2\2\u0220"+
		"\u0221\7\r\2\2\u0221\u0222\7\35\2\2\u0222\u0223\7\f\2\2\u0223\u0224\7"+
		"\37\2\2\u0224\u0225\7\r\2\2\u0225\u0226\7\35\2\2\u0226\u0227\7\f\2\2\u0227"+
		"\u0228\7\37\2\2\u0228\u0229\7\16\2\2\u0229C\3\2\2\2\u022a\u022b\7\24\2"+
		"\2\u022b\u022c\7\34\2\2\u022c\u022d\7\f\2\2\u022d\u022e\7\36\2\2\u022e"+
		"\u022f\7\r\2\2\u022f\u0230\7\35\2\2\u0230\u0231\7\f\2\2\u0231\u0232\7"+
		"\37\2\2\u0232\u0233\7\r\2\2\u0233\u0234\7\35\2\2\u0234\u0235\7\f\2\2\u0235"+
		"\u0236\7\37\2\2\u0236\u0237\7\r\2\2\u0237\u0238\7\35\2\2\u0238\u0239\7"+
		"\f\2\2\u0239\u023a\7\37\2\2\u023a\u023b\7\16\2\2\u023bE\3\2\2\2\u023c"+
		"\u023d\7\24\2\2\u023d\u023e\7\34\2\2\u023e\u023f\7\f\2\2\u023f\u0240\7"+
		"\36\2\2\u0240\u0241\7\r\2\2\u0241\u0242\7\35\2\2\u0242\u0243\7\f\2\2\u0243"+
		"\u0244\7\37\2\2\u0244\u0245\7\r\2\2\u0245\u0246\7\35\2\2\u0246\u0247\7"+
		"\f\2\2\u0247\u0248\7\37\2\2\u0248\u0249\7\r\2\2\u0249\u024a\7\35\2\2\u024a"+
		"\u024b\7\f\2\2\u024b\u024c\7\37\2\2\u024c\u024d\7\16\2\2\u024dG\3\2\2"+
		"\2\u024e\u024f\7\25\2\2\u024f\u0250\7\36\2\2\u0250\u0251\7\16\2\2\u0251"+
		"I\3\2\2\2\u0252\u0253\7\25\2\2\u0253\u0254\7\36\2\2\u0254\u0255\7\16\2"+
		"\2\u0255K\3\2\2\2\u0256\u0257\7\25\2\2\u0257\u0258\7\36\2\2\u0258\u0259"+
		"\7\16\2\2\u0259M\3\2\2\2\u025a\u025b\7\26\2\2\u025b\u025c\7\36\2\2\u025c"+
		"\u025d\7\16\2\2\u025dO\3\2\2\2\u025e\u025f\7\26\2\2\u025f\u0260\7\36\2"+
		"\2\u0260\u0261\7\16\2\2\u0261Q\3\2\2\2\u0262\u0263\7\26\2\2\u0263\u0264"+
		"\7\36\2\2\u0264\u0265\7\16\2\2\u0265S\3\2\2\2\35XZ`dhkpvz}\u0083\u0089"+
		"\u008d\u0093\u009a\u009e\u00b1\u00b3\u00b8\u00ba\u00c3\u00cc\u00d0\u00d6"+
		"\u00db\u00e1\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}