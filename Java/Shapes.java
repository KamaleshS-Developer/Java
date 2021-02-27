import java.util.*;
import java.io.*;

class shape
{
	int length,breadth,radius;
	shape(int length,int breadth,int radius)
	{
		this.length = length;
		this.breadth = breadth;	//"this" keyword is access the instance class variables...,
		this.radius = radius;	// incase the name of the parameters & variables are same.
	}
}

class Circle extends shape
{
	Circle(int r)
	{
		super(0,0,r); //have to specify the previous constructor format
		int radius;
		System.out.println("\n Radius of the Circle : "+super.radius);
	}
}

class Square extends shape
{
	Square(int s)
	{
		super(s,0,0);
		int length;
		System.out.println("\n Sides of the square : "+super.length);
	}
}

class Rectangle extends shape
{
	Rectangle(int l,int b)
	{
		super(l,b,0);
		int length,breadth;
		System.out.println("\n Length and Breadth of the rectangle : " + super.length +  "" + super.breadth);
	}
}

class Shapes
{
	public static void main(String args[])
	{
		int radius,length,breadth;
		Scanner sc = new Scanner(System.in);

		System.out.print("\n Enter the radius : ");
		radius = sc.nextInt();
		System.out.print("\n Enter the length : ");
		length = sc.nextInt();
		System.out.print("\n Enter the breadth : ");
		breadth = sc.nextInt();
		
		System.out.print("\n --- CIRCLE ---");
		Circle C = new Circle(radius);

		System.out.print("\n --- SQUARE ---");
		Square S = new Square(length);

		System.out.print("\n --- RECTANGLE ---");
		Rectangle R = new Rectangle(length,breadth);

		
	}
}















