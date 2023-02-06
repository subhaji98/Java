package Abstact;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpressionExample {

	  public static void main(String[] args) {
	    Pattern pattern = Pattern.compile("maveric", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("Welcome to MAVERIC");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	  }
	}
