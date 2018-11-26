package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {

		File text = new File("");
		
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter a search word...");
		File inputFile = getInputFileFromUser();
		String searchWord = myScanner.nextLine();
		
		
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please input the file path: ");
		String filePath = myScanner.nextLine();
		
		File file = new File(filePath);
		Scanner loopScanner = new Scanner(file);
		
		int wordCount = 0;
		int sentenceCount = 0;
			while (loopScanner.hasNextLine()) {
				String line = loopScanner.nextLine();
				String[] lineArray = line.split(" ");
				for(String punctuation: lineArray) {
					if(punctuation.contains(".") || punctuation.contains("!") || punctuation.contains("?"))
						sentenceCount++;
				}
				for(String character: lineArray) {
					//if(character.contains([a-zA-Z]))
						wordCount++;
				}
			}
		System.out.println("Word Count: " + Integer.toString(wordCount));
		System.out.print("Sentence Count: " + Integer.toString(sentenceCount));


	}
}

//File inputFile = getInputFileFromUser();
//try(Scanner fileScanner = new Scanner(inputFile)) {
//	while(fileScanner.hasNextLine()) {
//		String line = fileScanner.nextLine();
//		System.out.println("\n" + line + "\n");
=======

>>>>>>> dd70a0f48381089087031707e2ed5b8a9fd0dd69
