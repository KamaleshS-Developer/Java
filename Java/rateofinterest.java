//overloading

class Banks
{
	double rate_of_interest()
	{
		return 8.5;
	}
		
	double rate_of_interest(double ri)
	{
		return ri;
	}

	double rate_of_interest(String name,double ri)
	{
		System.out.print("\n *** " + name + " ***");
		return ri;
	}

	void rate_of_interest(float ri)
	{
		System.out.print("\n *** ICICI BANK ***");
		System.out.println("\n Rate of Interest : "+ri);
	}
}

class rateofinterest
{
	public static void main(String args[])
	{
		Banks B = new Banks();

		System.out.print("\n *** Sate Bank Of India ***");
		System.out.println("\n Rate of Interest : "+B.rate_of_interest());

		System.out.print("\n *** Indian Overseas Bank ***");
		System.out.println("\n Rate of Interest : "+B.rate_of_interest(10.5));

		double ri = B.rate_of_interest("Axis Bank",8.9);
		System.out.println("\n Rate of Interest : "+ri);

		B.rate_of_interest(10);
	}
}