//overidding

import java.io.*;
import java.util.*;

class Samsung_M31
{	
	void display()
	{
		System.out.println("\n Product Name : Samsung M31");
		System.out.println(" Product Colour: Balck");
		System.out.println(" Internal Storage : 64GB");
		System.out.println(" RAM : 4BG");
		System.out.println(" Price : 13,460");
	}
}

class OnePlus_8T extends Samsung_M31
{
	void display()
	{
		super.display();
		System.out.println("\n Product Name : OnePlus 8T");
		System.out.println(" Product Colour : Silver");
		System.out.println(" Internal Storage: 256GB");
		System.out.println(" RAM : 12GB");
		System.out.println(" Price : 45,900");
	}	
}


class Vivo_S1 extends OnePlus_8T
{
	void display()
	{
		super.display();
		System.out.println("\n Product Name : Vivo S1");
		System.out.println(" Product Color: Diamond Black");
		System.out.println(" Internal Storage : 64GB");
		System.out.println(" RAM : 6GB");
		System.out.println(" Price : 16,990");
	}
}

class Products
{
	public static void main(String args[])
	{	
		Vivo_S1 mob = new Vivo_S1();
		mob.display();
	}
}
















