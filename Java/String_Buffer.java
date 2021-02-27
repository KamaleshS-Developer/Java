import java.util.Scanner;

class String_Buffer{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer(" Welcome Kamalesh");
		System.out.println(sb);
		Scanner sc = new Scanner(System.in);
		int choice,k=1;
		do
		{
		System.out.println(" 1.Appending string");
		System.out.println(" 2.Inserting string");
		System.out.println(" 3.Deleting string");
		System.out.println(" 4.Reversing string");
		System.out.println(" 5.Replacing string");
		System.out.println(" 6.String length");
		System.out.println(" 7.Sub string");
		System.out.println(" 8.Index Of string/character");
		System.out.println(" 9.Char At");
		System.out.println(" 10.Sub Sequence");
		System.out.print("\n Enter a String : ");
		StringBuffer sbfr = new StringBuffer();
		sbfr.append(sc.nextLine());
		System.out.print(" Enter your choice : ");
		choice = sc.nextInt();
		switch(choice)	
		{
			case 1: 
			{
				System.out.println("\n Appending string");
				System.out.print("\n Enter a string to append : ");
				sc.nextLine();
				String stra = sc.nextLine();
				System.out.println(" "+sbfr.append(stra));

			break;
			}

			case 2:
			{
				System.out.println("\n Inserting string");
				System.out.print("\n Enter the string to insert : ");
				sc.nextLine();
				String stri = sc.nextLine();
				System.out.print("\n Enter the index position : ");
				int index = sc.nextInt();
				System.out.println(" "+sbfr.insert(index,stri));
			break;
			}

			case 3:
			{
				System.out.println("\n Deleting string");
				System.out.print("\n Enter the start index : ");
				int si = sc.nextInt();
				System.out.print("\n Enter the end index : ");
				int ei = sc.nextInt();
				System.out.println(" "+sbfr.delete(si,ei));
			break;
			}

			case 4:
			{
				System.out.println("\n Reversing string");
				System.out.println(" "+sbfr.reverse());
			break;
			}

			case 5:
			{	
				System.out.println("\n Replacing string");
				System.out.print("\n Enter the string to replace : ");
				sc.nextLine();
				String sr = sc.nextLine();
				System.out.print("\n Enter the start index : ");
				int si = sc.nextInt();
				System.out.print("\n Enter the end index : ");
				int ei = sc.nextInt();
				System.out.println(" "+sbfr.replace(si,ei,sr));
			break;
			}

			case 6:
			{
				System.out.println("\n String length");
				System.out.println(" "+sbfr.length());
			break;
			}

			case 7:
			{
				System.out.println("\n Sub String");
				System.out.print("\n Enter the index to get Sub String : ");
				int ss = sc.nextInt();
				System.out.println(" "+sbfr.substring(ss));
			break;
			}
			
			case 8: 
			{
				System.out.println("\n Index Of");
				System.out.print("\n Enter the string/character : ");
				sc.nextLine();
				String io = sc.nextLine();
				System.out.println(" "+sbfr.indexOf(io));
			break;
			}

			case 9: 
			{
				System.out.println("\n Char At");
				System.out.print("\n Enter the index position : ");
				int ip = sc.nextInt();
				System.out.println(" "+sbfr.charAt(ip));
			break;
			}

			case 10:
			{	
				System.out.println("\n Sub Sequence");
				System.out.print("\n Enter the start index : ");
				int si = sc.nextInt();
				System.out.print("\n Enter the end index : ");
				int ei = sc.nextInt();
				System.out.println(" "+sbfr.subSequence(si,ei));
			break;
			}

			default:
			{
				System.out.println(" Invalid Choice");
			}
		}
		System.out.print("\n Want to continue : ");
		k = sc.nextInt();
		sc.nextLine();
		}
		while(k==1);
		
	}
}