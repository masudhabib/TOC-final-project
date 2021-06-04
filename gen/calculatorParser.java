// Generated from /Users/chinmaykelkar/Code/Harrisburg/Theory of Computation/TOC-final-project/FinalProject/calculator.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, INT=2, FLOAT=3, WHITESPACE=4, NEWLINE=5, LPAREN=6, RPAREN=7, 
		DOT=8, SQUAREROOT=9, SQUARE=10, LOG=11, ADD=12, SUBTRACT=13, MULTIPLY=14, 
		DIVIDE=15, MOD=16, SIN=17, COS=18, TAN=19, COT=20;
	public static final int
		RULE_start = 0, RULE_expression = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'('", "')'", "'.'", "'sqrt'", "'square'", 
			"'log'", "'+'", "'-'", "'*'", "'/'", "'%'", "'sin'", "'cos'", "'tan'", 
			"'cot'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "INT", "FLOAT", "WHITESPACE", "NEWLINE", "LPAREN", "RPAREN", 
			"DOT", "SQUAREROOT", "SQUARE", "LOG", "ADD", "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "MOD", "SIN", "COS", "TAN", "COT"
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
	public String getGrammarFileName() { return "calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(calculatorParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expression(0);
			setState(5);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesesContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(calculatorParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(calculatorParser.RPAREN, 0); }
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SquareContext extends ExpressionContext {
		public TerminalNode SQUARE() { return getToken(calculatorParser.SQUARE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SquareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitSquare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSquare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(calculatorParser.NUMBER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogContext extends ExpressionContext {
		public TerminalNode LOG() { return getToken(calculatorParser.LOG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubtractContext extends ExpressionContext {
		public Token addsuboperator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(calculatorParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(calculatorParser.SUBTRACT, 0); }
		public AddSubtractContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterAddSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitAddSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAddSubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SquareRootContext extends ExpressionContext {
		public TerminalNode SQUAREROOT() { return getToken(calculatorParser.SQUAREROOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SquareRootContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterSquareRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitSquareRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSquareRoot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrigFunctionsContext extends ExpressionContext {
		public Token trigOperators;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SIN() { return getToken(calculatorParser.SIN, 0); }
		public TerminalNode COS() { return getToken(calculatorParser.COS, 0); }
		public TerminalNode TAN() { return getToken(calculatorParser.TAN, 0); }
		public TerminalNode COT() { return getToken(calculatorParser.COT, 0); }
		public TrigFunctionsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterTrigFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitTrigFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitTrigFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivideModContext extends ExpressionContext {
		public Token multdivmodoperator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(calculatorParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(calculatorParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(calculatorParser.MOD, 0); }
		public MulDivideModContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).enterMulDivideMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculatorListener ) ((calculatorListener)listener).exitMulDivideMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMulDivideMod(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(8);
				match(LPAREN);
				setState(9);
				expression(0);
				setState(10);
				match(RPAREN);
				}
				break;
			case SQUAREROOT:
				{
				_localctx = new SquareRootContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12);
				match(SQUAREROOT);
				setState(13);
				expression(5);
				}
				break;
			case SQUARE:
				{
				_localctx = new SquareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14);
				match(SQUARE);
				setState(15);
				expression(4);
				}
				break;
			case LOG:
				{
				_localctx = new LogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				match(LOG);
				setState(17);
				expression(3);
				}
				break;
			case SIN:
			case COS:
			case TAN:
			case COT:
				{
				_localctx = new TrigFunctionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				((TrigFunctionsContext)_localctx).trigOperators = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIN) | (1L << COS) | (1L << TAN) | (1L << COT))) != 0)) ) {
					((TrigFunctionsContext)_localctx).trigOperators = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(19);
				expression(2);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(29);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivideModContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(23);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(24);
						((MulDivideModContext)_localctx).multdivmodoperator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
							((MulDivideModContext)_localctx).multdivmodoperator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(25);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(26);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(27);
						((AddSubtractContext)_localctx).addsuboperator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
							((AddSubtractContext)_localctx).addsuboperator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(28);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26%\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\30\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3\2\3\4"+
		"\4\2\4\2\5\3\2\23\26\3\2\20\22\3\2\16\17\2)\2\6\3\2\2\2\4\27\3\2\2\2\6"+
		"\7\5\4\3\2\7\b\7\2\2\3\b\3\3\2\2\2\t\n\b\3\1\2\n\13\7\b\2\2\13\f\5\4\3"+
		"\2\f\r\7\t\2\2\r\30\3\2\2\2\16\17\7\13\2\2\17\30\5\4\3\7\20\21\7\f\2\2"+
		"\21\30\5\4\3\6\22\23\7\r\2\2\23\30\5\4\3\5\24\25\t\2\2\2\25\30\5\4\3\4"+
		"\26\30\7\3\2\2\27\t\3\2\2\2\27\16\3\2\2\2\27\20\3\2\2\2\27\22\3\2\2\2"+
		"\27\24\3\2\2\2\27\26\3\2\2\2\30!\3\2\2\2\31\32\f\t\2\2\32\33\t\3\2\2\33"+
		" \5\4\3\n\34\35\f\b\2\2\35\36\t\4\2\2\36 \5\4\3\t\37\31\3\2\2\2\37\34"+
		"\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#!\3\2\2\2\5\27\37"+
		"!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}