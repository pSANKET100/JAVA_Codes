import java.util.*;
public class ReverseArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		char b[] = new char [5];
		System.out.println("Enter any Interger Element :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
 		System.out.println("Enter any character Elements :");
		for(int i=0; i<b.length; i++){
			b[i] = sc.next().charAt(0);
		}
			
			System.out.println("Reverse interger array is :");
			ReverseArray(a);
			System.out.println("Reverse character array is :");
			ReverseArray(b);
					
		}
		public static void ReverseArray(int a[]){
			int temp = 0;
			int i=0;
			int j=a.length-1;
				
			while(i<j){
				 temp = a[i];
				 a[i] = a[j];
            			 a[j] = temp;
           		i++;
            		j--;
		}
		for(int k=0; k<a.length; k++){
			System.out.println(a[k]);
			}
	}
		public static void ReverseArray(char b[]){
			char temp = 0;
			int i=0;
			int j=b.length-1;
				
			while(i<j){
				 temp = b[i];
				 b[i] = b[j];
            			 b[j] = temp;
           		i++;
            		j--;
		}
		for(int k=0; k<b.length; k++){
			System.out.println(b[k]);
			}
		}


}