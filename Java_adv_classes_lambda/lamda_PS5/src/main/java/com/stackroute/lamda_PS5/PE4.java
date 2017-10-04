package com.stackroute.lamda_PS5;

public class PE4 {
	public static void main(String[] args) {
		LogHelper.logDetails(args.length+"");
		
		OuterHand outerHand = new OuterHand();
		Hand hand;
		hand = outerHand.getPalmAsHand();
		hand.facepalm();
		
	}
}

class OuterHand {
	OuterHand() {}
	
	class Palm implements Hand {

		public void facepalm() {
			// TODO Auto-generated method stub
			LogHelper.logDetails("Inside Palm, doing a facepalm");
		}
		
	}
	
	public Hand getPalmAsHand() {
		return new Palm();
	}
}