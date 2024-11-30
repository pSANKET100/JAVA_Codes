import java.util.*;
public class VoteEligibaleApp
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner (System.in);
		int age;
		System.out.println("Enter your age :");
		age = sc.nextInt();
		if (age >= 18){
			System.out.println("your are eligible for vote ");
			}
		else {
			System.out.println("Your are not eligible for vote ");
			}
	}
}