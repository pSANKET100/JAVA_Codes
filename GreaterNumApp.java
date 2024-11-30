import java.util.*;
public class GreaterNumApp
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int firstnum,secondnum,thirdnum;
		System.out.println("Enter first number");
		firstnum = sc.nextInt();
		System.out.println("Enter Second number");
		secondnum = sc.nextInt();
		System.out.println("Enter third number");
		thirdnum = sc.nextInt();

		int result = (secondnum < firstnum && firstnum > thirdnum) ? firstnum:
				(firstnum < secondnum && secondnum > thirdnum) ? secondnum :
				(firstnum < thirdnum && thirdnum > secondnum) ? thirdnum:0;
		System.out.println("this is greaternum "+result);
	}
}
