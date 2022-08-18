package com.bridgelabz.SnakeAndLadder;

public class Play {

	int playerPosition, dice, option;
	
	void game() {
		
		System.out.println(" Player starting Position : " + playerPosition);
		
		dice = (int) (Math.random() * 6 + 1);
        System.out.println("\n Dice : "+dice);
        
        option = (int) (Math.random() * 3);

        switch (option) {
	            case (1) -> {
	                System.out.println(" Case : Ladder");
	                playerPosition += dice;
	            }
	            case (2) -> {
	                System.out.println(" Case : Snake");
	                playerPosition -= dice;
	            }
	            default -> System.out.println(" Case : No Play");
	        }
        
        System.out.println("\n Player Position : " + playerPosition);
        
	}
	
}