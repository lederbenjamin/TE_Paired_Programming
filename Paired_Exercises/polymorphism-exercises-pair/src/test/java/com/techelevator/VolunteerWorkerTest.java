package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class VolunteerWorkerTest {

	VolunteerWorker volunteerworker;
	
	
	@Before
	public void setUp() {
		volunteerworker = new VolunteerWorker("John", "Smith", 40);
	}
	
	@Test
	public void testShouldCreateObject() {
		Assert.assertNotNull(volunteerworker);
	}
	
	
	@Test
	public void testShouldCalculateAsExpected() {
		Assert.assertEquals(0.00d , volunteerworker.calculateWeeklyPay(40));
	}
}
