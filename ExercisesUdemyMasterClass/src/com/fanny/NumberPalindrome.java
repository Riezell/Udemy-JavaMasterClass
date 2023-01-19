package com.fanny;

public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));

	}

	public static boolean isPalindrome(int number) {
		int lastDigit = 0;
		int reverse = 0;
		int value = number;
		while (number != 0 || number > 0) {
			lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number /= 10;
		}
		if(value == reverse) {
			return true;
		}else {
			return false;
		}

	}

}
