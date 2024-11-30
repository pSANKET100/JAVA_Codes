import java.util.*;
public class AnagramArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		System.out.println("Enter first array :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
 		System.out.println("Enter second array :");
		for(int j=0; j<b.length; j++){
			b[j] = sc.nextInt();
			}
		for(int m=0; m<a.length; m++){
			for(int n=m+1; n<a.length; n++){
			int temp = 0;
			if(a[m] > a[n]){
				temp = a[m];
				a[m] = a[n];
				a[n] = temp;
				}
			if(b[m] > b[n]){
				temp = b[m];
				b[m] = b[n];
				b[n] = temp;
				}
			}
		}
		boolean flag = true;
		for(int m=0; m<a.length; m++){
				if(a[m] != b[m]){
				flag = false;
				break;
				}
			}
		if(flag){
			System.out.println("Array is anagram");
			}
		else{
			System.out.println("Array is not anagram");
			}
				
	}
}
	
		
		
			