package student_details;

import java.util.*;

public class details
{
	String name,dob,dp,addr;
	int mrk1,mrk2;
	Scanner sc = new Scanner(System.in);
	//BuffereReader br = new BufferedReader(new InputStreamReader(System.in));

	public void get()
	{
		System.out.print(" Enter your name : ");
		name = sc.nextLine();
		System.out.print(" Enter your D.O.B : ");
		dob = sc.nextLine();
		System.out.print(" Enter your address : ");
		addr = sc.nextLine();
		System.out.print(" Enter your 10th mark : ");
		mrk1 = sc.nextInt();
		System.out.print(" Enter your 12th mark : ");
		mrk2 = sc.nextInt();
		System.out.print(" Enter your Department : ");
		sc.nextLine();
		dp = sc.nextLine();
	}
	public void print()
	{
		System.out.println("\n Name : "+name);
		System.out.println(" D.O.B : "+dob);
		System.out.println(" Address : "+addr);
		System.out.println(" 10th Mark : "+mrk1);
		System.out.println(" 12th Mark : "+mrk2);
		System.out.println(" Department : "+dp);
	}	
	
}












































