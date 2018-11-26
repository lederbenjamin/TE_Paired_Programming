package com.techelevator;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {

	private CheckingAccount checkingaccount;
		
	@Before
	public void Constructor() {
		checkingaccount = new CheckingAccount();
	}
	
	
	@Test
	public void ShouldHaveABankAccount() {
		Assert.assertNotNull(checkingaccount);	
	}
	
//	@Test
//	public void ShouldNotWithdrawNegativeAmount() {
//		checkingaccount.withdraw(new BigDecimal(-100));
//		Assert.assertEquals(new BigDecimal(0) , checkingaccount.getBalance());
//	}
	
	@Test
	public void ShouldDeposit() {
		checkingaccount.deposit(new BigDecimal (500));
		Assert.assertEquals(new BigDecimal(500) , checkingaccount.getBalance());
	}
	
	@Test
	public void ShouldSufferTENDollarFee() {
		checkingaccount.deposit(new BigDecimal (50));
		checkingaccount.withdraw(new BigDecimal(60));
		Assert.assertEquals(new BigDecimal(-20) , checkingaccount.getBalance());
	}
	
	@Test
	public void ShouldNotWithdrawMoreThanCheckingAccountBalanceOfNegNinety() {
		checkingaccount.withdraw(new BigDecimal(90));
		checkingaccount.withdraw(new BigDecimal(10));
		Assert.assertEquals(new BigDecimal(-100) , checkingaccount.getBalance());
	}

}
