package com.stackroute.lamda_PS5;

public class PE1 {
	public static void main(String[] args) {
		SecondClass object = new SecondClass();
		object.getFirstClassObject();
		object.getFirstClassObject("ARGS");
	}
}

class FirstClass {
	private String text;
	
	public FirstClass() {
		LogHelper.logDetails("First Class Created");
	}
	
	public FirstClass(String text) {
		LogHelper.logDetails("First class created with one arg constructor" );
		this.text = text;
	}
}

class SecondClass {
	public FirstClass getFirstClassObject() {
		LogHelper.logDetails("Inside Second Class creating anonymous inner class object which inherits"
				+ " FirstClass");
		return new FirstClass() {
			
		};
	}
	
	public FirstClass getFirstClassObject(String text) {
		LogHelper.logDetails("Inside Second Class creating anonymous inner class object which inherits"
				+ " FirstClass");
		return new FirstClass(text) {
			
		};
	}
}