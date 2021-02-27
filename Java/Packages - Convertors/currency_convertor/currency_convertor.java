/*
   User defined package
   package package_name;
   classes inside package must not contain main class
   if u need multiple classes in one package we have to create multiple programs
*/

package currency_convertor;
	
public class currency_convertor
{
	public double dollar_to_INR(double d)
	{
		return d*73.59;
	}

	public double euro_to_INR(double e)
	{
		return e*89.80;
	}

	public double yen_to_INR(double y)
	{
		return y*0.71;
	}

	// Vice Versa

	public double INR_to_dollar(double r)
	{
		return r*0.014;
	}

	public double INR_to_euro(double r)
	{
		return r*0.011;
	}

	public double INR_to_yen(double r)
	{
		return r*1.40;
	}
}































	