import java.util.*;
public class MaxNumApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int num1,num2;
		System.out.println("Enter any two numbers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2){
			System.out.println("Num1 is large");
			}
		else{
			System.out.println("Num2 is large");
			}
	}
}