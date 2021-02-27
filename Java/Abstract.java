/* 
   Abstract class
   The method which has abstract keyword then the class is abstract class
   Only Declaration part in the abstract class & implementation part done in the derived class.
   There no object for abstract class.
*/

import java.io.*;
import java.util.*;

abstract class Shape
{
	int l,b,r;
	abstract void Area();
}

class Rectangle extends Shape
{
	void Area()
	{
		System.out.println(" Area of Rectangle : "+l*b);
	}	
}

class Triangle extends Shape
{
	void Area()
	{
		System.out.println(" Area of Triangle : "+(0.5*b*l));
	}
}

class Circle extends Shape
{
	void Area()
	{
		System.out.println(" Area of Circle : "+(3.14*r*r));
	}
}

class Abstract
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		Rectangle R = new Rectangle();
		System.out.println("\n --- RECTANGLE ---");
		System.out.print(" Enter the length : ");
		R.l = sc.nextInt();
		System.out.print(" Enter the breadth : ");
		R.b = sc.nextInt();
		R.Area();

		Triangle T = new Triangle();
		System.out.println("\n --- TRIANGLE ---");
		System.out.print(" Enter the base : ");
		T.b = sc.nextInt();
		System.out.print(" Enter the height : ");
		T.l = sc.nextInt();
		T.Area();

		Circle C = new Circle();
		System.out.println("\n --- Circle ---");
		System.out.print(" Enter the radius : ");
		C.r = sc.nextInt();
		C.Area();
	}
}
























