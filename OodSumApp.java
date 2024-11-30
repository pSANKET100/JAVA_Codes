import java.util.*;
public class OodSumApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int no,sum = 0, i;
		System.out.println("Enter any number :");
		no = sc.nextInt();
		
		i=1;
		while(i<=no){
			if(i % 2 != 0){
			sum = sum + i;
			}
		i++;
		}
		System.out.println("Sum of odd numbers :"+sum);
	}
}