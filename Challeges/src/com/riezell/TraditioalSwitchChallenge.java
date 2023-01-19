package com.riezell;

public class TraditioalSwitchChallenge {

	public static void main(String[] args) {
		
		char letter = 'F';
		
		switch(letter) {
		case 'A':
			System.out.println("A is Able");
			break;
		case 'B':
			System.out.println("B isBaker");
			break;
		case 'C':
			System.out.println("C is Charlie");
			break;
		case 'D':
			System.out.println("D is Dog");
			break;
		case 'E':
			System.out.println("E is Easy");
			break;
		default:
			System.out.println("The NATO letter " + letter + " cannot found");
			break;
		
		}

	}

}
