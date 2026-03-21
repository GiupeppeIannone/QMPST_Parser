// Generated from ./src/Global.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GlobalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BASETYPE=10, TYPEVAR=11, END=12, ID=13, WS=14;
	public static final int
		RULE_prog = 0, RULE_global = 1, RULE_labelTypeSet = 2, RULE_labelType = 3, 
		RULE_label = 4, RULE_participant = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "global", "labelTypeSet", "labelType", "label", "participant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "':'", "'\\u03BC'", "'.'", "'{'", "','", "'}'", "'('", 
			"')'", null, null, "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "BASETYPE", 
			"TYPEVAR", "END", "ID", "WS"
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
	public String getGrammarFileName() { return "Global.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GlobalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GlobalParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			global();
			setState(13);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalContext extends ParserRuleContext {
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
	 
		public GlobalContext() { }
		public void copyFrom(GlobalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends GlobalContext {
		public TerminalNode TYPEVAR() { return getToken(GlobalParser.TYPEVAR, 0); }
		public VariableContext(GlobalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TransmissionContext extends GlobalContext {
		public List<ParticipantContext> participant() {
			return getRuleContexts(ParticipantContext.class);
		}
		public ParticipantContext participant(int i) {
			return getRuleContext(ParticipantContext.class,i);
		}
		public LabelTypeSetContext labelTypeSet() {
			return getRuleContext(LabelTypeSetContext.class,0);
		}
		public TransmissionContext(GlobalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterTransmission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitTransmission(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitTransmission(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends GlobalContext {
		public TerminalNode END() { return getToken(GlobalParser.END, 0); }
		public EndContext(GlobalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecursionContext extends GlobalContext {
		public TerminalNode TYPEVAR() { return getToken(GlobalParser.TYPEVAR, 0); }
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public RecursionContext(GlobalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterRecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitRecursion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitRecursion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new TransmissionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				participant();
				setState(16);
				match(T__0);
				setState(17);
				participant();
				setState(18);
				match(T__1);
				setState(19);
				labelTypeSet();
				}
				break;
			case T__2:
				_localctx = new RecursionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(T__2);
				setState(22);
				match(TYPEVAR);
				setState(23);
				match(T__3);
				setState(24);
				global();
				}
				break;
			case TYPEVAR:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(TYPEVAR);
				}
				break;
			case END:
				_localctx = new EndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelTypeSetContext extends ParserRuleContext {
		public LabelTypeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelTypeSet; }
	 
		public LabelTypeSetContext() { }
		public void copyFrom(LabelTypeSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends LabelTypeSetContext {
		public List<LabelTypeContext> labelType() {
			return getRuleContexts(LabelTypeContext.class);
		}
		public LabelTypeContext labelType(int i) {
			return getRuleContext(LabelTypeContext.class,i);
		}
		public MultContext(LabelTypeSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleContext extends LabelTypeSetContext {
		public LabelTypeContext labelType() {
			return getRuleContext(LabelTypeContext.class,0);
		}
		public SingleContext(LabelTypeSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelTypeSetContext labelTypeSet() throws RecognitionException {
		LabelTypeSetContext _localctx = new LabelTypeSetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_labelTypeSet);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__4);
				setState(30);
				labelType();
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					match(T__5);
					setState(32);
					labelType();
					}
					}
					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(37);
				match(T__6);
				}
				break;
			case T__7:
			case ID:
				_localctx = new SingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				labelType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelTypeContext extends ParserRuleContext {
		public LabelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelType; }
	 
		public LabelTypeContext() { }
		public void copyFrom(LabelTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label1Context extends LabelTypeContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode BASETYPE() { return getToken(GlobalParser.BASETYPE, 0); }
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public Label1Context(LabelTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterLabel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitLabel1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitLabel1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label3Context extends LabelTypeContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public Label3Context(LabelTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterLabel3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitLabel3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitLabel3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label2Context extends LabelTypeContext {
		public TerminalNode BASETYPE() { return getToken(GlobalParser.BASETYPE, 0); }
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public Label2Context(LabelTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterLabel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitLabel2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitLabel2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelTypeContext labelType() throws RecognitionException {
		LabelTypeContext _localctx = new LabelTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_labelType);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Label1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				label();
				setState(43);
				match(T__7);
				setState(44);
				match(BASETYPE);
				setState(45);
				match(T__8);
				setState(46);
				match(T__3);
				setState(47);
				global();
				}
				break;
			case 2:
				_localctx = new Label2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__7);
				setState(50);
				match(BASETYPE);
				setState(51);
				match(T__8);
				setState(52);
				match(T__3);
				setState(53);
				global();
				}
				break;
			case 3:
				_localctx = new Label3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				label();
				setState(55);
				match(T__3);
				setState(56);
				global();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GlobalParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParticipantContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GlobalParser.ID, 0); }
		public ParticipantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).enterParticipant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GlobalListener ) ((GlobalListener)listener).exitParticipant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GlobalVisitor ) return ((GlobalVisitor<? extends T>)visitor).visitParticipant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParticipantContext participant() throws RecognitionException {
		ParticipantContext _localctx = new ParticipantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_participant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ID);
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
		"\u0004\u0001\u000eA\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\""+
		"\b\u0002\u000b\u0002\f\u0002#\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002)\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003;\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000A\u0000"+
		"\f\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004("+
		"\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b<\u0001\u0000"+
		"\u0000\u0000\n>\u0001\u0000\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r"+
		"\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0003\n\u0005\u0000\u0010\u0011\u0005\u0001\u0000\u0000\u0011\u0012"+
		"\u0003\n\u0005\u0000\u0012\u0013\u0005\u0002\u0000\u0000\u0013\u0014\u0003"+
		"\u0004\u0002\u0000\u0014\u001c\u0001\u0000\u0000\u0000\u0015\u0016\u0005"+
		"\u0003\u0000\u0000\u0016\u0017\u0005\u000b\u0000\u0000\u0017\u0018\u0005"+
		"\u0004\u0000\u0000\u0018\u001c\u0003\u0002\u0001\u0000\u0019\u001c\u0005"+
		"\u000b\u0000\u0000\u001a\u001c\u0005\f\u0000\u0000\u001b\u000f\u0001\u0000"+
		"\u0000\u0000\u001b\u0015\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000"+
		"\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005\u0005\u0000\u0000\u001e!\u0003\u0006\u0003"+
		"\u0000\u001f \u0005\u0006\u0000\u0000 \"\u0003\u0006\u0003\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0005\u0007"+
		"\u0000\u0000&)\u0001\u0000\u0000\u0000\')\u0003\u0006\u0003\u0000(\u001d"+
		"\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0005\u0001\u0000"+
		"\u0000\u0000*+\u0003\b\u0004\u0000+,\u0005\b\u0000\u0000,-\u0005\n\u0000"+
		"\u0000-.\u0005\t\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0003\u0002\u0001"+
		"\u00000;\u0001\u0000\u0000\u000012\u0005\b\u0000\u000023\u0005\n\u0000"+
		"\u000034\u0005\t\u0000\u000045\u0005\u0004\u0000\u00005;\u0003\u0002\u0001"+
		"\u000067\u0003\b\u0004\u000078\u0005\u0004\u0000\u000089\u0003\u0002\u0001"+
		"\u00009;\u0001\u0000\u0000\u0000:*\u0001\u0000\u0000\u0000:1\u0001\u0000"+
		"\u0000\u0000:6\u0001\u0000\u0000\u0000;\u0007\u0001\u0000\u0000\u0000"+
		"<=\u0005\r\u0000\u0000=\t\u0001\u0000\u0000\u0000>?\u0005\r\u0000\u0000"+
		"?\u000b\u0001\u0000\u0000\u0000\u0004\u001b#(:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}