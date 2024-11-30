import java.util.*;
public class SumCharArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a[] = new int[5];
		char b[] = new char[5];


		System.out.println("Enter five interger Elements :");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}


		System.out.println("Enter five charater Elements:");
		for(int i=0; i<b.length; i++){
			 b[i] = sc.next().charAt(0);
			}
			sumElements(a);
			sumElements(b);
	}
	public static void sumElements(int a[]){


		int sum=0;
		for(int i=0; i<a.length; i++){
		sum = sum+a[i];
		}
		System.out.println("Sum of intger array is :"+sum);
	}
	public static void sumElements(char b[]){
		int sum1 = 0;
		for(int i=0; i<b.length; i++){
			if(b[i] >= '0' && b[i] <= '9' ){
			sum1= sum1 + b[i]-'0';
			}
		}
		System.out.println("Sum of interger of this character :"+sum1);
	}
		
}
		
		