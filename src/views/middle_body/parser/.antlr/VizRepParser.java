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
		T__17=18, T__18=19, T__19=20, T__20=21, BOOLEANSTRING=22, SPHEREDIMENSIONS=23, 
		DIMENSION3D=24, DIMENSION2D=25, TEXTDIMDIGITS=26, TEXTDIMSTRING=27, PENPARAMSBOOL=28, 
		PENPARAMS=29, VARASSVALUES=30, STRING=31, DIGITS=32, WHITESPACE=33, NEWLINE=34, 
		OPERATOR=35, SOMERULE=36;
	public static final int
		RULE_commandChain = 0, RULE_relation = 1, RULE_relMiddle = 2, RULE_condition = 3, 
		RULE_setVariable = 4, RULE_ifBlock = 5, RULE_elseBlock = 6, RULE_ifCommand = 7, 
		RULE_elseCommand = 8, RULE_command = 9, RULE_shapeCommand = 10, RULE_styleCommand = 11, 
		RULE_relCommandFrom = 12, RULE_relCommandTo = 13, RULE_cube = 14, RULE_relCube = 15, 
		RULE_ifCube = 16, RULE_elseCube = 17, RULE_sphere = 18, RULE_relSphere = 19, 
		RULE_ifSphere = 20, RULE_elseSphere = 21, RULE_plane = 22, RULE_relPane = 23, 
		RULE_ifPlane = 24, RULE_elsePlane = 25, RULE_text = 26, RULE_relText = 27, 
		RULE_ifText = 28, RULE_elseText = 29, RULE_line = 30, RULE_ifLine = 31, 
		RULE_elseLine = 32, RULE_pen = 33, RULE_ifPen = 34, RULE_elsePen = 35, 
		RULE_color = 36, RULE_ifColor = 37, RULE_elseColor = 38, RULE_map = 39, 
		RULE_ifMap = 40, RULE_elseMap = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"commandChain", "relation", "relMiddle", "condition", "setVariable", 
			"ifBlock", "elseBlock", "ifCommand", "elseCommand", "command", "shapeCommand", 
			"styleCommand", "relCommandFrom", "relCommandTo", "cube", "relCube", 
			"ifCube", "elseCube", "sphere", "relSphere", "ifSphere", "elseSphere", 
			"plane", "relPane", "ifPlane", "elsePlane", "text", "relText", "ifText", 
			"elseText", "line", "ifLine", "elseLine", "pen", "ifPen", "elsePen", 
			"color", "ifColor", "elseColor", "map", "ifMap", "elseMap"
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
			setState(89); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(89);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__18:
					case T__19:
					case T__20:
						{
						setState(84);
						command();
						}
						break;
					case NEWLINE:
						{
						setState(85);
						match(NEWLINE);
						}
						break;
					case T__16:
						{
						setState(86);
						relation();
						}
						break;
					case T__3:
						{
						setState(87);
						condition();
						}
						break;
					case T__8:
						{
						setState(88);
						setVariable();
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
				setState(91); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(93);
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
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
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
			setState(95);
			line();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(96);
				match(NEWLINE);
				}
			}

			setState(99);
			match(T__0);
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(100);
				match(NEWLINE);
				}
				break;
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(103);
				color();
				}
			}

			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(106);
				match(NEWLINE);
				}
			}

			setState(109);
			relCommandFrom();
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(110);
				match(NEWLINE);
				}
				break;
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(113);
				relCommandFrom();
				}
			}

			setState(117); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(116);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(119); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(121);
			match(T__1);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(122);
				match(NEWLINE);
				}
				break;
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(125);
				color();
				}
			}

			setState(129); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(128);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(133);
			relCommandTo();
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(134);
				match(NEWLINE);
				}
				break;
			}
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(137);
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
			setState(140);
			line();
			setState(142); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(141);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(144); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(146);
			match(T__0);
			setState(148); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(147);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(152);
			shapeCommand();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(153);
				shapeCommand();
				}
			}

			setState(156);
			match(T__2);
			setState(158); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(157);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(162);
			text();
			setState(163);
			match(T__1);
			setState(165); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(164);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(169);
			shapeCommand();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(170);
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
			setState(173);
			match(T__3);
			setState(174);
			match(DIGITS);
			setState(175);
			match(OPERATOR);
			setState(176);
			match(DIGITS);
			setState(177);
			match(T__4);
			setState(178);
			match(NEWLINE);
			setState(179);
			match(T__5);
			setState(180);
			match(NEWLINE);
			setState(181);
			ifBlock();
			setState(182);
			match(NEWLINE);
			setState(183);
			match(T__6);
			setState(184);
			elseBlock();
			setState(185);
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

	public static class SetVariableContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(VizRepParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VizRepParser.STRING, i);
		}
		public List<TerminalNode> VARASSVALUES() { return getTokens(VizRepParser.VARASSVALUES); }
		public TerminalNode VARASSVALUES(int i) {
			return getToken(VizRepParser.VARASSVALUES, i);
		}
		public List<TerminalNode> BOOLEANSTRING() { return getTokens(VizRepParser.BOOLEANSTRING); }
		public TerminalNode BOOLEANSTRING(int i) {
			return getToken(VizRepParser.BOOLEANSTRING, i);
		}
		public TerminalNode SOMERULE() { return getToken(VizRepParser.SOMERULE, 0); }
		public TerminalNode DIGITS() { return getToken(VizRepParser.DIGITS, 0); }
		public SetVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVariable; }
	}

	public final SetVariableContext setVariable() throws RecognitionException {
		SetVariableContext _localctx = new SetVariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_setVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__8);
			setState(188);
			match(STRING);
			setState(189);
			match(T__9);
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << DIGITS) | (1L << SOMERULE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(191);
			match(T__10);
			setState(192);
			match(VARASSVALUES);
			setState(193);
			match(T__9);
			setState(194);
			match(BOOLEANSTRING);
			setState(195);
			match(T__10);
			setState(196);
			match(VARASSVALUES);
			setState(197);
			match(T__9);
			setState(198);
			match(BOOLEANSTRING);
			setState(199);
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
		enterRule(_localctx, 10, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(204);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__18:
					case T__19:
					case T__20:
						{
						setState(201);
						ifCommand();
						}
						break;
					case T__16:
						{
						setState(202);
						relation();
						}
						break;
					case NEWLINE:
						{
						setState(203);
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
				setState(206); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 12, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__18:
				case T__19:
				case T__20:
					{
					setState(208);
					elseCommand();
					}
					break;
				case T__16:
					{
					setState(209);
					relation();
					}
					break;
				case NEWLINE:
					{
					setState(210);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << NEWLINE))) != 0) );
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
		enterRule(_localctx, 14, RULE_ifCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(215);
				ifCube();
				}
				break;
			case T__13:
				{
				setState(216);
				ifSphere();
				}
				break;
			case T__14:
				{
				setState(217);
				ifPlane();
				}
				break;
			case T__15:
				{
				setState(218);
				ifText();
				}
				break;
			case T__19:
				{
				setState(219);
				ifColor();
				}
				break;
			case T__20:
				{
				setState(220);
				ifMap();
				}
				break;
			case T__18:
				{
				setState(221);
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
		enterRule(_localctx, 16, RULE_elseCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(224);
				elseCube();
				}
				break;
			case T__13:
				{
				setState(225);
				elseSphere();
				}
				break;
			case T__14:
				{
				setState(226);
				elsePlane();
				}
				break;
			case T__15:
				{
				setState(227);
				elseText();
				}
				break;
			case T__19:
				{
				setState(228);
				elseColor();
				}
				break;
			case T__20:
				{
				setState(229);
				elseMap();
				}
				break;
			case T__18:
				{
				setState(230);
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
		enterRule(_localctx, 18, RULE_command);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				shapeCommand();
				}
				break;
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
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
		enterRule(_localctx, 20, RULE_shapeCommand);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				cube();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				sphere();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				plane();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
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
		enterRule(_localctx, 22, RULE_styleCommand);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				color();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				map();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
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
		enterRule(_localctx, 24, RULE_relCommandFrom);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				relCube();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				relSphere();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				relPane();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
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
		enterRule(_localctx, 26, RULE_relCommandTo);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				relCube();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				relSphere();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				relPane();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
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
		enterRule(_localctx, 28, RULE_cube);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__12);
			setState(261);
			match(DIMENSION3D);
			setState(262);
			match(T__9);
			setState(263);
			match(DIGITS);
			setState(264);
			match(T__10);
			setState(265);
			match(DIMENSION3D);
			setState(266);
			match(T__9);
			setState(267);
			match(DIGITS);
			setState(268);
			match(T__10);
			setState(269);
			match(DIMENSION3D);
			setState(270);
			match(T__9);
			setState(271);
			match(DIGITS);
			setState(272);
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
		enterRule(_localctx, 30, RULE_relCube);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__12);
			setState(275);
			match(DIMENSION3D);
			setState(276);
			match(T__9);
			setState(277);
			match(DIGITS);
			setState(278);
			match(T__10);
			setState(279);
			match(DIMENSION3D);
			setState(280);
			match(T__9);
			setState(281);
			match(DIGITS);
			setState(282);
			match(T__10);
			setState(283);
			match(DIMENSION3D);
			setState(284);
			match(T__9);
			setState(285);
			match(DIGITS);
			setState(286);
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
		enterRule(_localctx, 32, RULE_ifCube);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__12);
			setState(289);
			match(DIMENSION3D);
			setState(290);
			match(T__9);
			setState(291);
			match(DIGITS);
			setState(292);
			match(T__10);
			setState(293);
			match(DIMENSION3D);
			setState(294);
			match(T__9);
			setState(295);
			match(DIGITS);
			setState(296);
			match(T__10);
			setState(297);
			match(DIMENSION3D);
			setState(298);
			match(T__9);
			setState(299);
			match(DIGITS);
			setState(300);
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
		enterRule(_localctx, 34, RULE_elseCube);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__12);
			setState(303);
			match(DIMENSION3D);
			setState(304);
			match(T__9);
			setState(305);
			match(DIGITS);
			setState(306);
			match(T__10);
			setState(307);
			match(DIMENSION3D);
			setState(308);
			match(T__9);
			setState(309);
			match(DIGITS);
			setState(310);
			match(T__10);
			setState(311);
			match(DIMENSION3D);
			setState(312);
			match(T__9);
			setState(313);
			match(DIGITS);
			setState(314);
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
		enterRule(_localctx, 36, RULE_sphere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__13);
			setState(317);
			match(SPHEREDIMENSIONS);
			setState(318);
			match(T__9);
			setState(319);
			match(DIGITS);
			setState(320);
			match(T__10);
			setState(321);
			match(SPHEREDIMENSIONS);
			setState(322);
			match(T__9);
			setState(323);
			match(DIGITS);
			setState(324);
			match(T__10);
			setState(325);
			match(SPHEREDIMENSIONS);
			setState(326);
			match(T__9);
			setState(327);
			match(DIGITS);
			setState(328);
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
		enterRule(_localctx, 38, RULE_relSphere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__13);
			setState(331);
			match(SPHEREDIMENSIONS);
			setState(332);
			match(T__9);
			setState(333);
			match(DIGITS);
			setState(334);
			match(T__10);
			setState(335);
			match(SPHEREDIMENSIONS);
			setState(336);
			match(T__9);
			setState(337);
			match(DIGITS);
			setState(338);
			match(T__10);
			setState(339);
			match(SPHEREDIMENSIONS);
			setState(340);
			match(T__9);
			setState(341);
			match(DIGITS);
			setState(342);
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
		enterRule(_localctx, 40, RULE_ifSphere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__13);
			setState(345);
			match(SPHEREDIMENSIONS);
			setState(346);
			match(T__9);
			setState(347);
			match(DIGITS);
			setState(348);
			match(T__10);
			setState(349);
			match(SPHEREDIMENSIONS);
			setState(350);
			match(T__9);
			setState(351);
			match(DIGITS);
			setState(352);
			match(T__10);
			setState(353);
			match(SPHEREDIMENSIONS);
			setState(354);
			match(T__9);
			setState(355);
			match(DIGITS);
			setState(356);
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
		enterRule(_localctx, 42, RULE_elseSphere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__13);
			setState(359);
			match(SPHEREDIMENSIONS);
			setState(360);
			match(T__9);
			setState(361);
			match(DIGITS);
			setState(362);
			match(T__10);
			setState(363);
			match(SPHEREDIMENSIONS);
			setState(364);
			match(T__9);
			setState(365);
			match(DIGITS);
			setState(366);
			match(T__10);
			setState(367);
			match(SPHEREDIMENSIONS);
			setState(368);
			match(T__9);
			setState(369);
			match(DIGITS);
			setState(370);
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
		enterRule(_localctx, 44, RULE_plane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__14);
			setState(373);
			match(DIMENSION3D);
			setState(374);
			match(T__9);
			setState(375);
			match(DIGITS);
			setState(376);
			match(T__10);
			setState(377);
			match(DIMENSION3D);
			setState(378);
			match(T__9);
			setState(379);
			match(DIGITS);
			setState(380);
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
		enterRule(_localctx, 46, RULE_relPane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__14);
			setState(383);
			match(DIMENSION3D);
			setState(384);
			match(T__9);
			setState(385);
			match(DIGITS);
			setState(386);
			match(T__10);
			setState(387);
			match(DIMENSION3D);
			setState(388);
			match(T__9);
			setState(389);
			match(DIGITS);
			setState(390);
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
		enterRule(_localctx, 48, RULE_ifPlane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__14);
			setState(393);
			match(DIMENSION3D);
			setState(394);
			match(T__9);
			setState(395);
			match(DIGITS);
			setState(396);
			match(T__10);
			setState(397);
			match(DIMENSION3D);
			setState(398);
			match(T__9);
			setState(399);
			match(DIGITS);
			setState(400);
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
		enterRule(_localctx, 50, RULE_elsePlane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__14);
			setState(403);
			match(DIMENSION3D);
			setState(404);
			match(T__9);
			setState(405);
			match(DIGITS);
			setState(406);
			match(T__10);
			setState(407);
			match(DIMENSION3D);
			setState(408);
			match(T__9);
			setState(409);
			match(DIGITS);
			setState(410);
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
		enterRule(_localctx, 52, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__15);
			setState(413);
			match(TEXTDIMDIGITS);
			setState(414);
			match(T__9);
			setState(415);
			match(DIGITS);
			setState(416);
			match(T__10);
			setState(417);
			match(TEXTDIMDIGITS);
			setState(418);
			match(T__9);
			setState(419);
			match(DIGITS);
			setState(420);
			match(T__10);
			setState(421);
			match(TEXTDIMDIGITS);
			setState(422);
			match(T__9);
			setState(423);
			match(DIGITS);
			setState(424);
			match(T__10);
			setState(425);
			match(TEXTDIMDIGITS);
			setState(426);
			match(T__9);
			setState(427);
			match(DIGITS);
			setState(428);
			match(T__10);
			setState(429);
			match(TEXTDIMSTRING);
			setState(430);
			match(T__9);
			setState(431);
			match(STRING);
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(432);
				match(T__10);
				setState(433);
				match(TEXTDIMSTRING);
				setState(434);
				match(T__9);
				setState(435);
				match(STRING);
				}
				break;
			}
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(438);
				match(T__10);
				setState(439);
				match(TEXTDIMSTRING);
				setState(440);
				match(T__9);
				setState(441);
				match(STRING);
				}
				break;
			}
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(444);
				match(T__10);
				setState(445);
				match(TEXTDIMSTRING);
				setState(446);
				match(T__9);
				setState(447);
				match(STRING);
				}
			}

			setState(450);
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
		enterRule(_localctx, 54, RULE_relText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__15);
			setState(453);
			match(TEXTDIMDIGITS);
			setState(454);
			match(T__9);
			setState(455);
			match(DIGITS);
			setState(456);
			match(T__10);
			setState(457);
			match(TEXTDIMDIGITS);
			setState(458);
			match(T__9);
			setState(459);
			match(DIGITS);
			setState(460);
			match(T__10);
			setState(461);
			match(TEXTDIMDIGITS);
			setState(462);
			match(T__9);
			setState(463);
			match(DIGITS);
			setState(464);
			match(T__10);
			setState(465);
			match(TEXTDIMDIGITS);
			setState(466);
			match(T__9);
			setState(467);
			match(DIGITS);
			setState(468);
			match(T__10);
			setState(469);
			match(TEXTDIMSTRING);
			setState(470);
			match(T__9);
			setState(471);
			match(STRING);
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(472);
				match(T__10);
				setState(473);
				match(TEXTDIMSTRING);
				setState(474);
				match(T__9);
				setState(475);
				match(STRING);
				}
				break;
			}
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(478);
				match(T__10);
				setState(479);
				match(TEXTDIMSTRING);
				setState(480);
				match(T__9);
				setState(481);
				match(STRING);
				}
				break;
			}
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(484);
				match(T__10);
				setState(485);
				match(TEXTDIMSTRING);
				setState(486);
				match(T__9);
				setState(487);
				match(STRING);
				}
			}

			setState(490);
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
		enterRule(_localctx, 56, RULE_ifText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__15);
			setState(493);
			match(TEXTDIMDIGITS);
			setState(494);
			match(T__9);
			setState(495);
			match(DIGITS);
			setState(496);
			match(T__10);
			setState(497);
			match(TEXTDIMDIGITS);
			setState(498);
			match(T__9);
			setState(499);
			match(DIGITS);
			setState(500);
			match(T__10);
			setState(501);
			match(TEXTDIMDIGITS);
			setState(502);
			match(T__9);
			setState(503);
			match(DIGITS);
			setState(504);
			match(T__10);
			setState(505);
			match(TEXTDIMDIGITS);
			setState(506);
			match(T__9);
			setState(507);
			match(DIGITS);
			setState(508);
			match(T__10);
			setState(509);
			match(TEXTDIMSTRING);
			setState(510);
			match(T__9);
			setState(511);
			match(STRING);
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(512);
				match(T__10);
				setState(513);
				match(TEXTDIMSTRING);
				setState(514);
				match(T__9);
				setState(515);
				match(STRING);
				}
				break;
			}
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(518);
				match(T__10);
				setState(519);
				match(TEXTDIMSTRING);
				setState(520);
				match(T__9);
				setState(521);
				match(STRING);
				}
				break;
			}
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(524);
				match(T__10);
				setState(525);
				match(TEXTDIMSTRING);
				setState(526);
				match(T__9);
				setState(527);
				match(STRING);
				}
			}

			setState(530);
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
		enterRule(_localctx, 58, RULE_elseText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(T__15);
			setState(533);
			match(TEXTDIMDIGITS);
			setState(534);
			match(T__9);
			setState(535);
			match(DIGITS);
			setState(536);
			match(T__10);
			setState(537);
			match(TEXTDIMDIGITS);
			setState(538);
			match(T__9);
			setState(539);
			match(DIGITS);
			setState(540);
			match(T__10);
			setState(541);
			match(TEXTDIMDIGITS);
			setState(542);
			match(T__9);
			setState(543);
			match(DIGITS);
			setState(544);
			match(T__10);
			setState(545);
			match(TEXTDIMDIGITS);
			setState(546);
			match(T__9);
			setState(547);
			match(DIGITS);
			setState(548);
			match(T__10);
			setState(549);
			match(TEXTDIMSTRING);
			setState(550);
			match(T__9);
			setState(551);
			match(STRING);
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(552);
				match(T__10);
				setState(553);
				match(TEXTDIMSTRING);
				setState(554);
				match(T__9);
				setState(555);
				match(STRING);
				}
				break;
			}
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(558);
				match(T__10);
				setState(559);
				match(TEXTDIMSTRING);
				setState(560);
				match(T__9);
				setState(561);
				match(STRING);
				}
				break;
			}
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(564);
				match(T__10);
				setState(565);
				match(TEXTDIMSTRING);
				setState(566);
				match(T__9);
				setState(567);
				match(STRING);
				}
			}

			setState(570);
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
		enterRule(_localctx, 60, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__16);
			setState(573);
			match(T__17);
			setState(574);
			match(DIGITS);
			setState(575);
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
		enterRule(_localctx, 62, RULE_ifLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(T__16);
			setState(578);
			match(T__17);
			setState(579);
			match(DIGITS);
			setState(580);
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
		enterRule(_localctx, 64, RULE_elseLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T__16);
			setState(583);
			match(T__17);
			setState(584);
			match(DIGITS);
			setState(585);
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
		enterRule(_localctx, 66, RULE_pen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T__18);
			setState(588);
			match(PENPARAMSBOOL);
			setState(589);
			match(T__9);
			setState(590);
			match(STRING);
			setState(591);
			match(T__10);
			setState(592);
			match(PENPARAMS);
			setState(593);
			match(T__9);
			setState(594);
			match(DIGITS);
			setState(595);
			match(T__10);
			setState(596);
			match(PENPARAMS);
			setState(597);
			match(T__9);
			setState(598);
			match(DIGITS);
			setState(599);
			match(T__10);
			setState(600);
			match(PENPARAMS);
			setState(601);
			match(T__9);
			setState(602);
			match(DIGITS);
			setState(603);
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
		enterRule(_localctx, 68, RULE_ifPen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(T__18);
			setState(606);
			match(PENPARAMSBOOL);
			setState(607);
			match(T__9);
			setState(608);
			match(STRING);
			setState(609);
			match(T__10);
			setState(610);
			match(PENPARAMS);
			setState(611);
			match(T__9);
			setState(612);
			match(DIGITS);
			setState(613);
			match(T__10);
			setState(614);
			match(PENPARAMS);
			setState(615);
			match(T__9);
			setState(616);
			match(DIGITS);
			setState(617);
			match(T__10);
			setState(618);
			match(PENPARAMS);
			setState(619);
			match(T__9);
			setState(620);
			match(DIGITS);
			setState(621);
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
		enterRule(_localctx, 70, RULE_elsePen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(T__18);
			setState(624);
			match(PENPARAMSBOOL);
			setState(625);
			match(T__9);
			setState(626);
			match(STRING);
			setState(627);
			match(T__10);
			setState(628);
			match(PENPARAMS);
			setState(629);
			match(T__9);
			setState(630);
			match(DIGITS);
			setState(631);
			match(T__10);
			setState(632);
			match(PENPARAMS);
			setState(633);
			match(T__9);
			setState(634);
			match(DIGITS);
			setState(635);
			match(T__10);
			setState(636);
			match(PENPARAMS);
			setState(637);
			match(T__9);
			setState(638);
			match(DIGITS);
			setState(639);
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
		enterRule(_localctx, 72, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(T__19);
			setState(642);
			match(STRING);
			setState(643);
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
		enterRule(_localctx, 74, RULE_ifColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(T__19);
			setState(646);
			match(STRING);
			setState(647);
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
		enterRule(_localctx, 76, RULE_elseColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(T__19);
			setState(650);
			match(STRING);
			setState(651);
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
		enterRule(_localctx, 78, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(T__20);
			setState(654);
			match(STRING);
			setState(655);
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
		enterRule(_localctx, 80, RULE_ifMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(T__20);
			setState(658);
			match(STRING);
			setState(659);
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
		enterRule(_localctx, 82, RULE_elseMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(T__20);
			setState(662);
			match(STRING);
			setState(663);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u029c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\6\2\\\n\2\r\2\16\2]\3\2\3\2\3\3\3\3\5\3d\n\3\3\3\3"+
		"\3\5\3h\n\3\3\3\5\3k\n\3\3\3\5\3n\n\3\3\3\3\3\5\3r\n\3\3\3\5\3u\n\3\3"+
		"\3\6\3x\n\3\r\3\16\3y\3\3\3\3\5\3~\n\3\3\3\5\3\u0081\n\3\3\3\6\3\u0084"+
		"\n\3\r\3\16\3\u0085\3\3\3\3\5\3\u008a\n\3\3\3\5\3\u008d\n\3\3\4\3\4\6"+
		"\4\u0091\n\4\r\4\16\4\u0092\3\4\3\4\6\4\u0097\n\4\r\4\16\4\u0098\3\4\3"+
		"\4\5\4\u009d\n\4\3\4\3\4\6\4\u00a1\n\4\r\4\16\4\u00a2\3\4\3\4\3\4\6\4"+
		"\u00a8\n\4\r\4\16\4\u00a9\3\4\3\4\5\4\u00ae\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\6\7\u00cf\n\7\r\7\16\7\u00d0\3\b\3\b"+
		"\3\b\6\b\u00d6\n\b\r\b\16\b\u00d7\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e1"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ea\n\n\3\13\3\13\5\13\u00ee\n"+
		"\13\3\f\3\f\3\f\3\f\5\f\u00f4\n\f\3\r\3\r\3\r\5\r\u00f9\n\r\3\16\3\16"+
		"\3\16\3\16\5\16\u00ff\n\16\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01b7\n\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01bd\n\34\3\34\3\34\3\34\3\34\5\34\u01c3\n\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01df\n\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01e5\n\35\3\35\3\35\3\35\3\35\5\35\u01eb\n\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0207\n\36"+
		"\3\36\3\36\3\36\3\36\5\36\u020d\n\36\3\36\3\36\3\36\3\36\5\36\u0213\n"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u022f"+
		"\n\37\3\37\3\37\3\37\3\37\5\37\u0235\n\37\3\37\3\37\3\37\3\37\5\37\u023b"+
		"\n\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3+\3+\3+\3+\3+\by\u0085\u0092\u0098\u00a2\u00a9\2,\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"\2\4\3\3$$\4\2!\"&&\2\u02b2\2[\3\2\2\2\4a\3\2\2\2\6\u008e\3\2\2\2\b\u00af"+
		"\3\2\2\2\n\u00bd\3\2\2\2\f\u00ce\3\2\2\2\16\u00d5\3\2\2\2\20\u00e0\3\2"+
		"\2\2\22\u00e9\3\2\2\2\24\u00ed\3\2\2\2\26\u00f3\3\2\2\2\30\u00f8\3\2\2"+
		"\2\32\u00fe\3\2\2\2\34\u0104\3\2\2\2\36\u0106\3\2\2\2 \u0114\3\2\2\2\""+
		"\u0122\3\2\2\2$\u0130\3\2\2\2&\u013e\3\2\2\2(\u014c\3\2\2\2*\u015a\3\2"+
		"\2\2,\u0168\3\2\2\2.\u0176\3\2\2\2\60\u0180\3\2\2\2\62\u018a\3\2\2\2\64"+
		"\u0194\3\2\2\2\66\u019e\3\2\2\28\u01c6\3\2\2\2:\u01ee\3\2\2\2<\u0216\3"+
		"\2\2\2>\u023e\3\2\2\2@\u0243\3\2\2\2B\u0248\3\2\2\2D\u024d\3\2\2\2F\u025f"+
		"\3\2\2\2H\u0271\3\2\2\2J\u0283\3\2\2\2L\u0287\3\2\2\2N\u028b\3\2\2\2P"+
		"\u028f\3\2\2\2R\u0293\3\2\2\2T\u0297\3\2\2\2V\\\5\24\13\2W\\\7$\2\2X\\"+
		"\5\4\3\2Y\\\5\b\5\2Z\\\5\n\6\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2"+
		"[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\t\2\2\2`\3\3\2\2"+
		"\2ac\5> \2bd\7$\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\7\3\2\2fh\7$\2\2g"+
		"f\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5J&\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln"+
		"\7$\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2oq\5\32\16\2pr\7$\2\2qp\3\2\2\2q"+
		"r\3\2\2\2rt\3\2\2\2su\5\32\16\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\7$\2\2"+
		"wv\3\2\2\2xy\3\2\2\2yz\3\2\2\2yw\3\2\2\2z{\3\2\2\2{}\7\4\2\2|~\7$\2\2"+
		"}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081\5J&\2\u0080\177\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\7$\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\5\34\17\2\u0088\u008a\7$\2\2\u0089\u0088\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5\34\17\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\5\3\2\2\2\u008e\u0090\5> \2\u008f"+
		"\u0091\7$\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\7\3\2\2\u0095"+
		"\u0097\7$\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\5\26\f\2\u009b"+
		"\u009d\5\26\f\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009e\u00a0\7\5\2\2\u009f\u00a1\7$\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\5\66\34\2\u00a5\u00a7\7\4\2\2\u00a6\u00a8\7$\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\5\26\f\2\u00ac\u00ae\5\26\f\2\u00ad"+
		"\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\7\3\2\2\2\u00af\u00b0\7\6\2\2"+
		"\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7%\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4"+
		"\7\7\2\2\u00b4\u00b5\7$\2\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\7$\2\2\u00b7"+
		"\u00b8\5\f\7\2\u00b8\u00b9\7$\2\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb\5\16"+
		"\b\2\u00bb\u00bc\7\n\2\2\u00bc\t\3\2\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf"+
		"\7!\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\t\3\2\2\u00c1\u00c2\7\r\2\2\u00c2"+
		"\u00c3\7 \2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\7\30\2\2\u00c5\u00c6\7\r"+
		"\2\2\u00c6\u00c7\7 \2\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\7\30\2\2\u00c9"+
		"\u00ca\7\16\2\2\u00ca\13\3\2\2\2\u00cb\u00cf\5\20\t\2\u00cc\u00cf\5\4"+
		"\3\2\u00cd\u00cf\7$\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\r\3\2\2\2\u00d2\u00d6\5\22\n\2\u00d3\u00d6\5\4\3\2\u00d4\u00d6"+
		"\7$\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\17\3\2\2"+
		"\2\u00d9\u00e1\5\"\22\2\u00da\u00e1\5*\26\2\u00db\u00e1\5\62\32\2\u00dc"+
		"\u00e1\5:\36\2\u00dd\u00e1\5L\'\2\u00de\u00e1\5R*\2\u00df\u00e1\5F$\2"+
		"\u00e0\u00d9\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dc"+
		"\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\21\3\2\2\2\u00e2\u00ea\5$\23\2\u00e3\u00ea\5,\27\2\u00e4\u00ea\5\64\33"+
		"\2\u00e5\u00ea\5<\37\2\u00e6\u00ea\5N(\2\u00e7\u00ea\5T+\2\u00e8\u00ea"+
		"\5H%\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9"+
		"\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2"+
		"\2\2\u00ea\23\3\2\2\2\u00eb\u00ee\5\26\f\2\u00ec\u00ee\5\30\r\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\25\3\2\2\2\u00ef\u00f4\5\36\20"+
		"\2\u00f0\u00f4\5&\24\2\u00f1\u00f4\5.\30\2\u00f2\u00f4\5\66\34\2\u00f3"+
		"\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2"+
		"\2\2\u00f4\27\3\2\2\2\u00f5\u00f9\5J&\2\u00f6\u00f9\5P)\2\u00f7\u00f9"+
		"\5D#\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\31\3\2\2\2\u00fa\u00ff\5 \21\2\u00fb\u00ff\5(\25\2\u00fc\u00ff\5\60\31"+
		"\2\u00fd\u00ff\58\35\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\33\3\2\2\2\u0100\u0105\5 \21\2\u0101"+
		"\u0105\5(\25\2\u0102\u0105\5\60\31\2\u0103\u0105\58\35\2\u0104\u0100\3"+
		"\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		"\35\3\2\2\2\u0106\u0107\7\17\2\2\u0107\u0108\7\32\2\2\u0108\u0109\7\f"+
		"\2\2\u0109\u010a\7\"\2\2\u010a\u010b\7\r\2\2\u010b\u010c\7\32\2\2\u010c"+
		"\u010d\7\f\2\2\u010d\u010e\7\"\2\2\u010e\u010f\7\r\2\2\u010f\u0110\7\32"+
		"\2\2\u0110\u0111\7\f\2\2\u0111\u0112\7\"\2\2\u0112\u0113\7\16\2\2\u0113"+
		"\37\3\2\2\2\u0114\u0115\7\17\2\2\u0115\u0116\7\32\2\2\u0116\u0117\7\f"+
		"\2\2\u0117\u0118\7\"\2\2\u0118\u0119\7\r\2\2\u0119\u011a\7\32\2\2\u011a"+
		"\u011b\7\f\2\2\u011b\u011c\7\"\2\2\u011c\u011d\7\r\2\2\u011d\u011e\7\32"+
		"\2\2\u011e\u011f\7\f\2\2\u011f\u0120\7\"\2\2\u0120\u0121\7\16\2\2\u0121"+
		"!\3\2\2\2\u0122\u0123\7\17\2\2\u0123\u0124\7\32\2\2\u0124\u0125\7\f\2"+
		"\2\u0125\u0126\7\"\2\2\u0126\u0127\7\r\2\2\u0127\u0128\7\32\2\2\u0128"+
		"\u0129\7\f\2\2\u0129\u012a\7\"\2\2\u012a\u012b\7\r\2\2\u012b\u012c\7\32"+
		"\2\2\u012c\u012d\7\f\2\2\u012d\u012e\7\"\2\2\u012e\u012f\7\16\2\2\u012f"+
		"#\3\2\2\2\u0130\u0131\7\17\2\2\u0131\u0132\7\32\2\2\u0132\u0133\7\f\2"+
		"\2\u0133\u0134\7\"\2\2\u0134\u0135\7\r\2\2\u0135\u0136\7\32\2\2\u0136"+
		"\u0137\7\f\2\2\u0137\u0138\7\"\2\2\u0138\u0139\7\r\2\2\u0139\u013a\7\32"+
		"\2\2\u013a\u013b\7\f\2\2\u013b\u013c\7\"\2\2\u013c\u013d\7\16\2\2\u013d"+
		"%\3\2\2\2\u013e\u013f\7\20\2\2\u013f\u0140\7\31\2\2\u0140\u0141\7\f\2"+
		"\2\u0141\u0142\7\"\2\2\u0142\u0143\7\r\2\2\u0143\u0144\7\31\2\2\u0144"+
		"\u0145\7\f\2\2\u0145\u0146\7\"\2\2\u0146\u0147\7\r\2\2\u0147\u0148\7\31"+
		"\2\2\u0148\u0149\7\f\2\2\u0149\u014a\7\"\2\2\u014a\u014b\7\16\2\2\u014b"+
		"\'\3\2\2\2\u014c\u014d\7\20\2\2\u014d\u014e\7\31\2\2\u014e\u014f\7\f\2"+
		"\2\u014f\u0150\7\"\2\2\u0150\u0151\7\r\2\2\u0151\u0152\7\31\2\2\u0152"+
		"\u0153\7\f\2\2\u0153\u0154\7\"\2\2\u0154\u0155\7\r\2\2\u0155\u0156\7\31"+
		"\2\2\u0156\u0157\7\f\2\2\u0157\u0158\7\"\2\2\u0158\u0159\7\16\2\2\u0159"+
		")\3\2\2\2\u015a\u015b\7\20\2\2\u015b\u015c\7\31\2\2\u015c\u015d\7\f\2"+
		"\2\u015d\u015e\7\"\2\2\u015e\u015f\7\r\2\2\u015f\u0160\7\31\2\2\u0160"+
		"\u0161\7\f\2\2\u0161\u0162\7\"\2\2\u0162\u0163\7\r\2\2\u0163\u0164\7\31"+
		"\2\2\u0164\u0165\7\f\2\2\u0165\u0166\7\"\2\2\u0166\u0167\7\16\2\2\u0167"+
		"+\3\2\2\2\u0168\u0169\7\20\2\2\u0169\u016a\7\31\2\2\u016a\u016b\7\f\2"+
		"\2\u016b\u016c\7\"\2\2\u016c\u016d\7\r\2\2\u016d\u016e\7\31\2\2\u016e"+
		"\u016f\7\f\2\2\u016f\u0170\7\"\2\2\u0170\u0171\7\r\2\2\u0171\u0172\7\31"+
		"\2\2\u0172\u0173\7\f\2\2\u0173\u0174\7\"\2\2\u0174\u0175\7\16\2\2\u0175"+
		"-\3\2\2\2\u0176\u0177\7\21\2\2\u0177\u0178\7\32\2\2\u0178\u0179\7\f\2"+
		"\2\u0179\u017a\7\"\2\2\u017a\u017b\7\r\2\2\u017b\u017c\7\32\2\2\u017c"+
		"\u017d\7\f\2\2\u017d\u017e\7\"\2\2\u017e\u017f\7\16\2\2\u017f/\3\2\2\2"+
		"\u0180\u0181\7\21\2\2\u0181\u0182\7\32\2\2\u0182\u0183\7\f\2\2\u0183\u0184"+
		"\7\"\2\2\u0184\u0185\7\r\2\2\u0185\u0186\7\32\2\2\u0186\u0187\7\f\2\2"+
		"\u0187\u0188\7\"\2\2\u0188\u0189\7\16\2\2\u0189\61\3\2\2\2\u018a\u018b"+
		"\7\21\2\2\u018b\u018c\7\32\2\2\u018c\u018d\7\f\2\2\u018d\u018e\7\"\2\2"+
		"\u018e\u018f\7\r\2\2\u018f\u0190\7\32\2\2\u0190\u0191\7\f\2\2\u0191\u0192"+
		"\7\"\2\2\u0192\u0193\7\16\2\2\u0193\63\3\2\2\2\u0194\u0195\7\21\2\2\u0195"+
		"\u0196\7\32\2\2\u0196\u0197\7\f\2\2\u0197\u0198\7\"\2\2\u0198\u0199\7"+
		"\r\2\2\u0199\u019a\7\32\2\2\u019a\u019b\7\f\2\2\u019b\u019c\7\"\2\2\u019c"+
		"\u019d\7\16\2\2\u019d\65\3\2\2\2\u019e\u019f\7\22\2\2\u019f\u01a0\7\34"+
		"\2\2\u01a0\u01a1\7\f\2\2\u01a1\u01a2\7\"\2\2\u01a2\u01a3\7\r\2\2\u01a3"+
		"\u01a4\7\34\2\2\u01a4\u01a5\7\f\2\2\u01a5\u01a6\7\"\2\2\u01a6\u01a7\7"+
		"\r\2\2\u01a7\u01a8\7\34\2\2\u01a8\u01a9\7\f\2\2\u01a9\u01aa\7\"\2\2\u01aa"+
		"\u01ab\7\r\2\2\u01ab\u01ac\7\34\2\2\u01ac\u01ad\7\f\2\2\u01ad\u01ae\7"+
		"\"\2\2\u01ae\u01af\7\r\2\2\u01af\u01b0\7\35\2\2\u01b0\u01b1\7\f\2\2\u01b1"+
		"\u01b6\7!\2\2\u01b2\u01b3\7\r\2\2\u01b3\u01b4\7\35\2\2\u01b4\u01b5\7\f"+
		"\2\2\u01b5\u01b7\7!\2\2\u01b6\u01b2\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01bc\3\2\2\2\u01b8\u01b9\7\r\2\2\u01b9\u01ba\7\35\2\2\u01ba\u01bb\7"+
		"\f\2\2\u01bb\u01bd\7!\2\2\u01bc\u01b8\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01c2\3\2\2\2\u01be\u01bf\7\r\2\2\u01bf\u01c0\7\35\2\2\u01c0\u01c1\7"+
		"\f\2\2\u01c1\u01c3\7!\2\2\u01c2\u01be\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\7\16\2\2\u01c5\67\3\2\2\2\u01c6\u01c7\7\22"+
		"\2\2\u01c7\u01c8\7\34\2\2\u01c8\u01c9\7\f\2\2\u01c9\u01ca\7\"\2\2\u01ca"+
		"\u01cb\7\r\2\2\u01cb\u01cc\7\34\2\2\u01cc\u01cd\7\f\2\2\u01cd\u01ce\7"+
		"\"\2\2\u01ce\u01cf\7\r\2\2\u01cf\u01d0\7\34\2\2\u01d0\u01d1\7\f\2\2\u01d1"+
		"\u01d2\7\"\2\2\u01d2\u01d3\7\r\2\2\u01d3\u01d4\7\34\2\2\u01d4\u01d5\7"+
		"\f\2\2\u01d5\u01d6\7\"\2\2\u01d6\u01d7\7\r\2\2\u01d7\u01d8\7\35\2\2\u01d8"+
		"\u01d9\7\f\2\2\u01d9\u01de\7!\2\2\u01da\u01db\7\r\2\2\u01db\u01dc\7\35"+
		"\2\2\u01dc\u01dd\7\f\2\2\u01dd\u01df\7!\2\2\u01de\u01da\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e4\3\2\2\2\u01e0\u01e1\7\r\2\2\u01e1\u01e2\7\35"+
		"\2\2\u01e2\u01e3\7\f\2\2\u01e3\u01e5\7!\2\2\u01e4\u01e0\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01ea\3\2\2\2\u01e6\u01e7\7\r\2\2\u01e7\u01e8\7\35"+
		"\2\2\u01e8\u01e9\7\f\2\2\u01e9\u01eb\7!\2\2\u01ea\u01e6\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7\16\2\2\u01ed9\3\2\2\2"+
		"\u01ee\u01ef\7\22\2\2\u01ef\u01f0\7\34\2\2\u01f0\u01f1\7\f\2\2\u01f1\u01f2"+
		"\7\"\2\2\u01f2\u01f3\7\r\2\2\u01f3\u01f4\7\34\2\2\u01f4\u01f5\7\f\2\2"+
		"\u01f5\u01f6\7\"\2\2\u01f6\u01f7\7\r\2\2\u01f7\u01f8\7\34\2\2\u01f8\u01f9"+
		"\7\f\2\2\u01f9\u01fa\7\"\2\2\u01fa\u01fb\7\r\2\2\u01fb\u01fc\7\34\2\2"+
		"\u01fc\u01fd\7\f\2\2\u01fd\u01fe\7\"\2\2\u01fe\u01ff\7\r\2\2\u01ff\u0200"+
		"\7\35\2\2\u0200\u0201\7\f\2\2\u0201\u0206\7!\2\2\u0202\u0203\7\r\2\2\u0203"+
		"\u0204\7\35\2\2\u0204\u0205\7\f\2\2\u0205\u0207\7!\2\2\u0206\u0202\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\u020c\3\2\2\2\u0208\u0209\7\r\2\2\u0209"+
		"\u020a\7\35\2\2\u020a\u020b\7\f\2\2\u020b\u020d\7!\2\2\u020c\u0208\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u0212\3\2\2\2\u020e\u020f\7\r\2\2\u020f"+
		"\u0210\7\35\2\2\u0210\u0211\7\f\2\2\u0211\u0213\7!\2\2\u0212\u020e\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\7\16\2\2\u0215"+
		";\3\2\2\2\u0216\u0217\7\22\2\2\u0217\u0218\7\34\2\2\u0218\u0219\7\f\2"+
		"\2\u0219\u021a\7\"\2\2\u021a\u021b\7\r\2\2\u021b\u021c\7\34\2\2\u021c"+
		"\u021d\7\f\2\2\u021d\u021e\7\"\2\2\u021e\u021f\7\r\2\2\u021f\u0220\7\34"+
		"\2\2\u0220\u0221\7\f\2\2\u0221\u0222\7\"\2\2\u0222\u0223\7\r\2\2\u0223"+
		"\u0224\7\34\2\2\u0224\u0225\7\f\2\2\u0225\u0226\7\"\2\2\u0226\u0227\7"+
		"\r\2\2\u0227\u0228\7\35\2\2\u0228\u0229\7\f\2\2\u0229\u022e\7!\2\2\u022a"+
		"\u022b\7\r\2\2\u022b\u022c\7\35\2\2\u022c\u022d\7\f\2\2\u022d\u022f\7"+
		"!\2\2\u022e\u022a\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0234\3\2\2\2\u0230"+
		"\u0231\7\r\2\2\u0231\u0232\7\35\2\2\u0232\u0233\7\f\2\2\u0233\u0235\7"+
		"!\2\2\u0234\u0230\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u023a\3\2\2\2\u0236"+
		"\u0237\7\r\2\2\u0237\u0238\7\35\2\2\u0238\u0239\7\f\2\2\u0239\u023b\7"+
		"!\2\2\u023a\u0236\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023d\7\16\2\2\u023d=\3\2\2\2\u023e\u023f\7\23\2\2\u023f\u0240\7\24\2"+
		"\2\u0240\u0241\7\"\2\2\u0241\u0242\7\16\2\2\u0242?\3\2\2\2\u0243\u0244"+
		"\7\23\2\2\u0244\u0245\7\24\2\2\u0245\u0246\7\"\2\2\u0246\u0247\7\16\2"+
		"\2\u0247A\3\2\2\2\u0248\u0249\7\23\2\2\u0249\u024a\7\24\2\2\u024a\u024b"+
		"\7\"\2\2\u024b\u024c\7\16\2\2\u024cC\3\2\2\2\u024d\u024e\7\25\2\2\u024e"+
		"\u024f\7\36\2\2\u024f\u0250\7\f\2\2\u0250\u0251\7!\2\2\u0251\u0252\7\r"+
		"\2\2\u0252\u0253\7\37\2\2\u0253\u0254\7\f\2\2\u0254\u0255\7\"\2\2\u0255"+
		"\u0256\7\r\2\2\u0256\u0257\7\37\2\2\u0257\u0258\7\f\2\2\u0258\u0259\7"+
		"\"\2\2\u0259\u025a\7\r\2\2\u025a\u025b\7\37\2\2\u025b\u025c\7\f\2\2\u025c"+
		"\u025d\7\"\2\2\u025d\u025e\7\16\2\2\u025eE\3\2\2\2\u025f\u0260\7\25\2"+
		"\2\u0260\u0261\7\36\2\2\u0261\u0262\7\f\2\2\u0262\u0263\7!\2\2\u0263\u0264"+
		"\7\r\2\2\u0264\u0265\7\37\2\2\u0265\u0266\7\f\2\2\u0266\u0267\7\"\2\2"+
		"\u0267\u0268\7\r\2\2\u0268\u0269\7\37\2\2\u0269\u026a\7\f\2\2\u026a\u026b"+
		"\7\"\2\2\u026b\u026c\7\r\2\2\u026c\u026d\7\37\2\2\u026d\u026e\7\f\2\2"+
		"\u026e\u026f\7\"\2\2\u026f\u0270\7\16\2\2\u0270G\3\2\2\2\u0271\u0272\7"+
		"\25\2\2\u0272\u0273\7\36\2\2\u0273\u0274\7\f\2\2\u0274\u0275\7!\2\2\u0275"+
		"\u0276\7\r\2\2\u0276\u0277\7\37\2\2\u0277\u0278\7\f\2\2\u0278\u0279\7"+
		"\"\2\2\u0279\u027a\7\r\2\2\u027a\u027b\7\37\2\2\u027b\u027c\7\f\2\2\u027c"+
		"\u027d\7\"\2\2\u027d\u027e\7\r\2\2\u027e\u027f\7\37\2\2\u027f\u0280\7"+
		"\f\2\2\u0280\u0281\7\"\2\2\u0281\u0282\7\16\2\2\u0282I\3\2\2\2\u0283\u0284"+
		"\7\26\2\2\u0284\u0285\7!\2\2\u0285\u0286\7\16\2\2\u0286K\3\2\2\2\u0287"+
		"\u0288\7\26\2\2\u0288\u0289\7!\2\2\u0289\u028a\7\16\2\2\u028aM\3\2\2\2"+
		"\u028b\u028c\7\26\2\2\u028c\u028d\7!\2\2\u028d\u028e\7\16\2\2\u028eO\3"+
		"\2\2\2\u028f\u0290\7\27\2\2\u0290\u0291\7!\2\2\u0291\u0292\7\16\2\2\u0292"+
		"Q\3\2\2\2\u0293\u0294\7\27\2\2\u0294\u0295\7!\2\2\u0295\u0296\7\16\2\2"+
		"\u0296S\3\2\2\2\u0297\u0298\7\27\2\2\u0298\u0299\7!\2\2\u0299\u029a\7"+
		"\16\2\2\u029aU\3\2\2\2-[]cgjmqty}\u0080\u0085\u0089\u008c\u0092\u0098"+
		"\u009c\u00a2\u00a9\u00ad\u00ce\u00d0\u00d5\u00d7\u00e0\u00e9\u00ed\u00f3"+
		"\u00f8\u00fe\u0104\u01b6\u01bc\u01c2\u01de\u01e4\u01ea\u0206\u020c\u0212"+
		"\u022e\u0234\u023a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}