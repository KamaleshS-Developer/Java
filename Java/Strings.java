
import java.io.*;

public class Strings{
	public static void main(String []args)throws Exception{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String s1,s2;
		int ch;
		System.out.print(" Enter String s1 : ");
		s1 = br.readLine();
		System.out.print(" Enter String s2 : ");
		s2 = br.readLine();
		System.out.println("\n String Manipulations");
		System.out.println(" 1. String Length");
		System.out.println(" 2. String Comapare");
		System.out.println(" 3. String Concatenation");
		System.out.println(" 4. Indexof Strings");
		System.out.println(" 5. CharAt Strings");
		System.out.println(" 6. String Uppercase");
		System.out.println(" 7. String Lowercase");
		System.out.println(" 8. String Trim");
		System.out.print(" Enter choice : ");
		ch = Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1:
				System.out.println("\n String Length");
				System.out.println(" String Length of s1 is "+s1.length());
				System.out.println(" String Length of s2 is "+s2.length());
			break;
			case 2:
				System.out.println("\n String Compare");
				System.out.print(" Comparition of s1 & s2 is "+s1.compareTo(s2));
			break; 
			case 3:
				System.out.println("\n Concatenation of Strings");
				System.out.println(" Concatenation of s1 & s2 "+s1.concat(s2));
			break;
			case 4: 
				System.out.println("\n Index of String");
				System.out.println(" Index of the string "+s1.indexOf("a"));
			break;
			case 5:
				System.out.println("\n CharAt Strings");
				System.out.println(" CharAt Strings "+s2.charAt(2));
			break;
			case 6:
				System.out.println("\n String Uppercase");
				System.out.println(" String s2 Uppercase "+s2.toUpperCase());
			break;
			case 7:
				System.out.println("\n String Lowercase");
				System.out.println(" String s2 Lowercase "+s2.toLowerCase());
			break;
			case 8:
				System.out.println("\n String Trim");
				System.out.println(" String Trim of s1 "+s1.trim());
			break;
			default:
				System.out.println(" Invalid Choice");
		}	
	}
}