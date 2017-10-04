package com.stackroute.lamda_PS5;

public class PE5 {
	public static void main(String[] args) {
		Countable countsString;
		countsString = (s) -> {
			int count = 0;
			for(int i = 0; i < s.length(); i++) count++;
			return count;
		};
		
		LogHelper.logDetails("Counting String length for: \"Java8 is Cool!\"");
		LogHelper.logDetails(countsString.count("Java8 is Cool!") + "");
	}
}