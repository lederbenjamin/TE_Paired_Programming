package com.techelevator;


import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
		
	public CheckingAccount() {
	}

	
	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) 
	{
		if(getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal(0)) == 1) 
		{
			super.withdraw(amountToWithdraw);
			return getBalance();
		}
		else if(getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal(0)) == -1)
		{	
			if (getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal (-90.01d)) == 1)
			{
				super.withdraw(new BigDecimal (10));
				super.withdraw(amountToWithdraw);
			
			}
			return getBalance();
		}
		else 
		{
			return getBalance();
		}
	}
}
