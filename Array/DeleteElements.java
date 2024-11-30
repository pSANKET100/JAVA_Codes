import java.util.*;
public class DeleteElements
{
	public static void main(String args[])
	{	
		int delete;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter five elements :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		System.out.println("Enter delete elements :");
			delete = sc.nextInt();
		
		if(delete < 0 || delete >=a.length){
			System.out.println("Invalid position");
			return;
			}
		
		int b[] = new int[a.length-1];
		int j=0;
		
		for(int i=0; i<a.length; i++){
			if(i != delete){
				b[j] =	a[i];
				j++;
			}
		}
		System.out.println("New list :");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+" ");
			}
		System.out.println();
	}
}	