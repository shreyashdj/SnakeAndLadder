package com.bridgelabz.SnakeAndLadder;

public class SnakeAndLadder {
	
	public static void main(String[] args) {

		System.out.println("  Welcome to Snake And Ladder game \n");
		
		Play play = new Play();
		
		System.out.println(" Player starting Position : " + play.playerPosition);
		
		while(play.playerPosition < 100) {
		
			play.game();
		}

	}
}