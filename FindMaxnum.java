import java.util.*;
public class FindMaxnum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int num1,num2;
		System.out.println("Enter two numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int result = (num1>num2)?num1:num2;
		System.out.println("The Maximum no is ="+result);
	}
}
		