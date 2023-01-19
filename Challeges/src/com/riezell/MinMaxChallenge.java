package com.riezell;

import java.util.Scanner;

public class MinMaxChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double max = 0;
		double min = 0;
		int loopcount = 0;
		while (true) {
			System.out.println("Enter a number, or any character to exit:");
			String nextEntry = scanner.nextLine();
			try {
				double validNum = Double.parseDouble(nextEntry);
				if (loopcount == 0 || validNum < min) {
					min = validNum;
				}
				if (loopcount == 0 || validNum > max) {
					max = validNum;
				}
				loopcount++;
			} catch (NumberFormatException nfe) {
				break;
			}
		}
		if (loopcount > 0) {
			System.out.println("min = " + min + ", max = " + max);
		} else {
			System.out.println("No valid data entered");
		}
	}

}