import java.util.*;
public class EqualNoApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		String result = (num1 == num2)? "equal":"not equal";
		System.out.println("Interger is "+result);
	}
}
