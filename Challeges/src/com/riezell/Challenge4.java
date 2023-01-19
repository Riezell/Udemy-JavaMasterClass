package com.riezell;

public class Challenge4 {

	public static void main(String[] args) {
		
		int playerScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Fanny", playerScorePosition);

	}

	public static void displayHighScorePosition(String playerName, int playerScorePosition) {
		System.out
				.println(playerName + " managed to get into position " + playerScorePosition + " on the high score list");
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
