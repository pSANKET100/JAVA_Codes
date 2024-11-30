import java.util.*;
public class RotatePosition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter ten elemets for array :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		System.out.println("Enter position of array :");
			int pos = sc.nextInt();
		if(pos>0 && pos<a.length){
			for(int i=0; i<pos; i++){
			 int temp = a[i];
				for(int j=0; j<a.length-1; j++){
					a[j] = a[j+1];
					}
					a[a.length-1] = temp;
				}
			System.out.println("Rotate array is :");
			for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
			}
		}
		else{
			System.out.println("Invalid position");
			}
		}
	}