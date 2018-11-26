package com.techelevator;

public interface WorkerInterface {
//	| Attribute Name | Type | Get | Set |
//	|--------|-------------|-----|-----|
//	| `firstName` | `string` | X | |
//	| `lastName` | `string` | X | |
//
//
//	<br />
//
//	| Method | Return Type |
//	|--------|-------------|
//	| `calculateWeeklyPay(int hoursWorked)` | `double` |

	String getFirstName();
	String getLastName();
	double calculateWeeklyPay(int hoursWorked);
	int getHoursWorked();

}
