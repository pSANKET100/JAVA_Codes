import java.util.*;
public class UnitChargeApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double units,totalbill,bill,result;
		System.out.println("Enter units :");
		units = sc.nextDouble();

		if(units <= 50){
			result = 0.50 * units;
			}
		else if(units <= 150){
			result = 0.75 * units;
			}
		else if(units <= 250){
			result = 1.20 * units;
			}
		else {
			result = 1.50 * units;
			}
		System.out.println("Without additional charge is :"+result);

		bill = result*0.2;
		System.out.println("Additional charge is :"+bill);

		totalbill = result + bill;
		System.out.println("TotalBill is :"+totalbill);
	}
}



		
		