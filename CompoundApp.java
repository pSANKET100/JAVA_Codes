import java.util.*;
public class CompoundApp
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		double pamount,interest,period;

		System.out.println("Enter pamount :");
		pamount = sc.nextDouble();

		System.out.println("Enter interest :");
		interest = sc.nextDouble();

		System.out.println("Enter period :");
		period = sc.nextDouble();

		double monthlyint = interest / 12/100;
		double emi ;

		emi = (pamount * monthlyint * Math.pow(1 + monthlyint,period))/
		(Math.pow(1+monthlyint,period )-1);

		System.out.println("Emi is :"+emi);
	}
}
		
		