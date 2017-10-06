package com.stackroute.ps3.language_basics.Insurance;

public class CarInsuranceSurveyor implements InsuranceSurveyor {
	
	private Claim claim;
	
	public CarInsuranceSurveyor() {
		
	}
	
	public CarInsuranceSurveyor(Claim claim) {
		this.claim = claim;
	}

	public boolean validateClaim() {
		if(this.claim.isValid()) return true;
		return false;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

	public Claim getClaim() {
		return this.claim;
	}

}
