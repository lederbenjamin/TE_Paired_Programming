package com.techelevator;
import java.math.*;

public class SalaryWorker implements WorkerInterface{
//	Create a `SalaryWorker` class that implements `Worker` interface.
//
//	| Attribute Name | Type | Get | Set |
//	|--------|-------------|-----|-----|
//	| `annualSalary` | `double` | X | | 
//
//	<br />
//
//	| Constructor |
//	|-------------|
//	| `SalaryWorker(String firstName, String lastName, double annualSalary)` |
//
//	A salaried employee "is-a" worker. hoursWorked express the number of hours for which the salaried employee worked in a given week. Since salary employees are based on a 40 hour week, any hours above or below are ignored and the following formula is used to calculate their weekly salary:
//	    
//	    pay = annual salary / 52

	private double annualSalary;
	private String firstName;
	private String lastName;
	private int hoursWorked;
	
	
	
	public SalaryWorker(String firstName, String lastName, double annualSalary, int hoursWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String getFirstName() {
		
		return firstName;
	}

	@Override
	public String getLastName() {
		
		return lastName;
	}
	@Override
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		this.hoursWorked = hoursWorked;
			double pay = annualSalary / 52;
			return Math.round(pay * 100.0) / 100.0;	
	}
	

}
