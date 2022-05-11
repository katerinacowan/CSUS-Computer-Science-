/* This class should be added to your Homework #6 Main package.
 * 
 * This file is the class file needed to complete your Homework #6 assignment.
 * 
 * DO NOT MODIFY THIS FILE! I will be testing your code from the "Homework6.java" file
 * based on the original class file so if you modify this code, the changes will not
 * be present on my end. 
 * 
 * The homework is intended to teach you how to use a pre-existing class. The next homework
 * will allow you to create your own class.
 * 
 * Good Luck!
 * 
 * Matthew W. Phillips 2018
 */

package Main;

public class Arithmetic{
	// Fields
	private int v1;
	private int v2;
	
	// Constructor
	public Arithmetic(int value1, int value2){
		v1 = value1;
		v2 = value2;
	}
	
	// Methods
	public String add(){
		return v1 + " + " + v2 + " = " + (v1+v2);
	}
	
	public String subtract(){
		return v1 + " - " + v2 + " = " + (v1-v2);
	}
	
	public String multiply(){
		return v1 + " * " + v2 + " = " + (v1*v2);
	}
	
	public String divide(){
		float vf1 = (float)v1;
		float vf2 = (float)v2;
		return v1 + " / " + v2 + " = " + (float)(vf1/vf2);
	}
	
	public String modulo(){
		return v1 + " % " + v2 + " = " + (v1%v2);
	}
	
	public void changeValues(int new1, int new2){
		v1 = new1;
		v2 = new2;
	}
	
	public String toString(){
		return "Value1: " + v1 + "; Value2: " + v2;
	}
	
	// Static Methods
	public static String staticAdd(int value1, int value2){
		return value1 + " + " + value2 + " = " + (value1+value2);
	}
}