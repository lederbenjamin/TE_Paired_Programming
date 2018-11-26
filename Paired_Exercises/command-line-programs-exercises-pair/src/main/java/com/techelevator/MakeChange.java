package com.techelevator;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then display the change required.
 
 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
import java.util.*;
import java.text.*;

public class MakeChange {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.##");
		System.out.println("$ Java MakeChange");
		System.out.println("Please enter the amount of this bill: ");
		String billTotal = myScanner.nextLine();
		System.out.println("Please enter the amount of currency tendered: ");
		String currencyTotal = myScanner.nextLine();
		float billTotalAsF = Float.parseFloat(billTotal);
		float currencyTotalAsF = Float.parseFloat(currencyTotal);
		float change = currencyTotalAsF - billTotalAsF;
		System.out.println("Your change will be: $" + df.format(change));

	}

}
