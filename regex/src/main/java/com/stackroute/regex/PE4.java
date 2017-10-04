package com.stackroute.regex;

public class PE4 {
	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
			
			String[] arr;
			
			//
			arr = new String[5];
			System.out.println(arr[10]);
			
			//
			arr = new String[-4];
			
			//
			arr = null;
			System.out.println(arr[1]);
			
			
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Caught IndexOutOfBoundsException");
			System.out.println("Exception class: " + e.getClass());
			
		} catch (NegativeArraySizeException e) {
			System.out.println("Caught NegativeArraySizeException");
			System.out.println("Exception class: " + e.getClass());
			
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException");
			System.out.println("Exception class: " + e.getClass());
			
		}
	}
}