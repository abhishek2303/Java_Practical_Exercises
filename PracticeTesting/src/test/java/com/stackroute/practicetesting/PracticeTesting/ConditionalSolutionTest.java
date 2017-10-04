package com.stackroute.practicetesting.PracticeTesting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stackroute.practicetesting.PracticeTesting.ConditionalSolution;;


public class ConditionalSolutionTest {
	ConditionalSolution conditionObj;
	
	@Before
	public void setup() {
		conditionObj = new ConditionalSolution(20);

	}

	@After
	public void teardown() {
		conditionObj = null;

	}
	
	@Test
	public void checkNotNull() {
		assertNotNull("Expected a not null object", conditionObj);
	}

	@Test
	public void testGetFileName() {
		int actualVal = conditionObj.getValue();
		assertEquals("Expected value and actual value are not equal",
				20, conditionObj.getValue());
	}
}