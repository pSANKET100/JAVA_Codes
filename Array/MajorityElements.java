import java.util.*;
public class MajorityElements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[] = new int[6];
		int n = a.length;
		System.out.println("Enter six elements :");
		for(int i=0; i<a.length; i++)
		a[i] = sc.nextInt();
		
		findMajority(a,n);
	}

public static void findMajority(int a[],int n){
		int maxcount=0;
		int index = -1;
		
		for(int i=0; i<a.length; i++){
		int count = 0;
		for(int j=0; j<a.length; j++){
			if(a[i] == a[j]){
			count++;
			}
		if(count > maxcount){
			maxcount = count;
			index  = i;
			}
		}
	}
	if(maxcount >n/2){
		System.out.println("majority elements is :"+a[index]);
		}
	else{
		System.out.println("No majority elements in this array ");
		}
}
}		
			
	