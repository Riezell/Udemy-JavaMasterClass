package com.riezell;

public class Challenge3 {

	public static void main(String[] args) {
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Fanny", highScorePosition);
		
		 highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("iezell", highScorePosition);
		
		 highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Riezell", highScorePosition);


		
		 highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("R", highScorePosition);


		 highScorePosition = calculateHighScorePosition(25);
		displayHighScorePosition("F", highScorePosition);




	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out
				.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
	}

	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}

	}
}
