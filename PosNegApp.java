import java.util.*;
public class PosNegApp
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.println("Enter any number :");
		num = sc.nextInt();
		if (num < 0){
		System.out.println("Number is negative ");
		}
		else{
		System.out.println("Number is positive ");
		}
	}
}