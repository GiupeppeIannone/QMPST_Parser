// Generated from c:/Users/Admin/OneDrive/Desktop/UNI/Tirocinio/Workspace/QMPST_Parser/src/Program.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, UNITOP=24, 
		PROCNAME=25, OP=26, CONSTANT=27, QREF=28, VAR=29, ID=30, WS=31;
	public static final int
		RULE_prog = 0, RULE_multipartySystems = 1, RULE_process = 2, RULE_expression = 3, 
		RULE_quantum = 4, RULE_label = 5, RULE_participant = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "multipartySystems", "process", "expression", "quantum", "label", 
			"participant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'\\u25B7'", "'new'", "'.'", "':='", "'meas'", "'&'", "'{'", 
			"'('", "')'", "','", "'}'", "'\\u2295'", "'<'", "'>'", "'if'", "'then'", 
			"'else'", "'def'", "'='", "'in'", "'0'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"UNITOP", "PROCNAME", "OP", "CONSTANT", "QREF", "VAR", "ID", "WS"
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
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<MultipartySystemsContext> multipartySystems() {
			return getRuleContexts(MultipartySystemsContext.class);
		}
		public MultipartySystemsContext multipartySystems(int i) {
			return getRuleContext(MultipartySystemsContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ProgramParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(14);
					multipartySystems();
					setState(15);
					match(T__0);
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(22);
			multipartySystems();
			setState(23);
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
	public static class MultipartySystemsContext extends ParserRuleContext {
		public ParticipantContext participant() {
			return getRuleContext(ParticipantContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public MultipartySystemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartySystems; }
	}

	public final MultipartySystemsContext multipartySystems() throws RecognitionException {
		MultipartySystemsContext _localctx = new MultipartySystemsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multipartySystems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			participant();
			setState(26);
			match(T__1);
			setState(27);
			process();
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
	public static class ProcessContext extends ParserRuleContext {
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
	 
		public ProcessContext() { }
		public void copyFrom(ProcessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MeasurementContext extends ProcessContext {
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public QuantumContext quantum() {
			return getRuleContext(QuantumContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public MeasurementContext(ProcessContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BranchingContext extends ProcessContext {
		public ParticipantContext participant() {
			return getRuleContext(ParticipantContext.class,0);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(ProgramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProgramParser.VAR, i);
		}
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public BranchingContext(ProcessContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ProcessContext {
		public TerminalNode PROCNAME() { return getToken(ProgramParser.PROCNAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallContext(ProcessContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitaryOpContext extends ProcessContext {
		public TerminalNode UNITOP() { return getToken(ProgramParser.UNITOP, 0); }
		public QuantumContext quantum() {
			return getRuleContext(QuantumContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public UnitaryOpContext(ProcessContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QbGenerationContext extends ProcessContext {
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public QbGenerationContext(ProcessContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectionContext extends ProcessContext {
		public ParticipantContext participant() {
			return getRuleContext(ParticipantContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public SelectionContext(ProcessContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ProcessContext {
		public TerminalNode PROCNAME() { return getToken(ProgramParser.PROCNAME, 0); }
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public DefinitionContext(ProcessContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InactionContext extends ProcessContext {
		public QuantumContext quantum() {
			return getRuleContext(QuantumContext.class,0);
		}
		public InactionContext(ProcessContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ProcessContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public ConditionalContext(ProcessContext ctx) { copyFrom(ctx); }
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_process);
		try {
			int _alt;
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new QbGenerationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__2);
				setState(30);
				match(VAR);
				setState(31);
				match(T__3);
				setState(32);
				process();
				}
				break;
			case 2:
				_localctx = new MeasurementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(VAR);
				setState(34);
				match(T__4);
				setState(35);
				match(T__5);
				setState(36);
				quantum();
				setState(37);
				match(T__3);
				setState(38);
				process();
				}
				break;
			case 3:
				_localctx = new BranchingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				participant();
				setState(41);
				match(T__6);
				setState(42);
				match(T__7);
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(43);
						label();
						setState(44);
						match(T__8);
						setState(45);
						match(VAR);
						setState(46);
						match(T__9);
						setState(47);
						match(T__3);
						setState(48);
						process();
						setState(49);
						match(T__10);
						}
						} 
					}
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(56);
				label();
				setState(57);
				match(T__8);
				setState(58);
				match(VAR);
				setState(59);
				match(T__9);
				setState(60);
				match(T__3);
				setState(61);
				process();
				setState(62);
				match(T__11);
				}
				break;
			case 4:
				_localctx = new SelectionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				participant();
				setState(65);
				match(T__12);
				setState(66);
				label();
				setState(67);
				match(T__13);
				setState(68);
				expression(0);
				setState(69);
				match(T__14);
				setState(70);
				match(T__3);
				setState(71);
				process();
				}
				break;
			case 5:
				_localctx = new ConditionalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(T__15);
				setState(74);
				expression(0);
				setState(75);
				match(T__16);
				setState(76);
				process();
				setState(77);
				match(T__17);
				setState(78);
				process();
				}
				break;
			case 6:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				match(T__18);
				setState(81);
				match(PROCNAME);
				setState(82);
				match(T__8);
				setState(83);
				match(VAR);
				setState(84);
				match(T__9);
				setState(85);
				match(T__19);
				setState(86);
				process();
				setState(87);
				match(T__20);
				setState(88);
				process();
				}
				break;
			case 7:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				match(PROCNAME);
				setState(91);
				match(T__13);
				setState(92);
				expression(0);
				setState(93);
				match(T__14);
				}
				break;
			case 8:
				_localctx = new UnitaryOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				match(UNITOP);
				setState(96);
				match(T__8);
				setState(97);
				quantum();
				setState(98);
				match(T__9);
				setState(99);
				match(T__3);
				setState(100);
				process();
				}
				break;
			case 9:
				_localctx = new InactionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				match(T__21);
				setState(103);
				match(T__22);
				setState(104);
				match(T__7);
				setState(105);
				quantum();
				setState(106);
				match(T__11);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public TerminalNode QREF() { return getToken(ProgramParser.QREF, 0); }
		public TerminalNode CONSTANT() { return getToken(ProgramParser.CONSTANT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP() { return getToken(ProgramParser.OP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(111);
				match(VAR);
				}
				break;
			case QREF:
				{
				setState(112);
				match(QREF);
				}
				break;
			case CONSTANT:
				{
				setState(113);
				match(CONSTANT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(116);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(117);
					match(OP);
					setState(118);
					expression(2);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantumContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public TerminalNode QREF() { return getToken(ProgramParser.QREF, 0); }
		public QuantumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantum; }
	}

	public final QuantumContext quantum() throws RecognitionException {
		QuantumContext _localctx = new QuantumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quantum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==QREF || _la==VAR) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public ParticipantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participant; }
	}

	public final ParticipantContext participant() throws RecognitionException {
		ParticipantContext _localctx = new ParticipantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_participant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0083\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00024\b"+
		"\u0002\n\u0002\f\u00027\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002m\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003s\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003x\b\u0003\n\u0003\f\u0003{\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0001\u0006"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000\u001c\u001d"+
		"\u0088\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000"+
		"\u0000\u0004l\u0001\u0000\u0000\u0000\u0006r\u0001\u0000\u0000\u0000\b"+
		"|\u0001\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0005\u0001"+
		"\u0000\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000e\u0001\u0000"+
		"\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000"+
		"\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002"+
		"\u0001\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0003\f\u0006\u0000\u001a\u001b\u0005\u0002\u0000"+
		"\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u0003\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e\u001f\u0005\u001d\u0000"+
		"\u0000\u001f \u0005\u0004\u0000\u0000 m\u0003\u0004\u0002\u0000!\"\u0005"+
		"\u001d\u0000\u0000\"#\u0005\u0005\u0000\u0000#$\u0005\u0006\u0000\u0000"+
		"$%\u0003\b\u0004\u0000%&\u0005\u0004\u0000\u0000&\'\u0003\u0004\u0002"+
		"\u0000\'m\u0001\u0000\u0000\u0000()\u0003\f\u0006\u0000)*\u0005\u0007"+
		"\u0000\u0000*5\u0005\b\u0000\u0000+,\u0003\n\u0005\u0000,-\u0005\t\u0000"+
		"\u0000-.\u0005\u001d\u0000\u0000./\u0005\n\u0000\u0000/0\u0005\u0004\u0000"+
		"\u000001\u0003\u0004\u0002\u000012\u0005\u000b\u0000\u000024\u0001\u0000"+
		"\u0000\u00003+\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000089\u0003\n\u0005\u00009:\u0005\t\u0000\u0000"+
		":;\u0005\u001d\u0000\u0000;<\u0005\n\u0000\u0000<=\u0005\u0004\u0000\u0000"+
		"=>\u0003\u0004\u0002\u0000>?\u0005\f\u0000\u0000?m\u0001\u0000\u0000\u0000"+
		"@A\u0003\f\u0006\u0000AB\u0005\r\u0000\u0000BC\u0003\n\u0005\u0000CD\u0005"+
		"\u000e\u0000\u0000DE\u0003\u0006\u0003\u0000EF\u0005\u000f\u0000\u0000"+
		"FG\u0005\u0004\u0000\u0000GH\u0003\u0004\u0002\u0000Hm\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u0010\u0000\u0000JK\u0003\u0006\u0003\u0000KL\u0005\u0011"+
		"\u0000\u0000LM\u0003\u0004\u0002\u0000MN\u0005\u0012\u0000\u0000NO\u0003"+
		"\u0004\u0002\u0000Om\u0001\u0000\u0000\u0000PQ\u0005\u0013\u0000\u0000"+
		"QR\u0005\u0019\u0000\u0000RS\u0005\t\u0000\u0000ST\u0005\u001d\u0000\u0000"+
		"TU\u0005\n\u0000\u0000UV\u0005\u0014\u0000\u0000VW\u0003\u0004\u0002\u0000"+
		"WX\u0005\u0015\u0000\u0000XY\u0003\u0004\u0002\u0000Ym\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u0019\u0000\u0000[\\\u0005\u000e\u0000\u0000\\]\u0003\u0006"+
		"\u0003\u0000]^\u0005\u000f\u0000\u0000^m\u0001\u0000\u0000\u0000_`\u0005"+
		"\u0018\u0000\u0000`a\u0005\t\u0000\u0000ab\u0003\b\u0004\u0000bc\u0005"+
		"\n\u0000\u0000cd\u0005\u0004\u0000\u0000de\u0003\u0004\u0002\u0000em\u0001"+
		"\u0000\u0000\u0000fg\u0005\u0016\u0000\u0000gh\u0005\u0017\u0000\u0000"+
		"hi\u0005\b\u0000\u0000ij\u0003\b\u0004\u0000jk\u0005\f\u0000\u0000km\u0001"+
		"\u0000\u0000\u0000l\u001d\u0001\u0000\u0000\u0000l!\u0001\u0000\u0000"+
		"\u0000l(\u0001\u0000\u0000\u0000l@\u0001\u0000\u0000\u0000lI\u0001\u0000"+
		"\u0000\u0000lP\u0001\u0000\u0000\u0000lZ\u0001\u0000\u0000\u0000l_\u0001"+
		"\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000m\u0005\u0001\u0000\u0000"+
		"\u0000no\u0006\u0003\uffff\uffff\u0000os\u0005\u001d\u0000\u0000ps\u0005"+
		"\u001c\u0000\u0000qs\u0005\u001b\u0000\u0000rn\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000sy\u0001\u0000\u0000"+
		"\u0000tu\n\u0001\u0000\u0000uv\u0005\u001a\u0000\u0000vx\u0003\u0006\u0003"+
		"\u0002wt\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0007\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|}\u0007\u0000\u0000\u0000}\t\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u001e\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u001e\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0005"+
		"\u00135lry";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}