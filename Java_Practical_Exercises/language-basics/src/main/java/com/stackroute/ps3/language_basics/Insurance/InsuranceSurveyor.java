package com.stackroute.ps3.language_basics.Insurance;

public interface InsuranceSurveyor {
	boolean validateClaim();
	void setClaim(Claim claim);
	Claim getClaim();
}
