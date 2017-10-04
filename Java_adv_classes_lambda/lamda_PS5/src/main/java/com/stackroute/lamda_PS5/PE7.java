package com.stackroute.lamda_PS5;

public class PE7 {
	public static void main(String[] arg) {
		ChecksForFactors factorCheck;
		factorCheck = (N, d) -> N >= d && N%d == 0;
		
		int N = 10, d = 3;
		LogHelper.logDetails(N + " " + d);
		if(factorCheck.checkForFactor(N, d)) {
			LogHelper.logDetails(d + " is a factor of " + N);
		} else {
			LogHelper.logDetails(d + " is not a factor of " + N);
		}
	}
}

@FunctionalInterface
interface ChecksForFactors {
	public boolean checkForFactor(int N, int d);
}