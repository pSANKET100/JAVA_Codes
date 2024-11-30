import java.util.*;
public class ArrayDeclare
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter any five values :");
		for(int i=0;i<a.length;i++){
			a[i]= sc.nextInt();
			}
		System.out.println("Display array :");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			}
	}
}
			