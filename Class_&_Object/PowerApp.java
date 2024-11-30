import java.util.*;
class Power
{
	Scanner sc = new Scanner(System.in);
	int base,index;
	long result = 1;
	void intValue()
	{
		System.out.println("Enter base and index :");
			base = sc.nextInt();
			index = sc.nextInt();
	}
	void showValue()
	{
		//int result = (int)Math.pow(base,index);
		for(int i= index; i>0; i--)	
		{
			result = result * base;
		}
		System.out.println("Power of given number is : " +result);
	}
}
public class PowerApp
{
	public static void main(String args[])
	{
		Power p1 = new Power();
		p1.intValue();
		p1.showValue();
	}
}
			
		