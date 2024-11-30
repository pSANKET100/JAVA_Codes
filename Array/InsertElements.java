import java.util.*;
public class InsertElements
{
	public static void main(String args[])
	{
		int index,value;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("Enter five elements :");

		for(int i=0; i<a.length-1; i++){
			a[i] = sc.nextInt();
			}
		
		System.out.println("Original array is:");
		for(int i=0; i<a.length-1; i++){
			System.out.println(a[i]);
			}

		System.out.println("Enter Index :");
			index = sc.nextInt();
		System.out.println("Enter value of code :");
			value = sc.nextInt();

		for(int k=(a.length-2); k>=index; k--){
			a[k+1]=a[k];
			}
			a[index] = value;
			System.out.println("After insertion elements ");
		
		for(int m=0; m<a.length; m++){
			System.out.print(a[m]+" ");
			}
	}
}