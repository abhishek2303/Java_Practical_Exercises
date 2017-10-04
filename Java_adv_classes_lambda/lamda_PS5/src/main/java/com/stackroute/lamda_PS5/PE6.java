package com.stackroute.lamda_PS5;

public class PE6 {
	public static void main(String[] arg) {
		Multiplyable multiplyObj;
		multiplyObj = (i) -> 2*i;
		
		LogHelper.logDetails("Multiplying 4 by 2");
		LogHelper.logDetails("Result: " + multiplyObj.multiplyBy2(4));
	}
}

@FunctionalInterface
interface Multiplyable {
	public int multiplyBy2(int s1);
}