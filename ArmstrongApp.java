import java.util.*;
public class ArmstrongApp
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int fnum,snum,tnum,number;
		System.out.println("Enter number");
		number = sc.nextInt();
		System.out.println("Enter first number :");
		fnum = sc.nextInt();
		System.out.println("Enter second number :");
		snum = sc.nextInt();
		System.out.println("Enter third number :");
		tnum = sc.nextInt();
		
		int n1 = fnum*fnum*fnum;
		int n2 = snum*snum*snum;
		int n3 = tnum*tnum*tnum;

		String result = n1 + n2 + n3 == number ?"number is armstrong":"number is not armstrong"; 

		System.out.println("This number " +result);
	}
}