// Generated from Demo.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PRINT=7, READ=8, WHILE=9, 
		FOR=10, IF=11, FUNCTION=12, DO=13, RETURN=14, TOINT=15, TOREAL=16, TINT=17, 
		TREAL=18, TSTRING=19, TTAB=20, END=21, ID=22, STRING=23, MULT=24, DIV=25, 
		ADD=26, SUB=27, REAL=28, INT=29, EQUALL=30, NOTEQUAL=31, EQUAL=32, GREATER=33, 
		LESS=34, GREATER_EQUAL=35, LESS_EQUAL=36, NEWLINE=37, WS=38;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_stat = 2, RULE_block2 = 3, RULE_blockif = 4, 
		RULE_func = 5, RULE_type = 6, RULE_ret = 7, RULE_param = 8, RULE_blockfunc = 9, 
		RULE_expr0 = 10, RULE_expr1 = 11, RULE_expr2 = 12, RULE_cond = 13, RULE_rep = 14, 
		RULE_cnt = 15, RULE_sign = 16, RULE_tabelem = 17, RULE_value = 18, RULE_valuet = 19, 
		RULE_tab = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "stat", "block2", "blockif", "func", "type", "ret", 
			"param", "blockfunc", "expr0", "expr1", "expr2", "cond", "rep", "cnt", 
			"sign", "tabelem", "value", "valuet", "tab"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'print'", "'read'", 
			"'while'", "'for'", "'if'", "'function'", "'do'", "'return'", "'(int)'", 
			"'(real)'", "'int'", "'real'", "'string'", "'tab'", "'end'", null, null, 
			"'*'", "'/'", "'+'", "'-'", null, null, "'=='", "'!='", "'='", "'>'", 
			"'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PRINT", "READ", "WHILE", "FOR", 
			"IF", "FUNCTION", "DO", "RETURN", "TOINT", "TOREAL", "TINT", "TREAL", 
			"TSTRING", "TTAB", "END", "ID", "STRING", "MULT", "DIV", "ADD", "SUB", 
			"REAL", "INT", "EQUALL", "NOTEQUAL", "EQUAL", "GREATER", "LESS", "GREATER_EQUAL", 
			"LESS_EQUAL", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DemoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << FOR) | (1L << IF) | (1L << FUNCTION) | (1L << DO) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRINT:
				case READ:
				case FOR:
				case IF:
				case DO:
				case ID:
					{
					setState(44);
					stat();
					}
					break;
				case FUNCTION:
					{
					setState(45);
					func();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(48);
				match(NEWLINE);
				}
				}
				setState(53);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintTabElemContext extends StatContext {
		public TerminalNode PRINT() { return getToken(DemoParser.PRINT, 0); }
		public TabelemContext tabelem() {
			return getRuleContext(TabelemContext.class,0);
		}
		public PrintTabElemContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterPrintTabElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitPrintTabElem(this);
		}
	}
	public static class PrintContext extends StatContext {
		public TerminalNode PRINT() { return getToken(DemoParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitPrint(this);
		}
	}
	public static class ReadContext extends StatContext {
		public TerminalNode READ() { return getToken(DemoParser.READ, 0); }
		public ValuetContext valuet() {
			return getRuleContext(ValuetContext.class,0);
		}
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitRead(this);
		}
	}
	public static class ForContext extends StatContext {
		public TerminalNode FOR() { return getToken(DemoParser.FOR, 0); }
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DemoParser.NEWLINE, 0); }
		public Block2Context block2() {
			return getRuleContext(Block2Context.class,0);
		}
		public TerminalNode END() { return getToken(DemoParser.END, 0); }
		public ForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFor(this);
		}
	}
	public static class AssignTabElemContext extends StatContext {
		public TabelemContext tabelem() {
			return getRuleContext(TabelemContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(DemoParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignTabElemContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterAssignTabElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitAssignTabElem(this);
		}
	}
	public static class IfContext extends StatContext {
		public TerminalNode IF() { return getToken(DemoParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DemoParser.NEWLINE, 0); }
		public BlockifContext blockif() {
			return getRuleContext(BlockifContext.class,0);
		}
		public TerminalNode END() { return getToken(DemoParser.END, 0); }
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIf(this);
		}
	}
	public static class DoFuncContext extends StatContext {
		public TerminalNode DO() { return getToken(DemoParser.DO, 0); }
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public DoFuncContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterDoFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitDoFunc(this);
		}
	}
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(DemoParser.EQUAL, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitAssign(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(FOR);
				setState(55);
				match(T__0);
				setState(56);
				rep();
				setState(57);
				match(T__1);
				setState(58);
				match(NEWLINE);
				setState(59);
				block2();
				setState(60);
				match(END);
				}
				break;
			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(IF);
				setState(63);
				match(T__0);
				setState(64);
				cond();
				setState(65);
				match(T__1);
				setState(66);
				match(NEWLINE);
				setState(67);
				blockif();
				setState(68);
				match(END);
				}
				break;
			case 3:
				_localctx = new DoFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(DO);
				setState(71);
				match(ID);
				}
				break;
			case 4:
				_localctx = new AssignTabElemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				tabelem();
				setState(73);
				match(EQUAL);
				setState(74);
				value();
				}
				break;
			case 5:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(ID);
				setState(77);
				match(EQUAL);
				setState(78);
				expr0();
				}
				break;
			case 6:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				match(PRINT);
				setState(80);
				match(ID);
				}
				break;
			case 7:
				_localctx = new PrintTabElemContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				match(PRINT);
				setState(82);
				tabelem();
				}
				break;
			case 8:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				match(READ);
				setState(84);
				valuet();
				setState(85);
				match(ID);
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

	public static class Block2Context extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Block2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBlock2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBlock2(this);
		}
	}

	public final Block2Context block2() throws RecognitionException {
		Block2Context _localctx = new Block2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_block2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << FOR) | (1L << IF) | (1L << DO) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << FOR) | (1L << IF) | (1L << DO) | (1L << ID))) != 0)) {
					{
					setState(89);
					stat();
					}
				}

				setState(92);
				match(NEWLINE);
				}
				}
				setState(97);
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

	public static class BlockifContext extends ParserRuleContext {
		public Block2Context block2() {
			return getRuleContext(Block2Context.class,0);
		}
		public BlockifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBlockif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBlockif(this);
		}
	}

	public final BlockifContext blockif() throws RecognitionException {
		BlockifContext _localctx = new BlockifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			block2();
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(DemoParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(DemoParser.NEWLINE, 0); }
		public BlockfuncContext blockfunc() {
			return getRuleContext(BlockfuncContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public TerminalNode END() { return getToken(DemoParser.END, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(FUNCTION);
			setState(101);
			type();
			setState(102);
			match(ID);
			setState(103);
			match(NEWLINE);
			setState(104);
			blockfunc();
			setState(105);
			ret();
			setState(106);
			match(END);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TINT() { return getToken(DemoParser.TINT, 0); }
		public TerminalNode TREAL() { return getToken(DemoParser.TREAL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==TINT || _la==TREAL) ) {
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DemoParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(DemoParser.NEWLINE, 0); }
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitRet(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(RETURN);
			setState(111);
			match(ID);
			setState(112);
			match(NEWLINE);
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
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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

	public static class BlockfuncContext extends ParserRuleContext {
		public Block2Context block2() {
			return getRuleContext(Block2Context.class,0);
		}
		public BlockfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBlockfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBlockfunc(this);
		}
	}

	public final BlockfuncContext blockfunc() throws RecognitionException {
		BlockfuncContext _localctx = new BlockfuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			block2();
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

	public static class Expr0Context extends ParserRuleContext {
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends Expr0Context {
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public StringContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitString(this);
		}
	}
	public static class IntrealContext extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public IntrealContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIntreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIntreal(this);
		}
	}
	public static class Tab0Context extends Expr0Context {
		public TabContext tab() {
			return getRuleContext(TabContext.class,0);
		}
		public Tab0Context(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterTab0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitTab0(this);
		}
	}
	public static class ReturnContext extends Expr0Context {
		public TerminalNode DO() { return getToken(DemoParser.DO, 0); }
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public ReturnContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitReturn(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr0);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case TOINT:
			case TOREAL:
			case ID:
			case REAL:
			case INT:
				_localctx = new IntrealContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				expr1(0);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(STRING);
				}
				break;
			case TINT:
			case TREAL:
				_localctx = new Tab0Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				tab();
				}
				break;
			case DO:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(DO);
				setState(122);
				match(ID);
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

	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public SingleContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitSingle(this);
		}
	}
	public static class DivContext extends Expr1Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode DIV() { return getToken(DemoParser.DIV, 0); }
		public DivContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitDiv(this);
		}
	}
	public static class AddContext extends Expr1Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(DemoParser.ADD, 0); }
		public AddContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitAdd(this);
		}
	}
	public static class SubContext extends Expr1Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode SUB() { return getToken(DemoParser.SUB, 0); }
		public SubContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitSub(this);
		}
	}
	public static class MultContext extends Expr1Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode MULT() { return getToken(DemoParser.MULT, 0); }
		public MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitMult(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		return expr1(0);
	}

	private Expr1Context expr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr1Context _localctx = new Expr1Context(_ctx, _parentState);
		Expr1Context _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(126);
			expr2();
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new Expr1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(128);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(129);
						match(MULT);
						setState(130);
						expr1(5);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Expr1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(131);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(132);
						match(DIV);
						setState(133);
						expr1(4);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new Expr1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(134);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(135);
						match(ADD);
						setState(136);
						expr1(3);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new Expr1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(137);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(138);
						match(SUB);
						setState(139);
						expr1(2);
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValContext extends Expr2Context {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitVal(this);
		}
	}
	public static class ParContext extends Expr2Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ParContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitPar(this);
		}
	}
	public static class TointContext extends Expr2Context {
		public TerminalNode TOINT() { return getToken(DemoParser.TOINT, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TointContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterToint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitToint(this);
		}
	}
	public static class TorealContext extends Expr2Context {
		public TerminalNode TOREAL() { return getToken(DemoParser.TOREAL, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TorealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterToreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitToreal(this);
		}
	}
	public static class IdContext extends Expr2Context {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public IdContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitId(this);
		}
	}
	public static class ElementContext extends Expr2Context {
		public TabelemContext tabelem() {
			return getRuleContext(TabelemContext.class,0);
		}
		public ElementContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitElement(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr2);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				value();
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(ID);
				}
				break;
			case 3:
				_localctx = new ElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				tabelem();
				}
				break;
			case 4:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(TOINT);
				setState(149);
				expr2();
				}
				break;
			case 5:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(TOREAL);
				setState(151);
				expr2();
				}
				break;
			case 6:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(T__0);
				setState(153);
				expr1(0);
				setState(154);
				match(T__1);
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

	public static class CondContext extends ParserRuleContext {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			expr1(0);
			setState(159);
			sign();
			setState(160);
			expr1(0);
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

	public static class RepContext extends ParserRuleContext {
		public CntContext cnt() {
			return getRuleContext(CntContext.class,0);
		}
		public RepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterRep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitRep(this);
		}
	}

	public final RepContext rep() throws RecognitionException {
		RepContext _localctx = new RepContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			cnt();
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

	public static class CntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public CntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterCnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitCnt(this);
		}
	}

	public final CntContext cnt() throws RecognitionException {
		CntContext _localctx = new CntContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode EQUALL() { return getToken(DemoParser.EQUALL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(DemoParser.NOTEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(DemoParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(DemoParser.LESS, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(DemoParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(DemoParser.LESS_EQUAL, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALL) | (1L << NOTEQUAL) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) ) {
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

	public static class TabelemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DemoParser.ID, 0); }
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TabelemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabelem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterTabelem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitTabelem(this);
		}
	}

	public final TabelemContext tabelem() throws RecognitionException {
		TabelemContext _localctx = new TabelemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tabelem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(T__2);
			setState(170);
			match(INT);
			setState(171);
			match(T__3);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode REAL() { return getToken(DemoParser.REAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==INT) ) {
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

	public static class ValuetContext extends ParserRuleContext {
		public TerminalNode TINT() { return getToken(DemoParser.TINT, 0); }
		public TerminalNode TREAL() { return getToken(DemoParser.TREAL, 0); }
		public ValuetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterValuet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitValuet(this);
		}
	}

	public final ValuetContext valuet() throws RecognitionException {
		ValuetContext _localctx = new ValuetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valuet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==TINT || _la==TREAL) ) {
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

	public static class TabContext extends ParserRuleContext {
		public TerminalNode TINT() { return getToken(DemoParser.TINT, 0); }
		public TerminalNode TTAB() { return getToken(DemoParser.TTAB, 0); }
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode TREAL() { return getToken(DemoParser.TREAL, 0); }
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitTab(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tab);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(TINT);
				setState(178);
				match(TTAB);
				setState(179);
				match(T__4);
				setState(180);
				match(INT);
				setState(181);
				match(T__5);
				}
				break;
			case TREAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(TREAL);
				setState(183);
				match(TTAB);
				setState(184);
				match(T__4);
				setState(185);
				match(INT);
				setState(186);
				match(T__5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr1_sempred((Expr1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr1_sempred(Expr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\5\3\61\n\3\3"+
		"\3\7\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\5\5]\n\5\3\5\7\5`\n\5\f\5\16\5c\13"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008f\n\r\f\r\16\r\u0092\13\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009f\n\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00be\n\26\3\26\2\3\30\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\6\3\2\23\24\4\2\30\30\37\37\4\2 !#&\3\2\36\37\2\u00c3"+
		"\2,\3\2\2\2\4\65\3\2\2\2\6Y\3\2\2\2\ba\3\2\2\2\nd\3\2\2\2\ff\3\2\2\2\16"+
		"n\3\2\2\2\20p\3\2\2\2\22t\3\2\2\2\24v\3\2\2\2\26}\3\2\2\2\30\177\3\2\2"+
		"\2\32\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\""+
		"\u00a8\3\2\2\2$\u00aa\3\2\2\2&\u00af\3\2\2\2(\u00b1\3\2\2\2*\u00bd\3\2"+
		"\2\2,-\5\4\3\2-\3\3\2\2\2.\61\5\6\4\2/\61\5\f\7\2\60.\3\2\2\2\60/\3\2"+
		"\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\64\7\'\2\2\63\60\3\2\2\2\64\67\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\289\7\f\2\2"+
		"9:\7\3\2\2:;\5\36\20\2;<\7\4\2\2<=\7\'\2\2=>\5\b\5\2>?\7\27\2\2?Z\3\2"+
		"\2\2@A\7\r\2\2AB\7\3\2\2BC\5\34\17\2CD\7\4\2\2DE\7\'\2\2EF\5\n\6\2FG\7"+
		"\27\2\2GZ\3\2\2\2HI\7\17\2\2IZ\7\30\2\2JK\5$\23\2KL\7\"\2\2LM\5&\24\2"+
		"MZ\3\2\2\2NO\7\30\2\2OP\7\"\2\2PZ\5\26\f\2QR\7\t\2\2RZ\7\30\2\2ST\7\t"+
		"\2\2TZ\5$\23\2UV\7\n\2\2VW\5(\25\2WX\7\30\2\2XZ\3\2\2\2Y8\3\2\2\2Y@\3"+
		"\2\2\2YH\3\2\2\2YJ\3\2\2\2YN\3\2\2\2YQ\3\2\2\2YS\3\2\2\2YU\3\2\2\2Z\7"+
		"\3\2\2\2[]\5\6\4\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\7\'\2\2_\\\3\2\2"+
		"\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\t\3\2\2\2ca\3\2\2\2de\5\b\5\2e\13\3"+
		"\2\2\2fg\7\16\2\2gh\5\16\b\2hi\7\30\2\2ij\7\'\2\2jk\5\24\13\2kl\5\20\t"+
		"\2lm\7\27\2\2m\r\3\2\2\2no\t\2\2\2o\17\3\2\2\2pq\7\20\2\2qr\7\30\2\2r"+
		"s\7\'\2\2s\21\3\2\2\2tu\7\30\2\2u\23\3\2\2\2vw\5\b\5\2w\25\3\2\2\2x~\5"+
		"\30\r\2y~\7\31\2\2z~\5*\26\2{|\7\17\2\2|~\7\30\2\2}x\3\2\2\2}y\3\2\2\2"+
		"}z\3\2\2\2}{\3\2\2\2~\27\3\2\2\2\177\u0080\b\r\1\2\u0080\u0081\5\32\16"+
		"\2\u0081\u0090\3\2\2\2\u0082\u0083\f\6\2\2\u0083\u0084\7\32\2\2\u0084"+
		"\u008f\5\30\r\7\u0085\u0086\f\5\2\2\u0086\u0087\7\33\2\2\u0087\u008f\5"+
		"\30\r\6\u0088\u0089\f\4\2\2\u0089\u008a\7\34\2\2\u008a\u008f\5\30\r\5"+
		"\u008b\u008c\f\3\2\2\u008c\u008d\7\35\2\2\u008d\u008f\5\30\r\4\u008e\u0082"+
		"\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u008b\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\31\3\2\2"+
		"\2\u0092\u0090\3\2\2\2\u0093\u009f\5&\24\2\u0094\u009f\7\30\2\2\u0095"+
		"\u009f\5$\23\2\u0096\u0097\7\21\2\2\u0097\u009f\5\32\16\2\u0098\u0099"+
		"\7\22\2\2\u0099\u009f\5\32\16\2\u009a\u009b\7\3\2\2\u009b\u009c\5\30\r"+
		"\2\u009c\u009d\7\4\2\2\u009d\u009f\3\2\2\2\u009e\u0093\3\2\2\2\u009e\u0094"+
		"\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u0098\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009f\33\3\2\2\2\u00a0\u00a1\5\30\r\2\u00a1\u00a2\5\"\22"+
		"\2\u00a2\u00a3\5\30\r\2\u00a3\35\3\2\2\2\u00a4\u00a5\5 \21\2\u00a5\37"+
		"\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7!\3\2\2\2\u00a8\u00a9\t\4\2\2\u00a9"+
		"#\3\2\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\7\37\2"+
		"\2\u00ad\u00ae\7\6\2\2\u00ae%\3\2\2\2\u00af\u00b0\t\5\2\2\u00b0\'\3\2"+
		"\2\2\u00b1\u00b2\t\2\2\2\u00b2)\3\2\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5"+
		"\7\26\2\2\u00b5\u00b6\7\7\2\2\u00b6\u00b7\7\37\2\2\u00b7\u00be\7\b\2\2"+
		"\u00b8\u00b9\7\24\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc"+
		"\7\37\2\2\u00bc\u00be\7\b\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b8\3\2\2\2"+
		"\u00be+\3\2\2\2\f\60\65Y\\a}\u008e\u0090\u009e\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}