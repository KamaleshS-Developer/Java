package time_convertor;

public class time_convertor
{
	public double hours_to_minutes(double hr)
	{
		return hr*60;
	}

	public double hours_to_seconds(double hr)
	{
		return hr*3600;
	}

	//Vice versa

	public double minutes_to_hours(double min)
	{
		return min/60;
	}

	public double seconds_to_hours(double sec)
	{
		return sec*60;
	}
}