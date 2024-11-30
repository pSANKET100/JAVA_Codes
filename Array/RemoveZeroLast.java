import java.util.*;
public class RemoveZeroLast
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int [10];
		int count = 0;
			
		System.out.println("Enter ten Elements :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		for(int i=0; i<a.length; i++){
			if(a[i] != 0){
			a[count] = a[i];
			count++;
			}
		}

		while(count<a.length){
			a[count] = 0;
			count++;
			}
		System.out.println("New Array is :");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
			}
		
	}
}