package com.techelevator;

public class HourlyWorker implements WorkerInterface{


	private double hourlyRate;
	private String firstName;
	private String lastName;
	private int hoursWorked;
	
	public HourlyWorker(String firstName, String lastName, double hourlyRate, int hoursWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
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
		if (hoursWorked > 0) {
			this.hoursWorked = hoursWorked;
			double pay = hourlyRate * hoursWorked;
		    double overtime = hoursWorked - 40;
			pay = pay + (hourlyRate * overtime * .5);
			return pay;
		}
		else {
			return 0;
		}
	}
	
	
	
}
