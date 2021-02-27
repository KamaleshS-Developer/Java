import java.io.*;

class A{
	A()
	{	
		System.out.println("Base class");
	}
}

class B extends A{
	B()
	{	
		System.out.println("Child class");
	}
}

class Example{
	public static void main(String args[]){
		B b = new B();
	}
}