import java.io.*;

class Employee{
	String Emp_name,Mail_id,Address,Mobile_no;
	long Emp_id;
	Employee(String Emp_name,long Emp_id,String Mail_id,String Address,String Mobile_no)
	{
		this.Emp_name = Emp_name;
		this.Emp_id = Emp_id;
		this.Mail_id = Mail_id;
		this.Address = Address;
		this.Mobile_no = Mobile_no;
	}

	public void pay()throws IOException
	{	
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		double bp,da,hra,pf,fund,gross_salary,net_salary;
		System.out.print(" Enter Basic Pay : ");
		bp = Double.parseDouble(br.readLine());
		da = 0.97*bp;
		hra = 0.1*bp;
		pf = 0.12*bp;
		fund = 0.01*bp;
		gross_salary = bp+da+hra+pf+fund;
		net_salary = (bp+hra+da)-(pf+fund);
		System.out.println(" -----Employee Details----");
		System.out.println(" Employee Id : "+Emp_id);
		System.out.println(" Employee Name : "+Emp_name);
		System.out.println(" Employee Mail Id : "+Mail_id);
		System.out.println(" Employee Mobile no : "+Mobile_no);
		System.out.println(" Employee Address : "+Address);
		System.out.println(" Employee Salary : "+bp);
		System.out.println(" Gross Salary : "+gross_salary);
		System.out.println(" Net Salary : "+net_salary);
	}
}

class Programmer extends Employee{
	Programmer(String Emp_name,long Emp_id,String Mail_id,String Address,String Mobile_no)
	{
		super(Emp_name,Emp_id,Mail_id,Address,Mobile_no);
	}
}

class Assistant_Professor extends Employee{
	Assistant_Professor(String Emp_name,long Emp_id,String Mail_id,String Address,String Mobile_no)
	{
		super(Emp_name,Emp_id,Mail_id,Address,Mobile_no);
	}
}

class Associate_Professor extends Employee{
	Associate_Professor(String Emp_name,long Emp_id,String Mail_id,String Address,String Mobile_no)
	{
		super(Emp_name,Emp_id,Mail_id,Address,Mobile_no);
	}
}

class Professor extends Employee{
	Professor(String Emp_name,long Emp_id,String Mail_id,String Address,String Mobile_no)
	{
		super(Emp_name,Emp_id,Mail_id,Address,Mobile_no);
	}
}

class Pay_slip{
	public static void main(String args[])throws IOException{
		System.out.println(" Programmer");
		Programmer p = new Programmer("Kamalesh",101,"kamal@gmail.com","Tirupur","7010608344");
		p.pay();
		System.out.println(" -----------------");
		System.out.println(" Assistant Professor");
		Assistant_Professor ass_p = new Assistant_Professor("Ram",102,"ram@gmail.com","Coimbatore","1020304050");
		ass_p.pay();
		System.out.println(" -----------------");
		System.out.println(" Associate Professor");
		Associate_Professor acc_p = new Associate_Professor("Ramu",103,"ramu@gmail.com","Chennai","9585580244");
		acc_p.pay();
		System.out.println(" -----------------");
		System.out.println(" Professor");
		Professor pro = new Professor("Kam",104,"kama@gmail.com","Madurai","6010708344");
		pro.pay();
		System.out.println(" -----------------");
		
	}
}