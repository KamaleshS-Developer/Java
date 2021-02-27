import java.io.*;

public class EB_bill{	
	public static void main(String[]args)throws IOException{
		int cns_no,pre_red,cur_red,bill;
		double total=0;
		String cns_name,type;
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.print("\n Enter Consumer No : ");
		cns_no = Integer.parseInt(br.readLine());
		System.out.print("\n Enter Consumer Name : ");	
		cns_name = br.readLine();
		System.out.print("\n Enter previous reading : ")	;
		pre_red = Integer.parseInt(br.readLine());
		System.out.print("\n Enter current reading : ");
		cur_red = Integer.parseInt(br.readLine());
		System.out.print("\n Enter EB bill type : ");
		type = br.readLine();
		if(cur_red<=100)
		{
			System.out.print("\n No amount to be paid");
		}
		else if(cur_red>=100&&cur_red<=500)
		{
			cur_red = cur_red-100;
			total = cur_red*1.5+(20);
			System.out.print("\n Total amount to be paid : "+total);
		}
		else if(cur_red>500&&cur_red<=700)
		{
			cur_red = cur_red-100;
			total = cur_red*2.5+(30);
			System.out.print("\n Total amount to be paid : "+total);
		}
		else
		{
			cur_red = cur_red-100;
			total = cur_red*3.5+(50);
			System.out.print("\n Total amount to be paid : "+total);
		}

		System.out.print("\n\n EB Bill Recipt");
		System.out.print("\n\n Consumer No : "+cns_no);
		System.out.print("\n Consumer Name : "+cns_name);
		System.out.print("\n Previous month reading : "+pre_red);
		System.out.print("\n Current mount reading : "+cur_red);
		System.out.print("\n Bill type : "+type);
		System.out.print("\n Total Amount : "+total);
	}
} 