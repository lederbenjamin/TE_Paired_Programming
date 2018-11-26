package com.techelevator;
import java.math.BigDecimal;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount() {
	}
	
	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		if (getBalance().compareTo(amountToWithdraw) == -1 ) {
			return getBalance();
		}
		else if (getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal (150)) == -1) {	
			super.withdraw(new BigDecimal (2));
			super.withdraw(amountToWithdraw);
			return getBalance();
		}
		else {
			super.withdraw(amountToWithdraw);
			return getBalance();
		}
			
	}
}
