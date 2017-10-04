package com.stackroute.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PE5 {
	public static void main(String[] args) {
		String input = "This is Henry";
		String regex = "Harry";
		System.out.print("Is " + regex + " here ? ");
		System.out.println(isPatternPresent(regex, input));
	}
	
	public static boolean isPatternPresent(String regex, String str) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		return matcher.find();
	}
}