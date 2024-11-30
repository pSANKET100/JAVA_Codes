import java.util.*;
public class StarPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int[10];
		boolean flag = false;
		System.out.println("Enter ten arrays values :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		int star = 3;
		for(int i=0; i <star; i++){
			System.out.print("* ");
			}
		
		for(int i=3; i<7; i++){
				System.out.print(a[i] +" ");
			}

		for(int i=0; i <star; i++){
			System.out.print("* ");
			}
	}
}