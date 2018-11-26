package com.techelevator;

import java.math.BigDecimal;

public class BankAccount {
	
	private String accountNumber;
	private BigDecimal balance;
	
	public BankAccount() {
		balance = new BigDecimal (0);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	
	public BigDecimal deposit(BigDecimal amountToDeposit) {
		if (amountToDeposit.compareTo(new BigDecimal(0)) == 1) {
			balance = balance.add(amountToDeposit);
		}
		return balance;
	}
	
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		if (amountToWithdraw.compareTo(new BigDecimal(0)) == 1) {
			balance = balance.subtract(amountToWithdraw);
		}
		return balance;
	}
	
	public void transfer(BankAccount destinationAccount, BigDecimal transferAmount) {
		if (getBalance().compareTo(transferAmount) == 1) {
			destinationAccount.deposit(transferAmount);
			balance = balance.subtract(transferAmount);
		}// does not handle case where amount to transfer is equivalent to balance.
	}
	

}