import java.util.*;
public class majority
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		int n=a.length;
		int index = -1;
		int maxcount = 0;

		System.out.println("Enter any four elementa");
		for(int i=0; i<a.length; i++){
		a[i]= sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
		int count = 0;
		for(int j=0; j<n; j++){
			if(a[i] == a[j]){
			count++;
			}
		if(count > maxcount){
			maxcount = count ;
			index = i;
			}
			}
		}
		if(maxcount > n/2){
			System.out.println("majority elemets is "+a[index]);
			}
		else{
			System.out.println("not");
			}
	}
	}