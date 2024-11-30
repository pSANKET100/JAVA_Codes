import java.util.*;
public class PositiveNeApp
{
	public static void main(String args[])
 	{
		Scanner sc = new Scanner (System.in);
		int no;
		System.out.println("Enter number :");
		no = sc.nextInt();
		
		String result = (no | 0) == 0 ? "Number is zero" : ( no | 1 ) > 0 ? "Number is positive" 
				: "Number is negative";
		System.out.println(result);
	}
}