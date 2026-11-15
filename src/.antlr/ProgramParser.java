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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, CONSTANT=37, VAR=38, 
		PAULI=39, PROCNAME=40, BASETYPE=41, TYPEVAR=42, END=43, ID=44, WS=45;
	public static final int
		RULE_prog = 0, RULE_multipartySystems = 1, RULE_process = 2, RULE_varList = 3, 
		RULE_branch = 4, RULE_branchType = 5, RULE_label = 6, RULE_participant = 7, 
		RULE_expression = 8, RULE_unitop = 9, RULE_local = 10, RULE_labelSet = 11, 
		RULE_labelType = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "multipartySystems", "process", "varList", "branch", "branchType", 
			"label", "participant", "expression", "unitop", "local", "labelSet", 
			"labelType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'-'", "'>'", "'new'", "'.'", "':'", "'='", "'meas'", "'('", 
			"','", "')'", "'&'", "'\\u2295'", "'<'", "'unit'", "'if'", "'then'", 
			"'else'", "'def'", "';'", "'in'", "'null'", "'0'", "'_'", "'{'", "'}'", 
			"'+'", "'*'", "'/'", "'%'", "'@'", "'op'", "'H'", "'CNot'", "'\\u03C3'", 
			"'\\u03BC'", null, null, null, null, null, null, "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "CONSTANT", "VAR", "PAULI", "PROCNAME", "BASETYPE", "TYPEVAR", 
			"END", "ID", "WS"
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			multipartySystems();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(27);
				match(T__0);
				setState(28);
				multipartySystems();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
			setState(36);
			participant();
			setState(37);
			match(T__1);
			setState(38);
			match(T__2);
			setState(39);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitaryOpContext extends ProcessContext {
		public UnitopContext unitop() {
			return getRuleContext(UnitopContext.class,0);
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
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SelectionContext(ProcessContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ProcessContext {
		public VarListContext firstList;
		public VarListContext qbitList;
		public TerminalNode PROCNAME() { return getToken(ProgramParser.PROCNAME, 0); }
		public List<ProcessContext> process() {
			return getRuleContexts(ProcessContext.class);
		}
		public ProcessContext process(int i) {
			return getRuleContext(ProcessContext.class,i);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public List<VarListContext> varList() {
			return getRuleContexts(VarListContext.class);
		}
		public VarListContext varList(int i) {
			return getRuleContext(VarListContext.class,i);
		}
		public DefinitionContext(ProcessContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InactionContext extends ProcessContext {
		public List<TerminalNode> VAR() { return getTokens(ProgramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProgramParser.VAR, i);
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
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new QbGenerationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__3);
				setState(42);
				match(VAR);
				setState(43);
				match(T__4);
				setState(44);
				process();
				}
				break;
			case 2:
				_localctx = new MeasurementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(VAR);
				setState(46);
				match(T__5);
				setState(47);
				match(T__6);
				setState(48);
				match(T__7);
				setState(49);
				match(T__8);
				setState(50);
				match(VAR);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(51);
					match(T__9);
					setState(52);
					match(VAR);
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
				match(T__10);
				setState(59);
				match(T__4);
				setState(60);
				process();
				}
				break;
			case 3:
				_localctx = new BranchingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				participant();
				setState(62);
				match(T__11);
				setState(63);
				branch();
				}
				break;
			case 4:
				_localctx = new SelectionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				participant();
				setState(66);
				match(T__12);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(67);
					label();
					}
				}

				setState(70);
				match(T__13);
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONSTANT:
				case VAR:
					{
					{
					setState(71);
					expression(0);
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(72);
						match(T__9);
						setState(73);
						expression(0);
						}
						}
						setState(78);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case T__14:
					{
					setState(79);
					match(T__14);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82);
				match(T__2);
				setState(83);
				match(T__4);
				setState(84);
				process();
				}
				break;
			case 5:
				_localctx = new ConditionalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(T__15);
				setState(87);
				expression(0);
				setState(88);
				match(T__16);
				setState(89);
				process();
				setState(90);
				match(T__17);
				setState(91);
				process();
				}
				break;
			case 6:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				match(T__18);
				setState(94);
				match(PROCNAME);
				setState(95);
				match(T__8);
				setState(96);
				match(T__13);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(97);
					((DefinitionContext)_localctx).firstList = varList();
					}
				}

				setState(100);
				match(T__2);
				setState(101);
				match(T__19);
				setState(102);
				match(T__13);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(103);
					((DefinitionContext)_localctx).qbitList = varList();
					}
				}

				setState(106);
				match(T__2);
				setState(107);
				match(T__10);
				setState(108);
				match(T__6);
				setState(109);
				process();
				setState(110);
				match(T__5);
				setState(111);
				local();
				setState(112);
				match(T__20);
				setState(113);
				process();
				}
				break;
			case 7:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				match(PROCNAME);
				setState(116);
				match(T__13);
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONSTANT:
				case VAR:
					{
					{
					setState(117);
					expression(0);
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(118);
						match(T__9);
						setState(119);
						expression(0);
						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case T__21:
					{
					setState(125);
					match(T__21);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128);
				match(T__2);
				}
				break;
			case 8:
				_localctx = new UnitaryOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				unitop();
				}
				break;
			case 9:
				_localctx = new InactionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				match(T__22);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(131);
					match(T__23);
					setState(132);
					match(T__24);
					setState(133);
					match(VAR);
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(134);
						match(T__9);
						setState(135);
						match(VAR);
						}
						}
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(141);
					match(T__25);
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
	public static class VarListContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ProgramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ProgramParser.VAR, i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(VAR);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(147);
				match(T__9);
				setState(148);
				match(VAR);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleContext extends BranchContext {
		public BranchTypeContext branchType() {
			return getRuleContext(BranchTypeContext.class,0);
		}
		public SingleContext(BranchContext ctx) { copyFrom(ctx); }
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_branch);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__24);
				setState(155);
				branchType();
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					match(T__9);
					setState(157);
					branchType();
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(162);
				match(T__25);
				}
				break;
			case T__8:
			case ID:
				_localctx = new SingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
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
	}

	public final BranchTypeContext branchType() throws RecognitionException {
		BranchTypeContext _localctx = new BranchTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branchType);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new BranchLabel1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				label();
				setState(168);
				match(T__8);
				setState(169);
				match(VAR);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(170);
					match(T__9);
					setState(171);
					match(VAR);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(T__10);
				setState(178);
				match(T__4);
				setState(179);
				process();
				}
				break;
			case 2:
				_localctx = new BranchLabel2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__8);
				setState(182);
				match(VAR);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(183);
					match(T__9);
					setState(184);
					match(VAR);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(T__10);
				setState(191);
				match(T__4);
				setState(192);
				process();
				}
				break;
			case 3:
				_localctx = new BranchLabel3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				label();
				setState(194);
				match(T__4);
				setState(195);
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
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 14, RULE_participant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(ProgramParser.CONSTANT, 0); }
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTANT:
				{
				setState(204);
				match(CONSTANT);
				}
				break;
			case VAR:
				{
				setState(205);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(209);
						match(T__26);
						setState(210);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(212);
						match(T__1);
						setState(213);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(215);
						match(T__27);
						setState(216);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(218);
						match(T__28);
						setState(219);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(221);
						match(T__29);
						setState(222);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(224);
						match(T__30);
						setState(225);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(227);
						match(T__31);
						setState(228);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HadamarContext extends UnitopContext {
		public TerminalNode VAR() { return getToken(ProgramParser.VAR, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public HadamarContext(UnitopContext ctx) { copyFrom(ctx); }
	}

	public final UnitopContext unitop() throws RecognitionException {
		UnitopContext _localctx = new UnitopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unitop);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				_localctx = new HadamarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__32);
				setState(235);
				match(T__8);
				setState(236);
				match(VAR);
				setState(237);
				match(T__10);
				setState(238);
				match(T__4);
				setState(239);
				process();
				}
				break;
			case T__33:
				_localctx = new ControlledNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__33);
				setState(241);
				match(T__8);
				setState(242);
				match(VAR);
				setState(243);
				match(T__9);
				setState(244);
				match(VAR);
				setState(245);
				match(T__10);
				setState(246);
				match(T__4);
				setState(247);
				process();
				}
				break;
			case T__34:
				_localctx = new PauliTransformationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(T__34);
				setState(249);
				match(T__23);
				setState(250);
				match(T__24);
				setState(251);
				match(PAULI);
				setState(252);
				match(T__25);
				setState(253);
				match(T__8);
				setState(254);
				match(VAR);
				setState(255);
				match(T__10);
				setState(256);
				match(T__4);
				setState(257);
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
		public TerminalNode TYPEVAR() { return getToken(ProgramParser.TYPEVAR, 0); }
		public VariableContext(LocalContext ctx) { copyFrom(ctx); }
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends LocalContext {
		public TerminalNode END() { return getToken(ProgramParser.END, 0); }
		public EndContext(LocalContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecursionContext extends LocalContext {
		public TerminalNode TYPEVAR() { return getToken(ProgramParser.TYPEVAR, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public RecursionContext(LocalContext ctx) { copyFrom(ctx); }
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
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_local);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ReceiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				participant();
				setState(261);
				match(T__11);
				setState(262);
				labelSet();
				}
				break;
			case 2:
				_localctx = new SendContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				participant();
				setState(265);
				match(T__12);
				setState(266);
				labelSet();
				}
				break;
			case 3:
				_localctx = new RecursionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(T__35);
				setState(269);
				match(TYPEVAR);
				setState(270);
				match(T__4);
				setState(271);
				local();
				}
				break;
			case 4:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(TYPEVAR);
				}
				break;
			case 5:
				_localctx = new EndContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleChoiceContext extends LabelSetContext {
		public LabelTypeContext labelType() {
			return getRuleContext(LabelTypeContext.class,0);
		}
		public SingleChoiceContext(LabelSetContext ctx) { copyFrom(ctx); }
	}

	public final LabelSetContext labelSet() throws RecognitionException {
		LabelSetContext _localctx = new LabelSetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_labelSet);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				_localctx = new MultipleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(T__24);
				setState(277);
				labelType();
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(278);
					match(T__9);
					setState(279);
					labelType();
					}
					}
					setState(282); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(284);
				match(T__25);
				}
				break;
			case T__8:
			case ID:
				_localctx = new SingleChoiceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
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
		public TerminalNode BASETYPE() { return getToken(ProgramParser.BASETYPE, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public Label1Context(LabelTypeContext ctx) { copyFrom(ctx); }
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label2Context extends LabelTypeContext {
		public TerminalNode BASETYPE() { return getToken(ProgramParser.BASETYPE, 0); }
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public Label2Context(LabelTypeContext ctx) { copyFrom(ctx); }
	}

	public final LabelTypeContext labelType() throws RecognitionException {
		LabelTypeContext _localctx = new LabelTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_labelType);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new Label1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				label();
				setState(290);
				match(T__8);
				setState(291);
				match(BASETYPE);
				setState(292);
				match(T__10);
				setState(293);
				match(T__4);
				setState(294);
				local();
				}
				break;
			case 2:
				_localctx = new Label2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(T__8);
				setState(297);
				match(BASETYPE);
				setState(298);
				match(T__10);
				setState(299);
				match(T__4);
				setState(300);
				local();
				}
				break;
			case 3:
				_localctx = new Label3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				label();
				setState(302);
				match(T__4);
				setState(303);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u0134\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u0002"+
		"9\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"E\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"K\b\u0002\n\u0002\f\u0002N\t\u0002\u0001\u0002\u0003\u0002Q\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002c\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002i\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002y\b\u0002\n\u0002\f\u0002|\t\u0002\u0001"+
		"\u0002\u0003\u0002\u007f\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0089"+
		"\b\u0002\n\u0002\f\u0002\u008c\t\u0002\u0001\u0002\u0003\u0002\u008f\b"+
		"\u0002\u0003\u0002\u0091\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u0096\b\u0003\n\u0003\f\u0003\u0099\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004\u009f\b\u0004\u000b\u0004\f\u0004"+
		"\u00a0\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a6\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ad"+
		"\b\u0005\n\u0005\f\u0005\u00b0\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00ba\b\u0005\n\u0005\f\u0005\u00bd\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c6"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00cf\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00e6\b\b\n"+
		"\b\f\b\u00e9\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0103\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0113\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0119\b\u000b\u000b"+
		"\u000b\f\u000b\u011a\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0120"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0132\b\f\u0001\f\u0000\u0001\u0010\r\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000\u0152\u0000\u001a\u0001"+
		"\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004\u0090\u0001\u0000"+
		"\u0000\u0000\u0006\u0092\u0001\u0000\u0000\u0000\b\u00a5\u0001\u0000\u0000"+
		"\u0000\n\u00c5\u0001\u0000\u0000\u0000\f\u00c7\u0001\u0000\u0000\u0000"+
		"\u000e\u00c9\u0001\u0000\u0000\u0000\u0010\u00ce\u0001\u0000\u0000\u0000"+
		"\u0012\u0102\u0001\u0000\u0000\u0000\u0014\u0112\u0001\u0000\u0000\u0000"+
		"\u0016\u011f\u0001\u0000\u0000\u0000\u0018\u0131\u0001\u0000\u0000\u0000"+
		"\u001a\u001f\u0003\u0002\u0001\u0000\u001b\u001c\u0005\u0001\u0000\u0000"+
		"\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u0000\u0000\u0001#\u0001\u0001\u0000\u0000\u0000"+
		"$%\u0003\u000e\u0007\u0000%&\u0005\u0002\u0000\u0000&\'\u0005\u0003\u0000"+
		"\u0000\'(\u0003\u0004\u0002\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0005"+
		"\u0004\u0000\u0000*+\u0005&\u0000\u0000+,\u0005\u0005\u0000\u0000,\u0091"+
		"\u0003\u0004\u0002\u0000-.\u0005&\u0000\u0000./\u0005\u0006\u0000\u0000"+
		"/0\u0005\u0007\u0000\u000001\u0005\b\u0000\u000012\u0005\t\u0000\u0000"+
		"27\u0005&\u0000\u000034\u0005\n\u0000\u000046\u0005&\u0000\u000053\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:;\u0005\u000b\u0000\u0000;<\u0005\u0005\u0000\u0000<\u0091\u0003"+
		"\u0004\u0002\u0000=>\u0003\u000e\u0007\u0000>?\u0005\f\u0000\u0000?@\u0003"+
		"\b\u0004\u0000@\u0091\u0001\u0000\u0000\u0000AB\u0003\u000e\u0007\u0000"+
		"BD\u0005\r\u0000\u0000CE\u0003\f\u0006\u0000DC\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FP\u0005\u000e\u0000"+
		"\u0000GL\u0003\u0010\b\u0000HI\u0005\n\u0000\u0000IK\u0003\u0010\b\u0000"+
		"JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MQ\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OQ\u0005\u000f\u0000\u0000PG\u0001\u0000\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\u0003\u0000\u0000"+
		"ST\u0005\u0005\u0000\u0000TU\u0003\u0004\u0002\u0000U\u0091\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0010\u0000\u0000WX\u0003\u0010\b\u0000XY\u0005\u0011"+
		"\u0000\u0000YZ\u0003\u0004\u0002\u0000Z[\u0005\u0012\u0000\u0000[\\\u0003"+
		"\u0004\u0002\u0000\\\u0091\u0001\u0000\u0000\u0000]^\u0005\u0013\u0000"+
		"\u0000^_\u0005(\u0000\u0000_`\u0005\t\u0000\u0000`b\u0005\u000e\u0000"+
		"\u0000ac\u0003\u0006\u0003\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0005\u0003\u0000\u0000ef\u0005"+
		"\u0014\u0000\u0000fh\u0005\u000e\u0000\u0000gi\u0003\u0006\u0003\u0000"+
		"hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0003\u0000\u0000kl\u0005\u000b\u0000\u0000lm\u0005\u0007"+
		"\u0000\u0000mn\u0003\u0004\u0002\u0000no\u0005\u0006\u0000\u0000op\u0003"+
		"\u0014\n\u0000pq\u0005\u0015\u0000\u0000qr\u0003\u0004\u0002\u0000r\u0091"+
		"\u0001\u0000\u0000\u0000st\u0005(\u0000\u0000t~\u0005\u000e\u0000\u0000"+
		"uz\u0003\u0010\b\u0000vw\u0005\n\u0000\u0000wy\u0003\u0010\b\u0000xv\u0001"+
		"\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{\u007f\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}\u007f\u0005\u0016\u0000\u0000~u\u0001\u0000\u0000\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0091"+
		"\u0005\u0003\u0000\u0000\u0081\u0091\u0003\u0012\t\u0000\u0082\u008e\u0005"+
		"\u0017\u0000\u0000\u0083\u0084\u0005\u0018\u0000\u0000\u0084\u0085\u0005"+
		"\u0019\u0000\u0000\u0085\u008a\u0005&\u0000\u0000\u0086\u0087\u0005\n"+
		"\u0000\u0000\u0087\u0089\u0005&\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0005\u001a\u0000"+
		"\u0000\u008e\u0083\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090)\u0001\u0000\u0000\u0000"+
		"\u0090-\u0001\u0000\u0000\u0000\u0090=\u0001\u0000\u0000\u0000\u0090A"+
		"\u0001\u0000\u0000\u0000\u0090V\u0001\u0000\u0000\u0000\u0090]\u0001\u0000"+
		"\u0000\u0000\u0090s\u0001\u0000\u0000\u0000\u0090\u0081\u0001\u0000\u0000"+
		"\u0000\u0090\u0082\u0001\u0000\u0000\u0000\u0091\u0005\u0001\u0000\u0000"+
		"\u0000\u0092\u0097\u0005&\u0000\u0000\u0093\u0094\u0005\n\u0000\u0000"+
		"\u0094\u0096\u0005&\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u0007\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0019\u0000\u0000\u009b"+
		"\u009e\u0003\n\u0005\u0000\u009c\u009d\u0005\n\u0000\u0000\u009d\u009f"+
		"\u0003\n\u0005\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"\u001a\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a6\u0003"+
		"\n\u0005\u0000\u00a5\u009a\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\t\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\f\u0006"+
		"\u0000\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00ae\u0005&\u0000\u0000"+
		"\u00aa\u00ab\u0005\n\u0000\u0000\u00ab\u00ad\u0005&\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005\u000b\u0000\u0000\u00b2\u00b3\u0005\u0005\u0000\u0000\u00b3"+
		"\u00b4\u0003\u0004\u0002\u0000\u00b4\u00c6\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005\t\u0000\u0000\u00b6\u00bb\u0005&\u0000\u0000\u00b7\u00b8"+
		"\u0005\n\u0000\u0000\u00b8\u00ba\u0005&\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"\u000b\u0000\u0000\u00bf\u00c0\u0005\u0005\u0000\u0000\u00c0\u00c6\u0003"+
		"\u0004\u0002\u0000\u00c1\u00c2\u0003\f\u0006\u0000\u00c2\u00c3\u0005\u0005"+
		"\u0000\u0000\u00c3\u00c4\u0003\u0004\u0002\u0000\u00c4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u00a7\u0001\u0000\u0000\u0000\u00c5\u00b5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c6\u000b\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0005,\u0000\u0000\u00c8\r\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005,\u0000\u0000\u00ca\u000f\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0006\b\uffff\uffff\u0000\u00cc\u00cf\u0005%\u0000\u0000"+
		"\u00cd\u00cf\u0005&\u0000\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00e7\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\n\t\u0000\u0000\u00d1\u00d2\u0005\u001b\u0000\u0000\u00d2\u00e6"+
		"\u0003\u0010\b\n\u00d3\u00d4\n\b\u0000\u0000\u00d4\u00d5\u0005\u0002\u0000"+
		"\u0000\u00d5\u00e6\u0003\u0010\b\t\u00d6\u00d7\n\u0007\u0000\u0000\u00d7"+
		"\u00d8\u0005\u001c\u0000\u0000\u00d8\u00e6\u0003\u0010\b\b\u00d9\u00da"+
		"\n\u0006\u0000\u0000\u00da\u00db\u0005\u001d\u0000\u0000\u00db\u00e6\u0003"+
		"\u0010\b\u0007\u00dc\u00dd\n\u0005\u0000\u0000\u00dd\u00de\u0005\u001e"+
		"\u0000\u0000\u00de\u00e6\u0003\u0010\b\u0006\u00df\u00e0\n\u0004\u0000"+
		"\u0000\u00e0\u00e1\u0005\u001f\u0000\u0000\u00e1\u00e6\u0003\u0010\b\u0005"+
		"\u00e2\u00e3\n\u0003\u0000\u0000\u00e3\u00e4\u0005 \u0000\u0000\u00e4"+
		"\u00e6\u0003\u0010\b\u0004\u00e5\u00d0\u0001\u0000\u0000\u0000\u00e5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00d6\u0001\u0000\u0000\u0000\u00e5\u00d9"+
		"\u0001\u0000\u0000\u0000\u00e5\u00dc\u0001\u0000\u0000\u0000\u00e5\u00df"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u0011\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005!\u0000\u0000\u00eb\u00ec\u0005"+
		"\t\u0000\u0000\u00ec\u00ed\u0005&\u0000\u0000\u00ed\u00ee\u0005\u000b"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0005\u0000\u0000\u00ef\u0103\u0003\u0004"+
		"\u0002\u0000\u00f0\u00f1\u0005\"\u0000\u0000\u00f1\u00f2\u0005\t\u0000"+
		"\u0000\u00f2\u00f3\u0005&\u0000\u0000\u00f3\u00f4\u0005\n\u0000\u0000"+
		"\u00f4\u00f5\u0005&\u0000\u0000\u00f5\u00f6\u0005\u000b\u0000\u0000\u00f6"+
		"\u00f7\u0005\u0005\u0000\u0000\u00f7\u0103\u0003\u0004\u0002\u0000\u00f8"+
		"\u00f9\u0005#\u0000\u0000\u00f9\u00fa\u0005\u0018\u0000\u0000\u00fa\u00fb"+
		"\u0005\u0019\u0000\u0000\u00fb\u00fc\u0005\'\u0000\u0000\u00fc\u00fd\u0005"+
		"\u001a\u0000\u0000\u00fd\u00fe\u0005\t\u0000\u0000\u00fe\u00ff\u0005&"+
		"\u0000\u0000\u00ff\u0100\u0005\u000b\u0000\u0000\u0100\u0101\u0005\u0005"+
		"\u0000\u0000\u0101\u0103\u0003\u0004\u0002\u0000\u0102\u00ea\u0001\u0000"+
		"\u0000\u0000\u0102\u00f0\u0001\u0000\u0000\u0000\u0102\u00f8\u0001\u0000"+
		"\u0000\u0000\u0103\u0013\u0001\u0000\u0000\u0000\u0104\u0105\u0003\u000e"+
		"\u0007\u0000\u0105\u0106\u0005\f\u0000\u0000\u0106\u0107\u0003\u0016\u000b"+
		"\u0000\u0107\u0113\u0001\u0000\u0000\u0000\u0108\u0109\u0003\u000e\u0007"+
		"\u0000\u0109\u010a\u0005\r\u0000\u0000\u010a\u010b\u0003\u0016\u000b\u0000"+
		"\u010b\u0113\u0001\u0000\u0000\u0000\u010c\u010d\u0005$\u0000\u0000\u010d"+
		"\u010e\u0005*\u0000\u0000\u010e\u010f\u0005\u0005\u0000\u0000\u010f\u0113"+
		"\u0003\u0014\n\u0000\u0110\u0113\u0005*\u0000\u0000\u0111\u0113\u0005"+
		"+\u0000\u0000\u0112\u0104\u0001\u0000\u0000\u0000\u0112\u0108\u0001\u0000"+
		"\u0000\u0000\u0112\u010c\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0015\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005\u0019\u0000\u0000\u0115\u0118\u0003\u0018"+
		"\f\u0000\u0116\u0117\u0005\n\u0000\u0000\u0117\u0119\u0003\u0018\f\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u001a\u0000\u0000"+
		"\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u0120\u0003\u0018\f\u0000\u011f"+
		"\u0114\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120"+
		"\u0017\u0001\u0000\u0000\u0000\u0121\u0122\u0003\f\u0006\u0000\u0122\u0123"+
		"\u0005\t\u0000\u0000\u0123\u0124\u0005)\u0000\u0000\u0124\u0125\u0005"+
		"\u000b\u0000\u0000\u0125\u0126\u0005\u0005\u0000\u0000\u0126\u0127\u0003"+
		"\u0014\n\u0000\u0127\u0132\u0001\u0000\u0000\u0000\u0128\u0129\u0005\t"+
		"\u0000\u0000\u0129\u012a\u0005)\u0000\u0000\u012a\u012b\u0005\u000b\u0000"+
		"\u0000\u012b\u012c\u0005\u0005\u0000\u0000\u012c\u0132\u0003\u0014\n\u0000"+
		"\u012d\u012e\u0003\f\u0006\u0000\u012e\u012f\u0005\u0005\u0000\u0000\u012f"+
		"\u0130\u0003\u0014\n\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u0121"+
		"\u0001\u0000\u0000\u0000\u0131\u0128\u0001\u0000\u0000\u0000\u0131\u012d"+
		"\u0001\u0000\u0000\u0000\u0132\u0019\u0001\u0000\u0000\u0000\u001a\u001f"+
		"7DLPbhz~\u008a\u008e\u0090\u0097\u00a0\u00a5\u00ae\u00bb\u00c5\u00ce\u00e5"+
		"\u00e7\u0102\u0112\u011a\u011f\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}