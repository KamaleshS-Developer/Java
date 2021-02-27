import java.io.*;
import java.util.Scanner;

class Matrix{
	public static void main(String args[])throws IOException{
		Scanner sc = new Scanner(System.in);
		int a[][] = {{2,4,6},{14,16,18}};
		int b[][] = {{8,10,12},{20,22,24}};
		int i,j,k,tot[][] = new int[2][3],prd[][] = new int[2][3],trans[][] = new int[3][2],ch;
		System.out.println("\nMatrix A");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n\n");
		}

		System.out.println("Matrix B");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j] + "\t");
			}
			System.out.print("\n\n");
		}
		
		System.out.println("1.Matrix Addition");
		System.out.println("2.Matrix Subtraction");
		System.out.println("3.Matrix Multiplication");
		System.out.println("4.Transpose of Matrix");
		

		System.out.print("\nEnter your choice : ");
		ch = sc.nextInt();

		switch(ch)
		{
		case 1:
			System.out.println("\nMatrix Addition : \n");
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					tot[i][j] = a[i][j]+b[i][j];
					System.out.print(tot[i][j] + "\t");
				}
				System.out.print("\n");
			}
		break;
		case 2:
			System.out.println("\nMatrix Subtraction : \n");
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					tot[i][j] = a[i][j]-b[i][j];
					System.out.print(tot[i][j] + "\t");
				}
				System.out.print("\n");
			}
		break;

		case 3:
			System.out.println("\nMatrix Multiplication : \n");
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					for(k=0;k<2;k++)
					{
						prd[i][j] += a[i][j] * b[k][j];
					}
				}
			}

			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(prd[i][j] + "\t");
				}
				System.out.print("\n");
			}
		break;

		case 4:
			System.out.println("\nTranspose of Matrix \n");
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					trans[j][i] = a[i][j];
				}
			}

			for(j=0;j<3;j++)
			{
				for(i=0;i<2;i++)
				{
					System.out.print(trans[j][i]+ "\t");
				}
				System.out.print("\n");
			}
		break;
		default:
			System.out.println("Your choice is invalid");
		}
	}
}