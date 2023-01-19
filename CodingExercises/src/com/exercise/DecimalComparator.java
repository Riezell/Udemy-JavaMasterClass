package com.exercise;

public class DecimalComparator {

	public static void main(String[] args) {

		boolean check = true;
		check = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
		System.out.println(check);
		check = areEqualByThreeDecimalPlaces(3.175, 3.176);
		System.out.println(check);
		check = areEqualByThreeDecimalPlaces(3.0, 3.0);
		System.out.println(check);
		check = areEqualByThreeDecimalPlaces(-3.123, 3.123);
		System.out.println(check);

	}

	public static boolean areEqualByThreeDecimalPlaces(double myFistNum, double mySecNum) {
		int num1 = (int) (myFistNum * 1000);
		int num2 = (int) (mySecNum * 1000);

		if (num1 == num2) {
			return true;
		} else {
			return false;
		}
	}

}
