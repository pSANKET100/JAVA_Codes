import java.util.*;
public class FirstLast
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int first,last,mid,no,swap;
		System.out.println("Enter any number");
		no = sc.nextInt();
		
		last = no % 10;
		no = no / 10;

		first = no / 1000;
		mid =  no % 1000;

		swap = (last*10000)+(mid*10)+first;

		System.out.println("After swapping =  "+swap);
	}
}