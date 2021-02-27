/*
   Exception Handling
   used to run the program in flow.
   if we expect an exception,i.e in try block & handling the exception in catch block
   ca have one try block & match catch block
*/

import java.io.*;

class Exception
{
	public static void main(String args[])
	{
		try
		{
		int i;
		int arr[] = new int[5];
			arr[5] = 10;
		int k = 5/0;
		String str = null;
			System.out.println(" "+str.length());
		String str1 = "kamal";
			i = Integer.parseInt(str1);
			System.out.println(" "+i);
		}
		
		catch(ArithmeticException e)
		{
			System.out.print(" "+e);
		}	

		catch(ArrayIndexOutOfBoundsException e)	
		{
			System.out.print(" "+e);
		}

		catch(NullPointerException e)	
		{
			System.out.print(" "+e);
		}

		catch(NumberFormatException e)	
		{
			System.out.print(" "+e);
		}
	}	
}
