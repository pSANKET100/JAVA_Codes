import java.util.*;
public class SimpleInterestApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double principle,time,rate,SI;
		System.out.println("Enter principle :");
		principle = sc.nextDouble();
		System.out.println("Enter time :");
		time = sc.nextDouble();
		System.out.println("Enter rate :");
		rate = sc.nextDouble();
		
		SI = principle * time * rate / 100;		
		System.out.println("Simple Interest :"+SI);
	}
}