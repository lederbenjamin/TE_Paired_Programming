package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SalaryWorkerTest {

	SalaryWorker salaryworker;
	
	
	@Before
	public void setUp() {
		salaryworker = new SalaryWorker("John", "Smith", 100000.00d, 40);
	}
	
	@Test
	public void testShouldCreateObject() {
		Assert.assertNotNull(salaryworker);
	}
	
	
	@Test
	public void testShouldCalculateAsExpected() {
		Assert.assertEquals(1923.08 , salaryworker.calculateWeeklyPay(40));
	}

}
