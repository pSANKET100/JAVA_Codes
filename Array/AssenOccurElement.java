import java.util.*;	
public class AssenOccurElement
{
	public static void main(String arge[])
	{
		int temp = 0,count = 1;
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter five elements :");
		for(int i=0;i<a.length; i++){
			a[i]=sc.nextInt();
			}
		for(int i=0;i<a.length; i++){
		for(int j=i+1; j<a.length; j++){
			if(a[i] > a[j]){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		System.out.println("Assending order is: ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+ " ");
			}
		for(int i=0; i<a.length; i++){
			if(i==a.length-1){
				System.out.println(a[i]+ "  " +count);
				}
			else if(a[i] == a[i+1]){
				count++;
				}
			else{
				System.out.println(a[i]+ "  " +count);
				count =1;
				}
			}
	}
}