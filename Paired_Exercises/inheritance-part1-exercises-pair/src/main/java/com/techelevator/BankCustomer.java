package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

	private String name;
	private String address;
	private String phoneNumber;
	private BankAccount[] account;
	private List<BankAccount> accountList = new ArrayList<BankAccount> ();
	private boolean isVIP;
	
	public BankCustomer() {
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getArrayListSize() {
		return accountList.size();
	}
	
	public List<BankAccount> getArrayList(){
		return accountList;
	}

	public void addAccount(BankAccount newAccount) {
		accountList.add(newAccount);
	}
	
	public boolean getisVIP() {
		return isVIP;
	}
	
	public void setisVIP() {
		BigDecimal balanceSum = new BigDecimal (0);
		for(BankAccount act: accountList) {
			balanceSum.add(act.getBalance());
		}
		if (balanceSum.compareTo(new BigDecimal(24999.99)) == 1)
			isVIP = true;
		else 
			isVIP = false;
	}
	
	public BankAccount[] getAccount() {
		account = accountList.toArray(new BankAccount[accountList.size()]);
		return account;
	}
	
}
