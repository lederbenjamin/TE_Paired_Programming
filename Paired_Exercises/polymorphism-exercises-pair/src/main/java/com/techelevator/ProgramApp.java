package com.techelevator;
import java.util.ArrayList;
import java.text.*;

import java.util.List;
import java.util.Formatter.*;
import java.lang.*;

public class ProgramApp {
//	Following the approach that the morning's examples has led, create a List that 
//  represents a company payroll and holds a collection of workers in it. The objective will be to:
//
//	* output each employee, their number of hours worked (you can use a random number generator), 
//    and their weekly pay using the interface
//	* at the end show the sum of total hours worked and total weekly payroll
//
//	*Sample Output*
//
//	```
//	Employee             Hours Worked           Pay
//	Mouse, Mickey        90                     $750.00
//	Geef, George (Goofy) 90                     $0.00
//	Duck, Daisy          110                    $750.00
//	Mouse, Minnie        20                     $2100.00
//
//	Total Hours: 310
//	Total Pay: $3600.00

	public static void main(String[] args) {
		
		List<WorkerInterface> workers = new ArrayList<WorkerInterface>();
		
		SalaryWorker rich = new SalaryWorker("Matthew" , "Boyles" , 100000.00d, 40);
		VolunteerWorker dumb = new VolunteerWorker("Florence" , "Nightengale", 40);
		HourlyWorker poor = new HourlyWorker("Joe" , "Smoe" , 8.33d, 40);
		
		workers.add(rich);
		workers.add(dumb);
		workers.add(poor);
		
		String employee = "Employee";
		String hoursWorked = "Hours Worked";
		String pay = "Pay";
		
		System.out.println(String.format("%-29s  %-15s %-20s" , employee, pay, hoursWorked));
		int totalHours = 0;
		double totalPay = 0.00d;
		for (WorkerInterface worker : workers) {
			totalHours = totalHours + worker.getHoursWorked();
			totalPay = totalPay + worker.calculateWeeklyPay(40);
			System.out.printf("%-30s %s%-14.2f %-15s %n", worker.getFirstName() + ", " +worker.getLastName() , "$",worker.calculateWeeklyPay(40), worker.getHoursWorked());
			
		}
		DecimalFormat text = new DecimalFormat("0.##");
		System.out.println("");
		System.out.println("Total Hours: " + totalHours);
		System.out.println("TotalPay: $" + text.format(totalPay));
	}

}
