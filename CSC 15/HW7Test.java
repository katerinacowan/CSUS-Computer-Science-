/* This is the test file for Homework #7 (DO NOT MODIFY!) */

package Main;

public class HW7Test{
	public static void main(String[] args){
		Gamescore gs = new Gamescore(0);		// Creating a new Gamescore object
		p(gs.toString());						// Display proof of score
		gs.increaseScore(50);					// Add 50 points to score
		p("Score is now " + gs.getScore() + " points.");	// Verify getScore() works
		gs.decreaseScore(25); 					// Remove 25 points from score
		p(gs.toString());						// Display proof of score
		gs.resetScore(); 						// Set score back to zero
		p(gs.toString());						// Display proof of score
		gs.setScore(999); 						// Set the score to 999 points
		p(gs.toString());						// Display proof of score
	}
	
	public static void p(String input){
		System.out.println(input);
	}
}