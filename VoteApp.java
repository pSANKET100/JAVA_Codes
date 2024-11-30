import java.util.*;
public class VoteApp
{
	public static void main (String arse[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter any number");
		num = sc.nextInt();
		String result = (num >= 18)?"Eligible for vote":"Not eligible for vote";
		System.out.println("Candidate is "+result);
	}
} 