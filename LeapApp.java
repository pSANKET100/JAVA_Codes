import java.util.*;
public class LeapApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter any number:");
		num = sc.nextInt();
		String result = num%4==0 ? "This year is leap":"This year is not leap";
		System.out.println(result);
	}
}
