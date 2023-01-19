package com.fanny;

public class SharedDigit {

	public static void main(String[] args) {
		/*
		 * System.out.println(hasSharedDigit(12, 23));
		 * System.out.println(hasSharedDigit(9, 99));
		 * System.out.println(hasSharedDigit(15, 55));
		 */
		
		hasSharedDigit(12, 23);
	}
	public static boolean hasSharedDigit(int num1, int num2) {
		int lastDigit1 = 0;
		int lastDigit2 = 0;
		int value = num2;
		
		if((num1 >=10 && num1 <=99) &&(num2 >=10 && num2 <=99)) {
			
			while(num1 > 0) {
				lastDigit1 = num1 % 10;
				System.out.println("Num1 last digit " + lastDigit1 );
				
				do {
					lastDigit2 = num2 % 10;
					System.out.println("Num12 last digit " + lastDigit2);
					if(lastDigit1 == lastDigit2) {
						return true;
					}else {
						num2 /= 10;
					}
				}while(num2 >0) ;
				num2 = value;
				num1 /=10;
			}
		}
		return false;
	}

}
