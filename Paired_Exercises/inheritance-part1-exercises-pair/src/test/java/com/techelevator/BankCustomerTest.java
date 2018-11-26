package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import java.math.*;

public class BankCustomerTest {
		
	@Test
	public void ShouldCreateCustomer() {
		BankCustomer customer = new BankCustomer();
		Assert.assertNotNull(customer);	
	}
	
	
	@Test
	public void ShouldCreateCheckingAccount() {
		BankCustomer customer = new BankCustomer();
		CheckingAccount checkingAccount = new CheckingAccount();
		Assert.assertNotNull(checkingAccount);	
	}
	
	@Test
	public void ShouldCreateSavingsAccount() {
		BankCustomer customer = new BankCustomer();
		SavingsAccount savingsAccount = new SavingsAccount();
		Assert.assertNotNull(savingsAccount);	
	}
	
	 
	@Test
	public void ShouldAppendAccountList() {
		BankCustomer customer = new BankCustomer();
		CheckingAccount checkingAccount = new CheckingAccount();
		SavingsAccount savingsAccount = new SavingsAccount();
		customer.addAccount(savingsAccount);
		customer.addAccount(checkingAccount);
		Assert.assertEquals(2, customer.getArrayListSize());	
	}
	
	@Test
	public void ShouldReturnisVIPstatusAsTrue() {
		BankCustomer customer = new BankCustomer();
		CheckingAccount checkingAccount = new CheckingAccount();
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.deposit(new BigDecimal(500000));
		customer.addAccount(savingsAccount);
		checkingAccount.deposit(new BigDecimal(12500));
		customer.addAccount(checkingAccount);
		customer.setisVIP();
		Assert.assertEquals(true, customer.getisVIP());	
	}
	
	

}
