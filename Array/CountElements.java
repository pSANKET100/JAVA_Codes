import java.util.*;
public class CountElements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a[]=new int[5];
		System.out.println("Enter five values :");
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
			}
		System.out.println("occurance elements count are :");
		for(int i=0; i<a.length; i++){
			boolean flag = true;
			for(int j=0; j<i; j++){
				if(a[i] == a[j]){
				flag = false;
				break;
				}
			}
			if(flag){
			int count=0;
			for(int k=0; k<a.length; k++){
				if(a[k] == a[i]){
					count++;
					}
			}
	
			System.out.println(a[i] + ":" + count);
			}
		}
	}
} 