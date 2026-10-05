// Generated from ./src/Program.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, VAR=27, PAULI=28, PROCNAME=29, OP=30, CONSTANT=31, 
		ID=32, WS=33;
	public static final int
		RULE_prog = 0, RULE_multipartySystems = 1, RULE_process = 2, RULE_branch = 3, 
		RULE_branchType = 4, RULE_expression = 5, RULE_unitop = 6, RULE_label = 7, 
		RULE_participant = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "multipartySystems", "process", "branch", "branchType", "expression", 
			"unitop", "label", "participant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'-'", "'>'", "'new'", "'.'", "':'", "'='", "'meas'", "'('", 
			"','", "')'", "'&'", "'\\u2295'", "'<'", "'if'", "'then'", "'else'", 
			"'def'", "'in'", "'0'", "'_'", "'{'", "'}'", "'H'", "'CNot'", "'\\u03C3'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "VAR", "PAULI", "PROCNAME", "OP", "CONSTANT", "ID", 
			"WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			multipartySystems();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(19);
				match(T__0);
				setState(20);
				multipartySystems();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterMultipartySystems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitMultipartySystems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitMultipartySystems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartySystemsContext multipartySystems() throws RecognitionException {
		MultipartySystemsContext _localctx = new MultipartySystemsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multipartySystems);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			participant();
			setState(29);
			match(T__1);
			setState(30);
			match(T__2);
			setState(31);
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
		public List<TerminalNode> VAR() { return getTokens(ProgramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProgramParser.VAR, i);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public MeasurementContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterMeasurement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitMeasurement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitMeasurement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BranchingContext extends ProcessContext {
		public ParticipantContext participant() {
			return getRuleContext(ParticipantContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public BranchingContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterBranching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitBranching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBranching(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ProcessContext {
		public TerminalNode PROCNAME() { return getToken(ProgramParser.PROCNAME, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitaryOpContext extends ProcessContext {
		public UnitopContext unitop() {
			return getRuleContext(UnitopContext.class,0);
		}
		public UnitaryOpContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterUnitaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitUnitaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitUnitaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QbGenerationContext extends ProcessContext {
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public QbGenerationContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterQbGeneration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitQbGeneration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitQbGeneration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectionContext extends ProcessContext {
		public ParticipantContext participant() {
			return getRuleContext(ParticipantContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public SelectionContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ProcessContext {
		public TerminalNode PROCNAME() { return getToken(ProgramParser.PROCNAME, 0); }
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
		public DefinitionContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InactionContext extends ProcessContext {
		public List<TerminalNode> VAR() { return getTokens(ProgramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProgramParser.VAR, i);
		}
		public InactionContext(ProcessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterInaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitInaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitInaction(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_process);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new QbGenerationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(T__3);
				setState(34);
				match(VAR);
				setState(35);
				match(T__4);
				setState(36);
				process();
				}
				break;
			case 2:
				_localctx = new MeasurementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(VAR);
				setState(38);
				match(T__5);
				setState(39);
				match(T__6);
				setState(40);
				match(T__7);
				setState(41);
				match(T__8);
				setState(42);
				match(VAR);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(43);
					match(T__9);
					setState(44);
					match(VAR);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				match(T__10);
				setState(51);
				match(T__4);
				setState(52);
				process();
				}
				break;
			case 3:
				_localctx = new BranchingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				participant();
				setState(54);
				match(T__11);
				setState(55);
				branch();
				}
				break;
			case 4:
				_localctx = new SelectionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				participant();
				setState(58);
				match(T__12);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(59);
					label();
					}
				}

				setState(62);
				match(T__13);
				setState(63);
				expression(0);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(64);
					match(T__9);
					setState(65);
					expression(0);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(T__2);
				setState(72);
				match(T__4);
				setState(73);
				process();
				}
				break;
			case 5:
				_localctx = new ConditionalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(T__14);
				setState(76);
				expression(0);
				setState(77);
				match(T__15);
				setState(78);
				process();
				setState(79);
				match(T__16);
				setState(80);
				process();
				}
				break;
			case 6:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(T__17);
				setState(83);
				match(PROCNAME);
				setState(84);
				match(T__8);
				setState(85);
				match(VAR);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(86);
					match(T__9);
					setState(87);
					match(VAR);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(T__10);
				setState(94);
				match(T__6);
				setState(95);
				process();
				setState(96);
				match(T__18);
				setState(97);
				process();
				}
				break;
			case 7:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				match(PROCNAME);
				setState(100);
				match(T__13);
				setState(101);
				expression(0);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(102);
					match(T__9);
					setState(103);
					expression(0);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(T__2);
				}
				break;
			case 8:
				_localctx = new UnitaryOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				unitop();
				}
				break;
			case 9:
				_localctx = new InactionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				match(T__19);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(113);
					match(T__20);
					setState(114);
					match(T__21);
					setState(115);
					match(VAR);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(116);
						match(T__9);
						setState(117);
						match(VAR);
						}
						}
						setState(122);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(123);
					match(T__22);
					}
				}

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
	public static class BranchContext extends ParserRuleContext {
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
	 
		public BranchContext() { }
		public void copyFrom(BranchContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends BranchContext {
		public List<BranchTypeContext> branchType() {
			return getRuleContexts(BranchTypeContext.class);
		}
		public BranchTypeContext branchType(int i) {
			return getRuleContext(BranchTypeContext.class,i);
		}
		public MultContext(BranchContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleContext extends BranchContext {
		public BranchTypeContext branchType() {
			return getRuleContext(BranchTypeContext.class,0);
		}
		public SingleContext(BranchContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_branch);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__21);
				setState(129);
				branchType();
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130);
					match(T__9);
					setState(131);
					branchType();
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(136);
				match(T__22);
				}
				break;
			case T__8:
			case ID:
				_localctx = new SingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				branchType();
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
	public static class BranchTypeContext extends ParserRuleContext {
		public BranchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchType; }
	 
		public BranchTypeContext() { }
		public void copyFrom(BranchTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BranchLabel3Context extends BranchTypeContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public BranchLabel3Context(BranchTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterBranchLabel3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitBranchLabel3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBranchLabel3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BranchLabel2Context extends BranchTypeContext {
		public List<TerminalNode> VAR() { return getTokens(ProgramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProgramParser.VAR, i);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public BranchLabel2Context(BranchTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterBranchLabel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitBranchLabel2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBranchLabel2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BranchLabel1Context extends BranchTypeContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(ProgramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProgramParser.VAR, i);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public BranchLabel1Context(BranchTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterBranchLabel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitBranchLabel1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBranchLabel1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchTypeContext branchType() throws RecognitionException {
		BranchTypeContext _localctx = new BranchTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_branchType);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new BranchLabel1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				label();
				setState(142);
				match(T__8);
				setState(143);
				match(VAR);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(144);
					match(T__9);
					setState(145);
					match(VAR);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(T__10);
				setState(152);
				match(T__4);
				setState(153);
				process();
				}
				break;
			case 2:
				_localctx = new BranchLabel2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__8);
				setState(156);
				match(VAR);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(157);
					match(T__9);
					setState(158);
					match(VAR);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(T__10);
				setState(165);
				match(T__4);
				setState(166);
				process();
				}
				break;
			case 3:
				_localctx = new BranchLabel3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				label();
				setState(168);
				match(T__4);
				setState(169);
				process();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(174);
				match(VAR);
				}
				break;
			case CONSTANT:
				{
				setState(175);
				match(CONSTANT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(178);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(179);
					match(OP);
					setState(180);
					expression(2);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class UnitopContext extends ParserRuleContext {
		public UnitopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitop; }
	 
		public UnitopContext() { }
		public void copyFrom(UnitopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PauliTransformationContext extends UnitopContext {
		public TerminalNode PAULI() { return getToken(ProgramParser.PAULI, 0); }
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public PauliTransformationContext(UnitopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterPauliTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitPauliTransformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitPauliTransformation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ControlledNotContext extends UnitopContext {
		public List<TerminalNode> VAR() { return getTokens(ProgramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProgramParser.VAR, i);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public ControlledNotContext(UnitopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterControlledNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitControlledNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitControlledNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HadamarContext extends UnitopContext {
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public HadamarContext(UnitopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterHadamar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitHadamar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitHadamar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitopContext unitop() throws RecognitionException {
		UnitopContext _localctx = new UnitopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unitop);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new HadamarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__23);
				setState(187);
				match(T__8);
				setState(188);
				match(VAR);
				setState(189);
				match(T__10);
				setState(190);
				match(T__4);
				setState(191);
				process();
				}
				break;
			case T__24:
				_localctx = new ControlledNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__24);
				setState(193);
				match(T__8);
				setState(194);
				match(VAR);
				setState(195);
				match(T__9);
				setState(196);
				match(VAR);
				setState(197);
				match(T__10);
				setState(198);
				match(T__4);
				setState(199);
				process();
				}
				break;
			case T__25:
				_localctx = new PauliTransformationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__25);
				setState(201);
				match(T__20);
				setState(202);
				match(T__21);
				setState(203);
				match(PAULI);
				setState(204);
				match(T__22);
				setState(205);
				match(T__8);
				setState(206);
				match(VAR);
				setState(207);
				match(T__10);
				setState(208);
				match(T__4);
				setState(209);
				process();
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
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterParticipant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitParticipant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitParticipant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParticipantContext participant() throws RecognitionException {
		ParticipantContext _localctx = new ParticipantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_participant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		case 5:
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
		"\u0004\u0001!\u00d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0016\b\u0000"+
		"\n\u0000\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002.\b\u0002\n\u0002"+
		"\f\u00021\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002=\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002C\b\u0002\n\u0002\f\u0002F\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002Y\b\u0002\n\u0002\f\u0002\\"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002i\b\u0002\n\u0002\f\u0002l\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002w\b\u0002\n\u0002\f\u0002z\t\u0002\u0001\u0002\u0003"+
		"\u0002}\b\u0002\u0003\u0002\u007f\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003\u0085\b\u0003\u000b\u0003\f\u0003\u0086"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008c\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0093\b\u0004"+
		"\n\u0004\f\u0004\u0096\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a0"+
		"\b\u0004\n\u0004\f\u0004\u00a3\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ac\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b1\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00b6\b\u0005\n\u0005\f\u0005\u00b9"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00d3\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0000\u0001\n\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000"+
		"\u0000\u00e9\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000"+
		"\u0000\u0000\u0004~\u0001\u0000\u0000\u0000\u0006\u008b\u0001\u0000\u0000"+
		"\u0000\b\u00ab\u0001\u0000\u0000\u0000\n\u00b0\u0001\u0000\u0000\u0000"+
		"\f\u00d2\u0001\u0000\u0000\u0000\u000e\u00d4\u0001\u0000\u0000\u0000\u0010"+
		"\u00d6\u0001\u0000\u0000\u0000\u0012\u0017\u0003\u0002\u0001\u0000\u0013"+
		"\u0014\u0005\u0001\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018"+
		"\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0005\u0000\u0000\u0001\u001b\u0001\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0003\u0010\b\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u001f"+
		"\u0005\u0003\u0000\u0000\u001f \u0003\u0004\u0002\u0000 \u0003\u0001\u0000"+
		"\u0000\u0000!\"\u0005\u0004\u0000\u0000\"#\u0005\u001b\u0000\u0000#$\u0005"+
		"\u0005\u0000\u0000$\u007f\u0003\u0004\u0002\u0000%&\u0005\u001b\u0000"+
		"\u0000&\'\u0005\u0006\u0000\u0000\'(\u0005\u0007\u0000\u0000()\u0005\b"+
		"\u0000\u0000)*\u0005\t\u0000\u0000*/\u0005\u001b\u0000\u0000+,\u0005\n"+
		"\u0000\u0000,.\u0005\u001b\u0000\u0000-+\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"02\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u000b\u0000"+
		"\u000034\u0005\u0005\u0000\u00004\u007f\u0003\u0004\u0002\u000056\u0003"+
		"\u0010\b\u000067\u0005\f\u0000\u000078\u0003\u0006\u0003\u00008\u007f"+
		"\u0001\u0000\u0000\u00009:\u0003\u0010\b\u0000:<\u0005\r\u0000\u0000;"+
		"=\u0003\u000e\u0007\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>?\u0005\u000e\u0000\u0000?D\u0003\n\u0005"+
		"\u0000@A\u0005\n\u0000\u0000AC\u0003\n\u0005\u0000B@\u0001\u0000\u0000"+
		"\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005"+
		"\u0003\u0000\u0000HI\u0005\u0005\u0000\u0000IJ\u0003\u0004\u0002\u0000"+
		"J\u007f\u0001\u0000\u0000\u0000KL\u0005\u000f\u0000\u0000LM\u0003\n\u0005"+
		"\u0000MN\u0005\u0010\u0000\u0000NO\u0003\u0004\u0002\u0000OP\u0005\u0011"+
		"\u0000\u0000PQ\u0003\u0004\u0002\u0000Q\u007f\u0001\u0000\u0000\u0000"+
		"RS\u0005\u0012\u0000\u0000ST\u0005\u001d\u0000\u0000TU\u0005\t\u0000\u0000"+
		"UZ\u0005\u001b\u0000\u0000VW\u0005\n\u0000\u0000WY\u0005\u001b\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000]^\u0005\u000b\u0000\u0000^_\u0005\u0007\u0000\u0000_`\u0003"+
		"\u0004\u0002\u0000`a\u0005\u0013\u0000\u0000ab\u0003\u0004\u0002\u0000"+
		"b\u007f\u0001\u0000\u0000\u0000cd\u0005\u001d\u0000\u0000de\u0005\u000e"+
		"\u0000\u0000ej\u0003\n\u0005\u0000fg\u0005\n\u0000\u0000gi\u0003\n\u0005"+
		"\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000mn\u0005\u0003\u0000\u0000n\u007f\u0001\u0000\u0000"+
		"\u0000o\u007f\u0003\f\u0006\u0000p|\u0005\u0014\u0000\u0000qr\u0005\u0015"+
		"\u0000\u0000rs\u0005\u0016\u0000\u0000sx\u0005\u001b\u0000\u0000tu\u0005"+
		"\n\u0000\u0000uw\u0005\u001b\u0000\u0000vt\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{}\u0005\u0017\u0000"+
		"\u0000|q\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001"+
		"\u0000\u0000\u0000~!\u0001\u0000\u0000\u0000~%\u0001\u0000\u0000\u0000"+
		"~5\u0001\u0000\u0000\u0000~9\u0001\u0000\u0000\u0000~K\u0001\u0000\u0000"+
		"\u0000~R\u0001\u0000\u0000\u0000~c\u0001\u0000\u0000\u0000~o\u0001\u0000"+
		"\u0000\u0000~p\u0001\u0000\u0000\u0000\u007f\u0005\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u0016\u0000\u0000\u0081\u0084\u0003\b\u0004\u0000\u0082"+
		"\u0083\u0005\n\u0000\u0000\u0083\u0085\u0003\b\u0004\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0017\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0003\b\u0004\u0000\u008b\u0080\u0001"+
		"\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0007\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0003\u000e\u0007\u0000\u008e\u008f\u0005"+
		"\t\u0000\u0000\u008f\u0094\u0005\u001b\u0000\u0000\u0090\u0091\u0005\n"+
		"\u0000\u0000\u0091\u0093\u0005\u001b\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u000b"+
		"\u0000\u0000\u0098\u0099\u0005\u0005\u0000\u0000\u0099\u009a\u0003\u0004"+
		"\u0002\u0000\u009a\u00ac\u0001\u0000\u0000\u0000\u009b\u009c\u0005\t\u0000"+
		"\u0000\u009c\u00a1\u0005\u001b\u0000\u0000\u009d\u009e\u0005\n\u0000\u0000"+
		"\u009e\u00a0\u0005\u001b\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u000b\u0000\u0000"+
		"\u00a5\u00a6\u0005\u0005\u0000\u0000\u00a6\u00ac\u0003\u0004\u0002\u0000"+
		"\u00a7\u00a8\u0003\u000e\u0007\u0000\u00a8\u00a9\u0005\u0005\u0000\u0000"+
		"\u00a9\u00aa\u0003\u0004\u0002\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ab\u008d\u0001\u0000\u0000\u0000\u00ab\u009b\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ac\t\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0006\u0005\uffff\uffff\u0000\u00ae\u00b1\u0005\u001b\u0000\u0000"+
		"\u00af\u00b1\u0005\u001f\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\n\u0001\u0000\u0000\u00b3\u00b4\u0005\u001e\u0000\u0000\u00b4"+
		"\u00b6\u0003\n\u0005\u0002\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u000b\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0018\u0000\u0000\u00bb\u00bc"+
		"\u0005\t\u0000\u0000\u00bc\u00bd\u0005\u001b\u0000\u0000\u00bd\u00be\u0005"+
		"\u000b\u0000\u0000\u00be\u00bf\u0005\u0005\u0000\u0000\u00bf\u00d3\u0003"+
		"\u0004\u0002\u0000\u00c0\u00c1\u0005\u0019\u0000\u0000\u00c1\u00c2\u0005"+
		"\t\u0000\u0000\u00c2\u00c3\u0005\u001b\u0000\u0000\u00c3\u00c4\u0005\n"+
		"\u0000\u0000\u00c4\u00c5\u0005\u001b\u0000\u0000\u00c5\u00c6\u0005\u000b"+
		"\u0000\u0000\u00c6\u00c7\u0005\u0005\u0000\u0000\u00c7\u00d3\u0003\u0004"+
		"\u0002\u0000\u00c8\u00c9\u0005\u001a\u0000\u0000\u00c9\u00ca\u0005\u0015"+
		"\u0000\u0000\u00ca\u00cb\u0005\u0016\u0000\u0000\u00cb\u00cc\u0005\u001c"+
		"\u0000\u0000\u00cc\u00cd\u0005\u0017\u0000\u0000\u00cd\u00ce\u0005\t\u0000"+
		"\u0000\u00ce\u00cf\u0005\u001b\u0000\u0000\u00cf\u00d0\u0005\u000b\u0000"+
		"\u0000\u00d0\u00d1\u0005\u0005\u0000\u0000\u00d1\u00d3\u0003\u0004\u0002"+
		"\u0000\u00d2\u00ba\u0001\u0000\u0000\u0000\u00d2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00c8\u0001\u0000\u0000\u0000\u00d3\r\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0005 \u0000\u0000\u00d5\u000f\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005 \u0000\u0000\u00d7\u0011\u0001\u0000\u0000\u0000\u0011\u0017"+
		"/<DZjx|~\u0086\u008b\u0094\u00a1\u00ab\u00b0\u00b7\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}