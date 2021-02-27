import java.util.*;

class  Rev{
	public static void main(String args[]){	
		String s1 = "racecar";
		StringBuffer sb1 = new StringBuffer("s1");
		sb1.reverse();
		String sr1 = sb1.toString();
		if(s1==sr1)
		{	
			System.out.println("Given String "+s1 + " is palindrome.");
		}
		else
		{
			System.out.println("Given String "+s1 + " is not palindrome.");
		}
		
		String s2 = "java";
		StringBuffer sb2 = new StringBuffer("s2");
		sb2.reverse();
		String sr2 = sb2.toString();
		if(s2==sr2)	
		{
			System.out.println("Given String "+s2 + " is palindrome.");
		}
		else
		{
			System.out.println("Given String "+s2 + " is not palindrome.");
		}
	}
}