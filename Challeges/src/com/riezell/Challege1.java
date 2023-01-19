package com.riezell;

public class Challege1 {

	public static void main(String[] args) {
		double valueOne = 20.00d;
		double valueTwo = 80.00d;
		double valueTotal = valueOne + valueTwo;
		System.out.println("The total value is " + valueTotal);
		
		double remainder = valueTotal % 40.00d;
		System.out.println("The remainder is " + remainder);
		
		
		
		boolean isNoRemainder = (remainder == 0)? true:false;
		System.out.println("is no Remainder = " + isNoRemainder);
		if(!isNoRemainder) {
			System.out.println("Got some remainder");
		}
		
	}

}
