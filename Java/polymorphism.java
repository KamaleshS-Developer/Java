//Polymorphism (Doing single task in multiple ways.)

//-------compile time polymorphism--------

//Overloading (Having same name but different parameters.)

// 1.Constructor Overloading
	// 1) Default constructor (no arguments). 2) Parameterized Constructor (with arguments).
// 2.Method Overloading
// 3.Operator Overloading
	// 1) Addition operator & 2) Concatenation

import java.io.*;
import java.util.*;

class constructor_overloading
{
	constructor_overloading()
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("\n Default Constructor");
		System.out.print(" Enter a : ");
		a = sc.nextInt();
		System.out.print(" Enter b : ");
		b = sc.nextInt();
		System.out.println(" Sum = "+(a+b));
	}

	constructor_overloading(int a,int b)
	{

		System.out.println("\n Parameterized Constructor");
		System.out.println(" a = " + a + "\n b = " + b);
		System.out.println(" Sum = "+(a+b));
	}
}

class method_overloading
{
	void method()
	{	
		System.out.println("\n Method 1");
	}

	void method(float a,float b)
	{
		System.out.println("\n Method 2");
		float c = a - b;
		System.out.println(" Sub = "+c);
	}
}

class polymorphism
{
	public static void main(String args[])
	{
		constructor_overloading co1 = new constructor_overloading();
		constructor_overloading co2 = new constructor_overloading(20,30);

		method_overloading mo = new method_overloading();
		mo.method();
		mo.method(9,2);
	}
}
















