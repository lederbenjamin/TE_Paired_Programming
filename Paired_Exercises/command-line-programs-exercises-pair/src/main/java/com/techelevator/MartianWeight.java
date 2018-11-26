package com.techelevator;

import java.text.DecimalFormat;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */

import java.util.*;

public class MartianWeight {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("$ MartianWeight");
		System.out.print("Enter a series of Earth weights (space-separated): ");
		String input = myScanner.nextLine();
		String[] numbers = input.split(" "); 
		
		for (int i=0; i<numbers.length; i++){
			double inputWeight = Double.parseDouble(numbers[i]);
			double martianWeight = (inputWeight * 0.378);
			System.out.println(numbers[i] + " lbs. on Earth, is " + martianWeight + " lbs. on Mars.");
		}
	}	
}
		