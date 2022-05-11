//Katerina Cowan//
package DistinctNumbersShell;
import java.util.*;
public class DistinctNumbersShell
{

  // int[] num = new int[10];
   public static void main(String[] args)
   {
	   //Introduction to the user//
     System.out.println("Welcome to the distinct numbers. \nI will remove the repeated numbers and display the numbers you just enetered");
     int[] num = getInput();
     display(num);
   }
   //checks to see if the number is in the array and if it isnt it returns false//
   public static Boolean found(int[] num, int n)
	{
		for(int i=0;i<num.length;i++)
			if (num [i]==n)
				return true; 
		return false;
	}
 //Collects and stores the information/numbers the user inputs//
   public static int[] getInput()
   {
	   int[] num= new int[10];	
       Scanner console = new Scanner(System.in);
       int n; 
       //will ask the user a repeated amount of times until the user reaches 10 different numbers// 
       for(int i=0;i<num.length;i++) {
       	System.out.print("Enter a number:");
       	 n = console.nextInt();  
       	 boolean b = found(num,n); 
       	if (b==true)
       	{
       		 i--;
       	}
       	else
       	{
       		num [i]=n;
       	}
       }
     
       return num; 
   }
   //returns the user all the numbers they entered// 
   public static void display(int[] num)
   {
	   System.out.println("I filtered out all the repeated numbers you entered and kept only one copy of each number");
		System.out.println( " Here is the list of your numbers");
	   for (int i=0; i<= num.length-1; i++){
			System.out.print(num[i]+ ","); 
			}
    }
  
   
 }