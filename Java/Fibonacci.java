import java.util.*;

class Fibonacci{
	public static void main(String args[]){
		int n,a = 0,b = 1,c,i;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number : ");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print(a);
			c = a+b;
			a = b;
			b = c;	
					
		}
	}
} 