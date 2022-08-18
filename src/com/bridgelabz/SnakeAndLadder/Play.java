package com.bridgelabz.SnakeAndLadder;

public class Play {

	int playerPosition, dice, option, diceCount;
	
	void game() {
		
		dice = (int) (Math.random() * 6 + 1);
		diceCount++;
        System.out.println("\n Dice : "+dice);
        
        option = (int) (Math.random() * 3);

        switch (option) {
	            case (1) -> {
	                System.out.println(" Case : Ladder");
	                playerPosition += dice;
	                if (playerPosition > 100) {
	                	playerPosition -= dice;
	                }
	            }
	            case (2) -> {
	                System.out.println(" Case : Snake");
	                playerPosition -= dice;
	                if (playerPosition < 0) {
	                	playerPosition = 0;
	                }
	            }
	            default -> System.out.println(" Case : No Play");
	        }
        
        System.out.println("\n Player Position : " + playerPosition);
        
	}
	
}