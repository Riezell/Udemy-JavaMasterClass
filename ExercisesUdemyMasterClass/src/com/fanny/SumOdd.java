package com.fanny;

public class SumOdd {

	public static void main(String[] args) {
   sumOdd(1, 100);
	}
	
	public static boolean isOdd (int number) {
		if ((number > 0)&&(number % 2 != 0)) {
			return true;
		}
		return false;		
				
		}
	
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if (start >0 && end > 0 && start <= end) {
			for (int i= start; i<=end; i++ ) {
				if(isOdd(i)) {
					System.out.println("The sum of the odd number: " + i);
					sum = sum + i;
				}
			 }
			return sum;
		}else {
			return -1;
		}
		
	
	    
	}
 
}
