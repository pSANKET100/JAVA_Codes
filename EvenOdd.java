import java.util.*;
public class EvenOdd
{
	public static void main(String args[])
	{
		
                Scanner sc=new Scanner (System.in);
     		int no;
		System.out.println("Enter the number:");
		no = sc.nextInt();
		String result = no%2==0 ? "No is even ":"No is odd";
		System.out.println(result);
	}
}
		
		                                                                                                                                                