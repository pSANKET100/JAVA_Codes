import java.util.*;
public class MinMaxNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter five values :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		int max=a[0],min=a[0];
		for(int i=0; i<a.length; i++){
			if(a[i] > max){
			max = a[i];
			}
			if(a[i] < min){
			min = a[i];
			}
		}
		System.out.println("Max number is :"+max);
		System.out.println("Min number is :"+min);
	}
}
		