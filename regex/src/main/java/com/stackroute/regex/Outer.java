package com.stackroute.regex;


public class Outer {
	public Outer() {
		System.out.println("Outer Initialized");
	}
	
	class Inner {
		Inner() {
			System.out.println("Inner Initialized");
		}
	}
	
	public Inner getInnerInstance() {
		return new Inner();
	}
}