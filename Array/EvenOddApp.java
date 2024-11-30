import java.util.*;
public class EvenOddApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int[5];
		System.out.println("Enter five values :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		for(int i=0; i<a.length; i++){
			if(a[i] % 2 == 0){
			System.out.println("Even Number is :"+a[i]);
			}
			else{
			System.out.println("Odd Number is :+"+a[i]);
			}
		}

	}
}