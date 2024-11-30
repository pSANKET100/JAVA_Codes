import java.util.*;
public class first
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a[] =new int [5];
		char b[] =new char [5];
		System.out.println("Enter five elemets :");
			for(int i=0; i<a.length; i++)
				a[i] = sc.nextInt();

		System.out.println("Enter five character :");
			for(int i=0; i<a.length; i++)
			b[i] = sc.next().charAt(0);

			sorting(a);
			sorting(b);
	}

	public static void sorting(int a[])
	{
		int temp;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int k=0; k<a.length; k++){
			System.out.println(a[k]);
		}
        }

	public static void sorting(char b[]){
		char temp;
		for(int i=0; i<b.length; i++){
			for(int j=i+1; j<b.length; j++){
				if(b[i] > b[j]){
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for(int k=0; k<b.length; k++){
			System.out.println(b[k]);
		}	
	}
   
}
