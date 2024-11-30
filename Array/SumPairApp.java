import java.util.*;
public class SumPairApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		Boolean found = false;
		int sum;

		System.out.println("Enter five elements :");
			for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
			
		System.out.println("Enter pair sum :");
			sum = sc.nextInt();
			
		for(int  i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
			if(a[i] + a[j] == sum){
				System.out.println("Match of pair elements is " +i+ "  and  "  +j);
				found = true;
				break;
				}
			}
		}
		if(!found){
			System.out.println("Not match pair sum");
			}
	}
}
			
	 