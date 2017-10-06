package com.stackroute.ps3.language_basics.Insurance;

import com.stackroute.ps3.language_basics.LogHelper;

public class TestInsuranceSurveyor {
	public static void main(String[] arsg) {
		//claim object
		Claim newClaim = new CarClaim(true);
		
		//insurance object.validateClaim()
		InsuranceSurveyor carInsuranceSurveyor = new CarInsuranceSurveyor(newClaim);
		
		
		//Manager for approval
		CanApprove manager = new Manager(carInsuranceSurveyor);
		
		if(manager.approve()) LogHelper.logDetails("Claim approved");
		else LogHelper.logDetails("Claim not approved");
	}
}