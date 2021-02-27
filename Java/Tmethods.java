/*
	Thread Methods
	1.getId()--->to get thread id
	2.getName()--->to get thread name
	3.setName()--->to change the thread name
	4.sleep()--->to wait the continuous execution
*/

class Th extends Thread
{
	public void run()
	{
		for(int i=5;i>=0;i--)
		{
			try
			{
				Thread.sleep(1000);
			}	
			catch(java.lang.Exception e)
			{
			}
			System.out.println(" "+i);
		}
	}
}

class Tmethods
{
	public static void main(String args[])
	{
		Th t = new Th();
		System.out.print("\n Thread ID : "+t.getId());
		System.out.print("\n Thread Name : "+t.getName());
		t.setName(" Kamalesh");
		System.out.println("\n Thread Name after changing : "+t.getName()); 
		t.start();
	}
}