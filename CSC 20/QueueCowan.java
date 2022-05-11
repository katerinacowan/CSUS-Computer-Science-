//SELF GRADE: 100/100 met the output and followed the directions 
import java.util.*;
public class QueueCowan //<--- must change this name
{
  //no code here
}
class Queue
{
   //attribute
   ArrayList<Integer> list;
   //constructor
   public Queue()
   {
     list = new ArrayList<Integer>();
   }
   public void enqueue(Integer num)
   {
      list.add(num);
   }
   public Integer dequeue()
   {
     return list.remove(0);
   }
   public String toString()
   {
     String s = "";
     Queue copy = new Queue();
     boolean b = false;
     while(!b)
     {
       try
       {
          int num = this.dequeue();
          copy.enqueue(num);
          s = s + " " + num;
       }
       catch(Exception e)
       {
          b = true;
       }
     }
     //System.out.println(copy.list+ "&&&&");
     restore(copy);
     return s;
   }
   public int getMax()
   {
     Queue copy = new Queue();
     boolean b= false;
     int max = 0;
     while(!b)
     {
       try
       {
          int num = this.dequeue();
          if(num > max)
             max = num;
          copy.enqueue(num);   
          
       }
       catch(Exception e)
       {
         b = true;
       }
     }
     restore(copy);
     return max;
   }
   public void restore(Queue q)
   {
      boolean b = false;
      while(!b)
      {
         try
         {
            this.enqueue(q.dequeue());
         }
         catch(Exception e)
         {
            b = true;
         }
      }
   }
   //*******************implement the following methods***************
   //finds the smallest number out of the list
    public Integer getMin()
   {
    	Queue copy = new Queue();
        boolean b= false;
        int min = Integer.MAX_VALUE;
        while(!b)
        {
        //finds if the number is the smallest 
          try
          {
             int num = this.dequeue();
             if(num < min)
                min = num;
             copy.enqueue(num);   
             
          }
          catch(Exception e)
          {
            b = true;
          }
        }
        // returns the smallest number 
        restore(copy);
        return min;
          
       
          
   }
    //reverses the order of the list 
   public void reverseOrder() {
	   Stack<Integer>  s = new Stack<Integer> ();
	   boolean b = false;
	   while (!b)
	   {
		   //adds the element 
		   try
		   {
			   int element = this.dequeue();
			   s.push(element);
		   }
		   catch(Exception e)
		   {
			   b = true; 
		   }
	   }
		   	b = false; 
	while (!b)
		   {
			   try
			{
				   //pops the stack to reverse it 
				   int element = s.pop();
                   this.enqueue(element);
			}
			   catch (Exception e)
			{
				   b = true; 
			}
		   }
	   }
   //find the average of all the numbers 
   public double getAverage()
   {
       int sum = 0;
       int count = 0; 
       double average = 0; 
       Queue copy = new Queue();
       boolean b=false;
       while(!b)
       {
    	   //adds up all the numbers 
    	  try{
    		  int var = this.dequeue(); 
       	   copy.enqueue(var);
       	   sum += var;
       	   count++;
    	  }
       catch(Exception e)
       {
    	 b = true;   
       }
       }
       //finding the average
       restore(copy);
       average = (double)sum/count;
       return average; 
   }
     //sorts the lists  
   public boolean isSorted()
   {
	   Queue q=new Queue();
       boolean b=false;
       boolean sorted=true;
       while(!b)
       {
           try
           {
                Integer n1=this.dequeue();
                Integer n2=this.dequeue();
                q.enqueue(n1);
                q.enqueue(n2);
                if(n1>n2)
                sorted = false;
            }
               catch(Exception e)
               {
                       b=true;
               }
       }
       restore(q);
       return sorted;
             
   }
  //**************************************************** 
   /*add a method of your choice to this queue class
   Method description
   points for this method is 10
   */ 
  //a method that shows the size of of the list 
   public int value()
   {
	   return list.size();
  
   
} 
   
}  
class Driver
{
   public static void main(String[] args)
   {
	   Queue  m = new Queue();
	      m.enqueue(10);
	      m.enqueue(12);
	      m.enqueue(15);
	      m.enqueue(7);
	      m.enqueue(100);
	      m.enqueue(22);
	      System.out.println("The queue is : " + m);
	      m.reverseOrder();
	      System.out.println("The queue in the reverse order is: "+ m);
	      m.reverseOrder();
	      System.out.printf("Average = %.2f\n", m.getAverage());
	      System.out.println(m);
	      System.out.println("Max = " + m.getMax());
	      System.out.println("Max = " + m.getMin());
	      System.out.println("The list is sorted: "+ m.isSorted());
	      
	    
	   }
	}

class yourDriver
{
   public static void main(String[] args)
   {
	   Queue  k = new Queue();
	      k.enqueue(189);
	      k.enqueue(14);
	      k.enqueue(153);
	      k.enqueue(3);
	      k.enqueue(17);
	      k.enqueue(86);
	      k.enqueue(35);
	      k.enqueue(18);
	      k.enqueue(96);
	      System.out.println("The queue is : " + k);
	      k.reverseOrder();
	      System.out.println("The queue in the reverse order is: "+ k);
	      k.reverseOrder();
	      System.out.printf("Average = %.2f\n", k.getAverage());
	      System.out.println(k);
	      System.out.println("Max = " + k.getMax());
	      System.out.println("Min = " + k.getMin());
	      System.out.println("The list is sorted: "+ k.isSorted());
     System.out.print("The size of this list is " + k.value());
   }
}