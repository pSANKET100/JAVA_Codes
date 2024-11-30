import java.util.*;
public class ElectricityBill
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		double units,Bill,finalBill;
		System.out.println("Enter units :");
		units = sc.nextDouble();
		Double result = (units <= 50) ? units * 0.50:
				(units <= 150) ? units * 0.75:
				(units <= 250) ? units * 1.20:
				units * 1.50 ; 		
		System.out.println("Without charge bill is = "+result);
		Bill = result * 0.2;
		System.out.println("Additional charge is = "+Bill);
		finalBill =  Bill + result;
		System.out.println("The final bill is = "+finalBill);
		
	}
}
		