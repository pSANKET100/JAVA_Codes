import java.util.*;
public class AllNaturalApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n,i;
		System.out.println("Enter number :");
		n = sc.nextInt();

		i = 1;
		while(i<=n){
		System.out.println("number is :"+i);
		i++;
		}
	}
}