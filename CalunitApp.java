import java.util.*;
public class CalunitApp
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);
		double unit,unitrate,totalbill,bill;
		System.out.println("Enter yours units :");
		unit = sc.nextDouble();
		System.out.println("Enter unit rate :");
		unitrate = sc.nextDouble();
		bill = unit * unitrate ;
		System.out.println("Without discount bill is :"+bill);
		
		Double result = (bill > 2000)?  bill * 0.2 :
				bill * 0.05;
		System.out.println("Discount is :"+result);
		totalbill = bill - result ;
		System.out.println("Final bill is :"+totalbill); 
		
	}
}
