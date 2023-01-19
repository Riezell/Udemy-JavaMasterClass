package com.exercise;

public class LeafYearCalculator {

	public static void main(String[] args) {
		
		boolean check = true;
		check = isLeafYear(-1600);
		System.out.println(check);
		check = isLeafYear(1600);
		System.out.println(check);
		check = isLeafYear(2017);
		System.out.println(check);
		check = isLeafYear(2000);
		System.out.println(check);
		
		

	}

	public static boolean isLeafYear(int year) {
		if (year <= 1 && year >= 9999) {
			return false;
		}else if ((year % 4 == 0 &&  year % 100 == 0) && 
				(year >1 && year < 9999 ) || year  % 400 ==0
			&& (year > 1 && year <9999)){
				return true;
			}else {
				return false;
			}
	}

}
