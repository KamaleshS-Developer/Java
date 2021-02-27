class Teacher
{
	void base()
	{
		System.out.println(" In Base Class");
		System.out.println(" Hi,I'm a teacher");
	}
}

class Physics_Teacher extends Teacher
{
	void sub1()
	{
		System.out.println("\n In sub class - 1");
		System.out.println(" Hi,I'm a Physics Teacher");
	}
}

class Chemistry_Teacher extends Physics_Teacher
{	
	void sub2()
	{
		System.out.println("\n In Sub class - 2");
		System.out.println(" Hi,I'm a Chemistry Teacher");
	}
}

class Teachers
{
	public static void main(String args[])
	{
		Chemistry_Teacher tchr = new Chemistry_Teacher();
		tchr.base();
		tchr.sub1();
		tchr.sub2();
	}
}