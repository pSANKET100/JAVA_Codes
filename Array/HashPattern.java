import java.util.*;
public class HashPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter ten array values :");

		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		for(int i=0; i<2; i++){
			System.out.print(a[i]+" ");
			}
	
		for(int i=2; i<7; i++){
			System.out.print("# ");
			}
		for(int i=7; i<10; i++){
			System.out.print(a[i]+" ");
			}
		for(int i=0; i<10; i++){
			if(a[i] % 2 == 0){
			System.out.print(a[i]+" ");
			}
			else{
			System.out.print("* ");
			}
		}
	}
}