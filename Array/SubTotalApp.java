import java.util.*;
public class SubTotalApp
{
	public static void main(String args[])
	{
		double total = 0,per = 0;	
		Scanner sc = new Scanner (System.in);
		int a[] = new int[6];
		System.out.println("Enter subject marks :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		for(int i=0; i<a.length; i++){
			total = total + a[i];
			per = (total/600)*100;
			}
		System.out.println("Subject total is :"+total);
		System.out.println("percentage is :"+per);
	}
}