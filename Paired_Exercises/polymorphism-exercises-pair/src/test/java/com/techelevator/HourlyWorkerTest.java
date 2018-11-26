package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class HourlyWorkerTest {

	HourlyWorker hourlyworker;
	
	@Before
	public void setUp() {
		hourlyworker = new HourlyWorker("John", "Smith", 10.00d, 40);
	}
	
	@Test
	public void testShouldCreateObject() {
		Assert.assertNotNull(hourlyworker);
	}
	
	
	@Test
	public void testShouldCalculateAsExpected() {
		Assert.assertEquals(400.00, hourlyworker.calculateWeeklyPay(40));
		Assert.assertEquals(0.00, hourlyworker.calculateWeeklyPay(-40));
	}

}
