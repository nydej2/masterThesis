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
		T__17=18, T__18=19, T__19=20, BOOLEANSTRING=21, SPHEREPARAMS=22, DIMENSION3D=23, 
		DIMENSION2D=24, TEXTPARAMDIGITS=25, TEXTPARAMSTRING=26, PENPARAMSBOOL=27, 
		PENPARAMS=28, VARASSPARAMS=29, DIGITS=30, STRING=31, MAPLEXER=32, WHITESPACE=33, 
		NEWLINE=34, OPERATOR=35, DYNVALSTRING=36, DYNINPUT=37;
	public static final int
		RULE_commandChain = 0, RULE_command = 1, RULE_relation = 2, RULE_relCommandFrom = 3, 
		RULE_relCommandTo = 4, RULE_condition = 5, RULE_ifBlock = 6, RULE_elseBlock = 7, 
		RULE_ifCommand = 8, RULE_elseCommand = 9, RULE_setVariable = 10, RULE_shapeCommand = 11, 
		RULE_styleCommand = 12, RULE_cube = 13, RULE_relCube = 14, RULE_ifCube = 15, 
		RULE_elseCube = 16, RULE_sphere = 17, RULE_relSphere = 18, RULE_ifSphere = 19, 
		RULE_elseSphere = 20, RULE_plane = 21, RULE_relPane = 22, RULE_ifPlane = 23, 
		RULE_elsePlane = 24, RULE_text = 25, RULE_relText = 26, RULE_ifText = 27, 
		RULE_elseText = 28, RULE_line = 29, RULE_ifLine = 30, RULE_elseLine = 31, 
		RULE_color = 32, RULE_ifColor = 33, RULE_elseColor = 34, RULE_pen = 35, 
		RULE_ifPen = 36, RULE_elsePen = 37, RULE_map = 38, RULE_ifMap = 39, RULE_elseMap = 40, 
		RULE_dimInput = 41, RULE_sphereDimInput = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"commandChain", "command", "relation", "relCommandFrom", "relCommandTo", 
			"condition", "ifBlock", "elseBlock", "ifCommand", "elseCommand", "setVariable", 
			"shapeCommand", "styleCommand", "cube", "relCube", "ifCube", "elseCube", 
			"sphere", "relSphere", "ifSphere", "elseSphere", "plane", "relPane", 
			"ifPlane", "elsePlane", "text", "relText", "ifText", "elseText", "line", 
			"ifLine", "elseLine", "color", "ifColor", "elseColor", "pen", "ifPen", 
			"elsePen", "map", "ifMap", "elseMap", "dimInput", "sphereDimInput"
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
		public List<SetVariableContext> setVariable() {
			return getRuleContexts(SetVariableContext.class);
		}
		public SetVariableContext setVariable(int i) {
			return getRuleContext(SetVariableContext.class,i);
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
			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(91);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__17:
					case T__18:
					case T__19:
						{
						setState(86);
						command();
						}
						break;
					case T__15:
						{
						setState(87);
						relation();
						}
						break;
					case T__2:
						{
						setState(88);
						condition();
						}
						break;
					case T__7:
						{
						setState(89);
						setVariable();
						}
						break;
					case NEWLINE:
						{
						setState(90);
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
				setState(93); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(95);
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

	public static class CommandContext extends ParserRuleContext {
		public ShapeCommandContext shapeCommand() {
			return getRuleContext(ShapeCommandContext.class,0);
		}
		public StyleCommandContext styleCommand() {
			return getRuleContext(StyleCommandContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				shapeCommand();
				}
				break;
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				styleCommand();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
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

	public static class RelationContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public RelCommandFromContext relCommandFrom() {
			return getRuleContext(RelCommandFromContext.class,0);
		}
		public RelCommandToContext relCommandTo() {
			return getRuleContext(RelCommandToContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(VizRepParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VizRepParser.NEWLINE, i);
		}
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_relation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			line();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(103);
				match(NEWLINE);
				}
			}

			setState(106);
			match(T__0);
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(107);
				match(NEWLINE);
				}
				break;
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(110);
				color();
				}
			}

			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(113);
				match(NEWLINE);
				}
			}

			setState(116);
			relCommandFrom();
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(117);
				match(NEWLINE);
				}
				break;
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(120);
				text();
				}
			}

			setState(124); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(123);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(128);
			match(T__1);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(129);
				match(NEWLINE);
				}
				break;
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(132);
				color();
				}
			}

			setState(136); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(135);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(138); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(140);
			relCommandTo();
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(141);
				match(NEWLINE);
				}
				break;
			}
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(144);
				text();
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
		enterRule(_localctx, 6, RULE_relCommandFrom);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				relCube();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				relSphere();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				relPane();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
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
		enterRule(_localctx, 8, RULE_relCommandTo);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				relCube();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				relSphere();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				relPane();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
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
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__2);
			setState(160);
			match(DIGITS);
			setState(161);
			match(OPERATOR);
			setState(162);
			match(DIGITS);
			setState(163);
			match(T__3);
			setState(164);
			match(NEWLINE);
			setState(165);
			match(T__4);
			setState(166);
			match(NEWLINE);
			setState(167);
			ifBlock();
			setState(168);
			match(NEWLINE);
			setState(169);
			match(T__5);
			setState(170);
			elseBlock();
			setState(171);
			match(T__6);
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
		enterRule(_localctx, 12, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(176);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__17:
					case T__18:
					case T__19:
						{
						setState(173);
						ifCommand();
						}
						break;
					case T__15:
						{
						setState(174);
						relation();
						}
						break;
					case NEWLINE:
						{
						setState(175);
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
				setState(178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 14, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__17:
				case T__18:
				case T__19:
					{
					setState(180);
					elseCommand();
					}
					break;
				case T__15:
					{
					setState(181);
					relation();
					}
					break;
				case NEWLINE:
					{
					setState(182);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << NEWLINE))) != 0) );
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
		enterRule(_localctx, 16, RULE_ifCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(187);
				ifCube();
				}
				break;
			case T__12:
				{
				setState(188);
				ifSphere();
				}
				break;
			case T__13:
				{
				setState(189);
				ifPlane();
				}
				break;
			case T__14:
				{
				setState(190);
				ifText();
				}
				break;
			case T__17:
				{
				setState(191);
				ifColor();
				}
				break;
			case T__19:
				{
				setState(192);
				ifMap();
				}
				break;
			case T__18:
				{
				setState(193);
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
		enterRule(_localctx, 18, RULE_elseCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(196);
				elseCube();
				}
				break;
			case T__12:
				{
				setState(197);
				elseSphere();
				}
				break;
			case T__13:
				{
				setState(198);
				elsePlane();
				}
				break;
			case T__14:
				{
				setState(199);
				elseText();
				}
				break;
			case T__17:
				{
				setState(200);
				elseColor();
				}
				break;
			case T__19:
				{
				setState(201);
				elseMap();
				}
				break;
			case T__18:
				{
				setState(202);
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

	public static class SetVariableContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(VizRepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VizRepParser.STRING, i);
		}
		public List<TerminalNode> VARASSPARAMS() { return getTokens(VizRepParser.VARASSPARAMS); }
		public TerminalNode VARASSPARAMS(int i) {
			return getToken(VizRepParser.VARASSPARAMS, i);
		}
		public List<TerminalNode> BOOLEANSTRING() { return getTokens(VizRepParser.BOOLEANSTRING); }
		public TerminalNode BOOLEANSTRING(int i) {
			return getToken(VizRepParser.BOOLEANSTRING, i);
		}
		public TerminalNode DYNVALSTRING() { return getToken(VizRepParser.DYNVALSTRING, 0); }
		public TerminalNode DIGITS() { return getToken(VizRepParser.DIGITS, 0); }
		public SetVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVariable; }
	}

	public final SetVariableContext setVariable() throws RecognitionException {
		SetVariableContext _localctx = new SetVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_setVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__7);
			setState(206);
			match(STRING);
			setState(207);
			match(T__8);
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITS) | (1L << STRING) | (1L << DYNVALSTRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(209);
			match(T__9);
			setState(210);
			match(VARASSPARAMS);
			setState(211);
			match(T__8);
			setState(212);
			match(BOOLEANSTRING);
			setState(213);
			match(T__9);
			setState(214);
			match(VARASSPARAMS);
			setState(215);
			match(T__8);
			setState(216);
			match(BOOLEANSTRING);
			setState(217);
			match(T__10);
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
		public ShapeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeCommand; }
	}

	public final ShapeCommandContext shapeCommand() throws RecognitionException {
		ShapeCommandContext _localctx = new ShapeCommandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shapeCommand);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				cube();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				sphere();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				plane();
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
		enterRule(_localctx, 24, RULE_styleCommand);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				color();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				map();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
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

	public static class CubeContext extends ParserRuleContext {
		public List<DimInputContext> dimInput() {
			return getRuleContexts(DimInputContext.class);
		}
		public DimInputContext dimInput(int i) {
			return getRuleContext(DimInputContext.class,i);
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
			setState(229);
			match(T__11);
			setState(230);
			dimInput();
			setState(231);
			match(T__9);
			setState(232);
			dimInput();
			setState(233);
			match(T__9);
			setState(234);
			dimInput();
			setState(235);
			match(T__10);
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
		public List<DimInputContext> dimInput() {
			return getRuleContexts(DimInputContext.class);
		}
		public DimInputContext dimInput(int i) {
			return getRuleContext(DimInputContext.class,i);
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
			setState(237);
			match(T__11);
			setState(238);
			dimInput();
			setState(239);
			match(T__9);
			setState(240);
			dimInput();
			setState(241);
			match(T__9);
			setState(242);
			dimInput();
			setState(243);
			match(T__10);
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
		public List<DimInputContext> dimInput() {
			return getRuleContexts(DimInputContext.class);
		}
		public DimInputContext dimInput(int i) {
			return getRuleContext(DimInputContext.class,i);
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
			setState(245);
			match(T__11);
			setState(246);
			dimInput();
			setState(247);
			match(T__9);
			setState(248);
			dimInput();
			setState(249);
			match(T__9);
			setState(250);
			dimInput();
			setState(251);
			match(T__10);
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
		public List<DimInputContext> dimInput() {
			return getRuleContexts(DimInputContext.class);
		}
		public DimInputContext dimInput(int i) {
			return getRuleContext(DimInputContext.class,i);
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
			setState(253);
			match(T__11);
			setState(254);
			dimInput();
			setState(255);
			match(T__9);
			setState(256);
			dimInput();
			setState(257);
			match(T__9);
			setState(258);
			dimInput();
			setState(259);
			match(T__10);
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
		public List<SphereDimInputContext> sphereDimInput() {
			return getRuleContexts(SphereDimInputContext.class);
		}
		public SphereDimInputContext sphereDimInput(int i) {
			return getRuleContext(SphereDimInputContext.class,i);
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
			setState(261);
			match(T__12);
			setState(262);
			sphereDimInput();
			setState(263);
			match(T__9);
			setState(264);
			sphereDimInput();
			setState(265);
			match(T__9);
			setState(266);
			sphereDimInput();
			setState(267);
			match(T__10);
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
		public List<SphereDimInputContext> sphereDimInput() {
			return getRuleContexts(SphereDimInputContext.class);
		}
		public SphereDimInputContext sphereDimInput(int i) {
			return getRuleContext(SphereDimInputContext.class,i);
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
			setState(269);
			match(T__12);
			setState(270);
			sphereDimInput();
			setState(271);
			match(T__9);
			setState(272);
			sphereDimInput();
			setState(273);
			match(T__9);
			setState(274);
			sphereDimInput();
			setState(275);
			match(T__10);
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
		public List<SphereDimInputContext> sphereDimInput() {
			return getRuleContexts(SphereDimInputContext.class);
		}
		public SphereDimInputContext sphereDimInput(int i) {
			return getRuleContext(SphereDimInputContext.class,i);
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
			setState(277);
			match(T__12);
			setState(278);
			sphereDimInput();
			setState(279);
			match(T__9);
			setState(280);
			sphereDimInput();
			setState(281);
			match(T__9);
			setState(282);
			sphereDimInput();
			setState(283);
			match(T__10);
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
		public List<SphereDimInputContext> sphereDimInput() {
			return getRuleContexts(SphereDimInputContext.class);
		}
		public SphereDimInputContext sphereDimInput(int i) {
			return getRuleContext(SphereDimInputContext.class,i);
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
			setState(285);
			match(T__12);
			setState(286);
			sphereDimInput();
			setState(287);
			match(T__9);
			setState(288);
			sphereDimInput();
			setState(289);
			match(T__9);
			setState(290);
			sphereDimInput();
			setState(291);
			match(T__10);
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
		public List<DimInputContext> dimInput() {
			return getRuleContexts(DimInputContext.class);
		}
		public DimInputContext dimInput(int i) {
			return getRuleContext(DimInputContext.class,i);
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
			setState(293);
			match(T__13);
			setState(294);
			dimInput();
			setState(295);
			match(T__9);
			setState(296);
			dimInput();
			setState(297);
			match(T__10);
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
		public List<DimInputContext> dimInput() {
			return getRuleContexts(DimInputContext.class);
		}
		public DimInputContext dimInput(int i) {
			return getRuleContext(DimInputContext.class,i);
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
			setState(299);
			match(T__13);
			setState(300);
			dimInput();
			setState(301);
			match(T__9);
			setState(302);
			dimInput();
			setState(303);
			match(T__10);
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
		public List<DimInputContext> dimInput() {
			return getRuleContexts(DimInputContext.class);
		}
		public DimInputContext dimInput(int i) {
			return getRuleContext(DimInputContext.class,i);
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
			setState(305);
			match(T__13);
			setState(306);
			dimInput();
			setState(307);
			match(T__9);
			setState(308);
			dimInput();
			setState(309);
			match(T__10);
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
		public List<DimInputContext> dimInput() {
			return getRuleContexts(DimInputContext.class);
		}
		public DimInputContext dimInput(int i) {
			return getRuleContext(DimInputContext.class,i);
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
			setState(311);
			match(T__13);
			setState(312);
			dimInput();
			setState(313);
			match(T__9);
			setState(314);
			dimInput();
			setState(315);
			match(T__10);
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
		public List<TerminalNode> TEXTPARAMDIGITS() { return getTokens(VizRepParser.TEXTPARAMDIGITS); }
		public TerminalNode TEXTPARAMDIGITS(int i) {
			return getToken(VizRepParser.TEXTPARAMDIGITS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public List<TerminalNode> TEXTPARAMSTRING() { return getTokens(VizRepParser.TEXTPARAMSTRING); }
		public TerminalNode TEXTPARAMSTRING(int i) {
			return getToken(VizRepParser.TEXTPARAMSTRING, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__14);
			setState(318);
			match(TEXTPARAMDIGITS);
			setState(319);
			match(T__8);
			setState(320);
			match(DIGITS);
			setState(321);
			match(T__9);
			setState(322);
			match(TEXTPARAMDIGITS);
			setState(323);
			match(T__8);
			setState(324);
			match(DIGITS);
			setState(325);
			match(T__9);
			setState(326);
			match(TEXTPARAMDIGITS);
			setState(327);
			match(T__8);
			setState(328);
			match(DIGITS);
			setState(329);
			match(T__9);
			setState(330);
			match(TEXTPARAMDIGITS);
			setState(331);
			match(T__8);
			setState(332);
			match(DIGITS);
			setState(333);
			match(T__9);
			setState(334);
			match(TEXTPARAMSTRING);
			setState(335);
			match(T__8);
			setState(336);
			match(STRING);
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(337);
				match(T__9);
				setState(338);
				match(TEXTPARAMSTRING);
				setState(339);
				match(T__8);
				setState(340);
				match(STRING);
				}
				break;
			}
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(343);
				match(T__9);
				setState(344);
				match(TEXTPARAMSTRING);
				setState(345);
				match(T__8);
				setState(346);
				match(STRING);
				}
				break;
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(349);
				match(T__9);
				setState(350);
				match(TEXTPARAMSTRING);
				setState(351);
				match(T__8);
				setState(352);
				match(STRING);
				}
			}

			setState(355);
			match(T__10);
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
		public List<TerminalNode> TEXTPARAMDIGITS() { return getTokens(VizRepParser.TEXTPARAMDIGITS); }
		public TerminalNode TEXTPARAMDIGITS(int i) {
			return getToken(VizRepParser.TEXTPARAMDIGITS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public List<TerminalNode> TEXTPARAMSTRING() { return getTokens(VizRepParser.TEXTPARAMSTRING); }
		public TerminalNode TEXTPARAMSTRING(int i) {
			return getToken(VizRepParser.TEXTPARAMSTRING, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__14);
			setState(358);
			match(TEXTPARAMDIGITS);
			setState(359);
			match(T__8);
			setState(360);
			match(DIGITS);
			setState(361);
			match(T__9);
			setState(362);
			match(TEXTPARAMDIGITS);
			setState(363);
			match(T__8);
			setState(364);
			match(DIGITS);
			setState(365);
			match(T__9);
			setState(366);
			match(TEXTPARAMDIGITS);
			setState(367);
			match(T__8);
			setState(368);
			match(DIGITS);
			setState(369);
			match(T__9);
			setState(370);
			match(TEXTPARAMDIGITS);
			setState(371);
			match(T__8);
			setState(372);
			match(DIGITS);
			setState(373);
			match(T__9);
			setState(374);
			match(TEXTPARAMSTRING);
			setState(375);
			match(T__8);
			setState(376);
			match(STRING);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(377);
				match(T__9);
				setState(378);
				match(TEXTPARAMSTRING);
				setState(379);
				match(T__8);
				setState(380);
				match(STRING);
				}
				break;
			}
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(383);
				match(T__9);
				setState(384);
				match(TEXTPARAMSTRING);
				setState(385);
				match(T__8);
				setState(386);
				match(STRING);
				}
				break;
			}
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(389);
				match(T__9);
				setState(390);
				match(TEXTPARAMSTRING);
				setState(391);
				match(T__8);
				setState(392);
				match(STRING);
				}
			}

			setState(395);
			match(T__10);
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
		public List<TerminalNode> TEXTPARAMDIGITS() { return getTokens(VizRepParser.TEXTPARAMDIGITS); }
		public TerminalNode TEXTPARAMDIGITS(int i) {
			return getToken(VizRepParser.TEXTPARAMDIGITS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public List<TerminalNode> TEXTPARAMSTRING() { return getTokens(VizRepParser.TEXTPARAMSTRING); }
		public TerminalNode TEXTPARAMSTRING(int i) {
			return getToken(VizRepParser.TEXTPARAMSTRING, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__14);
			setState(398);
			match(TEXTPARAMDIGITS);
			setState(399);
			match(T__8);
			setState(400);
			match(DIGITS);
			setState(401);
			match(T__9);
			setState(402);
			match(TEXTPARAMDIGITS);
			setState(403);
			match(T__8);
			setState(404);
			match(DIGITS);
			setState(405);
			match(T__9);
			setState(406);
			match(TEXTPARAMDIGITS);
			setState(407);
			match(T__8);
			setState(408);
			match(DIGITS);
			setState(409);
			match(T__9);
			setState(410);
			match(TEXTPARAMDIGITS);
			setState(411);
			match(T__8);
			setState(412);
			match(DIGITS);
			setState(413);
			match(T__9);
			setState(414);
			match(TEXTPARAMSTRING);
			setState(415);
			match(T__8);
			setState(416);
			match(STRING);
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(417);
				match(T__9);
				setState(418);
				match(TEXTPARAMSTRING);
				setState(419);
				match(T__8);
				setState(420);
				match(STRING);
				}
				break;
			}
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(423);
				match(T__9);
				setState(424);
				match(TEXTPARAMSTRING);
				setState(425);
				match(T__8);
				setState(426);
				match(STRING);
				}
				break;
			}
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(429);
				match(T__9);
				setState(430);
				match(TEXTPARAMSTRING);
				setState(431);
				match(T__8);
				setState(432);
				match(STRING);
				}
			}

			setState(435);
			match(T__10);
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
		public List<TerminalNode> TEXTPARAMDIGITS() { return getTokens(VizRepParser.TEXTPARAMDIGITS); }
		public TerminalNode TEXTPARAMDIGITS(int i) {
			return getToken(VizRepParser.TEXTPARAMDIGITS, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(VizRepParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(VizRepParser.DIGITS, i);
		}
		public List<TerminalNode> TEXTPARAMSTRING() { return getTokens(VizRepParser.TEXTPARAMSTRING); }
		public TerminalNode TEXTPARAMSTRING(int i) {
			return getToken(VizRepParser.TEXTPARAMSTRING, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__14);
			setState(438);
			match(TEXTPARAMDIGITS);
			setState(439);
			match(T__8);
			setState(440);
			match(DIGITS);
			setState(441);
			match(T__9);
			setState(442);
			match(TEXTPARAMDIGITS);
			setState(443);
			match(T__8);
			setState(444);
			match(DIGITS);
			setState(445);
			match(T__9);
			setState(446);
			match(TEXTPARAMDIGITS);
			setState(447);
			match(T__8);
			setState(448);
			match(DIGITS);
			setState(449);
			match(T__9);
			setState(450);
			match(TEXTPARAMDIGITS);
			setState(451);
			match(T__8);
			setState(452);
			match(DIGITS);
			setState(453);
			match(T__9);
			setState(454);
			match(TEXTPARAMSTRING);
			setState(455);
			match(T__8);
			setState(456);
			match(STRING);
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(457);
				match(T__9);
				setState(458);
				match(TEXTPARAMSTRING);
				setState(459);
				match(T__8);
				setState(460);
				match(STRING);
				}
				break;
			}
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(463);
				match(T__9);
				setState(464);
				match(TEXTPARAMSTRING);
				setState(465);
				match(T__8);
				setState(466);
				match(STRING);
				}
				break;
			}
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(469);
				match(T__9);
				setState(470);
				match(TEXTPARAMSTRING);
				setState(471);
				match(T__8);
				setState(472);
				match(STRING);
				}
			}

			setState(475);
			match(T__10);
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
			setState(477);
			match(T__15);
			setState(478);
			match(T__16);
			setState(479);
			match(DIGITS);
			setState(480);
			match(T__10);
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
			setState(482);
			match(T__15);
			setState(483);
			match(T__16);
			setState(484);
			match(DIGITS);
			setState(485);
			match(T__10);
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
			setState(487);
			match(T__15);
			setState(488);
			match(T__16);
			setState(489);
			match(DIGITS);
			setState(490);
			match(T__10);
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
		enterRule(_localctx, 64, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__17);
			setState(493);
			match(STRING);
			setState(494);
			match(T__10);
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
		enterRule(_localctx, 66, RULE_ifColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(T__17);
			setState(497);
			match(STRING);
			setState(498);
			match(T__10);
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
		enterRule(_localctx, 68, RULE_elseColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__17);
			setState(501);
			match(STRING);
			setState(502);
			match(T__10);
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
		enterRule(_localctx, 70, RULE_pen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(T__18);
			setState(505);
			match(PENPARAMSBOOL);
			setState(506);
			match(T__8);
			setState(507);
			match(STRING);
			setState(508);
			match(T__9);
			setState(509);
			match(PENPARAMS);
			setState(510);
			match(T__8);
			setState(511);
			match(DIGITS);
			setState(512);
			match(T__9);
			setState(513);
			match(PENPARAMS);
			setState(514);
			match(T__8);
			setState(515);
			match(DIGITS);
			setState(516);
			match(T__9);
			setState(517);
			match(PENPARAMS);
			setState(518);
			match(T__8);
			setState(519);
			match(DIGITS);
			setState(520);
			match(T__10);
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
		enterRule(_localctx, 72, RULE_ifPen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T__18);
			setState(523);
			match(PENPARAMSBOOL);
			setState(524);
			match(T__8);
			setState(525);
			match(STRING);
			setState(526);
			match(T__9);
			setState(527);
			match(PENPARAMS);
			setState(528);
			match(T__8);
			setState(529);
			match(DIGITS);
			setState(530);
			match(T__9);
			setState(531);
			match(PENPARAMS);
			setState(532);
			match(T__8);
			setState(533);
			match(DIGITS);
			setState(534);
			match(T__9);
			setState(535);
			match(PENPARAMS);
			setState(536);
			match(T__8);
			setState(537);
			match(DIGITS);
			setState(538);
			match(T__10);
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
		enterRule(_localctx, 74, RULE_elsePen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(T__18);
			setState(541);
			match(PENPARAMSBOOL);
			setState(542);
			match(T__8);
			setState(543);
			match(STRING);
			setState(544);
			match(T__9);
			setState(545);
			match(PENPARAMS);
			setState(546);
			match(T__8);
			setState(547);
			match(DIGITS);
			setState(548);
			match(T__9);
			setState(549);
			match(PENPARAMS);
			setState(550);
			match(T__8);
			setState(551);
			match(DIGITS);
			setState(552);
			match(T__9);
			setState(553);
			match(PENPARAMS);
			setState(554);
			match(T__8);
			setState(555);
			match(DIGITS);
			setState(556);
			match(T__10);
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
		public TerminalNode MAPLEXER() { return getToken(VizRepParser.MAPLEXER, 0); }
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
			setState(558);
			match(T__19);
			setState(559);
			match(MAPLEXER);
			setState(560);
			match(T__10);
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
		public TerminalNode MAPLEXER() { return getToken(VizRepParser.MAPLEXER, 0); }
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
			setState(562);
			match(T__19);
			setState(563);
			match(MAPLEXER);
			setState(564);
			match(T__10);
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
		public TerminalNode MAPLEXER() { return getToken(VizRepParser.MAPLEXER, 0); }
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
			setState(566);
			match(T__19);
			setState(567);
			match(MAPLEXER);
			setState(568);
			match(T__10);
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

	public static class DimInputContext extends ParserRuleContext {
		public TerminalNode DIMENSION3D() { return getToken(VizRepParser.DIMENSION3D, 0); }
		public TerminalNode DYNINPUT() { return getToken(VizRepParser.DYNINPUT, 0); }
		public TerminalNode DIGITS() { return getToken(VizRepParser.DIGITS, 0); }
		public DimInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimInput; }
	}

	public final DimInputContext dimInput() throws RecognitionException {
		DimInputContext _localctx = new DimInputContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dimInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(DIMENSION3D);
			setState(571);
			match(T__8);
			setState(572);
			_la = _input.LA(1);
			if ( !(_la==DIGITS || _la==DYNINPUT) ) {
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

	public static class SphereDimInputContext extends ParserRuleContext {
		public TerminalNode SPHEREPARAMS() { return getToken(VizRepParser.SPHEREPARAMS, 0); }
		public TerminalNode DYNINPUT() { return getToken(VizRepParser.DYNINPUT, 0); }
		public TerminalNode DIGITS() { return getToken(VizRepParser.DIGITS, 0); }
		public SphereDimInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sphereDimInput; }
	}

	public final SphereDimInputContext sphereDimInput() throws RecognitionException {
		SphereDimInputContext _localctx = new SphereDimInputContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sphereDimInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(SPHEREPARAMS);
			setState(575);
			match(T__8);
			setState(576);
			_la = _input.LA(1);
			if ( !(_la==DIGITS || _la==DYNINPUT) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0245\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\6\2^\n\2\r\2\16\2_\3\2\3\2\3\3\3\3\3\3\5\3g\n"+
		"\3\3\4\3\4\5\4k\n\4\3\4\3\4\5\4o\n\4\3\4\5\4r\n\4\3\4\5\4u\n\4\3\4\3\4"+
		"\5\4y\n\4\3\4\5\4|\n\4\3\4\6\4\177\n\4\r\4\16\4\u0080\3\4\3\4\5\4\u0085"+
		"\n\4\3\4\5\4\u0088\n\4\3\4\6\4\u008b\n\4\r\4\16\4\u008c\3\4\3\4\5\4\u0091"+
		"\n\4\3\4\5\4\u0094\n\4\3\5\3\5\3\5\3\5\5\5\u009a\n\5\3\6\3\6\3\6\3\6\5"+
		"\6\u00a0\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\6\b\u00b3\n\b\r\b\16\b\u00b4\3\t\3\t\3\t\6\t\u00ba\n\t\r\t"+
		"\16\t\u00bb\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c5\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00ce\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00e1\n\r\3\16\3\16\3\16\5\16\u00e6"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0158\n\33\3\33\3\33\3\33\3\33\5\33\u015e\n\33\3\33\3\33\3"+
		"\33\3\33\5\33\u0164\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0180\n\34\3\34\3\34\3\34\3\34\5\34\u0186\n\34\3"+
		"\34\3\34\3\34\3\34\5\34\u018c\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u01a8\n\35\3\35\3\35\3\35\3\35\5\35\u01ae"+
		"\n\35\3\35\3\35\3\35\3\35\5\35\u01b4\n\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01d0\n\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01d6\n\36\3\36\3\36\3\36\3\36\5\36\u01dc\n\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)"+
		"\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\4\u0080\u008c\2-\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTV\2\5\3\3$$\4\2 !&&\4\2  \'\'\2\u0254\2]\3\2\2\2\4f\3\2\2\2\6h\3\2\2"+
		"\2\b\u0099\3\2\2\2\n\u009f\3\2\2\2\f\u00a1\3\2\2\2\16\u00b2\3\2\2\2\20"+
		"\u00b9\3\2\2\2\22\u00c4\3\2\2\2\24\u00cd\3\2\2\2\26\u00cf\3\2\2\2\30\u00e0"+
		"\3\2\2\2\32\u00e5\3\2\2\2\34\u00e7\3\2\2\2\36\u00ef\3\2\2\2 \u00f7\3\2"+
		"\2\2\"\u00ff\3\2\2\2$\u0107\3\2\2\2&\u010f\3\2\2\2(\u0117\3\2\2\2*\u011f"+
		"\3\2\2\2,\u0127\3\2\2\2.\u012d\3\2\2\2\60\u0133\3\2\2\2\62\u0139\3\2\2"+
		"\2\64\u013f\3\2\2\2\66\u0167\3\2\2\28\u018f\3\2\2\2:\u01b7\3\2\2\2<\u01df"+
		"\3\2\2\2>\u01e4\3\2\2\2@\u01e9\3\2\2\2B\u01ee\3\2\2\2D\u01f2\3\2\2\2F"+
		"\u01f6\3\2\2\2H\u01fa\3\2\2\2J\u020c\3\2\2\2L\u021e\3\2\2\2N\u0230\3\2"+
		"\2\2P\u0234\3\2\2\2R\u0238\3\2\2\2T\u023c\3\2\2\2V\u0240\3\2\2\2X^\5\4"+
		"\3\2Y^\5\6\4\2Z^\5\f\7\2[^\5\26\f\2\\^\7$\2\2]X\3\2\2\2]Y\3\2\2\2]Z\3"+
		"\2\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab"+
		"\t\2\2\2b\3\3\2\2\2cg\5\30\r\2dg\5\32\16\2eg\5\64\33\2fc\3\2\2\2fd\3\2"+
		"\2\2fe\3\2\2\2g\5\3\2\2\2hj\5<\37\2ik\7$\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2"+
		"\2\2ln\7\3\2\2mo\7$\2\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\5B\"\2qp\3\2\2"+
		"\2qr\3\2\2\2rt\3\2\2\2su\7$\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\5\b\5"+
		"\2wy\7$\2\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5\64\33\2{z\3\2\2\2{|\3\2"+
		"\2\2|~\3\2\2\2}\177\7$\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0080~\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\7\4\2\2\u0083\u0085"+
		"\7$\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0088\5B\"\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u008b\7$\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\5\n"+
		"\6\2\u008f\u0091\7$\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0094\5\64\33\2\u0093\u0092\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\7\3\2\2\2\u0095\u009a\5\36\20\2\u0096\u009a\5&\24\2\u0097"+
		"\u009a\5.\30\2\u0098\u009a\5\66\34\2\u0099\u0095\3\2\2\2\u0099\u0096\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\t\3\2\2\2\u009b\u00a0"+
		"\5\36\20\2\u009c\u00a0\5&\24\2\u009d\u00a0\5.\30\2\u009e\u00a0\5\66\34"+
		"\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\7 \2\2\u00a3"+
		"\u00a4\7%\2\2\u00a4\u00a5\7 \2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\7$\2"+
		"\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\7$\2\2\u00a9\u00aa\5\16\b\2\u00aa\u00ab"+
		"\7$\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\7\t\2\2\u00ae"+
		"\r\3\2\2\2\u00af\u00b3\5\22\n\2\u00b0\u00b3\5\6\4\2\u00b1\u00b3\7$\2\2"+
		"\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\17\3\2\2\2\u00b6"+
		"\u00ba\5\24\13\2\u00b7\u00ba\5\6\4\2\u00b8\u00ba\7$\2\2\u00b9\u00b6\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\21\3\2\2\2\u00bd\u00c5\5 \21"+
		"\2\u00be\u00c5\5(\25\2\u00bf\u00c5\5\60\31\2\u00c0\u00c5\58\35\2\u00c1"+
		"\u00c5\5D#\2\u00c2\u00c5\5P)\2\u00c3\u00c5\5J&\2\u00c4\u00bd\3\2\2\2\u00c4"+
		"\u00be\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\23\3\2\2\2\u00c6\u00ce"+
		"\5\"\22\2\u00c7\u00ce\5*\26\2\u00c8\u00ce\5\62\32\2\u00c9\u00ce\5:\36"+
		"\2\u00ca\u00ce\5F$\2\u00cb\u00ce\5R*\2\u00cc\u00ce\5L\'\2\u00cd\u00c6"+
		"\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\25\3\2\2"+
		"\2\u00cf\u00d0\7\n\2\2\u00d0\u00d1\7!\2\2\u00d1\u00d2\7\13\2\2\u00d2\u00d3"+
		"\t\3\2\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\7\37\2\2\u00d5\u00d6\7\13\2\2"+
		"\u00d6\u00d7\7\27\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\7\37\2\2\u00d9\u00da"+
		"\7\13\2\2\u00da\u00db\7\27\2\2\u00db\u00dc\7\r\2\2\u00dc\27\3\2\2\2\u00dd"+
		"\u00e1\5\34\17\2\u00de\u00e1\5$\23\2\u00df\u00e1\5,\27\2\u00e0\u00dd\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\31\3\2\2\2\u00e2"+
		"\u00e6\5B\"\2\u00e3\u00e6\5N(\2\u00e4\u00e6\5H%\2\u00e5\u00e2\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\33\3\2\2\2\u00e7\u00e8"+
		"\7\16\2\2\u00e8\u00e9\5T+\2\u00e9\u00ea\7\f\2\2\u00ea\u00eb\5T+\2\u00eb"+
		"\u00ec\7\f\2\2\u00ec\u00ed\5T+\2\u00ed\u00ee\7\r\2\2\u00ee\35\3\2\2\2"+
		"\u00ef\u00f0\7\16\2\2\u00f0\u00f1\5T+\2\u00f1\u00f2\7\f\2\2\u00f2\u00f3"+
		"\5T+\2\u00f3\u00f4\7\f\2\2\u00f4\u00f5\5T+\2\u00f5\u00f6\7\r\2\2\u00f6"+
		"\37\3\2\2\2\u00f7\u00f8\7\16\2\2\u00f8\u00f9\5T+\2\u00f9\u00fa\7\f\2\2"+
		"\u00fa\u00fb\5T+\2\u00fb\u00fc\7\f\2\2\u00fc\u00fd\5T+\2\u00fd\u00fe\7"+
		"\r\2\2\u00fe!\3\2\2\2\u00ff\u0100\7\16\2\2\u0100\u0101\5T+\2\u0101\u0102"+
		"\7\f\2\2\u0102\u0103\5T+\2\u0103\u0104\7\f\2\2\u0104\u0105\5T+\2\u0105"+
		"\u0106\7\r\2\2\u0106#\3\2\2\2\u0107\u0108\7\17\2\2\u0108\u0109\5V,\2\u0109"+
		"\u010a\7\f\2\2\u010a\u010b\5V,\2\u010b\u010c\7\f\2\2\u010c\u010d\5V,\2"+
		"\u010d\u010e\7\r\2\2\u010e%\3\2\2\2\u010f\u0110\7\17\2\2\u0110\u0111\5"+
		"V,\2\u0111\u0112\7\f\2\2\u0112\u0113\5V,\2\u0113\u0114\7\f\2\2\u0114\u0115"+
		"\5V,\2\u0115\u0116\7\r\2\2\u0116\'\3\2\2\2\u0117\u0118\7\17\2\2\u0118"+
		"\u0119\5V,\2\u0119\u011a\7\f\2\2\u011a\u011b\5V,\2\u011b\u011c\7\f\2\2"+
		"\u011c\u011d\5V,\2\u011d\u011e\7\r\2\2\u011e)\3\2\2\2\u011f\u0120\7\17"+
		"\2\2\u0120\u0121\5V,\2\u0121\u0122\7\f\2\2\u0122\u0123\5V,\2\u0123\u0124"+
		"\7\f\2\2\u0124\u0125\5V,\2\u0125\u0126\7\r\2\2\u0126+\3\2\2\2\u0127\u0128"+
		"\7\20\2\2\u0128\u0129\5T+\2\u0129\u012a\7\f\2\2\u012a\u012b\5T+\2\u012b"+
		"\u012c\7\r\2\2\u012c-\3\2\2\2\u012d\u012e\7\20\2\2\u012e\u012f\5T+\2\u012f"+
		"\u0130\7\f\2\2\u0130\u0131\5T+\2\u0131\u0132\7\r\2\2\u0132/\3\2\2\2\u0133"+
		"\u0134\7\20\2\2\u0134\u0135\5T+\2\u0135\u0136\7\f\2\2\u0136\u0137\5T+"+
		"\2\u0137\u0138\7\r\2\2\u0138\61\3\2\2\2\u0139\u013a\7\20\2\2\u013a\u013b"+
		"\5T+\2\u013b\u013c\7\f\2\2\u013c\u013d\5T+\2\u013d\u013e\7\r\2\2\u013e"+
		"\63\3\2\2\2\u013f\u0140\7\21\2\2\u0140\u0141\7\33\2\2\u0141\u0142\7\13"+
		"\2\2\u0142\u0143\7 \2\2\u0143\u0144\7\f\2\2\u0144\u0145\7\33\2\2\u0145"+
		"\u0146\7\13\2\2\u0146\u0147\7 \2\2\u0147\u0148\7\f\2\2\u0148\u0149\7\33"+
		"\2\2\u0149\u014a\7\13\2\2\u014a\u014b\7 \2\2\u014b\u014c\7\f\2\2\u014c"+
		"\u014d\7\33\2\2\u014d\u014e\7\13\2\2\u014e\u014f\7 \2\2\u014f\u0150\7"+
		"\f\2\2\u0150\u0151\7\34\2\2\u0151\u0152\7\13\2\2\u0152\u0157\7!\2\2\u0153"+
		"\u0154\7\f\2\2\u0154\u0155\7\34\2\2\u0155\u0156\7\13\2\2\u0156\u0158\7"+
		"!\2\2\u0157\u0153\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015d\3\2\2\2\u0159"+
		"\u015a\7\f\2\2\u015a\u015b\7\34\2\2\u015b\u015c\7\13\2\2\u015c\u015e\7"+
		"!\2\2\u015d\u0159\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0163\3\2\2\2\u015f"+
		"\u0160\7\f\2\2\u0160\u0161\7\34\2\2\u0161\u0162\7\13\2\2\u0162\u0164\7"+
		"!\2\2\u0163\u015f\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\7\r\2\2\u0166\65\3\2\2\2\u0167\u0168\7\21\2\2\u0168\u0169\7\33"+
		"\2\2\u0169\u016a\7\13\2\2\u016a\u016b\7 \2\2\u016b\u016c\7\f\2\2\u016c"+
		"\u016d\7\33\2\2\u016d\u016e\7\13\2\2\u016e\u016f\7 \2\2\u016f\u0170\7"+
		"\f\2\2\u0170\u0171\7\33\2\2\u0171\u0172\7\13\2\2\u0172\u0173\7 \2\2\u0173"+
		"\u0174\7\f\2\2\u0174\u0175\7\33\2\2\u0175\u0176\7\13\2\2\u0176\u0177\7"+
		" \2\2\u0177\u0178\7\f\2\2\u0178\u0179\7\34\2\2\u0179\u017a\7\13\2\2\u017a"+
		"\u017f\7!\2\2\u017b\u017c\7\f\2\2\u017c\u017d\7\34\2\2\u017d\u017e\7\13"+
		"\2\2\u017e\u0180\7!\2\2\u017f\u017b\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0185\3\2\2\2\u0181\u0182\7\f\2\2\u0182\u0183\7\34\2\2\u0183\u0184\7"+
		"\13\2\2\u0184\u0186\7!\2\2\u0185\u0181\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u018b\3\2\2\2\u0187\u0188\7\f\2\2\u0188\u0189\7\34\2\2\u0189\u018a\7"+
		"\13\2\2\u018a\u018c\7!\2\2\u018b\u0187\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\7\r\2\2\u018e\67\3\2\2\2\u018f\u0190\7\21\2"+
		"\2\u0190\u0191\7\33\2\2\u0191\u0192\7\13\2\2\u0192\u0193\7 \2\2\u0193"+
		"\u0194\7\f\2\2\u0194\u0195\7\33\2\2\u0195\u0196\7\13\2\2\u0196\u0197\7"+
		" \2\2\u0197\u0198\7\f\2\2\u0198\u0199\7\33\2\2\u0199\u019a\7\13\2\2\u019a"+
		"\u019b\7 \2\2\u019b\u019c\7\f\2\2\u019c\u019d\7\33\2\2\u019d\u019e\7\13"+
		"\2\2\u019e\u019f\7 \2\2\u019f\u01a0\7\f\2\2\u01a0\u01a1\7\34\2\2\u01a1"+
		"\u01a2\7\13\2\2\u01a2\u01a7\7!\2\2\u01a3\u01a4\7\f\2\2\u01a4\u01a5\7\34"+
		"\2\2\u01a5\u01a6\7\13\2\2\u01a6\u01a8\7!\2\2\u01a7\u01a3\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01ad\3\2\2\2\u01a9\u01aa\7\f\2\2\u01aa\u01ab\7\34"+
		"\2\2\u01ab\u01ac\7\13\2\2\u01ac\u01ae\7!\2\2\u01ad\u01a9\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b3\3\2\2\2\u01af\u01b0\7\f\2\2\u01b0\u01b1\7\34"+
		"\2\2\u01b1\u01b2\7\13\2\2\u01b2\u01b4\7!\2\2\u01b3\u01af\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7\r\2\2\u01b69\3\2\2\2"+
		"\u01b7\u01b8\7\21\2\2\u01b8\u01b9\7\33\2\2\u01b9\u01ba\7\13\2\2\u01ba"+
		"\u01bb\7 \2\2\u01bb\u01bc\7\f\2\2\u01bc\u01bd\7\33\2\2\u01bd\u01be\7\13"+
		"\2\2\u01be\u01bf\7 \2\2\u01bf\u01c0\7\f\2\2\u01c0\u01c1\7\33\2\2\u01c1"+
		"\u01c2\7\13\2\2\u01c2\u01c3\7 \2\2\u01c3\u01c4\7\f\2\2\u01c4\u01c5\7\33"+
		"\2\2\u01c5\u01c6\7\13\2\2\u01c6\u01c7\7 \2\2\u01c7\u01c8\7\f\2\2\u01c8"+
		"\u01c9\7\34\2\2\u01c9\u01ca\7\13\2\2\u01ca\u01cf\7!\2\2\u01cb\u01cc\7"+
		"\f\2\2\u01cc\u01cd\7\34\2\2\u01cd\u01ce\7\13\2\2\u01ce\u01d0\7!\2\2\u01cf"+
		"\u01cb\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d5\3\2\2\2\u01d1\u01d2\7\f"+
		"\2\2\u01d2\u01d3\7\34\2\2\u01d3\u01d4\7\13\2\2\u01d4\u01d6\7!\2\2\u01d5"+
		"\u01d1\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01db\3\2\2\2\u01d7\u01d8\7\f"+
		"\2\2\u01d8\u01d9\7\34\2\2\u01d9\u01da\7\13\2\2\u01da\u01dc\7!\2\2\u01db"+
		"\u01d7\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7\r"+
		"\2\2\u01de;\3\2\2\2\u01df\u01e0\7\22\2\2\u01e0\u01e1\7\23\2\2\u01e1\u01e2"+
		"\7 \2\2\u01e2\u01e3\7\r\2\2\u01e3=\3\2\2\2\u01e4\u01e5\7\22\2\2\u01e5"+
		"\u01e6\7\23\2\2\u01e6\u01e7\7 \2\2\u01e7\u01e8\7\r\2\2\u01e8?\3\2\2\2"+
		"\u01e9\u01ea\7\22\2\2\u01ea\u01eb\7\23\2\2\u01eb\u01ec\7 \2\2\u01ec\u01ed"+
		"\7\r\2\2\u01edA\3\2\2\2\u01ee\u01ef\7\24\2\2\u01ef\u01f0\7!\2\2\u01f0"+
		"\u01f1\7\r\2\2\u01f1C\3\2\2\2\u01f2\u01f3\7\24\2\2\u01f3\u01f4\7!\2\2"+
		"\u01f4\u01f5\7\r\2\2\u01f5E\3\2\2\2\u01f6\u01f7\7\24\2\2\u01f7\u01f8\7"+
		"!\2\2\u01f8\u01f9\7\r\2\2\u01f9G\3\2\2\2\u01fa\u01fb\7\25\2\2\u01fb\u01fc"+
		"\7\35\2\2\u01fc\u01fd\7\13\2\2\u01fd\u01fe\7!\2\2\u01fe\u01ff\7\f\2\2"+
		"\u01ff\u0200\7\36\2\2\u0200\u0201\7\13\2\2\u0201\u0202\7 \2\2\u0202\u0203"+
		"\7\f\2\2\u0203\u0204\7\36\2\2\u0204\u0205\7\13\2\2\u0205\u0206\7 \2\2"+
		"\u0206\u0207\7\f\2\2\u0207\u0208\7\36\2\2\u0208\u0209\7\13\2\2\u0209\u020a"+
		"\7 \2\2\u020a\u020b\7\r\2\2\u020bI\3\2\2\2\u020c\u020d\7\25\2\2\u020d"+
		"\u020e\7\35\2\2\u020e\u020f\7\13\2\2\u020f\u0210\7!\2\2\u0210\u0211\7"+
		"\f\2\2\u0211\u0212\7\36\2\2\u0212\u0213\7\13\2\2\u0213\u0214\7 \2\2\u0214"+
		"\u0215\7\f\2\2\u0215\u0216\7\36\2\2\u0216\u0217\7\13\2\2\u0217\u0218\7"+
		" \2\2\u0218\u0219\7\f\2\2\u0219\u021a\7\36\2\2\u021a\u021b\7\13\2\2\u021b"+
		"\u021c\7 \2\2\u021c\u021d\7\r\2\2\u021dK\3\2\2\2\u021e\u021f\7\25\2\2"+
		"\u021f\u0220\7\35\2\2\u0220\u0221\7\13\2\2\u0221\u0222\7!\2\2\u0222\u0223"+
		"\7\f\2\2\u0223\u0224\7\36\2\2\u0224\u0225\7\13\2\2\u0225\u0226\7 \2\2"+
		"\u0226\u0227\7\f\2\2\u0227\u0228\7\36\2\2\u0228\u0229\7\13\2\2\u0229\u022a"+
		"\7 \2\2\u022a\u022b\7\f\2\2\u022b\u022c\7\36\2\2\u022c\u022d\7\13\2\2"+
		"\u022d\u022e\7 \2\2\u022e\u022f\7\r\2\2\u022fM\3\2\2\2\u0230\u0231\7\26"+
		"\2\2\u0231\u0232\7\"\2\2\u0232\u0233\7\r\2\2\u0233O\3\2\2\2\u0234\u0235"+
		"\7\26\2\2\u0235\u0236\7\"\2\2\u0236\u0237\7\r\2\2\u0237Q\3\2\2\2\u0238"+
		"\u0239\7\26\2\2\u0239\u023a\7\"\2\2\u023a\u023b\7\r\2\2\u023bS\3\2\2\2"+
		"\u023c\u023d\7\31\2\2\u023d\u023e\7\13\2\2\u023e\u023f\t\4\2\2\u023fU"+
		"\3\2\2\2\u0240\u0241\7\30\2\2\u0241\u0242\7\13\2\2\u0242\u0243\t\4\2\2"+
		"\u0243W\3\2\2\2\']_fjnqtx{\u0080\u0084\u0087\u008c\u0090\u0093\u0099\u009f"+
		"\u00b2\u00b4\u00b9\u00bb\u00c4\u00cd\u00e0\u00e5\u0157\u015d\u0163\u017f"+
		"\u0185\u018b\u01a7\u01ad\u01b3\u01cf\u01d5\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}