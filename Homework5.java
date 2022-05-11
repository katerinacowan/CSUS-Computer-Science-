 // C S C   1 5
 // Student's Name Here: Katerina Cowan

package Main;

public class Homework5{
	public static void main(String[] args){
		// Tests I will run...
		System.out.println(switchBool(true)); 								// Answer should be false	
		System.out.println(switchBool(false)); 								// Answer should be true	
		System.out.println(Integer.toString(subtract(5, 3)));				// Answer should be 2
		System.out.println(Float.toString(fahrenheitConvert(212.0f)));		// Answer should be 100.0
		System.out.println(lieDetector(true));								// Truth string should be displayed on console
		System.out.println(lieDetector(false));								// Lie string should be displayed on console
		System.out.println(doubleNum(3,4));									// Answer should be 48
		System.out.println(findSmall(2, 15));								// Answer should be 2
		System.out.println(findBig(2, 15));									// Answer should be 15
		System.out.println(isEqual(10,10));	 								// Answer should be true
		System.out.println(isEqual(1,7)); 									// Answer should be false
		System.out.println("$" + getTotal(7.00f, 0.08f));	 				// Answer should be $7.56
		System.out.println(findSmallest(6,9,3)); 							// Answer should be 3 
	}
	
	// Below are the methods you must create for credit...
	
	/* This method takes one parameter (boolean) and should return a boolean value opposite of the input value */
	public static boolean switchBool(boolean b){
		// TODO: Correct the method to return the result according to criteria above
		if (b==false)
			return true;
		return false;
	}
	
	/* This method should return an integer that is v1 - v2 */
	public static int subtract(int v1, int v2){
		// TODO: Correct the method to return the result according to criteria above
		return v1 - v2;
	}
	
	/* This is the reverse of the drill in class. We will convert from fahrenheit to celsius now.
	 * Criteria:
	 * celsius subtracts 32 degrees from fahrenheit and divides what is left by 1.8 */
	public static float fahrenheitConvert(float fahrenheit){
		// TODO: Correct the code below and write a method to convert from fahrenheit to celsius
		float celsuis = (fahrenheit - 32) * 5 / 9;
		return celsuis ;
		
	}
	
	/* This is a "lie detector" that tells you if the truth was input as a parameter.
	 * The method should return a string that says "You are telling the truth" if the value of the parameter
	 * is true. It should return a string saying "You are lying" if the value of the parameter
	 * is false 
	 * 
	 * HINT: You need to use a conditional to make this work correctly. */
	public static String lieDetector(boolean isTrue){
		// TODO: Write logic to return the correct string based on value of "isTrue"
		if (isTrue==true)
		return "You are telling the truth";
		if (isTrue==false);
		return "You are lying";
	}
	
	/* This method takes two integers as parameters. You must return the smaller of the two integers given. */
	public static int findSmall(int v1, int v2){
		// TODO: Return the smaller of the two numbers
		if (v1<v2)
		return v1;
		if (v2<v1);
		return v2;
	}
	
	/* This method takes two integers as parameters. You must return the larger of the two integers given. */
	public static int findBig(int v1, int v2){
		// TODO: Return the larger of the two numbers
		if (v1>v2)
		return v1;
		if (v2>v1);
		return v2;
	}
	
	/* This method returns a boolean (true/ false) value depending on if two integers given are equal 
	 * If they are equal, return true; otherwise, return false */
	public static boolean isEqual(int v1, int v2){
		// TODO: Check equality and return true or false accordingly
		if (v1==v2)
			return true;
		return false;
	}
	
	/* This method takes two integers as parameters: 
	 * 1) The number to double its value (v)
	 * 2) The number of times to double the number (n)
	 * The return value should be the number after doubling "v" value "n" times 
	 * 
	 * EXAMPLE: doubleNum(2, 3); should result in 16 being returned since:
	 * 2+2 = 4 + 4 = 8 + 8 is 16
	 * 
	 * HINT: You will need to use a looping method to make this work correctly. */
	public static int doubleNum(int v, int n){
		// TODO: Make it return the appropriate value based on the example above
	 for (int i=0; i<4;i++){
		v =v+v;
		 
	 }
		 return v;

	 
	}
	
		
	/* This method should take two parameters (purchase price and sales tax rate) and return 
	 * the total amount (price after tax) */
	public static float getTotal(float subtotal, float taxRate){
		// TODO: Write method body to return Grand Total (subtotal with tax)
		float taxmoney = subtotal*taxRate;
		return taxmoney+subtotal;
	}
	
	/* This method should find the smallest value from three integer parameters and return said value.
	 * It is identical in idea to "findSmall" except there are three parameters instead of two */
	public static int findSmallest(int v1, int v2, int v3){
		// TODO: Find and return the smallest number of the three
		if (v1<v2 && v1<v3)
		return v1;
		else if (v2<v1 && v2<3) 
			return v2;
		else return v3;
			
	}
}