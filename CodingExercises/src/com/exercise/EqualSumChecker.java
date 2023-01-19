package com.exercise;

public class EqualSumChecker {

	public static void main(String[] args) {
		boolean sumCheck = true;
	    sumCheck = hasEqualSum(1, 1, 1);
	    System.out.println(sumCheck);
	    sumCheck= hasEqualSum(1, 1, 2);
	    System.out.println(sumCheck);
        sumCheck = hasEqualSum(1, -1, 0);
        System.out.println(sumCheck);
        

	}
	public static  boolean hasEqualSum(int num1, int num2, int num3) {
		if (num1 + num2 == num3) {
			return true;
		}else {
			return false;
		}
	}

}
