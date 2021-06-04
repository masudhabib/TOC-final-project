// Generated from /Users/chinmaykelkar/Code/Harrisburg/Theory of Computation/TOC-final-project/FinalProject/calculator.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, INT=2, FLOAT=3, WHITESPACE=4, NEWLINE=5, LPAREN=6, RPAREN=7, 
		DOT=8, SQUAREROOT=9, SQUARE=10, LOG=11, ADD=12, SUBTRACT=13, MULTIPLY=14, 
		DIVIDE=15, MOD=16, SIN=17, COS=18, TAN=19, COT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "INT", "FLOAT", "WHITESPACE", "NEWLINE", "LPAREN", "RPAREN", 
			"DOT", "SQUAREROOT", "SQUARE", "LOG", "ADD", "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "MOD", "SIN", "COS", "TAN", "COT"
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


	public calculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2.\n\2\3\3\6\3\61\n\3\r\3\16"+
		"\3\62\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\3\4\6\4>\n\4\r\4\16\4?\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26\3\2\5\3\2\62;\5\2\13\13\17\17\"\"\3\2\f\f\2|\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7\67\3\2\2\2\tA\3\2\2\2\13E"+
		"\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25T\3\2\2\2\27"+
		"[\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i"+
		"\3\2\2\2%m\3\2\2\2\'q\3\2\2\2)u\3\2\2\2+.\5\5\3\2,.\5\7\4\2-+\3\2\2\2"+
		"-,\3\2\2\2.\4\3\2\2\2/\61\t\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2"+
		"\2\2\62\63\3\2\2\2\63\6\3\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\669\3\2\2"+
		"\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\5\21\t\2;=\3\2\2"+
		"\2<>\t\2\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\b\3\2\2\2AB\t\3"+
		"\2\2BC\3\2\2\2CD\b\5\2\2D\n\3\2\2\2EF\t\4\2\2FG\3\2\2\2GH\b\6\2\2H\f\3"+
		"\2\2\2IJ\7*\2\2J\16\3\2\2\2KL\7+\2\2L\20\3\2\2\2MN\7\60\2\2N\22\3\2\2"+
		"\2OP\7u\2\2PQ\7s\2\2QR\7t\2\2RS\7v\2\2S\24\3\2\2\2TU\7u\2\2UV\7s\2\2V"+
		"W\7w\2\2WX\7c\2\2XY\7t\2\2YZ\7g\2\2Z\26\3\2\2\2[\\\7n\2\2\\]\7q\2\2]^"+
		"\7i\2\2^\30\3\2\2\2_`\7-\2\2`\32\3\2\2\2ab\7/\2\2b\34\3\2\2\2cd\7,\2\2"+
		"d\36\3\2\2\2ef\7\61\2\2f \3\2\2\2gh\7\'\2\2h\"\3\2\2\2ij\7u\2\2jk\7k\2"+
		"\2kl\7p\2\2l$\3\2\2\2mn\7e\2\2no\7q\2\2op\7u\2\2p&\3\2\2\2qr\7v\2\2rs"+
		"\7c\2\2st\7p\2\2t(\3\2\2\2uv\7e\2\2vw\7q\2\2wx\7v\2\2x*\3\2\2\2\7\2-\62"+
		"\67?\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}