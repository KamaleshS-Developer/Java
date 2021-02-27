 /*
   Exception Handling
	1.  try
	2.  catch
	3.  throw
	4.  throws //Used to indicate what exception type may be thrown by a method
	5.  finally //finally block is always executed whether exception is handled or not. 
		    //finally block follows try or catch block.
   To make the program in a continuous flow.
   achieved through try & catch block.
   1. checked exception -----> Compile time
   2. unchecked exception -----> Run time
	a) Arithmetic Exception
	b) NullPointer Exception
	c) NumberFormat Exception
	d) ArayIndexOutOfBound Exception	
*/	

import java.util.*;

class InvalidProductException extends Exception
{	
	String str;
	InvalidProductException(String s)
	{
		str = s;
	}
/*
   A toString() is an in-built method in Java that returns the value given to it in string format. 
   Hence, any object that this method is applied on, will then be returned as a string object.
*/
	public String toString()
	{
		return str;
	}
}

class throw_exception
{
	void display(double kg)throws InvalidProductException
	{
		
	if(kg<100)
	{
		throw new InvalidProductException("Product is invalid");
	}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		throw_exception ex = new throw_exception();
		String name,colour,price;
		double weight;

		System.out.print("\n Enter product name : ");
		name = sc.nextLine();
		System.out.print(" Enter product colour : ");
		colour = sc.nextLine();
		System.out.print(" Enter product price : ");
		price = sc.nextLine();
		System.out.print(" Enter product weight(kg) : ");
		weight = sc.nextDouble();

		try
		{
			ex.display(weight);
		}

		catch(InvalidProductException e)
		{
			System.out.println("\n InvalidProductException");
			System.out.println(" "+e);
		}

		finally
		{
			System.out.println(" Finally block executed..");
		}

	}
}









