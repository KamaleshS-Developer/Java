import java.util.*;

class Pattern{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j,sum=0;
		System.out.print("\n Enter no. of rows : ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("\n");
		}
		
	}
}