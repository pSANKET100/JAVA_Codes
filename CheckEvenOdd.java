import java.util.*; //scanner class package
public class CheckEvenOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);   //using scanner class
		int num;   //declear veriable
		System.out.println("Enter any number :"); 
		num = sc.netxInt(); // print number 

		String result = (num % 2 == 0)? "Number is even " : "Number is Odd";   // using ternary operator
		System.out.println(result);       // print 
	}
}