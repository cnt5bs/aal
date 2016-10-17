// Generated from ../gram/antlr4/AAS.g4 by ANTLR 4.5.3
package gram.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AASParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, ID=27, DIG=28, CAR=29, BR=30;
	public static final int
		RULE_adaptiveAutomaton = 0, RULE_transitions = 1, RULE_transition = 2, 
		RULE_from = 3, RULE_to = 4, RULE_stimuli = 5, RULE_simbolo = 6, RULE_chamada = 7, 
		RULE_transPreAdaptive = 8, RULE_transPostAdaptive = 9, RULE_argLst = 10, 
		RULE_submachines = 11, RULE_submachine = 12, RULE_main = 13, RULE_state = 14, 
		RULE_inicial = 15, RULE_terminal = 16, RULE_actions = 17, RULE_adaptiveAction = 18, 
		RULE_paramLst = 19, RULE_param = 20, RULE_local = 21, RULE_generator = 22, 
		RULE_action = 23, RULE_actionPreAdaptive = 24, RULE_actionPostAdaptive = 25, 
		RULE_argAction = 26, RULE_arg = 27;
	public static final String[] ruleNames = {
		"adaptiveAutomaton", "transitions", "transition", "from", "to", "stimuli", 
		"simbolo", "chamada", "transPreAdaptive", "transPostAdaptive", "argLst", 
		"submachines", "submachine", "main", "state", "inicial", "terminal", "actions", 
		"adaptiveAction", "paramLst", "param", "local", "generator", "action", 
		"actionPreAdaptive", "actionPostAdaptive", "argAction", "arg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'transitions'", "'from'", "'to'", "'symbol'", "'call'", "'preAdaptiveFunction'", 
		"'('", "')'", "'postAdaptiveFunction'", "','", "'submachines'", "'submachine'", 
		"'main'", "'state'", "'start'", "'accepting'", "'actions'", "'adaptiveAction'", 
		"'?'", "'*'", "'local'", "'generator'", "'action'", "'query'", "'remove'", 
		"'add'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ID", "DIG", "CAR", "BR"
	};
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
	public String getGrammarFileName() { return "AAS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AASParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AdaptiveAutomatonContext extends ParserRuleContext {
		public List<TransitionsContext> transitions() {
			return getRuleContexts(TransitionsContext.class);
		}
		public TransitionsContext transitions(int i) {
			return getRuleContext(TransitionsContext.class,i);
		}
		public List<SubmachinesContext> submachines() {
			return getRuleContexts(SubmachinesContext.class);
		}
		public SubmachinesContext submachines(int i) {
			return getRuleContext(SubmachinesContext.class,i);
		}
		public List<ActionsContext> actions() {
			return getRuleContexts(ActionsContext.class);
		}
		public ActionsContext actions(int i) {
			return getRuleContext(ActionsContext.class,i);
		}
		public AdaptiveAutomatonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adaptiveAutomaton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterAdaptiveAutomaton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitAdaptiveAutomaton(this);
		}
	}

	public final AdaptiveAutomatonContext adaptiveAutomaton() throws RecognitionException {
		AdaptiveAutomatonContext _localctx = new AdaptiveAutomatonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_adaptiveAutomaton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__16))) != 0)) {
				{
				setState(59);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(56);
					transitions();
					}
					break;
				case T__10:
					{
					setState(57);
					submachines();
					}
					break;
				case T__16:
					{
					setState(58);
					actions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(63);
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

	public static class TransitionsContext extends ParserRuleContext {
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public TransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterTransitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitTransitions(this);
		}
	}

	public final TransitionsContext transitions() throws RecognitionException {
		TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_transitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				transition();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class TransitionContext extends ParserRuleContext {
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public StimuliContext stimuli() {
			return getRuleContext(StimuliContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public List<TransPreAdaptiveContext> transPreAdaptive() {
			return getRuleContexts(TransPreAdaptiveContext.class);
		}
		public TransPreAdaptiveContext transPreAdaptive(int i) {
			return getRuleContext(TransPreAdaptiveContext.class,i);
		}
		public List<TransPostAdaptiveContext> transPostAdaptive() {
			return getRuleContexts(TransPostAdaptiveContext.class);
		}
		public TransPostAdaptiveContext transPostAdaptive(int i) {
			return getRuleContext(TransPostAdaptiveContext.class,i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			from();
			setState(71);
			stimuli();
			setState(72);
			to();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(73);
				transPreAdaptive();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(79);
				transPostAdaptive();
				}
				}
				setState(84);
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

	public static class FromContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitFrom(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__1);
			setState(86);
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

	public static class ToContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitTo(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__2);
			setState(89);
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

	public static class StimuliContext extends ParserRuleContext {
		public SimboloContext simbolo() {
			return getRuleContext(SimboloContext.class,0);
		}
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public StimuliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stimuli; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterStimuli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitStimuli(this);
		}
	}

	public final StimuliContext stimuli() throws RecognitionException {
		StimuliContext _localctx = new StimuliContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stimuli);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				simbolo();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				chamada();
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

	public static class SimboloContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public SimboloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simbolo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterSimbolo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitSimbolo(this);
		}
	}

	public final SimboloContext simbolo() throws RecognitionException {
		SimboloContext _localctx = new SimboloContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simbolo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__3);
			setState(96);
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

	public static class ChamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitChamada(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_chamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__4);
			setState(99);
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

	public static class TransPreAdaptiveContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public ArgLstContext argLst() {
			return getRuleContext(ArgLstContext.class,0);
		}
		public TransPreAdaptiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transPreAdaptive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterTransPreAdaptive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitTransPreAdaptive(this);
		}
	}

	public final TransPreAdaptiveContext transPreAdaptive() throws RecognitionException {
		TransPreAdaptiveContext _localctx = new TransPreAdaptiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transPreAdaptive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__5);
			setState(102);
			match(ID);
			setState(103);
			match(T__6);
			setState(104);
			argLst();
			setState(105);
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

	public static class TransPostAdaptiveContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public ArgLstContext argLst() {
			return getRuleContext(ArgLstContext.class,0);
		}
		public TransPostAdaptiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transPostAdaptive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterTransPostAdaptive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitTransPostAdaptive(this);
		}
	}

	public final TransPostAdaptiveContext transPostAdaptive() throws RecognitionException {
		TransPostAdaptiveContext _localctx = new TransPostAdaptiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transPostAdaptive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__8);
			setState(108);
			match(ID);
			setState(109);
			match(T__6);
			setState(110);
			argLst();
			setState(111);
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

	public static class ArgLstContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgLstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argLst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterArgLst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitArgLst(this);
		}
	}

	public final ArgLstContext argLst() throws RecognitionException {
		ArgLstContext _localctx = new ArgLstContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argLst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			arg();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(114);
				match(T__9);
				setState(115);
				arg();
				}
				}
				setState(120);
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

	public static class SubmachinesContext extends ParserRuleContext {
		public List<SubmachineContext> submachine() {
			return getRuleContexts(SubmachineContext.class);
		}
		public SubmachineContext submachine(int i) {
			return getRuleContext(SubmachineContext.class,i);
		}
		public SubmachinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_submachines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterSubmachines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitSubmachines(this);
		}
	}

	public final SubmachinesContext submachines() throws RecognitionException {
		SubmachinesContext _localctx = new SubmachinesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_submachines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__10);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				submachine();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
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

	public static class SubmachineContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public SubmachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_submachine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterSubmachine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitSubmachine(this);
		}
	}

	public final SubmachineContext submachine() throws RecognitionException {
		SubmachineContext _localctx = new SubmachineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_submachine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__11);
			setState(128);
			match(ID);
			setState(129);
			main();
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				state();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
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

	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(135);
				match(T__12);
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public InicialContext inicial() {
			return getRuleContext(InicialContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__13);
			setState(139);
			match(ID);
			setState(141);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(140);
				inicial();
				}
			}

			setState(144);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(143);
				terminal();
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

	public static class InicialContext extends ParserRuleContext {
		public InicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitInicial(this);
		}
	}

	public final InicialContext inicial() throws RecognitionException {
		InicialContext _localctx = new InicialContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inicial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__14);
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

	public static class TerminalContext extends ParserRuleContext {
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_terminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__15);
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

	public static class ActionsContext extends ParserRuleContext {
		public List<AdaptiveActionContext> adaptiveAction() {
			return getRuleContexts(AdaptiveActionContext.class);
		}
		public AdaptiveActionContext adaptiveAction(int i) {
			return getRuleContext(AdaptiveActionContext.class,i);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitActions(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__16);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				adaptiveAction();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
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

	public static class AdaptiveActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public ParamLstContext paramLst() {
			return getRuleContext(ParamLstContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public GeneratorContext generator() {
			return getRuleContext(GeneratorContext.class,0);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public AdaptiveActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adaptiveAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterAdaptiveAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitAdaptiveAction(this);
		}
	}

	public final AdaptiveActionContext adaptiveAction() throws RecognitionException {
		AdaptiveActionContext _localctx = new AdaptiveActionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_adaptiveAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__17);
			setState(157);
			match(ID);
			setState(158);
			match(T__6);
			setState(159);
			paramLst();
			setState(160);
			match(T__7);
			setState(162);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(161);
				local();
				}
			}

			setState(165);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(164);
				generator();
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(167);
				action();
				}
				}
				setState(172);
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

	public static class ParamLstContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamLstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramLst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterParamLst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitParamLst(this);
		}
	}

	public final ParamLstContext paramLst() throws RecognitionException {
		ParamLstContext _localctx = new ParamLstContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_paramLst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			param();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(174);
				match(T__9);
				setState(175);
				param();
				}
				}
				setState(180);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(181);
				match(T__18);
				}
			}

			setState(184);
			match(ID);
			setState(186);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(185);
				match(T__19);
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

	public static class LocalContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AASParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AASParser.ID, i);
		}
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitLocal(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_local);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__20);
			setState(189);
			match(T__18);
			setState(190);
			match(ID);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(191);
				match(T__9);
				setState(192);
				match(T__18);
				setState(193);
				match(ID);
				}
				}
				setState(198);
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

	public static class GeneratorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AASParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AASParser.ID, i);
		}
		public GeneratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterGenerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitGenerator(this);
		}
	}

	public final GeneratorContext generator() throws RecognitionException {
		GeneratorContext _localctx = new GeneratorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_generator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__21);
			setState(200);
			match(ID);
			setState(201);
			match(T__19);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(202);
				match(T__9);
				setState(203);
				match(ID);
				setState(204);
				match(T__19);
				}
				}
				setState(209);
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

	public static class ActionContext extends ParserRuleContext {
		public ArgActionContext argAction() {
			return getRuleContext(ArgActionContext.class,0);
		}
		public List<ActionPreAdaptiveContext> actionPreAdaptive() {
			return getRuleContexts(ActionPreAdaptiveContext.class);
		}
		public ActionPreAdaptiveContext actionPreAdaptive(int i) {
			return getRuleContext(ActionPreAdaptiveContext.class,i);
		}
		public List<ActionPostAdaptiveContext> actionPostAdaptive() {
			return getRuleContexts(ActionPostAdaptiveContext.class);
		}
		public ActionPostAdaptiveContext actionPostAdaptive(int i) {
			return getRuleContext(ActionPostAdaptiveContext.class,i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__22);
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(212);
			argAction();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(213);
				actionPreAdaptive();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(219);
				actionPostAdaptive();
				}
				}
				setState(224);
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

	public static class ActionPreAdaptiveContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public ArgLstContext argLst() {
			return getRuleContext(ArgLstContext.class,0);
		}
		public ActionPreAdaptiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionPreAdaptive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterActionPreAdaptive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitActionPreAdaptive(this);
		}
	}

	public final ActionPreAdaptiveContext actionPreAdaptive() throws RecognitionException {
		ActionPreAdaptiveContext _localctx = new ActionPreAdaptiveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_actionPreAdaptive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__5);
			setState(226);
			match(ID);
			setState(227);
			match(T__6);
			setState(228);
			argLst();
			setState(229);
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

	public static class ActionPostAdaptiveContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public ArgLstContext argLst() {
			return getRuleContext(ArgLstContext.class,0);
		}
		public ActionPostAdaptiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionPostAdaptive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterActionPostAdaptive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitActionPostAdaptive(this);
		}
	}

	public final ActionPostAdaptiveContext actionPostAdaptive() throws RecognitionException {
		ActionPostAdaptiveContext _localctx = new ActionPostAdaptiveContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_actionPostAdaptive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__8);
			setState(232);
			match(ID);
			setState(233);
			match(T__6);
			setState(234);
			argLst();
			setState(235);
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

	public static class ArgActionContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterArgAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitArgAction(this);
		}
	}

	public final ArgActionContext argAction() throws RecognitionException {
		ArgActionContext _localctx = new ArgActionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			arg();
			setState(238);
			arg();
			setState(239);
			arg();
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AASParser.ID, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AASListener ) ((AASListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(241);
				match(T__18);
				}
			}

			setState(244);
			match(ID);
			setState(246);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(245);
				match(T__19);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\3\3\3\6\3E\n\3\r\3\16\3F\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13"+
		"\4\3\4\7\4S\n\4\f\4\16\4V\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7`\n"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\r\3\r\6\r~\n\r\r\r\16"+
		"\r\177\3\16\3\16\3\16\3\16\6\16\u0086\n\16\r\16\16\16\u0087\3\17\5\17"+
		"\u008b\n\17\3\20\3\20\3\20\5\20\u0090\n\20\3\20\5\20\u0093\n\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\6\23\u009b\n\23\r\23\16\23\u009c\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00a5\n\24\3\24\5\24\u00a8\n\24\3\24\7\24\u00ab\n"+
		"\24\f\24\16\24\u00ae\13\24\3\25\3\25\3\25\7\25\u00b3\n\25\f\25\16\25\u00b6"+
		"\13\25\3\26\5\26\u00b9\n\26\3\26\3\26\5\26\u00bd\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\7\27\u00c5\n\27\f\27\16\27\u00c8\13\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\7\30\u00d0\n\30\f\30\16\30\u00d3\13\30\3\31\3\31\3\31\3"+
		"\31\7\31\u00d9\n\31\f\31\16\31\u00dc\13\31\3\31\7\31\u00df\n\31\f\31\16"+
		"\31\u00e2\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\5\35\u00f5\n\35\3\35\3\35\5\35\u00f9\n"+
		"\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\3\3\2\32\34\u00f8\2?\3\2\2\2\4B\3\2\2\2\6H\3\2\2\2\bW\3\2\2"+
		"\2\nZ\3\2\2\2\f_\3\2\2\2\16a\3\2\2\2\20d\3\2\2\2\22g\3\2\2\2\24m\3\2\2"+
		"\2\26s\3\2\2\2\30{\3\2\2\2\32\u0081\3\2\2\2\34\u008a\3\2\2\2\36\u008c"+
		"\3\2\2\2 \u0094\3\2\2\2\"\u0096\3\2\2\2$\u0098\3\2\2\2&\u009e\3\2\2\2"+
		"(\u00af\3\2\2\2*\u00b8\3\2\2\2,\u00be\3\2\2\2.\u00c9\3\2\2\2\60\u00d4"+
		"\3\2\2\2\62\u00e3\3\2\2\2\64\u00e9\3\2\2\2\66\u00ef\3\2\2\28\u00f4\3\2"+
		"\2\2:>\5\4\3\2;>\5\30\r\2<>\5$\23\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>A\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BD\7\3\2\2CE\5\6\4\2DC"+
		"\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\5\3\2\2\2HI\5\b\5\2IJ\5\f\7\2"+
		"JN\5\n\6\2KM\5\22\n\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2\2"+
		"\2PN\3\2\2\2QS\5\24\13\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3"+
		"\2\2\2VT\3\2\2\2WX\7\4\2\2XY\7\35\2\2Y\t\3\2\2\2Z[\7\5\2\2[\\\7\35\2\2"+
		"\\\13\3\2\2\2]`\5\16\b\2^`\5\20\t\2_]\3\2\2\2_^\3\2\2\2`\r\3\2\2\2ab\7"+
		"\6\2\2bc\7\35\2\2c\17\3\2\2\2de\7\7\2\2ef\7\35\2\2f\21\3\2\2\2gh\7\b\2"+
		"\2hi\7\35\2\2ij\7\t\2\2jk\5\26\f\2kl\7\n\2\2l\23\3\2\2\2mn\7\13\2\2no"+
		"\7\35\2\2op\7\t\2\2pq\5\26\f\2qr\7\n\2\2r\25\3\2\2\2sx\58\35\2tu\7\f\2"+
		"\2uw\58\35\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\27\3\2\2\2zx\3\2"+
		"\2\2{}\7\r\2\2|~\5\32\16\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\31\3\2\2\2\u0081\u0082\7\16\2\2\u0082\u0083\7\35\2\2\u0083"+
		"\u0085\5\34\17\2\u0084\u0086\5\36\20\2\u0085\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\33\3\2\2\2\u0089"+
		"\u008b\7\17\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\35\3\2\2"+
		"\2\u008c\u008d\7\20\2\2\u008d\u008f\7\35\2\2\u008e\u0090\5 \21\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0093\5\""+
		"\22\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\37\3\2\2\2\u0094\u0095"+
		"\7\21\2\2\u0095!\3\2\2\2\u0096\u0097\7\22\2\2\u0097#\3\2\2\2\u0098\u009a"+
		"\7\23\2\2\u0099\u009b\5&\24\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d%\3\2\2\2\u009e\u009f\7"+
		"\24\2\2\u009f\u00a0\7\35\2\2\u00a0\u00a1\7\t\2\2\u00a1\u00a2\5(\25\2\u00a2"+
		"\u00a4\7\n\2\2\u00a3\u00a5\5,\27\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\5.\30\2\u00a7\u00a6\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\5\60\31\2\u00aa\u00a9\3"+
		"\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\'\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b4\5*\26\2\u00b0\u00b1\7\f\2\2"+
		"\u00b1\u00b3\5*\26\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5)\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00b9\7\25\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00ba\u00bc\7\35\2\2\u00bb\u00bd\7\26\2\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd+\3\2\2\2\u00be\u00bf\7\27\2\2\u00bf\u00c0\7\25\2"+
		"\2\u00c0\u00c6\7\35\2\2\u00c1\u00c2\7\f\2\2\u00c2\u00c3\7\25\2\2\u00c3"+
		"\u00c5\7\35\2\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7-\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca"+
		"\7\30\2\2\u00ca\u00cb\7\35\2\2\u00cb\u00d1\7\26\2\2\u00cc\u00cd\7\f\2"+
		"\2\u00cd\u00ce\7\35\2\2\u00ce\u00d0\7\26\2\2\u00cf\u00cc\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2/\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\31\2\2\u00d5\u00d6\t\2\2\2\u00d6\u00da"+
		"\5\66\34\2\u00d7\u00d9\5\62\32\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e0\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00df\5\64\33\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\61\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e4\7\b\2\2\u00e4\u00e5\7\35\2\2\u00e5\u00e6\7\t\2\2"+
		"\u00e6\u00e7\5\26\f\2\u00e7\u00e8\7\n\2\2\u00e8\63\3\2\2\2\u00e9\u00ea"+
		"\7\13\2\2\u00ea\u00eb\7\35\2\2\u00eb\u00ec\7\t\2\2\u00ec\u00ed\5\26\f"+
		"\2\u00ed\u00ee\7\n\2\2\u00ee\65\3\2\2\2\u00ef\u00f0\58\35\2\u00f0\u00f1"+
		"\58\35\2\u00f1\u00f2\58\35\2\u00f2\67\3\2\2\2\u00f3\u00f5\7\25\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\7\35"+
		"\2\2\u00f7\u00f9\7\26\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"9\3\2\2\2\33=?FNT_x\177\u0087\u008a\u008f\u0092\u009c\u00a4\u00a7\u00ac"+
		"\u00b4\u00b8\u00bc\u00c6\u00d1\u00da\u00e0\u00f4\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}