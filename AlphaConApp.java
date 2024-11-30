import java.util.*;
public class AlphaConApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		char alpha;
		System.out.println("Enter any alphabets :");
		alpha = sc.next().charAt(0);
		
		alpha = (char)((int)alpha^32);
		System.out.println(alpha);
	}
}




		
		
		
		
		