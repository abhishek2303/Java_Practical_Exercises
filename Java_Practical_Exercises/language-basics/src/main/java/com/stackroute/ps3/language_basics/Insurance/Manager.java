package com.stackroute.ps3.language_basics.Insurance;

public class Manager implements CanApprove{
	private InsuranceSurveyor surveyor;
	
	public Manager() {
		
	}
	
	public Manager(InsuranceSurveyor surveyor) {
		this.surveyor = surveyor;
	}

	@Override
	public boolean approve() {
		return this.surveyor.validateClaim();
	}

	@Override
	public void setInsurance(InsuranceSurveyor surveyor) {

		this.surveyor = surveyor;
		
	}
	
	
}
