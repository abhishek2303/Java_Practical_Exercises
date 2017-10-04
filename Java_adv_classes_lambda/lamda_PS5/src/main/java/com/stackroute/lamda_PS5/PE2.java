package com.stackroute.lamda_PS5;

public class PE2 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getNewInnerInstance();
	}
}

class Outer {
	Outer() {
		LogHelper.logDetails("Creating an Outer class object");
	}
	
	class Inner {
		Inner(){
			LogHelper.logDetails("Creating an Inner class object");
		}
	}
	
	public Inner getNewInnerInstance() {
		return new Inner();
	}
}