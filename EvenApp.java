import java.util.*;
public class EvenApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int no ;
		System.out.println("Enter The Number");
		no = sc.nextInt();
		
		String result = (no & 1)==0? "The number is Even": "The Number is Odd";
		//String result = (no | 1)>no? "The number is Even": "The Number is Odd";
		System.out.println(result);
	}
}
			// NO = 2	
			// 2 & 1 == 0
			// 0010
			// 0001
			// -----
			// 0000 == 0 this no is even  1 == 0 this no is odd