package com.stackroute.regex;

public class PE3 {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("Throwing an exception inside try block");
			throw new Exception("Exception type: Exception");
		} catch (Exception e) {
			System.out.println("Inside catch block");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("I was there");
		}
	}
}