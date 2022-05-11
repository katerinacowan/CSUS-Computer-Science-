//SELF GRADE i would give a 100/100 because I matched the output and followed the directions 
import java.util.*;
public class StackCowan
{
}
//Interface
interface myStack
{
   public void push(String s);
   public String peek();
   public boolean isEmpty();
   public String pop();
}
//Implementation of the interface creating a stack
 class Stack implements myStack//must implement the myStack interface
{
	 //Arraylist of strings for the stack
	private ArrayList<String> s;
	   int top;   //index of the top of the stack
	   //constructor
	   
	  public Stack()
	   {
	     s = new ArrayList<String>();
	     top = 0;
	   }
	  //peek
	  
	   public String peek()
	   {
		   if(s.isEmpty()) {
               return null;
       }
       return s.get(s.size() - 1);
}
	   //pop
	   
	   public String pop()
	   {
	      if(!isEmpty())
	      {
	         top--;
	         String b = s.get(top);
	         s.remove(top);
	         return b;
	      }
	      return null;   
	   }
	   //push 
	   
	   public void push(String token)
	   {
	     s.add(token);
	     top++;
	     
	   }
	   
	   public boolean isEmpty()
	   {
	     return s.size() == 0;
	   }
	   public String toString()
	   {
	     return s.toString();
	   }
	}


class Expression
{
  private String exp;  // instance variable
  public Expression(String s)
  {
     exp = s;
  }
  
  //the postfix expression
  
  public String getPostfix()
  
  {
	  String postfixExp = "";
      Stack stack = new Stack();
	 StringTokenizer st = new StringTokenizer(exp," ");
	 while(st.hasMoreTokens())
	 {
	       String token = st.nextToken();
	       if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
	    	   int precedence = precedence(token);
	    	   if(precedence==3){
	    		     while(!stack.isEmpty() && precedence(stack.peek()) == 3) {
                         postfixExp += " " + stack.pop();
                 }
         } else if (precedence == 2) {
                 while(!stack.isEmpty() && (precedence(stack.peek()) == 3 || precedence(stack.peek()) == 2)) {
                         postfixExp += " " + stack.pop();
                 }
         }
	    	   	stack.push(token);
	       		}	else { 
	       			postfixExp += " "+ token;
	       		}

		 			}
	 		while(!stack.isEmpty()) {
	 			postfixExp += " " + stack.pop();
	 			}

	 		return postfixExp;
	    	   }
	   //precedence   
  private static int precedence(String opr)
  {
	  if (opr.equals("*") || opr.equals("/")) {
		  return 3; 
		  }
	  if (opr.equals("+") || opr.equals("-")) {
		  return 2; 
	  }
	  return 0;
  }
  	//evalpostfix
  public int evalPostfix()
  {
             String postfix = this.getPostfix();
             
             Stack stack = new Stack();
             
             int result = 0;
             StringTokenizer st = new StringTokenizer(postfix," ");
             
             while (st.hasMoreTokens()) {
                     String token = st.nextToken();
             
                     if (!(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))) {
                             stack.push(token);
                     } else { 
                             String n1 = stack.pop();
                             String n2 = stack.pop();
                             int num1 = Integer.parseInt(n1);
                             int num2 = Integer.parseInt(n2);
                             result = calculate(num2, num1, token);
                             stack.push(""+result);
                     }
             }       
             result = Integer.parseInt(stack.pop());
             return result;
                    
   }
    
     //the math
  
  private int calculate(int num1, int num2, String opr)
  {
	  if(opr.equals("*")){
		     return num1 * num2;
	  }
	  if(opr.equals("+")){
		  return num1 + num2;
	  }
	  if(opr.equals("-")){
		  return num1 - num2;
	  }
	  if (opr.equals("/")){
		  return num1 / num2;
	  }
	  return 0;
  }
  }
class ExpDrive
{
  public static void main(String[] args)
  {
     
    // String s = "5 - 2";
     ArrayList <String> exp = new ArrayList<String>();
     exp.add("2 + 3 + 7 * 4 - 2 / 3");
     exp.add("3 - 4 / 2 + 6 * 3");
     exp.add("5 * 6 - 8 + 2 * 10");
     exp.add("4 + 8 * 3 - 2 / 34");
     exp.add("6 - 3 + 6 / 2 * 4 - 8");
     for(int i = 0; i < exp.size(); i++)
     {
     
        Expression e1 = new Expression(exp.get(i));
        String post = e1.getPostfix();
        int result = e1.evalPostfix();
        System.out.println("Infix: "+ exp.get(i) + ",  postfix: " + post + " = " + result);
     }

}
}
/*
Write your own driver to test your code
this driver should be similar to the one 
I provided but must be your own expressions
*/
class MyExpDrive
{
   public static void main(String[] args)
   {
	   ArrayList <String> exp = new ArrayList<String>();
	     exp.add("4 + 4 + 9 * 1 - 3 / 5");
	     exp.add("1 - 2 / 9 + 5 * 7");
	     exp.add("7 * 3 - 8 + 1 * 14");
	     exp.add("2 + 9 * 8 - 5 / 47");
	     exp.add("6 - 2 + 9 / 9 * 3 - 7");
	     for(int i = 0; i < exp.size(); i++)
	     {
	     
	        Expression e1 = new Expression(exp.get(i));
	        String post = e1.getPostfix();
	        int result = e1.evalPostfix();
	        System.out.println("Infix: "+ exp.get(i) + ",  postfix: " + post + " = " + result);
   }
}
}