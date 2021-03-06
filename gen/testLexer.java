// Generated from C:/Users/mattd/IdeaProjects/potluckr\test.g4 by ANTLR 4.7

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.*;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.text.ParseException;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ALLERGIES=6, DIETTYPE=7, MONTH=8, 
		CUISINES=9, CUISINE=10, TYPE=11, TYPES=12, DIET=13, ALLERGY=14, PRIVATE=15, 
		EVENT=16, NAME=17, PLAN=18, DESCRIPTION=19, LOCATION=20, FROM=21, TO=22, 
		DATE=23, RECIPE=24, ATTENDEE=25, UNAVAILABLE=26, AVAILABLE=27, INGREDIENTS=28, 
		DAY=29, TIME=30, YEAR=31, DESC=32, WS=33, SPACE=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "ALLERGIES", "DIETTYPE", "MONTH", 
		"CUISINES", "CUISINE", "TYPE", "TYPES", "DIET", "ALLERGY", "PRIVATE", 
		"EVENT", "NAME", "PLAN", "DESCRIPTION", "LOCATION", "FROM", "TO", "DATE", 
		"RECIPE", "ATTENDEE", "UNAVAILABLE", "AVAILABLE", "INGREDIENTS", "DAY", 
		"TIME", "YEAR", "DESC", "WS", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "'('", "')'", null, null, null, null, "'cuisine'", 
		"'type'", null, "'diet'", "'allergy'", "'private'", "'event'", "'name'", 
		"'plan'", "'description'", "'location'", "'from'", "'to'", "'date'", "'recipe'", 
		"'attendee'", "'unavailable'", "'available'", "'ingredients'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "ALLERGIES", "DIETTYPE", "MONTH", 
		"CUISINES", "CUISINE", "TYPE", "TYPES", "DIET", "ALLERGY", "PRIVATE", 
		"EVENT", "NAME", "PLAN", "DESCRIPTION", "LOCATION", "FROM", "TO", "DATE", 
		"RECIPE", "ATTENDEE", "UNAVAILABLE", "AVAILABLE", "INGREDIENTS", "DAY", 
		"TIME", "YEAR", "DESC", "WS", "SPACE"
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


	Map<String, String> recipeDict = new HashMap<>();
	Map<String, Integer> diets = new HashMap<>();
	int[] dietInt = new int[8];
	String[] dietStr = {"vegan", "ovo vegetarian", "lacto vegetarian",
	                    "vegetarian", "pescetarian", "paleo", "primal"};
	String[][] rescipeArr = new String[][]{{"Arugula Pumpkin Seed Pesto Sauerkraut Lasagna", "https://spoonacular.com/recipes/-8799", "https://spoonacular.com/recipeImages/8799-312x231.jpg"}, {"Asparagus", "https://spoonacular.com/recipes/-18502", "https://spoonacular.com/recipeImages/18502-312x231.jpg"}, {"Barley Risotto With Golden Beets & Greens", "https://spoonacular.com/recipes/-20433", "https://spoonacular.com/recipeImages/20433-312x231.jpg"}, {"Fretwell (italian Vegetable) Soup", "https://spoonacular.com/recipes/-20494", "https://spoonacular.com/recipeImages/20494-312x231.jpg"}, {"Pasta Pomodoro My Way'", "https://spoonacular.com/recipes/-26885", "https://spoonacular.com/recipeImages/26885-312x231.jpg"}};
	boolean inRecipe = false;

	Map<String, String> csvDict = new HashMap<>();
	SimpleDateFormat inputDate = new SimpleDateFormat("d MMMM yyyy");
	SimpleDateFormat outputDate = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat inputTime = new SimpleDateFormat("H:m");
	SimpleDateFormat outputTime = new SimpleDateFormat("h:mm a");
	Date newDateObj;
	Date newTimeObj1;
	Date newTimeObj2;
	String newDate = "";
	String newTime = "";


	String[] monthStr = {"january", "february", "march", "april", "may", "june",
	                    "july", "august", "september", "october", "november",
	                    "december"};
	int[] date = new int[7];
	boolean available;
	int index = 0;



	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u032c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u009c\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00e1\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0199\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0231\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u028d"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\5\36"+
		"\u030b\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\7!\u031a"+
		"\n!\f!\16!\u031d\13!\3!\3!\3\"\6\"\u0322\n\"\r\"\16\"\u0323\3\"\3\"\3"+
		"#\6#\u0329\n#\r#\16#\u032a\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\f\3\2\62\65\3\2\62;\3"+
		"\2\63;\3\2\62\64\3\2\62\67\3\2\64\64\3\2\62\62\3\2$$\5\2\13\f\17\17\""+
		"\"\3\2\"\"\2\u037f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\r\u009b"+
		"\3\2\2\2\17\u00e0\3\2\2\2\21\u0198\3\2\2\2\23\u0230\3\2\2\2\25\u0232\3"+
		"\2\2\2\27\u023a\3\2\2\2\31\u028c\3\2\2\2\33\u028e\3\2\2\2\35\u0293\3\2"+
		"\2\2\37\u029b\3\2\2\2!\u02a3\3\2\2\2#\u02a9\3\2\2\2%\u02ae\3\2\2\2\'\u02b3"+
		"\3\2\2\2)\u02bf\3\2\2\2+\u02c8\3\2\2\2-\u02cd\3\2\2\2/\u02d0\3\2\2\2\61"+
		"\u02d5\3\2\2\2\63\u02dc\3\2\2\2\65\u02e5\3\2\2\2\67\u02f1\3\2\2\29\u02fb"+
		"\3\2\2\2;\u030a\3\2\2\2=\u030c\3\2\2\2?\u0312\3\2\2\2A\u0317\3\2\2\2C"+
		"\u0321\3\2\2\2E\u0328\3\2\2\2GH\7}\2\2H\4\3\2\2\2IJ\7\177\2\2J\6\3\2\2"+
		"\2KL\7.\2\2L\b\3\2\2\2MN\7*\2\2N\n\3\2\2\2OP\7+\2\2P\f\3\2\2\2QR\7F\2"+
		"\2RS\7c\2\2ST\7k\2\2TU\7t\2\2U\u009c\7{\2\2VW\7G\2\2WX\7i\2\2XY\7i\2\2"+
		"Y\u009c\7u\2\2Z[\7I\2\2[\\\7n\2\2\\]\7w\2\2]^\7v\2\2^_\7g\2\2_\u009c\7"+
		"p\2\2`a\7I\2\2ab\7t\2\2bc\7c\2\2cd\7k\2\2de\7p\2\2e\u009c\7u\2\2fg\7R"+
		"\2\2gh\7g\2\2hi\7c\2\2ij\7p\2\2jk\7w\2\2kl\7v\2\2l\u009c\7u\2\2mn\7U\2"+
		"\2no\7g\2\2op\7c\2\2pq\7h\2\2qr\7q\2\2rs\7q\2\2s\u009c\7f\2\2tu\7U\2\2"+
		"uv\7g\2\2vw\7u\2\2wx\7c\2\2xy\7o\2\2y\u009c\7g\2\2z{\7U\2\2{|\7j\2\2|"+
		"}\7g\2\2}~\7n\2\2~\177\7n\2\2\177\u0080\7h\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7u\2\2\u0082\u009c\7j\2\2\u0083\u0084\7U\2\2\u0084\u0085\7q\2\2"+
		"\u0085\u009c\7{\2\2\u0086\u0087\7U\2\2\u0087\u0088\7w\2\2\u0088\u0089"+
		"\7n\2\2\u0089\u008a\7h\2\2\u008a\u008b\7k\2\2\u008b\u008c\7v\2\2\u008c"+
		"\u009c\7g\2\2\u008d\u008e\7V\2\2\u008e\u008f\7t\2\2\u008f\u0090\7g\2\2"+
		"\u0090\u0091\7g\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7P\2\2\u0093\u0094"+
		"\7w\2\2\u0094\u0095\7v\2\2\u0095\u009c\7u\2\2\u0096\u0097\7Y\2\2\u0097"+
		"\u0098\7j\2\2\u0098\u0099\7g\2\2\u0099\u009a\7c\2\2\u009a\u009c\7v\2\2"+
		"\u009bQ\3\2\2\2\u009bV\3\2\2\2\u009bZ\3\2\2\2\u009b`\3\2\2\2\u009bf\3"+
		"\2\2\2\u009bm\3\2\2\2\u009bt\3\2\2\2\u009bz\3\2\2\2\u009b\u0083\3\2\2"+
		"\2\u009b\u0086\3\2\2\2\u009b\u008d\3\2\2\2\u009b\u0096\3\2\2\2\u009c\16"+
		"\3\2\2\2\u009d\u009e\7r\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7u\2\2\u00a0"+
		"\u00a1\7e\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7c\2\2"+
		"\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7c\2\2\u00a7\u00e1"+
		"\7p\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7e\2\2\u00ab"+
		"\u00ac\7v\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7x\2"+
		"\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7i\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7k\2\2\u00b6"+
		"\u00b7\7c\2\2\u00b7\u00e1\7p\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7x\2\2"+
		"\u00ba\u00bb\7q\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7i\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\u00c2\7c\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7c\2\2"+
		"\u00c5\u00e1\7p\2\2\u00c6\u00c7\7x\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9"+
		"\7i\2\2\u00c9\u00ca\7c\2\2\u00ca\u00e1\7p\2\2\u00cb\u00cc\7r\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7g\2\2\u00cf\u00e1\7q\2\2"+
		"\u00d0\u00d1\7r\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4"+
		"\7o\2\2\u00d4\u00d5\7c\2\2\u00d5\u00e1\7n\2\2\u00d6\u00d7\7x\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7i\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7v\2\2"+
		"\u00db\u00dc\7c\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7k\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e1\7p\2\2\u00e0\u009d\3\2\2\2\u00e0\u00a8\3\2\2\2\u00e0"+
		"\u00b8\3\2\2\2\u00e0\u00c6\3\2\2\2\u00e0\u00cb\3\2\2\2\u00e0\u00d0\3\2"+
		"\2\2\u00e0\u00d6\3\2\2\2\u00e1\20\3\2\2\2\u00e2\u00e3\7l\2\2\u00e3\u00e4"+
		"\7c\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7c\2\2\u00e7"+
		"\u00e8\7t\2\2\u00e8\u0199\7{\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7g\2\2"+
		"\u00eb\u00ec\7d\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f0\7t\2\2\u00f0\u0199\7{\2\2\u00f1\u00f2\7o\2\2\u00f2"+
		"\u00f3\7c\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7e\2\2\u00f5\u0199\7j\2\2"+
		"\u00f6\u00f7\7c\2\2\u00f7\u00f8\7r\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa"+
		"\7k\2\2\u00fa\u0199\7n\2\2\u00fb\u00fc\7o\2\2\u00fc\u00fd\7c\2\2\u00fd"+
		"\u0199\7{\2\2\u00fe\u00ff\7l\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7p\2\2"+
		"\u0101\u0199\7g\2\2\u0102\u0103\7l\2\2\u0103\u0104\7w\2\2\u0104\u0105"+
		"\7n\2\2\u0105\u0199\7{\2\2\u0106\u0107\7c\2\2\u0107\u0108\7w\2\2\u0108"+
		"\u0109\7i\2\2\u0109\u010a\7w\2\2\u010a\u010b\7u\2\2\u010b\u0199\7v\2\2"+
		"\u010c\u010d\7u\2\2\u010d\u010e\7g\2\2\u010e\u010f\7r\2\2\u010f\u0110"+
		"\7v\2\2\u0110\u0111\7g\2\2\u0111\u0112\7o\2\2\u0112\u0113\7d\2\2\u0113"+
		"\u0114\7g\2\2\u0114\u0199\7t\2\2\u0115\u0116\7q\2\2\u0116\u0117\7e\2\2"+
		"\u0117\u0118\7v\2\2\u0118\u0119\7q\2\2\u0119\u011a\7d\2\2\u011a\u011b"+
		"\7g\2\2\u011b\u0199\7t\2\2\u011c\u011d\7p\2\2\u011d\u011e\7q\2\2\u011e"+
		"\u011f\7x\2\2\u011f\u0120\7g\2\2\u0120\u0121\7o\2\2\u0121\u0122\7d\2\2"+
		"\u0122\u0123\7g\2\2\u0123\u0199\7t\2\2\u0124\u0125\7f\2\2\u0125\u0126"+
		"\7g\2\2\u0126\u0127\7e\2\2\u0127\u0128\7g\2\2\u0128\u0129\7o\2\2\u0129"+
		"\u012a\7d\2\2\u012a\u012b\7g\2\2\u012b\u0199\7t\2\2\u012c\u012d\7L\2\2"+
		"\u012d\u012e\7c\2\2\u012e\u012f\7p\2\2\u012f\u0130\7w\2\2\u0130\u0131"+
		"\7c\2\2\u0131\u0132\7t\2\2\u0132\u0199\7{\2\2\u0133\u0134\7H\2\2\u0134"+
		"\u0135\7g\2\2\u0135\u0136\7d\2\2\u0136\u0137\7t\2\2\u0137\u0138\7w\2\2"+
		"\u0138\u0139\7c\2\2\u0139\u013a\7t\2\2\u013a\u0199\7{\2\2\u013b\u013c"+
		"\7O\2\2\u013c\u013d\7c\2\2\u013d\u013e\7t\2\2\u013e\u013f\7e\2\2\u013f"+
		"\u0199\7j\2\2\u0140\u0141\7C\2\2\u0141\u0142\7r\2\2\u0142\u0143\7t\2\2"+
		"\u0143\u0144\7k\2\2\u0144\u0199\7n\2\2\u0145\u0146\7O\2\2\u0146\u0147"+
		"\7c\2\2\u0147\u0199\7{\2\2\u0148\u0149\7L\2\2\u0149\u014a\7w\2\2\u014a"+
		"\u014b\7p\2\2\u014b\u0199\7g\2\2\u014c\u014d\7L\2\2\u014d\u014e\7w\2\2"+
		"\u014e\u014f\7n\2\2\u014f\u0199\7{\2\2\u0150\u0151\7C\2\2\u0151\u0152"+
		"\7w\2\2\u0152\u0153\7i\2\2\u0153\u0154\7w\2\2\u0154\u0155\7u\2\2\u0155"+
		"\u0199\7v\2\2\u0156\u0157\7U\2\2\u0157\u0158\7g\2\2\u0158\u0159\7r\2\2"+
		"\u0159\u015a\7v\2\2\u015a\u015b\7g\2\2\u015b\u015c\7o\2\2\u015c\u015d"+
		"\7d\2\2\u015d\u015e\7g\2\2\u015e\u0199\7t\2\2\u015f\u0160\7Q\2\2\u0160"+
		"\u0161\7e\2\2\u0161\u0162\7v\2\2\u0162\u0163\7q\2\2\u0163\u0164\7d\2\2"+
		"\u0164\u0165\7g\2\2\u0165\u0199\7t\2\2\u0166\u0167\7P\2\2\u0167\u0168"+
		"\7q\2\2\u0168\u0169\7x\2\2\u0169\u016a\7g\2\2\u016a\u016b\7o\2\2\u016b"+
		"\u016c\7d\2\2\u016c\u016d\7g\2\2\u016d\u0199\7t\2\2\u016e\u016f\7F\2\2"+
		"\u016f\u0170\7g\2\2\u0170\u0171\7e\2\2\u0171\u0172\7g\2\2\u0172\u0173"+
		"\7o\2\2\u0173\u0174\7d\2\2\u0174\u0175\7g\2\2\u0175\u0199\7t\2\2\u0176"+
		"\u0177\7L\2\2\u0177\u0178\7c\2\2\u0178\u0199\7p\2\2\u0179\u017a\7H\2\2"+
		"\u017a\u017b\7g\2\2\u017b\u0199\7d\2\2\u017c\u017d\7O\2\2\u017d\u017e"+
		"\7c\2\2\u017e\u0199\7t\2\2\u017f\u0180\7C\2\2\u0180\u0181\7r\2\2\u0181"+
		"\u0199\7t\2\2\u0182\u0183\7O\2\2\u0183\u0184\7c\2\2\u0184\u0199\7{\2\2"+
		"\u0185\u0186\7C\2\2\u0186\u0187\7w\2\2\u0187\u0199\7i\2\2\u0188\u0189"+
		"\7U\2\2\u0189\u018a\7g\2\2\u018a\u0199\7r\2\2\u018b\u018c\7U\2\2\u018c"+
		"\u018d\7g\2\2\u018d\u018e\7r\2\2\u018e\u0199\7v\2\2\u018f\u0190\7Q\2\2"+
		"\u0190\u0191\7e\2\2\u0191\u0199\7v\2\2\u0192\u0193\7P\2\2\u0193\u0194"+
		"\7q\2\2\u0194\u0199\7x\2\2\u0195\u0196\7F\2\2\u0196\u0197\7g\2\2\u0197"+
		"\u0199\7e\2\2\u0198\u00e2\3\2\2\2\u0198\u00e9\3\2\2\2\u0198\u00f1\3\2"+
		"\2\2\u0198\u00f6\3\2\2\2\u0198\u00fb\3\2\2\2\u0198\u00fe\3\2\2\2\u0198"+
		"\u0102\3\2\2\2\u0198\u0106\3\2\2\2\u0198\u010c\3\2\2\2\u0198\u0115\3\2"+
		"\2\2\u0198\u011c\3\2\2\2\u0198\u0124\3\2\2\2\u0198\u012c\3\2\2\2\u0198"+
		"\u0133\3\2\2\2\u0198\u013b\3\2\2\2\u0198\u0140\3\2\2\2\u0198\u0145\3\2"+
		"\2\2\u0198\u0148\3\2\2\2\u0198\u014c\3\2\2\2\u0198\u0150\3\2\2\2\u0198"+
		"\u0156\3\2\2\2\u0198\u015f\3\2\2\2\u0198\u0166\3\2\2\2\u0198\u016e\3\2"+
		"\2\2\u0198\u0176\3\2\2\2\u0198\u0179\3\2\2\2\u0198\u017c\3\2\2\2\u0198"+
		"\u017f\3\2\2\2\u0198\u0182\3\2\2\2\u0198\u0185\3\2\2\2\u0198\u0188\3\2"+
		"\2\2\u0198\u018b\3\2\2\2\u0198\u018f\3\2\2\2\u0198\u0192\3\2\2\2\u0198"+
		"\u0195\3\2\2\2\u0199\22\3\2\2\2\u019a\u019b\7C\2\2\u019b\u019c\7h\2\2"+
		"\u019c\u019d\7t\2\2\u019d\u019e\7k\2\2\u019e\u019f\7e\2\2\u019f\u01a0"+
		"\7c\2\2\u01a0\u0231\7p\2\2\u01a1\u01a2\7C\2\2\u01a2\u01a3\7o\2\2\u01a3"+
		"\u01a4\7g\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\7e\2\2"+
		"\u01a7\u01a8\7c\2\2\u01a8\u0231\7p\2\2\u01a9\u01aa\7D\2\2\u01aa\u01ab"+
		"\7t\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae\7k\2\2\u01ae"+
		"\u01af\7u\2\2\u01af\u0231\7j\2\2\u01b0\u01b1\7E\2\2\u01b1\u01b2\7c\2\2"+
		"\u01b2\u01b3\7l\2\2\u01b3\u01b4\7w\2\2\u01b4\u0231\7p\2\2\u01b5\u01b6"+
		"\7E\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9\7k\2\2\u01b9"+
		"\u01ba\7d\2\2\u01ba\u01bb\7d\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7c\2\2"+
		"\u01bd\u0231\7p\2\2\u01be\u01bf\7E\2\2\u01bf\u01c0\7j\2\2\u01c0\u01c1"+
		"\7k\2\2\u01c1\u01c2\7p\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7u\2\2\u01c4"+
		"\u0231\7g\2\2\u01c5\u01c6\7H\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8\7g\2\2"+
		"\u01c8\u01c9\7p\2\2\u01c9\u01ca\7e\2\2\u01ca\u0231\7j\2\2\u01cb\u01cc"+
		"\7I\2\2\u01cc\u01cd\7g\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf\7o\2\2\u01cf"+
		"\u01d0\7c\2\2\u01d0\u0231\7p\2\2\u01d1\u01d2\7I\2\2\u01d2\u01d3\7t\2\2"+
		"\u01d3\u01d4\7g\2\2\u01d4\u01d5\7g\2\2\u01d5\u0231\7m\2\2\u01d6\u01d7"+
		"\7K\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7f\2\2\u01d9\u01da\7k\2\2\u01da"+
		"\u01db\7c\2\2\u01db\u0231\7p\2\2\u01dc\u01dd\7K\2\2\u01dd\u01de\7v\2\2"+
		"\u01de\u01df\7c\2\2\u01df\u01e0\7n\2\2\u01e0\u01e1\7k\2\2\u01e1\u01e2"+
		"\7c\2\2\u01e2\u0231\7p\2\2\u01e3\u01e4\7L\2\2\u01e4\u01e5\7c\2\2\u01e5"+
		"\u01e6\7r\2\2\u01e6\u01e7\7c\2\2\u01e7\u01e8\7p\2\2\u01e8\u01e9\7g\2\2"+
		"\u01e9\u01ea\7u\2\2\u01ea\u0231\7g\2\2\u01eb\u01ec\7L\2\2\u01ec\u01ed"+
		"\7g\2\2\u01ed\u01ee\7y\2\2\u01ee\u01ef\7k\2\2\u01ef\u01f0\7u\2\2\u01f0"+
		"\u0231\7j\2\2\u01f1\u01f2\7M\2\2\u01f2\u01f3\7q\2\2\u01f3\u01f4\7t\2\2"+
		"\u01f4\u01f5\7g\2\2\u01f5\u01f6\7c\2\2\u01f6\u0231\7p\2\2\u01f7\u01f8"+
		"\7N\2\2\u01f8\u01f9\7c\2\2\u01f9\u01fa\7v\2\2\u01fa\u01fb\7k\2\2\u01fb"+
		"\u01fc\7p\2\2\u01fc\u01fd\7\"\2\2\u01fd\u01fe\7C\2\2\u01fe\u01ff\7o\2"+
		"\2\u01ff\u0200\7g\2\2\u0200\u0201\7t\2\2\u0201\u0202\7k\2\2\u0202\u0203"+
		"\7e\2\2\u0203\u0204\7c\2\2\u0204\u0231\7p\2\2\u0205\u0206\7O\2\2\u0206"+
		"\u0207\7g\2\2\u0207\u0208\7z\2\2\u0208\u0209\7k\2\2\u0209\u020a\7e\2\2"+
		"\u020a\u020b\7c\2\2\u020b\u0231\7p\2\2\u020c\u020d\7O\2\2\u020d\u020e"+
		"\7k\2\2\u020e\u020f\7f\2\2\u020f\u0210\7f\2\2\u0210\u0211\7n\2\2\u0211"+
		"\u0212\7g\2\2\u0212\u0213\7\"\2\2\u0213\u0214\7G\2\2\u0214\u0215\7c\2"+
		"\2\u0215\u0216\7u\2\2\u0216\u0217\7v\2\2\u0217\u0218\7g\2\2\u0218\u0219"+
		"\7t\2\2\u0219\u0231\7p\2\2\u021a\u021b\7U\2\2\u021b\u021c\7q\2\2\u021c"+
		"\u021d\7w\2\2\u021d\u021e\7v\2\2\u021e\u021f\7j\2\2\u021f\u0220\7g\2\2"+
		"\u0220\u0221\7t\2\2\u0221\u0231\7p\2\2\u0222\u0223\7V\2\2\u0223\u0224"+
		"\7j\2\2\u0224\u0225\7c\2\2\u0225\u0231\7k\2\2\u0226\u0227\7X\2\2\u0227"+
		"\u0228\7k\2\2\u0228\u0229\7g\2\2\u0229\u022a\7v\2\2\u022a\u022b\7p\2\2"+
		"\u022b\u022c\7c\2\2\u022c\u022d\7o\2\2\u022d\u022e\7g\2\2\u022e\u022f"+
		"\7u\2\2\u022f\u0231\7g\2\2\u0230\u019a\3\2\2\2\u0230\u01a1\3\2\2\2\u0230"+
		"\u01a9\3\2\2\2\u0230\u01b0\3\2\2\2\u0230\u01b5\3\2\2\2\u0230\u01be\3\2"+
		"\2\2\u0230\u01c5\3\2\2\2\u0230\u01cb\3\2\2\2\u0230\u01d1\3\2\2\2\u0230"+
		"\u01d6\3\2\2\2\u0230\u01dc\3\2\2\2\u0230\u01e3\3\2\2\2\u0230\u01eb\3\2"+
		"\2\2\u0230\u01f1\3\2\2\2\u0230\u01f7\3\2\2\2\u0230\u0205\3\2\2\2\u0230"+
		"\u020c\3\2\2\2\u0230\u021a\3\2\2\2\u0230\u0222\3\2\2\2\u0230\u0226\3\2"+
		"\2\2\u0231\24\3\2\2\2\u0232\u0233\7e\2\2\u0233\u0234\7w\2\2\u0234\u0235"+
		"\7k\2\2\u0235\u0236\7u\2\2\u0236\u0237\7k\2\2\u0237\u0238\7p\2\2\u0238"+
		"\u0239\7g\2\2\u0239\26\3\2\2\2\u023a\u023b\7v\2\2\u023b\u023c\7{\2\2\u023c"+
		"\u023d\7r\2\2\u023d\u023e\7g\2\2\u023e\30\3\2\2\2\u023f\u0240\7o\2\2\u0240"+
		"\u0241\7c\2\2\u0241\u0242\7k\2\2\u0242\u0243\7p\2\2\u0243\u0244\7\"\2"+
		"\2\u0244\u0245\7e\2\2\u0245\u0246\7q\2\2\u0246\u0247\7w\2\2\u0247\u0248"+
		"\7t\2\2\u0248\u0249\7u\2\2\u0249\u028d\7g\2\2\u024a\u024b\7u\2\2\u024b"+
		"\u024c\7k\2\2\u024c\u024d\7f\2\2\u024d\u024e\7g\2\2\u024e\u024f\7\"\2"+
		"\2\u024f\u0250\7f\2\2\u0250\u0251\7k\2\2\u0251\u0252\7u\2\2\u0252\u028d"+
		"\7j\2\2\u0253\u0254\7f\2\2\u0254\u0255\7g\2\2\u0255\u0256\7u\2\2\u0256"+
		"\u0257\7u\2\2\u0257\u0258\7g\2\2\u0258\u0259\7t\2\2\u0259\u028d\7v\2\2"+
		"\u025a\u025b\7c\2\2\u025b\u025c\7r\2\2\u025c\u025d\7r\2\2\u025d\u025e"+
		"\7g\2\2\u025e\u025f\7v\2\2\u025f\u0260\7k\2\2\u0260\u0261\7|\2\2\u0261"+
		"\u0262\7g\2\2\u0262\u028d\7t\2\2\u0263\u0264\7u\2\2\u0264\u0265\7c\2\2"+
		"\u0265\u0266\7n\2\2\u0266\u0267\7c\2\2\u0267\u028d\7f\2\2\u0268\u0269"+
		"\7d\2\2\u0269\u026a\7t\2\2\u026a\u026b\7g\2\2\u026b\u026c\7c\2\2\u026c"+
		"\u028d\7f\2\2\u026d\u026e\7d\2\2\u026e\u026f\7t\2\2\u026f\u0270\7g\2\2"+
		"\u0270\u0271\7c\2\2\u0271\u0272\7m\2\2\u0272\u0273\7h\2\2\u0273\u0274"+
		"\7c\2\2\u0274\u0275\7u\2\2\u0275\u028d\7v\2\2\u0276\u0277\7u\2\2\u0277"+
		"\u0278\7q\2\2\u0278\u0279\7w\2\2\u0279\u028d\7r\2\2\u027a\u027b\7d\2\2"+
		"\u027b\u027c\7g\2\2\u027c\u027d\7x\2\2\u027d\u027e\7g\2\2\u027e\u027f"+
		"\7t\2\2\u027f\u0280\7c\2\2\u0280\u0281\7i\2\2\u0281\u028d\7g\2\2\u0282"+
		"\u0283\7u\2\2\u0283\u0284\7c\2\2\u0284\u0285\7w\2\2\u0285\u0286\7e\2\2"+
		"\u0286\u028d\7g\2\2\u0287\u0288\7f\2\2\u0288\u0289\7t\2\2\u0289\u028a"+
		"\7k\2\2\u028a\u028b\7p\2\2\u028b\u028d\7m\2\2\u028c\u023f\3\2\2\2\u028c"+
		"\u024a\3\2\2\2\u028c\u0253\3\2\2\2\u028c\u025a\3\2\2\2\u028c\u0263\3\2"+
		"\2\2\u028c\u0268\3\2\2\2\u028c\u026d\3\2\2\2\u028c\u0276\3\2\2\2\u028c"+
		"\u027a\3\2\2\2\u028c\u0282\3\2\2\2\u028c\u0287\3\2\2\2\u028d\32\3\2\2"+
		"\2\u028e\u028f\7f\2\2\u028f\u0290\7k\2\2\u0290\u0291\7g\2\2\u0291\u0292"+
		"\7v\2\2\u0292\34\3\2\2\2\u0293\u0294\7c\2\2\u0294\u0295\7n\2\2\u0295\u0296"+
		"\7n\2\2\u0296\u0297\7g\2\2\u0297\u0298\7t\2\2\u0298\u0299\7i\2\2\u0299"+
		"\u029a\7{\2\2\u029a\36\3\2\2\2\u029b\u029c\7r\2\2\u029c\u029d\7t\2\2\u029d"+
		"\u029e\7k\2\2\u029e\u029f\7x\2\2\u029f\u02a0\7c\2\2\u02a0\u02a1\7v\2\2"+
		"\u02a1\u02a2\7g\2\2\u02a2 \3\2\2\2\u02a3\u02a4\7g\2\2\u02a4\u02a5\7x\2"+
		"\2\u02a5\u02a6\7g\2\2\u02a6\u02a7\7p\2\2\u02a7\u02a8\7v\2\2\u02a8\"\3"+
		"\2\2\2\u02a9\u02aa\7p\2\2\u02aa\u02ab\7c\2\2\u02ab\u02ac\7o\2\2\u02ac"+
		"\u02ad\7g\2\2\u02ad$\3\2\2\2\u02ae\u02af\7r\2\2\u02af\u02b0\7n\2\2\u02b0"+
		"\u02b1\7c\2\2\u02b1\u02b2\7p\2\2\u02b2&\3\2\2\2\u02b3\u02b4\7f\2\2\u02b4"+
		"\u02b5\7g\2\2\u02b5\u02b6\7u\2\2\u02b6\u02b7\7e\2\2\u02b7\u02b8\7t\2\2"+
		"\u02b8\u02b9\7k\2\2\u02b9\u02ba\7r\2\2\u02ba\u02bb\7v\2\2\u02bb\u02bc"+
		"\7k\2\2\u02bc\u02bd\7q\2\2\u02bd\u02be\7p\2\2\u02be(\3\2\2\2\u02bf\u02c0"+
		"\7n\2\2\u02c0\u02c1\7q\2\2\u02c1\u02c2\7e\2\2\u02c2\u02c3\7c\2\2\u02c3"+
		"\u02c4\7v\2\2\u02c4\u02c5\7k\2\2\u02c5\u02c6\7q\2\2\u02c6\u02c7\7p\2\2"+
		"\u02c7*\3\2\2\2\u02c8\u02c9\7h\2\2\u02c9\u02ca\7t\2\2\u02ca\u02cb\7q\2"+
		"\2\u02cb\u02cc\7o\2\2\u02cc,\3\2\2\2\u02cd\u02ce\7v\2\2\u02ce\u02cf\7"+
		"q\2\2\u02cf.\3\2\2\2\u02d0\u02d1\7f\2\2\u02d1\u02d2\7c\2\2\u02d2\u02d3"+
		"\7v\2\2\u02d3\u02d4\7g\2\2\u02d4\60\3\2\2\2\u02d5\u02d6\7t\2\2\u02d6\u02d7"+
		"\7g\2\2\u02d7\u02d8\7e\2\2\u02d8\u02d9\7k\2\2\u02d9\u02da\7r\2\2\u02da"+
		"\u02db\7g\2\2\u02db\62\3\2\2\2\u02dc\u02dd\7c\2\2\u02dd\u02de\7v\2\2\u02de"+
		"\u02df\7v\2\2\u02df\u02e0\7g\2\2\u02e0\u02e1\7p\2\2\u02e1\u02e2\7f\2\2"+
		"\u02e2\u02e3\7g\2\2\u02e3\u02e4\7g\2\2\u02e4\64\3\2\2\2\u02e5\u02e6\7"+
		"w\2\2\u02e6\u02e7\7p\2\2\u02e7\u02e8\7c\2\2\u02e8\u02e9\7x\2\2\u02e9\u02ea"+
		"\7c\2\2\u02ea\u02eb\7k\2\2\u02eb\u02ec\7n\2\2\u02ec\u02ed\7c\2\2\u02ed"+
		"\u02ee\7d\2\2\u02ee\u02ef\7n\2\2\u02ef\u02f0\7g\2\2\u02f0\66\3\2\2\2\u02f1"+
		"\u02f2\7c\2\2\u02f2\u02f3\7x\2\2\u02f3\u02f4\7c\2\2\u02f4\u02f5\7k\2\2"+
		"\u02f5\u02f6\7n\2\2\u02f6\u02f7\7c\2\2\u02f7\u02f8\7d\2\2\u02f8\u02f9"+
		"\7n\2\2\u02f9\u02fa\7g\2\2\u02fa8\3\2\2\2\u02fb\u02fc\7k\2\2\u02fc\u02fd"+
		"\7p\2\2\u02fd\u02fe\7i\2\2\u02fe\u02ff\7t\2\2\u02ff\u0300\7g\2\2\u0300"+
		"\u0301\7f\2\2\u0301\u0302\7k\2\2\u0302\u0303\7g\2\2\u0303\u0304\7p\2\2"+
		"\u0304\u0305\7v\2\2\u0305\u0306\7u\2\2\u0306:\3\2\2\2\u0307\u0308\t\2"+
		"\2\2\u0308\u030b\t\3\2\2\u0309\u030b\t\4\2\2\u030a\u0307\3\2\2\2\u030a"+
		"\u0309\3\2\2\2\u030b<\3\2\2\2\u030c\u030d\t\5\2\2\u030d\u030e\t\3\2\2"+
		"\u030e\u030f\7<\2\2\u030f\u0310\t\6\2\2\u0310\u0311\t\3\2\2\u0311>\3\2"+
		"\2\2\u0312\u0313\t\7\2\2\u0313\u0314\t\b\2\2\u0314\u0315\t\4\2\2\u0315"+
		"\u0316\t\3\2\2\u0316@\3\2\2\2\u0317\u031b\7$\2\2\u0318\u031a\n\t\2\2\u0319"+
		"\u0318\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2"+
		"\2\2\u031c\u031e\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u031f\7$\2\2\u031f"+
		"B\3\2\2\2\u0320\u0322\t\n\2\2\u0321\u0320\3\2\2\2\u0322\u0323\3\2\2\2"+
		"\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326"+
		"\b\"\2\2\u0326D\3\2\2\2\u0327\u0329\t\13\2\2\u0328\u0327\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032bF\3\2\2\2"+
		"\f\2\u009b\u00e0\u0198\u0230\u028c\u030a\u031b\u0323\u032a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}