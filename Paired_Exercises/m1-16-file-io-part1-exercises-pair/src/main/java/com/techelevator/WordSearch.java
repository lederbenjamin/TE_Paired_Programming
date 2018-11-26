package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("What is the word you would like to search for: ");
		String targetWord = myScanner.nextLine();
		System.out.println("Enter 'true' if case sensitive and 'false' if not case sensitive: ");
		String input = myScanner.nextLine();
		boolean caseSensitive = Boolean.parseBoolean(input);
		System.out.println("Please input the file path: ");
		String filePath = myScanner.nextLine();
		
		File file = new File(filePath);
		Scanner loopScanner = new Scanner(file);
		
		int lineNumber = 0;
		if(caseSensitive == false) {
			while (loopScanner.hasNextLine()) {
				String line = loopScanner.nextLine();
				String[] lineArray = line.split(" ");
				lineNumber++;
				for(String word: lineArray) {
					if(word.toLowerCase().contains(targetWord)) {
						System.out.println(Integer.toString(lineNumber)+ ") " + line);
						break;
					}
				}		
			}
		}
		else if (caseSensitive == true){
			while (loopScanner.hasNextLine()) {
				String line = loopScanner.nextLine();
				String[] lineArray = line.split(" ");
				lineNumber++;
				for(String word: lineArray) {
					if(word.contains(targetWord)) {
						System.out.println(Integer.toString(lineNumber)+ ") " + line);
						break;
					}
				}		
			}
		}
	}
}

// case insensitive search through a list of strings 
//RegEx - 