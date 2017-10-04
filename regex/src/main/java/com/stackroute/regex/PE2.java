package com.stackroute.regex;

import com.stackroute.regex.Outer.Inner;

public class PE2 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.getInnerInstance();
	}
}