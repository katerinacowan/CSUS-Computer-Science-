//SELF GRADE: I would give 100/100 because I matched outputs in my driver and the one given 
import java.util.*;
public class InstaCowan
{
}
class User implements Comparable {
   private String first;
   private String last;
   private String username;
   private boolean followBack;//set to true if you want to follow back the person
     
    //constructor    
   public User(String first, String last, String username, boolean followBack){
       this.first = first;
       this.last = last; 
       this.username = username;
       this.followBack = followBack;
   }
   //return followback
   public boolean getFollow()
   {
      return this.followBack; 
   }
      //followback to false
   public void unfollow()
   {
     followBack = false; 
   }
   //followback true
   public void  follow()
   {
      followBack = true;
   }
   //first name
   public String getFirst() {
      return this.first;
   }
   //last name
   public String getLast() {
      return this.last;
   }
     //changes first name        
   public void setFirst(String first) {
     this.first = first;
   }
   //changes last name
   public void setLast(String last) {
      this.last = last;
   }
   //username
   public String getUsername()
   {
      return this.username; 
   }
   //compares objects based on their username
   public int compareTo(Object o) {
	 User other = (User)o;
        return this.username.compareTo(other.username);
   }
   //compares first and last name
   public boolean equals(User other) {
   
	   return this.first.equalsIgnoreCase(other.first) && 
			 this.last.equalsIgnoreCase(other.last);
       
   }
   //how the info will display in console
   public String toString() {
	   String info = "User name: "+ username +"\nName: "+ first +"\nLast name: "+ last;
       if(followBack)
           info += " \"You follow back this person\"";
       else
           info += " \"You are not following this person\"";

       return info;
   }
     
}
class SocialMedia{
   private ArrayList<User> app;
     
    
   SocialMedia(){
      app = new ArrayList<User>();
         
       
   }
   //this follows back the user
   public void followBack(String first, String last)
   {
	   String s = first + " " + last;
	   for(int i = 0; i < app.size(); i++) 
	   { String s1 = app.get(i).getFirst() + " " + app.get(i).getLast(); if(s1.equalsIgnoreCase(s))
	   { 
			   app.get(i).follow(); 
			   } 
	   }
   }
   //this scans to follow a new user
   public boolean follow(String first, String last, String username, boolean followBack) {
       if(search(first, last) == false) {
           User u = new User(first, last, username, followBack);
           for(int i=0; i<app.size(); i++) {
               if(app.get(i).compareTo(u) > 1) {
                   app.add(i, u);
                   return true;
                   }
           }
           app.add(u);
           return true;
       }
       return false;
   }
   //removes the person you arent following or doesnt follow you 
   public boolean remove(String first, String last ) {
	   String s = first + " " + last;
       for(int i=0; i<app.size(); i++) {
           String s1 = app.get(i).getFirst() + " " + app.get(i).getLast();
           if(s1.equalsIgnoreCase(s)) {
               app.remove(i);
               return true;
           }
       }
       return false;
   }
   // searches for a user 
   public boolean search(String first, String last) {
	   String s = first + " " + last;
       for(int i=0; i<app.size(); i++) {
           String s1 = app.get(i).getFirst() + " " + app.get(i).getLast();
           if(s1.equalsIgnoreCase(s)) {
               return true;
           }
       }
       return false;
   }

   public ArrayList<User >getList(){
      return app;
   }
   //follower count
   public int followerCounts()
   {
      return app.size();
   }
   //following count
   public int followingCounts()
   {
	   int count = 0;
       for(int i=0; i<app.size(); i++) {
           if(app.get(i).getFollow() == true) {
               count++;
           }
       }
       return count;
   } 
   //displays the followers in the list
   public String toString() { 
	   String s = "";
       for(int i=0; i<app.size(); i++) {
           s += app.get(i).toString();
           s += "\n*******************************************************\n";
       }
       return s;
   		}
	}
class MyDriver
{
   private static Scanner kb;

public static void main(String[] args)
   {
	  SocialMedia myInsta = new SocialMedia();
		/*Adding followers to your list*/
      /*the boolean field indicates whether you want to follow them back*/
      myInsta.follow("Nancy", "James", "NancyJ", true);
      myInsta.follow("Bob", "Smith",  "TheBSmith", false); 
      myInsta.follow("Michael", "Jackson",  "MichaelJackson", true); 
      myInsta.follow("Troy", "Stone", "Stone.troy",true);
      myInsta.follow("Billy", "White", "BillyBob", false);
      /*Displaying your followers*/
      System.out.println("Your followers informations\n");
      System.out.println(myInsta);
      /*Unfollowing a user*/
      System.out.println("Removing Troy Stone from your followers list");
      myInsta.remove("Troy", "Stone");
      /*Displaying the list*/
      System.out.println("List of followers after removing Troy Stone");
      System.out.println(myInsta);
   	
      /*adding a new follower*/
      System.out.println("Adding Fetty Wap to your list of followers");
      myInsta.follow("Fetty", "Wap", "OfficalFetty", true);
      
      /*Dipslying the followers*/
      System.out.println("List of your followers:");
      System.out.println(myInsta);
   	
      /*Searching for a follower*/
      System.out.println("Searching for Kanye West(Ye) in your followers list");
      if(myInsta.search("Kanye", "West") == false) {
         System.out.println("Kanye West is not in your list of followers");
         System.out.println("\n***************************");   
         System.out.println("You are following " + myInsta.followerCounts() + " people");
      
         System.out.println("You have " + myInsta.followingCounts() + " followers");  
         System.out.println(myInsta);
         kb = new Scanner(System.in);
         System.out.println("Enter the first and  last name from the list bellow that you want to follow back: ");
      
         String first =kb.next();
         String last = kb.next();
         myInsta.followBack(first,last);
      
         System.out.println(myInsta);
      
      }
      
	  
   }
   
}
class Driver{
   public static void main(String[]args) {
      SocialMedia myInsta = new SocialMedia();
      
    	/*Adding followers to your list*/
      /*the boolean field indicates whether you want to follow them back*/
      myInsta.follow("Matthew", "Philips", "MatPhil", true);
      myInsta.follow("Gary", "Kane",  "GKane", false); 
      myInsta.follow("Robert", "Kenny",  "RKenny", true); 
      myInsta.follow("Bill", "Fitch", "BillF",true);
      myInsta.follow("Trevor", "Schlulz", "TrevorS", false);
      
    	/*Displaying your followers*/
      System.out.println("Your followers informations\n");
      System.out.println(myInsta);
    	
      /*Unfollowing a user*/
      System.out.println("Removing Robert Kenny from your followers list");
      myInsta.remove("Robert", "Kenny");
   	
      /*Displaying the list*/
      System.out.println("List of followers after removing Robert Kenny");
      System.out.println(myInsta);
   	
      /*adding a new follower*/
      System.out.println("Adding Elon Musk to your list of followers");
      myInsta.follow("Elon", "Musk", "ElonM", true);
      
      /*Dipslying the followers*/
      System.out.println("List of your followers:");
      System.out.println(myInsta);
   	
      /*Searching for a follower*/
      System.out.println("Searching for Stonewall Jackson(StonW) in your followers list");
      if(myInsta.search("Jackson", "Stonewall") == false) {
         System.out.println("Stonewall Jackson is not in your list of followers");
         System.out.println("\n***************************");   
         System.out.println("You are following " + myInsta.followerCounts() + " people");
      
         System.out.println("You have " + myInsta.followingCounts() + " followers");  
         System.out.println(myInsta);
         Scanner kb = new Scanner(System.in);
         System.out.println("Enter the first and  last name from the list bellow that you want to follow back: ");
      
         String first =kb.next();
         String last = kb.next();
         myInsta.followBack(first,last);
      
         System.out.println(myInsta);
      
      }
   	
   }
}