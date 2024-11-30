import java.util.*;
public class SmallMissingElements
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter five elements :");
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
			}
		System.out.println("sorted array is :");
		for(int i=0; i<a.length; i++){
		for(int j=i+1; j<a.length; j++){
			int temp = 0;
			if(a[i] > a[j]){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("Second smallest elements is: ");
		int count = 0;
		for(int i=0; i<a.length; i++){
			for(int j=a[i]+1; j<a[i+1];j++){
				System.out.println(j+" ");
				count++;
				break;
				}
			if(count != 0)
			break;
		}
			
	}
}