package com.stackroute.ps3.language_basics.Insurance;

public class CarClaim implements Claim {
	private boolean isValid;
	
	public CarClaim() {
		this.isValid = false;
	}
	
	public CarClaim(boolean isValid ) {
		this.isValid = isValid;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return this.isValid;
	}
	
	
}
