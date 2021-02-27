//run time polymorphism

// overidding (method which has same name in different classes which is inherited)
// super keyword used to access previous base class's methods/variables

class P{
	int a = 20;
	void display()
	{
		System.out.println(" Parent");
	}
}

class C extends P{
	int a = 40;
	void display()
	{
		System.out.println(" Child");
		System.out.println(" Value of a : "+a);
		super.display();
		System.out.println(" Value of a : "+super.a);
	}
}

class overidding{
	public static void main(String args[]){
		C obj = new C();
		obj.display();
	}
}