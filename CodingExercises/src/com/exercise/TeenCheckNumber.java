package com.exercise;

public class TeenCheckNumber {

	public static void main(String[] args) {
		
		boolean isTeenager = true;
		isTeenager = hasTeen(9,99, 19);
		System.out.println(isTeenager);
		isTeenager = hasTeen(23, 15, 42);
		System.out.println(isTeenager);
		isTeenager = hasTeen(22, 23, 34);
		System.out.println(isTeenager);
		
		System.out.println("***********************************");
		boolean checkTeen = true;
		checkTeen = isTeen(9);
		System.out.println(checkTeen);
		checkTeen = isTeen(13);
		System.out.println(checkTeen);
		

		

	}
	public static boolean hasTeen( int teen1, int teen2, int teen3) {
		if(teen1 >= 13 && teen1 <= 19 || teen2 >= 13 
				&& teen2 <= 19 || teen3 >= 13 && teen3 <= 19) {
			return true;
		}else {
			return false;
		}
	}
	 public static boolean isTeen( int teen4) {
		 if(teen4 >= 13 && teen4 <= 19) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	

}
