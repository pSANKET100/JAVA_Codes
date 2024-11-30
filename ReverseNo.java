import java.util.*;
public class ReverseNo
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rev=0,rem,no;
		System.out.println("Enter three number");
		no = sc.nextInt();

		rem = no % 10;
		rev = rev*10+rem; 
		no = no/10;

		rem = no % 10;
		rev = rev*10+rem;
		no = no/10;
		
		rem = no % 10;
		rev = rev*10+rem;
		no = no/10;
		System.out.println("ReverseNo is ="+rev);
		
	}
}