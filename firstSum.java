import java.util.*;
public class firstSum 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int num1,num2,sum,sub,multi,div,mode;
		System.out.println("Enter first num :");
		num1 = sc.nextInt();
		System.out.println("Enter second num :");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		System.out.println("Sum is :" +sum);
		
		sub = num1 - num2;
		System.out.println("Difference is :" +sub);

		multi = num1 * num2;
		System.out.println("Product is :" +multi);

		div = num1 / num2;
		System.out.println("Quotient is :" +div);
		
		mode = num1 % num2;
		System.out.println("Remainder is :" +mode);
	}
}





