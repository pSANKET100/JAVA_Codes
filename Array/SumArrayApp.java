import java.util.*;
public class SumArrayApp
{
	public static void main(String args[])
	{
		int sum = 0;
		Scanner sc = new Scanner (System.in);
		int a[] = new int[5];
		System.out.println("Enter any five values :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		System.out.println("Display values :");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
			sum = sum + a[i];
			}
		System.out.println("Sum of Array is : " +sum);
	}
}