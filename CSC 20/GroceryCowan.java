//self grade: 100/100 matched the output 
public class GroceryCowan  //<------ chnage this name to add your last name to it
{
   // no code here
} 


class Item implements Comparable<Object>{
	//instance variable
   private String food;
   private double price;
   private String expDate;
   //constructor
   	public Item (String food, double price, String expDate){
   		this.food = food;
   		this.price = price;
   		this.expDate = expDate;
   	}
   //getter
   		public String getfood(){
   			return food;
   		}
   		public double getprice(){
   			return price;
   		}
   		public String getexpDate(){
   			return expDate;
   		}
   //setter
   		public void setfood(String food){
   			this.food = food; 
   		}
   		public void setprice (double price){
   			this.price = price;
   		}
   		public void setexpDate (String expDate){
   			this.expDate = expDate; 
   		}
   
   //equals: two items are equal if they have the same food and have the  same price
   		public boolean equals(Item other){
   			
   			return this.food.equals(other.food) && Double.valueOf(this.getprice()).equals(Double.valueOf(other.getprice()));
   		}
	
   //compare two items based on the instance varaible food
   public int compareTo(Object o) {
	   Item s =(Item)o;
	      return (this.food).compareTo(s.food);
   }
   public String toString(){
	   return String.format("%n" +  "Food: " + food + "%n" + "Price: " + price + "%n" + "Expiration Date: " + expDate + "%n");
   }

	
}

class ListNode{
	private Item i;
	private ListNode next;
	 public ListNode(Item i){
         this.i = i;
         next = null;
	 }
	 public ListNode(){
		 
	 }
	 public ListNode(Item i, ListNode next){
		 this.i = i;
		 this.next = next;
	 }
	  public Item getItem(){
          return i;
      }

      public ListNode getNext(){
          return next;
      }
	 public void setNext(ListNode next){
         this.next = next;
     }
}

//list

interface List{
   public void add(String food, double price, String expDate);
   public void add(int index, String food, double price, String expDate);
   public int indexOf(String food);
   public void remove(String food);
   public int size();
   public String toString();
   public Item get(int index);
   public Item mostExpensive();
}

class GroceryList implements List{
	private ListNode head;
	public static int size = 0;
	public GroceryList(){
		head = null;
	}
	
	//add a food to the end of the list
	
   public void add(String food, double price, String expDate) {
	   Item s = new Item(food, price, expDate);
	      ListNode curr = head;
	      if(head == null)
	      {
	        head = new ListNode( s);   
	        size++;
	        return;
	      }
	      ListNode n = new ListNode(s);

	      while(curr.getNext()!= null)
	      {
	        curr = curr.getNext();
	      }
	      curr.setNext(n);

	      size++;  
   }

   //add a node at the given index in the list
   
   public void add(int index, String food, double price, String expDate) {
	   Item s = new Item(food, price, expDate);
	      if(index > size)
	        return;
	       
	   
	      if(index == 0)
	      {
	         ListNode n = new ListNode(s);
	         n.setNext(head);
	         head = n;
	         size++;
	         return;
	      } 
	     ListNode curr = head;  
	     int i = 0; 
	     while(curr.getNext() != null && i < index-1)
	     {
	        curr = curr.getNext();
	        i++;
	     }  
	     ListNode n = new ListNode(s);
	     n.setNext(curr.getNext());

	     curr.setNext(n);

	     size++;  
	   }
   	
  ////returns the index of the node containing the food name

   public int indexOf(String food) {
	
       if(head == null)
           return -1;
       
       if(food.equals(head.getItem().getfood()))
       {
           
          return 0;
       } 


       ListNode curr = head;
       int index = 0;
       while(curr!= null && index <= size)
       {
         if(curr.getItem().getfood().equals(food)) 
            return index;
         curr = curr.getNext(); 
         index++;  
       }   
       return -1;
   }

   //will remove a food that is wanted 
   
   public void remove(String food) {
	   if(head == null)
	         return;
	      //remove the first node
	      if(head.getItem().getfood().equals(food))
	         head = head.getNext(); 
	      ListNode pre = head;
	      ListNode curr = head;
	      while(curr != null && !(curr.getItem().getfood().equals(food)))
	      {
	         pre = curr;
	         curr = curr.getNext();
	      } 
	      if (curr!= null && curr.getNext() == null &&(curr.getItem().getfood().equals(food) ))       {
	        pre.setNext(null);
	        size--;
	        System.out.println("The last node is removed");
	      } 
	      else if (curr == null)
	        System.out.println("Food not found");
	      else
	       {
	         pre.setNext(curr.getNext());
	         size--;
	         
	       }   
	    
   }
//the size of the list
   
   public int size() {

      return this.size();
   }
   
////get the food object at the given position in the list
   
   public Item get(int index) {
	   if(head == null)
	         return null;
	
	     if (index > size)
	        return null;    

	     ListNode curr = head;
	     int index1 = 0;
	     while(curr!= null && index != index1)
	     {
	        index1++; 
	        curr = curr.getNext();    
	     } 
	
	     if(curr == null)   
	       return null;

	    return curr.getItem(); 
	   }
   
//will display what the most expensive food item is 
   
   public Item mostExpensive() {
	
       if(head == null){
           System.out.println("List is empty!");
           return null;
       }
       double mxm = -100;
       ListNode temp = head;
       Item result = null;
       while(temp != null){

           if(temp.getItem().getprice() > mxm){
               mxm = temp.getItem().getprice();
               result = temp.getItem();
           }
           temp = temp.getNext();
       }

       return result;
   }
   
   //shows all the foods
   
   public String toString(){

       String result = "";

       //traverse the list
       ListNode temp  = head;

       while(temp != null){
           result += temp.getItem().toString() +  "\n" ;
           temp = temp.getNext();
       }

       return result;
   }

   }
	


//Once you have completeed all the classes run your code with the given driver, then write your own driver
class Driver {
	public static void main(String []args) {
		GroceryList list = new GroceryList();
		
		list.add("Bread", 5.99, "3/20/2022");
		list.add("Milk", 3.99, "2/1/2002");
		list.add("Chips", 2.99, "12/30/2025");
		list.add("Rice", 35.50, "8/15/2030");
		
		System.out.println("Here is the list of food items");
		System.out.println(list);
		
		System.out.println("Here is the most expensive item on the list");
		System.out.println(list.mostExpensive());
		
		System.out.println("Removing Milk from the list and adding a new expensive item on the list in the 2nd node");
		list.remove("Milk");
		list.add(1, "Truffle", 800, "4/20/2050");
		System.out.println(list);
		
		System.out.println("Testing the mostExpensive method to see what is the most expensive item now");
		System.out.println(list.mostExpensive());
		
		System.out.println("Testing the get method to get the item at the 3rd node");
		System.out.println(list.get(2));
		
	}
}
/*
implement your own driver and test all the methods. Your driver must be very similar to the provided one*/
 //my code
class MyDriver
{
   public static void main(String[] args)
   {
	   GroceryList list = new GroceryList();
		
		list.add("Apple", 1.99, "5/24/2022");
		list.add("Eggs", 7.99, "6/13/2034");
		list.add("Beans", 5.99, "11/23/2027");
		list.add("Chicken", 17.50, "4/12/2034");
		
		System.out.println("Here is the list of food items");
		System.out.println(list);
		
		System.out.println("Here is the most expensive item on the list");
		System.out.println(list.mostExpensive());
		
		System.out.println("Removing Eggs from the list and adding a new expensive item on the list in the 2nd node");
		list.remove("Eggs");
		list.add(1, "Steak", 500, "3/24/2045");
		System.out.println(list);
		
		System.out.println("Testing the mostExpensive method to see what is the most expensive item now");
		System.out.println(list.mostExpensive());
		
		System.out.println("Testing the get method to get the item at the 3rd node");
		System.out.println(list.get(2));
   }
}