


import java.util.*;

class Number extends Thread
{
	public void run()
	{
	Random rand = new Random();

	for(int i=0;i<10;i++)
	{
		int ran = rand.nextInt(100);
		if(ran%2==0)
		{
			System.out.println("\n Random Number Generated : "+ ran + " ---> Even");
			Square sq = new Square(ran);
			sq.start();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		else
		{
			System.out.println("\n Random Number Generated : "+ ran + " ---> Odd");
			Cube cb = new Cube(ran);
			cb.start();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}
	}
}

class Square extends Thread
{
	int num;
	Square(int num)
	{	
		this.num = num;
	}
	public void run()
	{
		System.out.println(" Square of "+ num + " is "+(num*num));
	}
}

class Cube extends Thread
{
	int num;
	Cube(int num)
	{
		this.num = num;
	}
	public void run()
	{
		System.out.println(" Cube of "+ num + " is "+(num*num*num));
	}
}


class Threads
{
	public static void main(String args[])	
	{
		Number num = new Number();
		num.start();
	}
}