package com.stackroute.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PE6{
	public static void main(String[] args) {
		String input = "She sells seashells by the seashore";
		String regex = "se";
		List<List<Integer>> occurrences = findOccurrences(regex, input);
		
		for(List<Integer> startAndEnd: occurrences) {
			System.out.print("Found at: ");
			System.out.println(startAndEnd.get(0) + " - " + startAndEnd.get(1));
		}
//		System.out.println(occurrences);
	}
	
	public static List<List<Integer>> findOccurrences(String regex, String input) {
		List<List<Integer>> occurrences = new ArrayList<List<Integer>>();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find()) {
			occurrences.add(new ArrayList<Integer>(Arrays.asList(matcher.start(), matcher.end())));
		}
		
		return occurrences;
	}
}