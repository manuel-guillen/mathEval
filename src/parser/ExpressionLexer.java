// Generated from Expression.g4 by ANTLR 4.4

	package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, NUMBER=28, VARIABLE=29, WHITESPACE=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'"
	};
	public static final String[] ruleNames = {
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "NUMBER", "VARIABLE", "WHITESPACE", "DIGIT"
	};


	    public void reportErrorsAsExceptions() {
	        addErrorListener(new BaseErrorListener() {
	            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
	                throw new ParseCancellationException(msg, e);
	            }
	        });
	    }


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\6\35\u00aa\n\35"+
		"\r\35\16\35\u00ab\3\35\3\35\6\35\u00b0\n\35\r\35\16\35\u00b1\5\35\u00b4"+
		"\n\35\3\36\6\36\u00b7\n\36\r\36\16\36\u00b8\3\37\6\37\u00bc\n\37\r\37"+
		"\16\37\u00bd\3\37\3\37\3 \6 \u00c3\n \r \16 \u00c4\2\2!\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2\3\2\5\4"+
		"\2C\\c|\4\2\13\13\"\"\3\2\62;\u00ca\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3A\3\2\2\2\5C\3\2"+
		"\2\2\7H\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rS\3\2\2\2\17W\3\2\2\2\21[\3\2"+
		"\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31h\3\2\2\2\33m\3\2\2\2\35r\3"+
		"\2\2\2\37v\3\2\2\2!{\3\2\2\2#\177\3\2\2\2%\u0083\3\2\2\2\'\u0086\3\2\2"+
		"\2)\u008b\3\2\2\2+\u0090\3\2\2\2-\u0094\3\2\2\2/\u0096\3\2\2\2\61\u009b"+
		"\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a6\3\2\2\29\u00a9\3\2"+
		"\2\2;\u00b6\3\2\2\2=\u00bb\3\2\2\2?\u00c2\3\2\2\2AB\7\61\2\2B\4\3\2\2"+
		"\2CD\7e\2\2DE\7q\2\2EF\7v\2\2FG\7j\2\2G\6\3\2\2\2HI\7e\2\2IJ\7q\2\2JK"+
		"\7u\2\2K\b\3\2\2\2LM\7`\2\2M\n\3\2\2\2NO\7c\2\2OP\7u\2\2PQ\7k\2\2QR\7"+
		"p\2\2R\f\3\2\2\2ST\7e\2\2TU\7u\2\2UV\7e\2\2V\16\3\2\2\2WX\7u\2\2XY\7i"+
		"\2\2YZ\7p\2\2Z\20\3\2\2\2[\\\7u\2\2\\]\7k\2\2]^\7p\2\2^\22\3\2\2\2_`\7"+
		"*\2\2`\24\3\2\2\2ab\7,\2\2b\26\3\2\2\2cd\7e\2\2de\7u\2\2ef\7e\2\2fg\7"+
		"j\2\2g\30\3\2\2\2hi\7c\2\2ij\7v\2\2jk\7c\2\2kl\7p\2\2l\32\3\2\2\2mn\7"+
		"u\2\2no\7g\2\2op\7e\2\2pq\7j\2\2q\34\3\2\2\2rs\7v\2\2st\7c\2\2tu\7p\2"+
		"\2u\36\3\2\2\2vw\7u\2\2wx\7s\2\2xy\7t\2\2yz\7v\2\2z \3\2\2\2{|\7e\2\2"+
		"|}\7q\2\2}~\7v\2\2~\"\3\2\2\2\177\u0080\7c\2\2\u0080\u0081\7d\2\2\u0081"+
		"\u0082\7u\2\2\u0082$\3\2\2\2\u0083\u0084\7n\2\2\u0084\u0085\7p\2\2\u0085"+
		"&\3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088\7q\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7j\2\2\u008a(\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7e\2\2\u008d"+
		"\u008e\7q\2\2\u008e\u008f\7u\2\2\u008f*\3\2\2\2\u0090\u0091\7u\2\2\u0091"+
		"\u0092\7g\2\2\u0092\u0093\7e\2\2\u0093,\3\2\2\2\u0094\u0095\7+\2\2\u0095"+
		".\3\2\2\2\u0096\u0097\7v\2\2\u0097\u0098\7c\2\2\u0098\u0099\7p\2\2\u0099"+
		"\u009a\7j\2\2\u009a\60\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7z\2\2\u009d"+
		"\u009e\7r\2\2\u009e\62\3\2\2\2\u009f\u00a0\7-\2\2\u00a0\64\3\2\2\2\u00a1"+
		"\u00a2\7u\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7j\2\2"+
		"\u00a5\66\3\2\2\2\u00a6\u00a7\7/\2\2\u00a78\3\2\2\2\u00a8\u00aa\5? \2"+
		"\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00b3\3\2\2\2\u00ad\u00af\7\60\2\2\u00ae\u00b0\5? \2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		":\3\2\2\2\u00b5\u00b7\t\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9<\3\2\2\2\u00ba\u00bc\t"+
		"\3\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\37\2\2\u00c0>\3\2\2\2"+
		"\u00c1\u00c3\t\4\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5@\3\2\2\2\t\2\u00ab\u00b1\u00b3\u00b8"+
		"\u00bd\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}