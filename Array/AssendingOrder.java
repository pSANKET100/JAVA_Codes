import java.util.*;
public class AssendingOrder
{
	public static void main(String args[])
	{
		int temp = 0;
		Scanner sc = new Scanner (System.in);
		int a[]=new int[5];
		System.out.println("Enter five elements :");
		for(int i=0; i<a.length; i++){	
			a[i] = sc.nextInt();
			}
		for(int i=0; i<a.length; i++){	
			for(int j=i+1; j<a.length; j++){


				if(a[i] >  a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Assending order is :");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
			}
	}
}