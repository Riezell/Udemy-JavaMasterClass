package com.riezell;

public class CalculateInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(double rate = 7.5; rate <=10.0; rate += 0.25) {
			double interest = calculateInterest(100.00, rate);
			System.out.println("$100 at " + rate + " % interest = $" + interest);
		}

	}
	public static double calculateInterest(double amount, double interestRate) {
		return (amount *(interestRate / 100));
	}

}
