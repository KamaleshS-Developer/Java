import currency_convertor.*;
import distance_convertor.*;
import time_convertor.*;
import java.util.*;
import java.io.*;

class convertor
{
	public static void main(String args[])
	{
		int ch;
		double d,e,y,inr,m,mil,km,hr,min,sec
		Scanner sc = new Scanner(System.in);

		System.out.print("\n 1.Currency Convertor");
		System.out.print("\n 2.Distance Convertor");
		System.out.print("\n 3.Time Convertor");
		System.out.print("\n Select your choice : ");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			currency_convertor cc = new currency_convertor();
			System.out.println("\n ---Currency Convertor---");
			System.out.println(" 1.Dollar to INR");
			System.out.println(" 2.Euro to INR");
			System.out.println(" 3.Yen to INR");
			System.out.println(" 4.INR to Dollar");
			System.out.println(" 5.INR to Euro");
			System.out.println(" 6.INR to Yen");
			System.out.print("\n Select your choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("\n Enter Dollar to convert INR : ");
				d = sc.nextDouble();
				System.out.print(" "+cc.dollar_to_INR(d));
			break;
			case 2:	
				System.out.print("\n Enter Euro to convert INR : ");
				e = sc.nextDouble();
				System.out.print(" "+cc.euro_to_INR(e));
			break;
			case 3:
				System.out.print("\n Enter Yen to convert INR : ");
				y = sc.nextDouble();
				System.out.print(" "+cc.yen_to_INR(y));
			break;
			case 4:
				System.out.print("\n Enter INR to convert Dollar : ");
				inr = sc.nextDouble();
				System.out.print(" "+cc.INR_to_dollar(inr));
			break;
			case 5:
				System.out.print("\n Enter INR to convert Euro : ");
				inr = sc.nextDouble();
				System.out.print(" "+cc.INR_to_euro(inr));
			break;
			case 6:
				System.out.print("\n Enter INR to convert Yen : ");
				inr = sc.nextDouble();
				System.out.print(" "+cc.INR_to_yen(inr));
			break;
			default:
				System.out.println("\n Invalid Choice");
			}
		break;
		case 2:
			distance_convertor dc = new distance_convertor();
			System.out.println("\n ---Distance Convertor---");
			System.out.println(" 1.Meter to KM");
			System.out.println(" 2.Miles to KM");
			System.out.println(" 3.KM to Meter");
			System.out.println(" 4.KM to Miles");
			System.out.print("\n Select your choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("\n Enter Meter to convert KM : ");
				m = sc.nextDouble();
				System.out.print(" "+dc.meter_to_KM(m));
			break;
			case 2:
				System.out.print("\n Enter Mile to convert KM : ");
				mil = sc.nextDouble();
				System.out.print(" "+dc.mile_to_KM(mil));
			break;
			case 3:
				System.out.print("\n Enter KM to convert Meter : ");
				km = sc.nextDouble();
				System.out.print(" "+dc.KM_to_meter(km));
			break;
			case 4:
				System.out.print("\n Enter KM to convert Mile : ");
				km = sc.nextDouble();
				System.out.print(" "+dc.KM_to_mile(km));
			break;
			default:
				System.out.println("\n Invalid Choice");			
			}
		break;
		case 3:
			time_convertor tc = new time_convertor();
			System.out.println("\n ---Time Convertor---");
			System.out.println(" 1.Hours to Minutes");
			System.out.println(" 2.Hours to Seconds");
			System.out.println(" 3.Minutes to Hours");	
			System.out.println(" 4.Seconds to Hours");
			System.out.print("\n Select your choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("\n Enter Hours to convert Minutes : ");
				hr = sc.nextDouble();
				System.out.print(" "+tc.hours_to_minutes(hr));
			break;
			case 2:
				System.out.print("\n Enter Hours to convert Seconds : ");
				hr = sc.nextDouble();
				System.out.print(" "+tc.hours_to_seconds(hr));
			break;
			case 3:
				System.out.print("\n Enter Minutes to convert Hours : ");
				min = sc.nextDouble();
				System.out.print(" "+tc.minutes_to_hours(min));
			break;
			case 4:
				System.out.print("\n Enter Seconds to convert Hours : ");
				sec = sc.nextDouble();
				System.out.print(" "+tc.seconds_to_hours(sec));
			break;
			default:
				System.out.println("\n Invalid Choice");			
			}
		break;
		default:
			System.out.println("\n Invalid Choice");
		}
		
	}
}





































