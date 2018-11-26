package com.techelevator;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SavingsAccountTest {

private SavingsAccount savingsaccount;
	
	@Before
	public void Constructor() {
		savingsaccount = new SavingsAccount();
	}
	
	
	
	@Test
	public void ShouldNotWithdrawMoreThanAvailableBalance() {
		savingsaccount.deposit(new BigDecimal(200));
		savingsaccount.withdraw(new BigDecimal(250));
		Assert.assertEquals(new BigDecimal(200) , savingsaccount.getBalance());

		
	}
	
	@Test
	public void ShouldInccurTwoDollarFee() {
		savingsaccount.deposit(new BigDecimal(150));
		savingsaccount.withdraw(new BigDecimal (50));
		Assert.assertEquals(new BigDecimal(98) , savingsaccount.getBalance());

		
	}
	
	@Test
	public void ShouldCompleteWithdrawNormally() {
		savingsaccount.deposit(new BigDecimal(500));
		savingsaccount.withdraw(new BigDecimal(250));
		Assert.assertEquals(new BigDecimal(250) , savingsaccount.getBalance());
	}

}
