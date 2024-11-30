import java.util.*;
public class SearchNumberApp
{
	public static void main(String args[])
	{
		int skey;
		boolean flag = false;
		Scanner sc=new Scanner (System.in);
		int a[] = new int[5];
		System.out.println("Enter any five values :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		System.out.println("Enter search values :");
			skey = sc.nextInt();
		for(int i=0; i<a.length; i++){
			if(a[i] == skey){
			flag = true;
			break;
			}
		}
		if(flag){
			System.out.println("Found values");
			}
		else{
			System.out.println("Values not found");
			}
	}
}