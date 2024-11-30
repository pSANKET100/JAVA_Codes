import java.util.*;
public class FloorCeilApp
{
	public static void main(String args[])
	{
		int i,j, floor=0, ceil=0,temp=0;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter five elements :");
		for(i=0; i<a.length; i++)
		a[i] = sc.nextInt();
		for(i=0; i<a.length; i++){
		for(j=i+1; j<a.length; j++){
			if(a[i] > a[j]){
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			}
			}
		}
		System.out.println("Enter number ");
		int n = sc.nextInt();
		for(i=0; i<a.length; i++){

		if(a[i] > n){
			floor = -1;
			ceil = a[i];
			break;
			}
		else if(a[a.length-1] < n){
			floor = a[a.length-1];
			ceil = -1;
			break;
			}
		else if(a[i] == n){
			floor = a[i];
			ceil = a[i];
			break;
			}
		else if(a[i]<n && a[i+1]>n){
			floor = a[i];
			ceil = a[i+1];
			break;
			}
		}
		System.out.println("floor of "+n+" is "+floor);
		System.out.println("ceil of "+n+" is " +ceil);
	}
}

			