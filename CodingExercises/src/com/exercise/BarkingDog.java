package com.exercise;



public class BarkingDog {

	public static void main(String[] args) {
		
		BarkingDog Dog = new BarkingDog();
		boolean wakeUp = true;
		wakeUp = shouldWakeUp(true, 1);
		System.out.println(wakeUp);
		wakeUp = shouldWakeUp(false, 2);
		System.out.println(wakeUp);
		wakeUp = shouldWakeUp(true, 8);
		System.out.println(wakeUp);
		wakeUp= shouldWakeUp(true, -1);
		System.out.println(wakeUp);
	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (!barking || (hourOfDay < 0 || hourOfDay > 23)) {
			return false;
		}
		if (hourOfDay < 8 || hourOfDay > 22 && barking) {
			return true;
		} else {
			return false;
		}
	}
}

