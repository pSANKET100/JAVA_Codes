import java.util.*;
public class SwapUsingBitwise
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a,b;
		System.out.println("Enter first number :");
		a = sc.nextInt();
		System.out.println("Enter second number :");
		b = sc.nextInt();
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("After swapping :"+a);
		System.out.println("After swapping :"+b);
	}
}
		