// H O M E W O R K   # 1 0
// C S C   1 5
// Student's Name Here: Katerina Cowan

package Main;

import java.util.StringTokenizer;

public class Homework10{
	public static void main(String[] args){
		// My code to dynamically create a text file (DO NOT MODIFY OR REMOVE!)
		EZFileWrite efw = new EZFileWrite("parse.txt");
		efw.writeLine("Shawshank Redemption*1994*Tim Robbins*2.36");
		efw.writeLine("The Godfather*1972*Al Pacino*2.92");
		efw.writeLine("Raging Bull*1980*Robert De Niro*2.15");
		efw.writeLine("Million Dollar Baby*2004*Hilary Swank*2.2");
		efw.writeLine("Straight Outta Compton*2015*Jason Mitchell*2.45");
		efw.saveFile();
		// End of test
		
		// TODO: Write your code to load the text file into memory, parse it, and display the data in a meaningful way...
		// (Use the instructions in the hand out to complete the assignment for full credit)
		
		//Read//
		EZFileRead ezr = new EZFileRead ("parse.txt"); 
		
		//Arrays//
		int num = ezr.getNumLines();
		String[] movies = new String[num];
		int[] years = new int[num]; 
		String[] stars = new String[num]; 
		float [] runtimes = new float[num]; 
		
		//Loop//
		   for (int i = 0; i < num; i++){
			   String raw = ezr.getNextLine();
			   StringTokenizer st = new StringTokenizer(raw, "*");
			   movies[i] = st.nextToken("*");
	           years[i] = Integer.valueOf(st.nextToken("*"));
	           stars[i] = st.nextToken("*");
	           runtimes[i] = Float.valueOf(st.nextToken("*"));
		   }
	   //Prints//
		   System.out.println("-----MOVIES-----");
	       for (String m : movies) {
	           System.out.println(m);
	       }
	           
	           System.out.println("-----YEARS-----");
		       for (int y : years) {
		           System.out.println(y);
		       }
		       
		           System.out.println("-----STARS-----");
		           for (String s : stars) {
		               System.out.println(s);
		           }

	
		           System.out.println("-----RUNTIMES-----");
		           for (float r : runtimes) {
		               System.out.println(r);
		          
		           }
	}
}