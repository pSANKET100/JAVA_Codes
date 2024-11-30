//with sorting 
//public class MissingValues
//{
//	public static void main(String args[])
//	{
//		int a[] = {11,15,18,20,22};
//		for(int i=0; i<a.length-1; i++){
//
//		for(int j=a[i]+1; j<a[i+1]; j++){
//			System.out.printf("%d ",j);
//			}
//		}
//	}
//}

//without sorting

import java.util.*;
public class MissingValues
{
	public static void main	(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
			
		System.out.println("Enter any five elements :");
		for(int i=0; i<a.length; i++){
		a[i] = sc.nextInt();
		}
		int max=0;
		int min= a[0];
		for(int i=0; i<a.length; i++){
			if(a[i] > max){
			        max = a[i];
				}
			if(a[i] < min){
				min = a[i];
				}
			}
		for(int i=min; i<=max; i++){
			boolean flag = false;
			for(int j=0; j<a.length; j++){
				if(i==a[j]){
				flag = true;
				}
			}	
		if(!flag){
			System.out.println(i);
			}
		}	
		}
}
		
			
		
					