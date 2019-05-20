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


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_schedule = 1, RULE_event = 2, RULE_name = 3, RULE_date = 4, 
		RULE_time = 5, RULE_description = 6, RULE_location = 7, RULE_plan = 8, 
		RULE_attendee = 9, RULE_allergy = 10, RULE_diet = 11, RULE_pname = 12, 
		RULE_availability = 13, RULE_pdate = 14, RULE_recipe = 15, RULE_ingredients = 16, 
		RULE_cuisine = 17, RULE_type = 18;
	public static final String[] ruleNames = {
		"prog", "schedule", "event", "name", "date", "time", "description", "location", 
		"plan", "attendee", "allergy", "diet", "pname", "availability", "pdate", 
		"recipe", "ingredients", "cuisine", "type"
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

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public API myAPI = new API();
		public Output myOutput = new Output();
		public csvCleaner csvCleanerInit = new csvCleaner();
		public String str = "";
		public TerminalNode EOF() { return getToken(testParser.EOF, 0); }
		public List<ScheduleContext> schedule() {
			return getRuleContexts(ScheduleContext.class);
		}
		public ScheduleContext schedule(int i) {
			return getRuleContext(ScheduleContext.class,i);
		}
		public List<PlanContext> plan() {
			return getRuleContexts(PlanContext.class);
		}
		public PlanContext plan(int i) {
			return getRuleContext(PlanContext.class,i);
		}
		public List<RecipeContext> recipe() {
			return getRuleContexts(RecipeContext.class);
		}
		public RecipeContext recipe(int i) {
			return getRuleContext(RecipeContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitProg(this);
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case EVENT:
					{
					setState(38);
					schedule();
					}
					break;
				case PLAN:
					{
					setState(39);
					plan();
					}
					break;
				case RECIPE:
					{
					setState(40);
					recipe();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << EVENT) | (1L << PLAN) | (1L << RECIPE))) != 0) );
			setState(45);
			match(EOF);

			    if(csvDict.containsKey("Subject") && csvDict.containsKey("Start Date")){
			        _localctx.csvCleanerInit.clean(csvDict);
			    }
			    recipeDict.put("diet", "vegetarian");
			    _localctx.myOutput.writeFile(rescipeArr, recipeDict, csvDict, monthStr);
			    
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

	public static class ScheduleContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(testParser.EVENT, 0); }
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TerminalNode PRIVATE() { return getToken(testParser.PRIVATE, 0); }
		public ScheduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schedule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterSchedule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitSchedule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitSchedule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScheduleContext schedule() throws RecognitionException {
		ScheduleContext _localctx = new ScheduleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_schedule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(48);
				match(PRIVATE);
				}
			}

			setState(51);
			match(EVENT);
			setState(52);
			match(T__0);
			setState(53);
			event();
			setState(54);
			match(T__1);
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

	public static class EventContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public List<LocationContext> location() {
			return getRuleContexts(LocationContext.class);
		}
		public LocationContext location(int i) {
			return getRuleContext(LocationContext.class,i);
		}
		public List<DescriptionContext> description() {
			return getRuleContexts(DescriptionContext.class);
		}
		public DescriptionContext description(int i) {
			return getRuleContext(DescriptionContext.class,i);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << DESCRIPTION) | (1L << LOCATION) | (1L << FROM) | (1L << DATE))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(56);
					name();
					}
					break;
				case DATE:
					{
					setState(57);
					date();
					}
					break;
				case FROM:
					{
					setState(58);
					time();
					}
					break;
				case LOCATION:
					{
					setState(59);
					location();
					}
					break;
				case DESCRIPTION:
					{
					setState(60);
					description();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
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

	public static class NameContext extends ParserRuleContext {
		public Token p;
		public TerminalNode NAME() { return getToken(testParser.NAME, 0); }
		public TerminalNode DESC() { return getToken(testParser.DESC, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(NAME);
			setState(67);
			match(T__0);
			setState(68);
			((NameContext)_localctx).p = match(DESC);
			setState(69);
			match(T__1);
			csvDict.put("Subject", (((NameContext)_localctx).p!=null?((NameContext)_localctx).p.getText():null));
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

	public static class DateContext extends ParserRuleContext {
		public String dateStr = "";;
		public Token k;
		public Token l;
		public Token m;
		public TerminalNode DATE() { return getToken(testParser.DATE, 0); }
		public TerminalNode MONTH() { return getToken(testParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(testParser.DAY, 0); }
		public TerminalNode YEAR() { return getToken(testParser.YEAR, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(DATE);
			setState(73);
			match(T__0);
			setState(74);
			((DateContext)_localctx).k = match(MONTH);
			setState(75);
			((DateContext)_localctx).l = match(DAY);
			setState(76);
			((DateContext)_localctx).m = match(YEAR);
			setState(77);
			match(T__1);
			 try
			    {((DateContext)_localctx).dateStr =  (((DateContext)_localctx).l!=null?((DateContext)_localctx).l.getText():null) + " " +(((DateContext)_localctx).k!=null?((DateContext)_localctx).k.getText():null) + " " + (((DateContext)_localctx).m!=null?((DateContext)_localctx).m.getText():null);
			    newDateObj = inputDate.parse(_localctx.dateStr);
			    newDate += outputDate.format(newDateObj);
			    csvDict.put("Start Date", newDate);
			    csvDict.put("End Date", newDate);}
			    catch(ParseException e){
			         System.out.println("Exception Found!");
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

	public static class TimeContext extends ParserRuleContext {
		public Token g;
		public Token i;
		public TerminalNode FROM() { return getToken(testParser.FROM, 0); }
		public TerminalNode TO() { return getToken(testParser.TO, 0); }
		public List<TerminalNode> TIME() { return getTokens(testParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(testParser.TIME, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(FROM);
			setState(81);
			match(T__0);
			setState(82);
			((TimeContext)_localctx).g = match(TIME);
			setState(83);
			match(TO);
			setState(84);
			((TimeContext)_localctx).i = match(TIME);
			setState(85);
			match(T__1);

			    try{
			    newTimeObj1 = inputTime.parse((((TimeContext)_localctx).g!=null?((TimeContext)_localctx).g.getText():null));
			    newTimeObj2 = inputTime.parse((((TimeContext)_localctx).i!=null?((TimeContext)_localctx).i.getText():null));
			    newTime = outputTime.format(newTimeObj1);
			    csvDict.put("Start Time", newTime);
			    newTime = outputTime.format(newTimeObj2);
			    csvDict.put("End Time", newTime);
			    }
			    catch(ParseException e){
			    System.out.println("Exception Found!");
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

	public static class DescriptionContext extends ParserRuleContext {
		public String descStr = "";
		public Token d;
		public Token e;
		public Token f;
		public TerminalNode DESCRIPTION() { return getToken(testParser.DESCRIPTION, 0); }
		public List<TerminalNode> DESC() { return getTokens(testParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(testParser.DESC, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(DESCRIPTION);
			setState(89);
			match(T__0);
			setState(90);
			((DescriptionContext)_localctx).d = match(DESC);
			_localctx.descStr += (((DescriptionContext)_localctx).d!=null?((DescriptionContext)_localctx).d.getText():null);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DESC || _la==SPACE) {
				{
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DESC:
					{
					setState(92);
					((DescriptionContext)_localctx).e = match(DESC);
					_localctx.descStr += (((DescriptionContext)_localctx).e!=null?((DescriptionContext)_localctx).e.getText():null);
					}
					break;
				case SPACE:
					{
					setState(94);
					((DescriptionContext)_localctx).f = match(SPACE);
					_localctx.descStr += (((DescriptionContext)_localctx).f!=null?((DescriptionContext)_localctx).f.getText():null);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__1);
			csvDict.put("Description", _localctx.descStr);
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

	public static class LocationContext extends ParserRuleContext {
		public Token b;
		public TerminalNode LOCATION() { return getToken(testParser.LOCATION, 0); }
		public TerminalNode DESC() { return getToken(testParser.DESC, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(LOCATION);
			setState(105);
			match(T__0);
			setState(106);
			((LocationContext)_localctx).b = match(DESC);
			csvDict.put("Location", (((LocationContext)_localctx).b!=null?((LocationContext)_localctx).b.getText():null));
			setState(108);
			match(T__1);
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

	public static class PlanContext extends ParserRuleContext {
		public TerminalNode PLAN() { return getToken(testParser.PLAN, 0); }
		public List<AttendeeContext> attendee() {
			return getRuleContexts(AttendeeContext.class);
		}
		public AttendeeContext attendee(int i) {
			return getRuleContext(AttendeeContext.class,i);
		}
		public PlanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterPlan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPlan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPlan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanContext plan() throws RecognitionException {
		PlanContext _localctx = new PlanContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_plan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(PLAN);
			setState(111);
			match(T__0);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				attendee();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATTENDEE );
			setState(117);
			match(T__1);
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

	public static class AttendeeContext extends ParserRuleContext {
		public TerminalNode ATTENDEE() { return getToken(testParser.ATTENDEE, 0); }
		public PnameContext pname() {
			return getRuleContext(PnameContext.class,0);
		}
		public List<AllergyContext> allergy() {
			return getRuleContexts(AllergyContext.class);
		}
		public AllergyContext allergy(int i) {
			return getRuleContext(AllergyContext.class,i);
		}
		public List<DietContext> diet() {
			return getRuleContexts(DietContext.class);
		}
		public DietContext diet(int i) {
			return getRuleContext(DietContext.class,i);
		}
		public List<AvailabilityContext> availability() {
			return getRuleContexts(AvailabilityContext.class);
		}
		public AvailabilityContext availability(int i) {
			return getRuleContext(AvailabilityContext.class,i);
		}
		public AttendeeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attendee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAttendee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAttendee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAttendee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttendeeContext attendee() throws RecognitionException {
		AttendeeContext _localctx = new AttendeeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attendee);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			match(ATTENDEE);
			PeopleContainer.addPerson(new Person());
			setState(121);
			match(T__0);
			setState(122);
			pname();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIET) | (1L << ALLERGY) | (1L << UNAVAILABLE) | (1L << AVAILABLE))) != 0)) {
				{
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALLERGY:
					{
					setState(123);
					allergy();
					}
					break;
				case DIET:
					{
					setState(124);
					diet();
					}
					break;
				case UNAVAILABLE:
				case AVAILABLE:
					{
					setState(125);
					availability();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(T__1);
			}

			         index++;
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

	public static class AllergyContext extends ParserRuleContext {
		public String aller = "";
		public Token a1;
		public Token a2;
		public TerminalNode ALLERGY() { return getToken(testParser.ALLERGY, 0); }
		public List<TerminalNode> ALLERGIES() { return getTokens(testParser.ALLERGIES); }
		public TerminalNode ALLERGIES(int i) {
			return getToken(testParser.ALLERGIES, i);
		}
		public AllergyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allergy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAllergy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAllergy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAllergy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllergyContext allergy() throws RecognitionException {
		AllergyContext _localctx = new AllergyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_allergy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ALLERGY);
			setState(136);
			match(T__0);
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(137);
					((AllergyContext)_localctx).a1 = match(ALLERGIES);
					setState(138);
					match(T__2);
					_localctx.aller += ((((AllergyContext)_localctx).a1!=null?((AllergyContext)_localctx).a1.getText():null).replace(" ", "+")) + "%2C+";
					}
					break;
				case 2:
					{
					setState(140);
					((AllergyContext)_localctx).a2 = match(ALLERGIES);
					_localctx.aller += ((((AllergyContext)_localctx).a2!=null?((AllergyContext)_localctx).a2.getText():null).replace(" ", "+"));
					}
					break;
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALLERGIES );
			setState(146);
			match(T__1);

			    if(! inRecipe){
			        PeopleContainer.getPeopleList().get(index).setAllergy(_localctx.aller);
			    }
			    if(recipeDict.containsKey("intolerances")){
			        recipeDict.put("intolerances", recipeDict.get("intolerances") + "%2C+" + _localctx.aller);
			    }else{recipeDict.put("intolerances", _localctx.aller);}
			    
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

	public static class DietContext extends ParserRuleContext {
		public Token d;
		public TerminalNode DIET() { return getToken(testParser.DIET, 0); }
		public TerminalNode DIETTYPE() { return getToken(testParser.DIETTYPE, 0); }
		public DietContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDiet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDiet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDiet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DietContext diet() throws RecognitionException {
		DietContext _localctx = new DietContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_diet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(DIET);
			setState(150);
			match(T__0);
			setState(151);
			((DietContext)_localctx).d = match(DIETTYPE);
			setState(152);
			match(T__1);

			    if(! inRecipe){
			        PeopleContainer.getPeopleList().get(index).setDiet((((DietContext)_localctx).d!=null?((DietContext)_localctx).d.getText():null));
			    }
			    dietInt[Arrays.asList(dietStr).indexOf((((DietContext)_localctx).d!=null?((DietContext)_localctx).d.getText():null))] += 1;
			    
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

	public static class PnameContext extends ParserRuleContext {
		public String nam = "";
		public Token n;
		public TerminalNode NAME() { return getToken(testParser.NAME, 0); }
		public TerminalNode DESC() { return getToken(testParser.DESC, 0); }
		public PnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterPname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PnameContext pname() throws RecognitionException {
		PnameContext _localctx = new PnameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(NAME);
			setState(156);
			match(T__0);
			setState(157);
			((PnameContext)_localctx).n = match(DESC);
			((PnameContext)_localctx).nam =  ((((PnameContext)_localctx).n!=null?((PnameContext)_localctx).n.getText():null).replaceAll("[^A-Za-z0-9]", ""));
			setState(159);
			match(T__1);


			    PeopleContainer.getPeopleList().get(index).setName(_localctx.nam);
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

	public static class AvailabilityContext extends ParserRuleContext {
		public String avail = "";
		public Token f;
		public PdateContext pdate() {
			return getRuleContext(PdateContext.class,0);
		}
		public TerminalNode AVAILABLE() { return getToken(testParser.AVAILABLE, 0); }
		public TerminalNode UNAVAILABLE() { return getToken(testParser.UNAVAILABLE, 0); }
		public AvailabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAvailability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAvailability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitAvailability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvailabilityContext availability() throws RecognitionException {
		AvailabilityContext _localctx = new AvailabilityContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_availability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(162);
			((AvailabilityContext)_localctx).f = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UNAVAILABLE || _la==AVAILABLE) ) {
				((AvailabilityContext)_localctx).f = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			    ((AvailabilityContext)_localctx).avail =  ((((AvailabilityContext)_localctx).f!=null?((AvailabilityContext)_localctx).f.getText():null).replaceAll("[^A-Za-z0-9]", ""));
			    if(_localctx.avail.equals("available")) {
			        available = true;
			    }
			    else if (_localctx.avail.equals("unavailable")) {
			        available = false;
			    }
			    
			setState(164);
			match(T__0);
			setState(165);
			pdate();
			setState(166);
			match(T__1);
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

	public static class PdateContext extends ParserRuleContext {
		public String mo = "";
		public String da = "";
		public String ye = "";
		public String st = "";
		public String et = "";
		public String t = "";
		public Token m;
		public Token d;
		public Token y;
		public Token s;
		public Token e;
		public List<TerminalNode> FROM() { return getTokens(testParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(testParser.FROM, i);
		}
		public List<TerminalNode> TO() { return getTokens(testParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(testParser.TO, i);
		}
		public List<TerminalNode> MONTH() { return getTokens(testParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(testParser.MONTH, i);
		}
		public List<TerminalNode> DAY() { return getTokens(testParser.DAY); }
		public TerminalNode DAY(int i) {
			return getToken(testParser.DAY, i);
		}
		public List<TerminalNode> YEAR() { return getTokens(testParser.YEAR); }
		public TerminalNode YEAR(int i) {
			return getToken(testParser.YEAR, i);
		}
		public List<TerminalNode> TIME() { return getTokens(testParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(testParser.TIME, i);
		}
		public PdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterPdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitPdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdateContext pdate() throws RecognitionException {
		PdateContext _localctx = new PdateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				match(T__0);
				{
				setState(169);
				((PdateContext)_localctx).m = match(MONTH);
				((PdateContext)_localctx).mo =  ((((PdateContext)_localctx).m!=null?((PdateContext)_localctx).m.getText():null).replaceAll("[^A-Za-z0-9]", ""));
				setState(171);
				((PdateContext)_localctx).d = match(DAY);
				((PdateContext)_localctx).da =  ((((PdateContext)_localctx).d!=null?((PdateContext)_localctx).d.getText():null).replaceAll("[^A-Za-z0-9]", ""));
				setState(173);
				((PdateContext)_localctx).y = match(YEAR);
				((PdateContext)_localctx).ye =  ((((PdateContext)_localctx).y!=null?((PdateContext)_localctx).y.getText():null).replaceAll("[^A-Za-z0-9]", ""));
				setState(175);
				match(FROM);
				setState(176);
				((PdateContext)_localctx).s = match(TIME);
				((PdateContext)_localctx).st =  ((((PdateContext)_localctx).s!=null?((PdateContext)_localctx).s.getText():null).replaceAll("[^A-Za-z0-9]", ""));
				setState(178);
				match(TO);
				setState(179);
				((PdateContext)_localctx).e = match(TIME);
				((PdateContext)_localctx).et =  ((((PdateContext)_localctx).e!=null?((PdateContext)_localctx).e.getText():null).replaceAll("[^A-Za-z0-9]", ""));
				}


				   date[0] = Arrays.asList(monthStr).indexOf(_localctx.mo)+1;

				   date[1] = Integer.parseInt(_localctx.da);

				   date[2] = Integer.parseInt(_localctx.ye);

				   ((PdateContext)_localctx).t =  "" + _localctx.st.charAt(0)+_localctx.st.charAt(1);
				   date[3] = Integer.parseInt(_localctx.t);


				   ((PdateContext)_localctx).t =  "" + _localctx.st.charAt(2)+_localctx.st.charAt(3);
				   date[4] = Integer.parseInt(_localctx.t);


				   ((PdateContext)_localctx).t =  "" + _localctx.et.charAt(0)+_localctx.et.charAt(1);
				   date[5] = Integer.parseInt(_localctx.t);


				   ((PdateContext)_localctx).t =  "" + _localctx.et.charAt(2)+_localctx.et.charAt(3);
				   date[6] = Integer.parseInt(_localctx.t);


				   if(available) {
				        PeopleContainer.getPeopleList().get(index).addAvailable(new PDate(date[0], date[1], date[3], date[4], date[5], date[6], false, date[2]));
				   }
				   else {
				        PeopleContainer.getPeopleList().get(index).addUnavailable(new PDate(date[0], date[1], date[3], date[4], date[5], date[6], false, date[2]));
				   }
				   
				setState(183);
				match(T__1);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(184);
					match(T__2);
					}
				}

				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class RecipeContext extends ParserRuleContext {
		public Token r;
		public TerminalNode RECIPE() { return getToken(testParser.RECIPE, 0); }
		public List<IngredientsContext> ingredients() {
			return getRuleContexts(IngredientsContext.class);
		}
		public IngredientsContext ingredients(int i) {
			return getRuleContext(IngredientsContext.class,i);
		}
		public List<CuisineContext> cuisine() {
			return getRuleContexts(CuisineContext.class);
		}
		public CuisineContext cuisine(int i) {
			return getRuleContext(CuisineContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<AllergyContext> allergy() {
			return getRuleContexts(AllergyContext.class);
		}
		public AllergyContext allergy(int i) {
			return getRuleContext(AllergyContext.class,i);
		}
		public List<DietContext> diet() {
			return getRuleContexts(DietContext.class);
		}
		public DietContext diet(int i) {
			return getRuleContext(DietContext.class,i);
		}
		public TerminalNode DAY() { return getToken(testParser.DAY, 0); }
		public RecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterRecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitRecipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitRecipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeContext recipe() throws RecognitionException {
		RecipeContext _localctx = new RecipeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_recipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(RECIPE);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(192);
				match(T__3);
				setState(193);
				((RecipeContext)_localctx).r = match(DAY);
				setState(194);
				match(T__4);
				recipeDict.put("number", (((RecipeContext)_localctx).r!=null?((RecipeContext)_localctx).r.getText():null)); inRecipe = true;
				}
			}

			setState(198);
			match(T__0);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(204);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INGREDIENTS:
					{
					setState(199);
					ingredients();
					}
					break;
				case CUISINE:
					{
					setState(200);
					cuisine();
					}
					break;
				case TYPE:
					{
					setState(201);
					type();
					}
					break;
				case ALLERGY:
					{
					setState(202);
					allergy();
					}
					break;
				case DIET:
					{
					setState(203);
					diet();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUISINE) | (1L << TYPE) | (1L << DIET) | (1L << ALLERGY) | (1L << INGREDIENTS))) != 0) );
			setState(208);
			match(T__1);
			inRecipe = false;
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

	public static class IngredientsContext extends ParserRuleContext {
		public String food = "";
		public Token f;
		public Token g;
		public TerminalNode INGREDIENTS() { return getToken(testParser.INGREDIENTS, 0); }
		public List<TerminalNode> DESC() { return getTokens(testParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(testParser.DESC, i);
		}
		public IngredientsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredients; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterIngredients(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitIngredients(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitIngredients(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredientsContext ingredients() throws RecognitionException {
		IngredientsContext _localctx = new IngredientsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ingredients);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(INGREDIENTS);
			setState(212);
			match(T__0);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(213);
					((IngredientsContext)_localctx).f = match(DESC);
					setState(214);
					match(T__2);
					_localctx.food += ((((IngredientsContext)_localctx).f!=null?((IngredientsContext)_localctx).f.getText():null).replace(" ", "+").replace("\"", "")) + "%2C+";
					}
					break;
				case 2:
					{
					setState(216);
					((IngredientsContext)_localctx).g = match(DESC);
					_localctx.food += ((((IngredientsContext)_localctx).g!=null?((IngredientsContext)_localctx).g.getText():null).replace(" ", "+").replace("\"", ""));
					}
					break;
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DESC );
			setState(222);
			match(T__1);
			recipeDict.put("includeIngredients", _localctx.food);
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

	public static class CuisineContext extends ParserRuleContext {
		public Token c;
		public TerminalNode CUISINE() { return getToken(testParser.CUISINE, 0); }
		public TerminalNode CUISINES() { return getToken(testParser.CUISINES, 0); }
		public CuisineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuisine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCuisine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCuisine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCuisine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuisineContext cuisine() throws RecognitionException {
		CuisineContext _localctx = new CuisineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cuisine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(CUISINE);
			setState(226);
			match(T__0);
			setState(227);
			((CuisineContext)_localctx).c = match(CUISINES);
			setState(228);
			match(T__1);
			recipeDict.put("cuisine", (((CuisineContext)_localctx).c!=null?((CuisineContext)_localctx).c.getText():null).replace(" ", "+"));
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
		public Token t;
		public TerminalNode TYPE() { return getToken(testParser.TYPE, 0); }
		public TerminalNode TYPES() { return getToken(testParser.TYPES, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(TYPE);
			setState(232);
			match(T__0);
			setState(233);
			((TypeContext)_localctx).t = match(TYPES);
			setState(234);
			match(T__1);
			recipeDict.put("type", (((TypeContext)_localctx).t!=null?((TypeContext)_localctx).t.getText():null).replace(" ", "+"));
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\2\3\3\5"+
		"\3\64\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bc\n\b\f\b\16\b"+
		"f\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\6\nt\n\n\r\n\16"+
		"\nu\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0081\n\13\f\13\16"+
		"\13\u0084\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0091"+
		"\n\f\r\f\16\f\u0092\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00bc\n\20\6\20\u00be\n\20\r\20\16\20\u00bf\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00c7\n\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00cf\n\21\r\21\16"+
		"\21\u00d0\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00dd"+
		"\n\22\r\22\16\22\u00de\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\3\3\2\34\35\2\u00f7\2+\3\2\2\2\4\63\3\2\2\2\6A\3\2\2"+
		"\2\bD\3\2\2\2\nJ\3\2\2\2\fR\3\2\2\2\16Z\3\2\2\2\20j\3\2\2\2\22p\3\2\2"+
		"\2\24y\3\2\2\2\26\u0089\3\2\2\2\30\u0097\3\2\2\2\32\u009d\3\2\2\2\34\u00a4"+
		"\3\2\2\2\36\u00bd\3\2\2\2 \u00c1\3\2\2\2\"\u00d5\3\2\2\2$\u00e3\3\2\2"+
		"\2&\u00e9\3\2\2\2(,\5\4\3\2),\5\22\n\2*,\5 \21\2+(\3\2\2\2+)\3\2\2\2+"+
		"*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\2\2\3\60\61\b"+
		"\2\1\2\61\3\3\2\2\2\62\64\7\21\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3"+
		"\2\2\2\65\66\7\22\2\2\66\67\7\3\2\2\678\5\6\4\289\7\4\2\29\5\3\2\2\2:"+
		"@\5\b\5\2;@\5\n\6\2<@\5\f\7\2=@\5\20\t\2>@\5\16\b\2?:\3\2\2\2?;\3\2\2"+
		"\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2"+
		"\2\2CA\3\2\2\2DE\7\23\2\2EF\7\3\2\2FG\7\"\2\2GH\7\4\2\2HI\b\5\1\2I\t\3"+
		"\2\2\2JK\7\31\2\2KL\7\3\2\2LM\7\n\2\2MN\7\37\2\2NO\7!\2\2OP\7\4\2\2PQ"+
		"\b\6\1\2Q\13\3\2\2\2RS\7\27\2\2ST\7\3\2\2TU\7 \2\2UV\7\30\2\2VW\7 \2\2"+
		"WX\7\4\2\2XY\b\7\1\2Y\r\3\2\2\2Z[\7\25\2\2[\\\7\3\2\2\\]\7\"\2\2]d\b\b"+
		"\1\2^_\7\"\2\2_c\b\b\1\2`a\7$\2\2ac\b\b\1\2b^\3\2\2\2b`\3\2\2\2cf\3\2"+
		"\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\4\2\2hi\b\b\1\2i\17\3"+
		"\2\2\2jk\7\26\2\2kl\7\3\2\2lm\7\"\2\2mn\b\t\1\2no\7\4\2\2o\21\3\2\2\2"+
		"pq\7\24\2\2qs\7\3\2\2rt\5\24\13\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2vw\3\2\2\2wx\7\4\2\2x\23\3\2\2\2yz\7\33\2\2z{\b\13\1\2{|\7\3\2\2|"+
		"\u0082\5\32\16\2}\u0081\5\26\f\2~\u0081\5\30\r\2\177\u0081\5\34\17\2\u0080"+
		"}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7\4\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\13\1\2\u0088\25\3\2\2"+
		"\2\u0089\u008a\7\20\2\2\u008a\u0090\7\3\2\2\u008b\u008c\7\b\2\2\u008c"+
		"\u008d\7\5\2\2\u008d\u0091\b\f\1\2\u008e\u008f\7\b\2\2\u008f\u0091\b\f"+
		"\1\2\u0090\u008b\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\4"+
		"\2\2\u0095\u0096\b\f\1\2\u0096\27\3\2\2\2\u0097\u0098\7\17\2\2\u0098\u0099"+
		"\7\3\2\2\u0099\u009a\7\t\2\2\u009a\u009b\7\4\2\2\u009b\u009c\b\r\1\2\u009c"+
		"\31\3\2\2\2\u009d\u009e\7\23\2\2\u009e\u009f\7\3\2\2\u009f\u00a0\7\"\2"+
		"\2\u00a0\u00a1\b\16\1\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\b\16\1\2\u00a3"+
		"\33\3\2\2\2\u00a4\u00a5\t\2\2\2\u00a5\u00a6\b\17\1\2\u00a6\u00a7\7\3\2"+
		"\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\7\4\2\2\u00a9\35\3\2\2\2\u00aa\u00ab"+
		"\7\3\2\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\b\20\1\2\u00ad\u00ae\7\37\2\2"+
		"\u00ae\u00af\b\20\1\2\u00af\u00b0\7!\2\2\u00b0\u00b1\b\20\1\2\u00b1\u00b2"+
		"\7\27\2\2\u00b2\u00b3\7 \2\2\u00b3\u00b4\b\20\1\2\u00b4\u00b5\7\30\2\2"+
		"\u00b5\u00b6\7 \2\2\u00b6\u00b7\b\20\1\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\b\20\1\2\u00b9\u00bb\7\4\2\2\u00ba\u00bc\7\5\2\2\u00bb\u00ba\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00aa\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\37\3\2\2\2\u00c1"+
		"\u00c6\7\32\2\2\u00c2\u00c3\7\6\2\2\u00c3\u00c4\7\37\2\2\u00c4\u00c5\7"+
		"\7\2\2\u00c5\u00c7\b\21\1\2\u00c6\u00c2\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ce\7\3\2\2\u00c9\u00cf\5\"\22\2\u00ca\u00cf\5"+
		"$\23\2\u00cb\u00cf\5&\24\2\u00cc\u00cf\5\26\f\2\u00cd\u00cf\5\30\r\2\u00ce"+
		"\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4\b\21"+
		"\1\2\u00d4!\3\2\2\2\u00d5\u00d6\7\36\2\2\u00d6\u00dc\7\3\2\2\u00d7\u00d8"+
		"\7\"\2\2\u00d8\u00d9\7\5\2\2\u00d9\u00dd\b\22\1\2\u00da\u00db\7\"\2\2"+
		"\u00db\u00dd\b\22\1\2\u00dc\u00d7\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7\4\2\2\u00e1\u00e2\b\22\1\2\u00e2#\3\2\2\2\u00e3\u00e4\7\f\2\2"+
		"\u00e4\u00e5\7\3\2\2\u00e5\u00e6\7\13\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8"+
		"\b\23\1\2\u00e8%\3\2\2\2\u00e9\u00ea\7\r\2\2\u00ea\u00eb\7\3\2\2\u00eb"+
		"\u00ec\7\16\2\2\u00ec\u00ed\7\4\2\2\u00ed\u00ee\b\24\1\2\u00ee\'\3\2\2"+
		"\2\25+-\63?Abdu\u0080\u0082\u0090\u0092\u00bb\u00bf\u00c6\u00ce\u00d0"+
		"\u00dc\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}