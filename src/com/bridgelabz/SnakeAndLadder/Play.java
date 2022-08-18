package com.bridgelabz.SnakeAndLadder;

public class Play {

	int playerPosition, dice;
	
	void game() {
		
		System.out.println(" Player Position : " + playerPosition);
		
		dice = (int) (Math.random() * 6 + 1);
        System.out.println(" Dice : "+dice);
	}
	
}