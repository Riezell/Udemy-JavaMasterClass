package com.riezell;

public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString( 65,45));
		

	}
	
	public static String getDurationString(int seconds) {
		int minutes = seconds / 60;
		return getDurationString(seconds, minutes);
	}
	
	public static String getDurationString(int seconds, int minutes) {
		
		int hours = minutes / 60;
		

       int remainingMinutes = minutes % 60;
       int remainingSeconds = seconds % 60;
       
		return hours + " h " + minutes + " m "  + seconds + " s ";
	
	}

}
