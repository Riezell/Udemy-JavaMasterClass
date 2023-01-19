package com.fanny;

public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));
	
	}
	public static int sumFirstAndLastDigit(int number) {
		int lastDigit = 0;
	int firstDigit = number;
		lastDigit = number % 10;
		if(number < 0) {
			return -1;
		}
		while(number >= 10) {
			number/=10;
		}
		firstDigit = number;
		return  firstDigit + lastDigit;
		
	}

}
