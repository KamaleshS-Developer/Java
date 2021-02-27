/* 
   interface
   interface uses only implements
   using interface multiple inheritance also achieved
   This is similar to abstract class.Only declaration is done & implementation is done in another class.
*/

import java.io.*;
import java.util.*;
import java.lang.*;

interface vehicle
{
	void Changegear(int g);
	void Speedup(int s);
	void Applybrakes(int b);
	void Printstates();
}

class bike implements vehicle
{
	int gear,speed;

	public void Changegear(int g)
	{
		gear = g;
	}

	public void Speedup(int s)	
	{
		speed = speed + s;
	}

	public void Applybrakes(int b)
	{
		speed = speed - b;
	}

	public void Printstates()
	{	
		System.out.println("\n Bike's status");
		System.out.println(" Gear : " + gear + "\n Speed : " + speed);
	}
}

class car implements vehicle
{
	int gear,speed;

	public void Changegear(int g)	
	{
		gear = g;
	}

	public void Speedup(int s)
	{
		speed = speed + s;
	}

	public void Applybrakes(int b)
	{
		speed = speed - b;
	}

	public void Printstates()
	{	
		System.out.println("\n Car's status");
		System.out.println(" Gear : " + gear + "\n Speed : " + speed);
	}
}

class Interfaces
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int gear,brake,speed,i=1,ch;

		bike B = new bike();
		car C = new car();
			
		while(i==1)
		{
		System.out.println("\n 1.Bike");
		System.out.println(" 2.Car");
		System.out.println(" 3.Exit");
		System.out.print("\n Choose you ride : ");
		ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			while(i==1)
			{
			System.out.println("\n --- Bike ---");
			System.out.print(" Change gear : ");
			gear = sc.nextInt();
			System.out.print(" Change speed : ");
			speed = sc.nextInt();
			System.out.print(" Apply brake : ");
			brake = sc.nextInt();
	
			B.Changegear(gear);
			B.Speedup(speed);
			B.Applybrakes(brake);
			B.Printstates();

			System.out.print("\n Continue bike ride(1->yes||0->no) : ");
			i = sc.nextInt();
			}
		break;

		case 2:
			while(i==1)
			{
			System.out.println("\n --- Car ---");
			System.out.print(" Change gear : ");
			gear = sc.nextInt();
			System.out.print(" Change speed : ");
			speed = sc.nextInt();
			System.out.print(" Apply brake : ");
			brake = sc.nextInt();
	
			C.Changegear(gear);
			C.Speedup(speed);
			C.Applybrakes(brake);
			C.Printstates();

			System.out.print("\n Continue car ride(1->yes || 0->no) : ");
			i = sc.nextInt();
			}
		break;

		case 3:
			System.out.println(" End of the ride.....!");
			System.exit(0);

		default:
			System.out.println("\n invalid option");
		}
		System.out.print("\n Want to continue your rides(1->yes || 0->no) : ");
		i = sc.nextInt();
		}
	}
}

























