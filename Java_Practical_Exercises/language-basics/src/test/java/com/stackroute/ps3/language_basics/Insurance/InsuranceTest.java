package com.stackroute.ps3.language_basics.Insurance;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.ps3.language_basics.LogHelper;

public class InsuranceTest {
	private Claim claim;
	private InsuranceSurveyor surveyor;
	private CanApprove manager;
	
	@Before
	public void setup() {
		
	}
	
	@After
	public void teardown() {
		
	}
	
	@Test
	public void testforClaimApproved() {
		claim = new CarClaim(true);
		surveyor = new CarInsuranceSurveyor();
		surveyor.setClaim(claim);
		manager = new Manager();
		manager.setInsurance(surveyor);
		boolean approved = manager.approve();
		assertEquals("Claim should be approved but is not approved", approved, true);
	}
}
