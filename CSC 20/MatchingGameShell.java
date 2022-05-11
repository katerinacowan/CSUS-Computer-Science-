import java.util.*;
public class MatchingGameShell
{
  public static void main(String[] args)
  {
     //fill in the code for each line of the provided comment
     //create a Scanner object
     //declare a string variable and assign "" to it . call this variable answer                 
     String answer = "";                   
      
     while (!answer.equalsIgnoreCase("q"))
     {
        // call the description method
        //prompt the user to enter their name , store their name in  a variable 
         
        //display the hello message(refer to the output ) 
        
        //call the play method and pass the Random object that you created to it 
         
        //display the message "Hit enter to let another person play or enter Q to quit the program"
        //store the user's input in the answer variable. all you need to do is answer = kb.nextLine(), assuming your scanner object is kb
         
     }
     //display a good by message
      
  }
  public static int getRand(Random rand)
  {
    //your code
    return 0;// must change this line
  }
  public static void play(Random rand)
  {
     
      
     Scanner kb = new Scanner(System.in);
     int total = 0;
     String answer = "";
     int n1= 0, n2 = 0, n3 = 0;
     while(!answer.equalsIgnoreCase("q"))
     {
       //call the method getRand(rand) three times and store the result in the variable n1, n2, n3       
       //display the generated random numbers
              
       int match = match(n1,n2,n3);
       if (match == 2)
       {
         //add 100 to the total total = total + 100;
         //display the proper message
          System.out.println("You got two matches, you won 100 dollars");
       }   
       else if( match == 3)
       {
           //add 300 to the total
           // display the proper message
            
       }    
       else
         //display the proper message
     
       System.out.print("\nHit enter to continue or press q/Q to quit  ");
       answer = kb.nextLine(); 
       
             
     }
     System.out.println("\nTotal amount you won: " + total);
     System.out.println("\n");
     
  }
  public static int match(int n1, int n2, int n3)
  {
       //your code with conditional stamnets 
       return 0;//must modify 
  }
  public static void description()
  {
        //your code to display the descritpion 
  }
}