// Generated from C:/Users/Robyn/Documents/Undergraduate/6th Year/Second Semester/CS 4TB3/Final Project/Potluck\test.g4 by ANTLR 4.7

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


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(testParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(testParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(testParser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(testParser.ScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(testParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(testParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(testParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(testParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(testParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(testParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(testParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(testParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(testParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(testParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(testParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(testParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#plan}.
	 * @param ctx the parse tree
	 */
	void enterPlan(testParser.PlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#plan}.
	 * @param ctx the parse tree
	 */
	void exitPlan(testParser.PlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#attendee}.
	 * @param ctx the parse tree
	 */
	void enterAttendee(testParser.AttendeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#attendee}.
	 * @param ctx the parse tree
	 */
	void exitAttendee(testParser.AttendeeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#allergy}.
	 * @param ctx the parse tree
	 */
	void enterAllergy(testParser.AllergyContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#allergy}.
	 * @param ctx the parse tree
	 */
	void exitAllergy(testParser.AllergyContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#diet}.
	 * @param ctx the parse tree
	 */
	void enterDiet(testParser.DietContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#diet}.
	 * @param ctx the parse tree
	 */
	void exitDiet(testParser.DietContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#pname}.
	 * @param ctx the parse tree
	 */
	void enterPname(testParser.PnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#pname}.
	 * @param ctx the parse tree
	 */
	void exitPname(testParser.PnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#availability}.
	 * @param ctx the parse tree
	 */
	void enterAvailability(testParser.AvailabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#availability}.
	 * @param ctx the parse tree
	 */
	void exitAvailability(testParser.AvailabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#pdate}.
	 * @param ctx the parse tree
	 */
	void enterPdate(testParser.PdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#pdate}.
	 * @param ctx the parse tree
	 */
	void exitPdate(testParser.PdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#recipe}.
	 * @param ctx the parse tree
	 */
	void enterRecipe(testParser.RecipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#recipe}.
	 * @param ctx the parse tree
	 */
	void exitRecipe(testParser.RecipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#ingredients}.
	 * @param ctx the parse tree
	 */
	void enterIngredients(testParser.IngredientsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#ingredients}.
	 * @param ctx the parse tree
	 */
	void exitIngredients(testParser.IngredientsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#cuisine}.
	 * @param ctx the parse tree
	 */
	void enterCuisine(testParser.CuisineContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#cuisine}.
	 * @param ctx the parse tree
	 */
	void exitCuisine(testParser.CuisineContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(testParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(testParser.TypeContext ctx);
}