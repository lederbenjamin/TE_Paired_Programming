package com.techelevator;

public class VolunteerWorker implements WorkerInterface {

	private String firstName;
	private String lastName;
	private int hoursWorked;
	
	public VolunteerWorker(String firstName, String lastName, int hoursWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
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
			double pay;
			pay = (double) hoursWorked * 0;
			return pay;
		}
		else {
			return 0;
		}
	}
	
}
