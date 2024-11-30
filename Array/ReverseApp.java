import java.util.*;
public class ReverseApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a[]=new int[5];
		System.out.println("Enter five value :");
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		for(int j=a.length-1; j>=0; j--){
			System.out.print(a[j]+" ");
			}
	}
}
			
			