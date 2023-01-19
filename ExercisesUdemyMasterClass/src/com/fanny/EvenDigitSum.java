package com.fanny;

public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));
		

	}
	public static int getEvenDigitSum(int number) {
		int sum = 0;
		int lastDigit = 0;
		if(number < 0) {
			return -1;
		}
		while(number > 0) {
			lastDigit = number % 10;
			if( number % 2 == 0) {
				sum += lastDigit;
				number /= 10;
				
			}else {
				number /= 10;
				continue;
				
			}
			
			
		}
		return sum;
	}

}
