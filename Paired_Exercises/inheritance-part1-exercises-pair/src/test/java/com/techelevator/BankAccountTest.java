package com.techelevator;
import java.math.*;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

private BankAccount bankaccount;
	
	@Before
	public void Constructor() {
		bankaccount = new BankAccount();
	}
	
	
	
	@Test
	public void ShouldHaveABankAccount() {
		Assert.assertNotNull(bankaccount);	
	}
	
	@Test
	public void ShouldNotWithdrawNegativeAmount() {
		bankaccount.withdraw(new BigDecimal(-100));
		Assert.assertEquals(new BigDecimal(0) , bankaccount.getBalance());
	}
	
	@Test
	public void ShouldNotDepositNegativeAmount() {
		bankaccount.deposit(new BigDecimal(-100));
		Assert.assertEquals(new BigDecimal(0) , bankaccount.getBalance());
	}
	
	@Test
	public void ShouldNotTransferMoreMoneyThanAvailable() {
		BankAccount bankaccount2 = new BankAccount();
		bankaccount.transfer(bankaccount2 , new BigDecimal(100));
		Assert.assertEquals(new BigDecimal(0) , bankaccount2.getBalance());
	}
	
	@Test
	public void ShouldDeposit() {
		bankaccount.deposit(new BigDecimal (500.00));
		Assert.assertEquals(new BigDecimal(500.00) , bankaccount.getBalance());
	}

}

// withdraw method test
// ---can not withdraw negative amount
// ---can not withdraw more then they have


// deposit method test
// ---can not deposit a negative amount

// transfer method test
// ---make sure method deposits amount to transfer into desired account while withdrawing from origin account


