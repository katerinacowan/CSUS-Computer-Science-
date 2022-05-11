//Self grade: 100/100 same output
import java.util.*;
public class BookAppCowan
{
}
class Book implements Comparable
{
   private String title;
   private String author;
   private String ISBN;
   private double price;
   public Book(String title, String author, String ISBN,double price)
   {
      this.title = title;
      this.author = author;
      this.ISBN = ISBN;
      this.price = price;
   }
   public String getTitle()
   {
      return title;
   }
   public String getAuthor()
   {
      return author;
   }
   public String getISBN()
   {
      return ISBN;
   }
   public double getPrice()
   {
      return price;
   }
   public void setTitle(String t)
   {
      title = t;
   }
   public void setPrice(double p)
   {
      price = p;
   }
   public void setIsbn(String sb)
   {
      ISBN = sb;
   }
   public String toString()
   {
      return title+ ", " + author+", "+price+", "+ISBN;
   }
   public boolean equals(Book other)
   {
     return this.ISBN.equals(other.ISBN);
   }
   
   /* compares the book objects based on the title of the book
   This compareTo method is called in the selection sort*/
   // #1
   public int compareTo(Object o)
   {
	   Book a = (Book)o;
       return this.title.compareTo(a.title);
   }
   /*compares objects of type book based on their author
   This comapreTo method is called in the insertion sort
   the paramter for this method is of type Book and the author of the book b 
   needed to be compared with the author of the Book object called this*/
   // #2
   public int compares(Book b)
   {
	   Book c = (Book)b;
       return this.author.compareTo(c.author);
   }
   /*compares the Book object based on the author, if the author is the same then compares the 
   Book  objects based on the price
   this compareTo method is used in the bubbleSort method
   conditional statemnet needs to be used in this method
   if the authors of the book b is the same as the author of the Book object this
        return this.price - b.price
   else
      return   return author.compareTo(b.author)
    */
   // #3
   public double compare(Book b)
   {
       if(author.equals(b.author)){
    	   return this.price - b.price;
       }
       else 
       {
    	   return author.compareTo(b.author);
       }
   }
}
class BookStore
{
   private ArrayList<Book> books;
   public BookStore()
   {
      books = new ArrayList<Book>();
   }
   public void add(String title, String author, double price, String isbn)
   {
      books.add(new Book(title, author,isbn, price));
   }
   public String toString()
   {
      String s = "";
      for(int i = 0; i < books.size(); i++)
      {
         s= s+ books.get(i).toString()+"\n";
      }
      return s;
   }
   public boolean delete(String isbn)
   {
      for(int i = 0; i < books.size(); i++)
      {
         if (books.get(i).getISBN().equals(isbn))
         {
            books.remove(i);
            return true;
         }
      }
      return false;
   }
   /*sorts the books based on the title of the book
   call the compareTo #1 in this method
   remember the name of the ArrayList is books and it is not list
   refer to the given selectionSort code in the modules*/
   public void selectionSort()
   {
	   {
		     for(int i = 0; i <books.size(); i++)
		      {
		         int index = 0;
		         boolean swap = false;
		         Book min = books.get(i);
		         for(int j = i+1; j < books.size(); j++)
		         {
		            if(books.get(j).compareTo(min) < 0)
		            {
		               index = j;
		               min = books.get(j);
		               swap = true;
		               
		            
		            }
		         }
		      //swap
		      if(swap)
		      {
		         Book temp = books.get(i);
		         books.set(i,books.get(index));
		         books.set(index ,temp);
		      }   
		      }
		   }

    }
   /*sorts the book objects based on the author of the book
   remember the name of the ArrayList is books and it is not list
   call compare method  #2 in this method
   refer to the provided insertionSort code in the modules*/
   public  void insertionSort( )
   {
	   for(int i = 0; i < books.size() -1; i++)
	   {
	     int j = i+1;
	     Book n = books.get(j);
	     while(j > 0 && n.compares(books.get(j-1)) < 0) 
	    {
	         books.set(j,books.get(j-1)); 
	         j--;
	     }
	     books.set(j,n); 

	   }
	}
    
   /*sorts the book objcts based on the author, 
   if the author is the same then sorts it based on the price
   call comapre #3 method in this method
   refer to the provided bubbleSort code for in the modules
   */
   public void bubbleSort()
   {
	   for(int i = 0; i <books.size() ; i++)
	      {
	         for(int j = 0 ; j <books.size() -1 - i; j++)
	         {
	            //swap
	            if(books.get(j+1).compare(books.get(j)) < 0)// < list[j])
	            {
	               Book temp = books.get(j) ;
	               books.set(j,  books.get(j+1));
	               books.set(j+1, temp);
	            }
	         }
	      }

	   }
  
   /*the following search method searches the book based on the title of the book
   therfore the first line of code should be a call to the selection sort to sort the books
   based on the title of the books
   refer to the binarySearch code provided in the modules*/
   public Book binarySearch(String title)
   {
	   selectionSort();
	   boolean found = false;
	    int first = 0; 
	    int last = books.size() - 1;
	    int mid = (first+last)/2;
	    while(first <= last) 
	    {
	    	if(books.get(mid).getTitle().equalsIgnoreCase(title)){
              
                return books.get(mid);
            }

            if (title.compareTo(books.get(mid).getTitle()) > 0) {
              
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;

        }
        return null;
    }

}
   
class Driver
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      BookStore myStore = new BookStore();
      myStore.add("Java","Zoie",23.56,"12345678");
      myStore.add("Python","Elina",23.56,"2");
    
      myStore.add("Advance Java","Stewart",98,"767676576");
      myStore.add("Build Java","Liang",45,"56786565y76");
      myStore.add("Zip lining", "Stewart",12,"1234566576");
      myStore.add("C++","Elina",23.56,"2645556");
      myStore.add("Programming Java","Stewart",124,"75465666");
      myStore.add("Humanity","Smith",100.56,"234545657");
      boolean b = true;
      while(b)
      {
         System.out.println("Enter 1 to sort based on the title");
         System.out.println("Enter 2 to sort based on the author");
         System.out.println("Enter 3 to sort based on the author, and the price");
         System.out.print("Enter your choice: ");
         int option = kb.nextInt();
         System.out.println("\n*************");
         if(option == 1)
         {
            System.out.println("Sorted based on the title\n");
            myStore.selectionSort();
         }
         else if (option == 2)
         {
            System.out.println("Sorted based on the author\n");
            myStore.insertionSort();
         } 
         
         else  
         {
            System.out.println("Sorted based on the author and price\n");
            myStore.bubbleSort();
         }   
         System.out.println(myStore);
         System.out.println("\n     **************     ");
         System.out.println("Enter the title of the book to search for it: ");
         kb.nextLine();
         String t = kb.nextLine();
         
         Book book = myStore.binarySearch(t);
         if(book != null)
            System.out.println(book);
         else
           System.out.println("Book not found");   
         System.out.println("\n");
            
      }  
   
   }
}
//my code// 
class YourDriver
{
   public static void main(String[] args)
   {
	   Scanner kb = new Scanner(System.in);
	      BookStore myStore = new BookStore();
	      myStore.add("The Hunger Games","Collins",34,"394930490");
	      myStore.add("To Kill a Mockingbird","Lee",23,"9478302930");
	      myStore.add("Pride and Prejudice", "Austen",11,"96350950");
	      myStore.add("Twilight","Meyer",44.43,"583482902");
	      myStore.add("Animal Farm","Orwell",113,"49820208");
	      myStore.add("The Fault in Our Stars","Green",399.23,"39439392");
	      boolean b = true;
	      while(b)
	      {
	         System.out.println("Enter 1 to sort based on the title");
	         System.out.println("Enter 2 to sort based on the author");
	         System.out.println("Enter 3 to sort based on the author, and the price");
	         System.out.print("Enter your choice: ");
	         int option = kb.nextInt();
	         System.out.println("\n*************");
	         if(option == 1)
	         {
	            System.out.println("Sorted based on the title\n");
	            myStore.selectionSort();
	         }
	         else if (option == 2)
	         {
	            System.out.println("Sorted based on the author\n");
	            myStore.insertionSort();
	         } 
	         
	         else  
	         {
	            System.out.println("Sorted based on the author and price\n");
	            myStore.bubbleSort();
	         }   
	         System.out.println(myStore);
	         System.out.println("\n     **************     ");
	         System.out.println("Enter the title of the book to search for it: ");
	         kb.nextLine();
	         String t = kb.nextLine();
	         
	         Book book = myStore.binarySearch(t);
	         if(book != null)
	            System.out.println(book);
	         else
	           System.out.println("Book not found");   
	         System.out.println("\n");
	            
	      }  
  
   }
}