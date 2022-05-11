
//SELF GRADE: I would give a 100/100 because I did the requirements and I tried to make my code aesthetically pleasing because if I followed in order it looked weird but it still shows what is required// 
package main;
public class Payroll
{
   
	 private String name;
	 private String id;
	 private double hourlyRate;
	 private double hoursWorked;
	 //constructor//
	 public Payroll(String name, String id, double hourlyRate, double hoursWorked) {
		 this.name = name;
		 this.id = id;
		 this.hourlyRate = hourlyRate;
		 this.hoursWorked = hoursWorked;
			 }
	 //methods//
	 public String getName(){
	     return name;
	   }
	   public String getId(){
	     return id;
	   }
	  public double getHourlyRate() {
	    return hourlyRate;
	  }
	  public double getHoursWorked() {
	    return hoursWorked;
	  }
	  public void setName(String name) {
	        this.name = name;
	    }
	  public void setId(String id) {
	        this.id = id;
	    }
	  public void setHourlyRate(double hourlyRate) {
	        this.hourlyRate = hourlyRate;
	    }
	  public void setHoursWorked(double hoursWorked) {
	        this.hoursWorked = hoursWorked;
	    }

	    public double getPay(){
	       return hourlyRate*hoursWorked;
	  }
	    @Override
	    public String toString() {
	        String s =  "Name = " + name + '\n' +
	                "ID = " + id + '\n' +
	                "Hourly Rate = " + hourlyRate + '\n' +
	                "Hours Worked = " + hoursWorked;
	        return s;
	    }
}
//payroll driver//
class PayrollDriver
{
  public static void main(String[] args)
  {

    System.out.println("Cretaing payroll objects");
    Payroll p1 = new Payroll("Alex Martinez" ,"123456", 25, 20);
    Payroll p2 = new Payroll("Ali Santos" ,"986747", 125, 45);
    Payroll p3 = new Payroll(" Jose Busta" ,"45678", 55, 30);
    System.out.println("testing the toString method");
    System.out.println("List of the employees");
    System.out.println(p1);
    System.out.println("Salary is : " + p1.getPay());  //calling the getPay method
    System.out.println("\n*******************");
    System.out.println(p2);
    System.out.println("Salary is : "+ p2.getPay());
    System.out.println("\n*******************");
    System.out.println(p3);
    System.out.println("Salary is : "+ p3.getPay());
    System.out.println("\n*******************");
    System.out.println("\nTesting the setter methods");
    System.out.println("The hourly pay of " + p1.getName()  + " is being chnaged");
    p1.setHoursWorked(80);  // changing the hours worked for the object p1
    System.out.println(p1);         
    
  
    System.out.println("\n********************");
 
    //1. create two objects of the payroll class 
    	Payroll p4 = new Payroll("Marilyn Monroe" ,"53522", 43, 98);
    	Payroll p5 = new Payroll("Michael Jackson" ,"16636", 44, 19);
    	System.out.println("Testing the toString method");
        System.out.println("List of the employees");
      //display the objects on the screen by calling the toString method//
        System.out.println(p4.toString());
      //calling the getPay method
        System.out.println("Salary is : " + p4.getPay());  
        System.out.println("\n*******************");
        //display the objects on the screen by calling the toString method//
        System.out.println(p5.toString());
      //calling the getPay method
        System.out.println("Salary is : " + p5.getPay());
        System.out.println("\n*******************");
        	//change the hourlyRate of the objects you created
    			System.out.println("\nThe hourly pay of " + p4.getName()
    			+ " is being changed");
    			p4.setHourlyRate(198);
    			  //display the objects again to see the changes you made by calling the toString method
    			System.out.println(p4.toString());
    			 System.out.println("\n*******************");
    			   //change the hourlyRate of the objects you created
    			System.out.println("The hourly pay of " + p5.getName()
    			+ " is being changed");
    			p5.setHourlyRate(167);
    			  //display the objects again to see the changes you made by calling the toString method
    			System.out.println(p5.toString());
    			 System.out.println("\n*******************");  			
    		
    //change the hoursworked for the objects you created by calling the setter methods
    			System.out.println("\nHours worked of " + p4.getName()
    			+ " is being changed");
    			p4.setHoursWorked(900);
    			System.out.println(p4.toString());
    			 System.out.println("\n*******************");
    	//change the hoursworked for the objects you created by calling the setter methods
    			System.out.println("Hours Worked of " + p5.getName()
    			+ " is being changed");
    			p5.setHoursWorked(346);
    			System.out.println(p5.toString());
    			 System.out.println("\n*******************");
    
  }
}