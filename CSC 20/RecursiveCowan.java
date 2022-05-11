//SELF GRADE: 100/100 met the output and followed the directions 
/*your program must work with the given main method*/
import java.util.*;
public class RecursiveCowan  //<------change the name to include your last name
{
}
class Driver3
{
   public static void main(String[] args)
   {
     int x = 5;
     System.out.println(myMethod(x));
   }
   public static int myMethod(int x)
   {
     if (x < 0)
         return 0;
    return x + myMethod(x -1 );     
   }
}