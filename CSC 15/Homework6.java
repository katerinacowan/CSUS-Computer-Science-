/*Katerina Cowan*/
package Main;


class Homework6{
	public static void main(String[]args){
		 Arithmetic ar = new Arithmetic(1,2);
		    System.out.println(ar);
		    System.out.println(ar.add());
		    System.out.println(ar.subtract());
		    System.out.println(ar.multiply());
		    System.out.println(ar.divide());
		    System.out.println(ar.modulo());
		    /* new values*/
		    ar.changeValues(5,6);
		    System.out.println(ar);
		    System.out.println(ar.add());
		    System.out.println(ar.subtract());
		    System.out.println(ar.multiply());
		    System.out.println(ar.divide());
		    System.out.println(ar.modulo());
		    /*static*/
		    System.out.println(Arithmetic.staticAdd(8, 9));
		
		
		}
	}
