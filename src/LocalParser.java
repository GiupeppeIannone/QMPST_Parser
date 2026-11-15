// Generated from ./src/Local.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LocalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BASETYPE=10, TYPEVAR=11, END=12, ID=13, WS=14;
	public static final int
		RULE_local = 0, RULE_labelSet = 1, RULE_labelType = 2, RULE_label = 3, 
		RULE_participant = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"local", "labelSet", "labelType", "label", "participant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'\\u2295'", "'\\u03BC'", "'.'", "'{'", "','", "'}'", "'('", 
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
	public String getGrammarFileName() { return "Local.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LocalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalContext extends ParserRuleContext {
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
	 
		public LocalContext() { }
		public void copyFrom(LocalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends LocalContext {
		public TerminalNode TYPEVAR() { return getToken(LocalParser.TYPEVAR, 0); }
		public VariableContext(LocalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReceiveContext extends LocalContext {
		public ParticipantContext participant() {
			return getRuleContext(ParticipantContext.class,0);
		}
		public LabelSetContext labelSet() {
			return getRuleContext(LabelSetContext.class,0);
		}
		public ReceiveContext(LocalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterReceive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitReceive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitReceive(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends LocalContext {
		public TerminalNode END() { return getToken(LocalParser.END, 0); }
		public EndContext(LocalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecursionContext extends LocalContext {
		public TerminalNode TYPEVAR() { return getToken(LocalParser.TYPEVAR, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public RecursionContext(LocalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterRecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitRecursion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitRecursion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SendContext extends LocalContext {
		public ParticipantContext participant() {
			return getRuleContext(ParticipantContext.class,0);
		}
		public LabelSetContext labelSet() {
			return getRuleContext(LabelSetContext.class,0);
		}
		public SendContext(LocalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterSend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitSend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitSend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_local);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ReceiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				participant();
				setState(11);
				match(T__0);
				setState(12);
				labelSet();
				}
				break;
			case 2:
				_localctx = new SendContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				participant();
				setState(15);
				match(T__1);
				setState(16);
				labelSet();
				}
				break;
			case 3:
				_localctx = new RecursionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(T__2);
				setState(19);
				match(TYPEVAR);
				setState(20);
				match(T__3);
				setState(21);
				local();
				}
				break;
			case 4:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				match(TYPEVAR);
				}
				break;
			case 5:
				_localctx = new EndContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(23);
				match(END);
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
	public static class LabelSetContext extends ParserRuleContext {
		public LabelSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelSet; }
	 
		public LabelSetContext() { }
		public void copyFrom(LabelSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultipleContext extends LabelSetContext {
		public List<LabelTypeContext> labelType() {
			return getRuleContexts(LabelTypeContext.class);
		}
		public LabelTypeContext labelType(int i) {
			return getRuleContext(LabelTypeContext.class,i);
		}
		public MultipleContext(LabelSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitMultiple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleChoiceContext extends LabelSetContext {
		public LabelTypeContext labelType() {
			return getRuleContext(LabelTypeContext.class,0);
		}
		public SingleChoiceContext(LabelSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterSingleChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitSingleChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitSingleChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelSetContext labelSet() throws RecognitionException {
		LabelSetContext _localctx = new LabelSetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_labelSet);
		int _la;
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new MultipleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__4);
				setState(27);
				labelType();
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(28);
					match(T__5);
					setState(29);
					labelType();
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(34);
				match(T__6);
				}
				break;
			case T__7:
			case ID:
				_localctx = new SingleChoiceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
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
		public TerminalNode BASETYPE() { return getToken(LocalParser.BASETYPE, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public Label1Context(LabelTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterLabel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitLabel1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitLabel1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label3Context extends LabelTypeContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public Label3Context(LabelTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterLabel3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitLabel3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitLabel3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label2Context extends LabelTypeContext {
		public TerminalNode BASETYPE() { return getToken(LocalParser.BASETYPE, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public Label2Context(LabelTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterLabel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitLabel2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitLabel2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelTypeContext labelType() throws RecognitionException {
		LabelTypeContext _localctx = new LabelTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_labelType);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Label1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				label();
				setState(40);
				match(T__7);
				setState(41);
				match(BASETYPE);
				setState(42);
				match(T__8);
				setState(43);
				match(T__3);
				setState(44);
				local();
				}
				break;
			case 2:
				_localctx = new Label2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__7);
				setState(47);
				match(BASETYPE);
				setState(48);
				match(T__8);
				setState(49);
				match(T__3);
				setState(50);
				local();
				}
				break;
			case 3:
				_localctx = new Label3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				label();
				setState(52);
				match(T__3);
				setState(53);
				local();
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
		public TerminalNode ID() { return getToken(LocalParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
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
		public TerminalNode ID() { return getToken(LocalParser.ID, 0); }
		public ParticipantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).enterParticipant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LocalListener ) ((LocalListener)listener).exitParticipant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LocalVisitor ) return ((LocalVisitor<? extends T>)visitor).visitParticipant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParticipantContext participant() throws RecognitionException {
		ParticipantContext _localctx = new ParticipantContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_participant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		"\u0004\u0001\u000e>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001\u001f\b\u0001\u000b\u0001\f\u0001 \u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0000@\u0000\u0018\u0001\u0000\u0000\u0000\u0002"+
		"%\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u00069\u0001"+
		"\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n\u000b\u0003\b\u0004\u0000"+
		"\u000b\f\u0005\u0001\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u0019\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0003\b\u0004\u0000\u000f\u0010\u0005\u0002"+
		"\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0019\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0005\u0003\u0000\u0000\u0013\u0014\u0005\u000b"+
		"\u0000\u0000\u0014\u0015\u0005\u0004\u0000\u0000\u0015\u0019\u0003\u0000"+
		"\u0000\u0000\u0016\u0019\u0005\u000b\u0000\u0000\u0017\u0019\u0005\f\u0000"+
		"\u0000\u0018\n\u0001\u0000\u0000\u0000\u0018\u000e\u0001\u0000\u0000\u0000"+
		"\u0018\u0012\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u0001\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0005\u0005\u0000\u0000\u001b\u001e\u0003\u0004\u0002\u0000"+
		"\u001c\u001d\u0005\u0006\u0000\u0000\u001d\u001f\u0003\u0004\u0002\u0000"+
		"\u001e\u001c\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0005\u0007\u0000\u0000#&\u0001\u0000\u0000\u0000$&\u0003\u0004"+
		"\u0002\u0000%\u001a\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000"+
		"&\u0003\u0001\u0000\u0000\u0000\'(\u0003\u0006\u0003\u0000()\u0005\b\u0000"+
		"\u0000)*\u0005\n\u0000\u0000*+\u0005\t\u0000\u0000+,\u0005\u0004\u0000"+
		"\u0000,-\u0003\u0000\u0000\u0000-8\u0001\u0000\u0000\u0000./\u0005\b\u0000"+
		"\u0000/0\u0005\n\u0000\u000001\u0005\t\u0000\u000012\u0005\u0004\u0000"+
		"\u000028\u0003\u0000\u0000\u000034\u0003\u0006\u0003\u000045\u0005\u0004"+
		"\u0000\u000056\u0003\u0000\u0000\u000068\u0001\u0000\u0000\u00007\'\u0001"+
		"\u0000\u0000\u00007.\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u0000"+
		"8\u0005\u0001\u0000\u0000\u00009:\u0005\r\u0000\u0000:\u0007\u0001\u0000"+
		"\u0000\u0000;<\u0005\r\u0000\u0000<\t\u0001\u0000\u0000\u0000\u0004\u0018"+
		" %7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}