package com.bridgelabz.SnakeAndLadder;

public class SnakeAndLadder {
	
	static Play player1 = new Play();
	static Play player2 = new Play();
	
	static void firstPlayer() {
		
		System.out.println("\n Player-1 played");
		player1.game();
		System.out.println(" Player-1 Position : " + player1.playerPosition
				+ "\n Player-2 Position : " + player2.playerPosition);
	}
	
	static void secondPlayer() {
		
		System.out.println("\n Player-2 played");
		player2.game();
		System.out.println(" Player-1 Position : " + player1.playerPosition
				+ "\n Player-2 Position : " + player2.playerPosition);
	}
	
	public static void main(String[] args) {

		System.out.println("  Welcome to Snake And Ladder game \n");
		
		System.out.println(" Player-1 starting Position : " + player1.playerPosition
						+ "\n Player-2 starting Position : " + player2.playerPosition);
		
		while(player1.playerPosition < 100 && player2.playerPosition < 100) {
		
			firstPlayer();
			
			while(player1.option == 1 && player1.playerPosition < 100) {
				
				firstPlayer();
			}
			
			if(player1.playerPosition < 100) {
				secondPlayer();
			}
			
			while(player2.option == 1 && player1.playerPosition < 100 && player2.playerPosition < 100) {
				
				secondPlayer();
			}
			
		}

		if(player1.playerPosition == 100) {
			System.out.println("\n Player-1 Wins!");
		} else {
			System.out.println("\n Player-2 Wins!");
		}
		
		System.out.println("\n NO. OF times Dice rolled by Player-1 : " + player1.diceCount
						+ "\n NO. OF times Dice rolled by Player-2 : " + player2.diceCount);
		
	}
}