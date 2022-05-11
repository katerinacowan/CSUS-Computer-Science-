/* H O M E W O R K   # 7
 * C S C   1 5
 * 
 * Student's Name Here: Katerina Cowan
 * 
 * Follow the directions on the Homework #7 hand out and submit this file via Canvas by the due date.
 * 
 * */

package Main;

/* Create a class that handles keeping track of a video game's score (according to specifications on the hand out)
 * 
 * Fill in the fields, constructor body, and method bodies to complete the assignment. */

public class Gamescore{
	// TODO: Fields...
	private int number; 
	
	// TODO: Constructor...
	public Gamescore(int startScore){
		this.number = startScore;
	}
	
	// TODO: Methods...
	   // private variable
   public int getScore(){
	   return number;
   }
   public void increaseScore(int amt){
       this.setScore(this.getScore()+amt);
   }
   public void decreaseScore(int amt){
       this.setScore(this.getScore()-amt);
   }
   public void resetScore(){
       this.setScore(0);
   
   }
  public void setScore(int score) {
       this.number = score;
   }
   public String toString() {
       return "Score:" +number;
   }
 
   }
    

	
