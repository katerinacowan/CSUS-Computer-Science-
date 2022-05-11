//SELF GRADE: I would give a 100 because I match the output of the code that is provided and the one i wrote
package Airplane;
import java.util.*;
public class AirplaneCowan
{
}
//super class
class Person{
	 private String name;
	    private String lastName;
	    private String ticketID;
	    //constructor
	    public Person(String name, String lastName, String ticketID) {
	        this.name = name;
	        this.lastName = lastName;
	        this.ticketID = ticketID;
	    }
	    //methods
	    //first name
	    public void setName(String name) {
	        this.name = name;
	    }
	    //last name
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    //ticketID
	    public void setticketID(String ticketID) {
	        this.ticketID = ticketID;
	    }
	    public String getName() {
	        return name;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public String getticketID() {
	        return ticketID;
	    }    
	    // Displays all the methods
	    public String toString() {
	        return String.format("Name: " + name + "%n" +
                    "Last Name: " + lastName + "%n"+
                    "Ticket ID: " + ticketID);
	    }
	    //determines if there is multiple of the same person
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Person)) return false;
	        Person person = (Person) o;
	        return Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName) && Objects.equals(ticketID, person.ticketID);
	    }
}
//subclass 
class Passenger extends Person{
	private int seatNumber;
    private String classType;
    //constructor
    public Passenger(String name, String lastName, String ticketID, int seatNumber, String classType){
    	 super(name, lastName, ticketID);
    	 this.seatNumber = seatNumber;
    	 this.classType = classType; 
    }
    //methods
    //seat number
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    //type of class
    public void setclassType(String classType){
    	this.classType = classType;
    } 
    public String getclassType(){
    	return classType;
    }
    public int getSeatNumber() {
        return seatNumber;
    }
    //displays the methods
    public String toString() {
        return String.format(super.toString() + "%n" +  "Seat Number: " + seatNumber + "%n" + "Class: " + classType + "%n");
    }
  
}
//interface
interface list {   
		public boolean add(Object o);
		public Object search(Object o);
		public boolean delete(Object o);
		public void printLast();
		public void takeOff();
	}

class Airplane implements list{
	public static int count = 0;
	Passenger [] plane;
	private int planeNum;
	boolean takeOff;
	//constructor
	Airplane(int planeNum){
		plane = new Passenger[10];
		this.planeNum = planeNum;
		takeOff = false; 
	}
	//methods
		public int getplaneNum() {
	        return planeNum;
	    }
		public void setplaneNum(int planeNum) {
		        this.planeNum = planeNum;
		    }
		//displays how many people on plane 
		 public String toString() {
		        StringBuilder stringBuilder = new StringBuilder();
		        for (int i=0 ;i<count; i++) {
		            stringBuilder.append(plane[i].toString());
		            stringBuilder.append("\n");
		        }
		        return stringBuilder.toString();
		    }
		public int getCount(){
			return count;
		}
		
   
	public boolean add(Object o) {
		if (count == 10 || !(o instanceof Passenger))
            return false;
        plane[count] = (Passenger) o ;
        count++;
        return true;
	}

	public Object search (Object o)
		{ 
		boolean b = o instanceof String; 
		if(!b) 
			return null;
		String name = (String)o; 
		for(int i = 0; i < plane.length; i++)
		{
			if(plane[i]!= null && plane[i].getLastName().equalsIgnoreCase(name))
			{ return plane[i];   //returning the found object } 
	 }
		}
			return null;//returning null if the object is not found
	}
		 

	public boolean delete(Object o) {
		//complete this method
		  boolean b = o instanceof String;
	        if (!b) 
	        	return false;
	        String name = (String) o;
	        for (int i=0; i<count; i++) 
	        {
	            if (plane[i].getLastName().equals(name)){
	                for (int k=i; k<count-1; k++) {
	                    plane[k] = plane[k+1];
	                }
	                count--;
	                plane[count] = null;
	                return true;
	            }
	        }
	        return false;
	    }


	public void printLast() {
		 for (int i=0; i<count; i++){
	            System.out.println(plane[i].getLastName());
	        }
	        System.out.println();
	    }

	public void takeOff() {
	 takeOff = true; 
		
	}
	
}


class Driver {
	private static Scanner in;

	public static void main(String[]args) {
		in = new Scanner(System.in);
		
		Airplane plane = new Airplane(20394);
		Passenger p1 = new Passenger("Bobby", "Smith", "123456789", 1, "First class");
		Passenger p2 = new Passenger("Johnny", "Apple", "987654321", 8, "Business class");
		Passenger p3 = new Passenger("Tom", "Jerry", "567123489", 32, "Economy class");
		Passenger p4 = new Passenger("Candy", "Cruz", "982134567", 15, "Premium Economy class");
		Passenger p5 = new Passenger("Kaloti", "Aaron", "762134589", 5, "First class");
		
		plane.add(p1);
		plane.add(p2);
		plane.add(p3);
		plane.add(p4);
		plane.takeOff();
		plane.add(p5);
		
	
		System.out.println("Here is the list of the passengers in this plane" + "\n");
		System.out.println(plane + "\n");
		
		 System.out.println("Testing the printLast method to display the last names");
		   plane.printLast(); //prints the last name of the passenger sin the train
		   System.out.println();
		   
		   System.out.println("Testing the static method getCount");
		   System.out.println("This plane has " + plane.getCount() + " Passengers\n");
		   
		   System.out.print("Enter the last name of the passenger: ");
		   String lastName = in.nextLine();
		   System.out.println(plane.search(lastName));
		   System.out.println();
		   
		   System.out.println("Testing the delete method");
		   System.out.print("Enter the last name of the passenger: ");
		   String lastName1 = in.nextLine();
		   plane.delete(lastName1);
		   System.out.println("Passenger " + lastName1 + " has been removed from the list\n");
		   
		   System.out.println("Here is the updated list");
		   System.out.println(plane);
		
	}
}

/*Cretae your own driver with the list of your passengers*/
/*This part has 10 points*/
class MyDriver
{
	private static Scanner in;
	
   public static void main(String[] args)
   {
	   in = new Scanner(System.in);
		
		Airplane plane2 = new Airplane(20365);
		Passenger dad = new Passenger("Nathan", "Jones", "123456789", 1, "First class");
		Passenger mom = new Passenger("Miranda", "Kay", "987654321", 8, "Business class");
		Passenger sister = new Passenger("Mary", "Sue", "567123489", 32, "Economy class");
		Passenger brother = new Passenger("Cruz", "Tom", "982134567", 15, "Premium Economy class");
		Passenger uncle = new Passenger("Tommy", "Wave", "762134589", 5, "First class");
		
		plane2.add(dad);
		plane2.add(mom);
		plane2.add(sister);
		plane2.add(brother);
		plane2.takeOff();
		plane2.add(uncle);
		
		System.out.println("Here is the list of the passengers in this plane" + "\n");
		System.out.println(plane2 + "\n");
		
		 System.out.println("Testing the printLast method to display the last names");
		   plane2.printLast(); //prints the last name of the passenger sin the train
		   System.out.println();
		   
		   System.out.println("Testing the static method getCount");
		   System.out.println("This plane has " + plane2.getCount() + " Passengers\n");
		   
		   System.out.print("Enter the last name of the passenger: ");
		   String lastName = in.nextLine();
		   System.out.println(plane2.search(lastName));
		   System.out.println();
		   
		   System.out.println("Testing the delete method");
		   System.out.print("Enter the last name of the passenger: ");
		   String lastName1 = in.nextLine();
		   plane2.delete(lastName1);
		   System.out.println("Passenger " + lastName1 + " has been removed from the list\n");
		   
		   System.out.println("Here is the updated list");
		   System.out.println(plane2);
   }
}
