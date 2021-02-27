package distance_convertor;

public class distance_convertor
{
	public double meter_to_KM(double m)
	{
		return m/1000;
	}

	public double mile_to_KM(double mil)
	{
		return mil*1.60934;
	}

	//vice versa
	
	public double KM_to_meter(double km)
	{
		return km*1000;
	}

	public double KM_to_mile(double km)
	{
		return km/0.621371;
	}

}
