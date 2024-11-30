import java.util.*;
public class NeonNumApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int no,sqr,sum=0,rem,temp = 0;
		boolean flag = false;
		System.out.println("Enter any number :");
		no = sc.nextInt();

		temp = no;
		sqr = no * no;
		while(sqr > 0){
			rem = sqr % 10;
			sum = sum + rem;
			sqr = sqr / 10;
			}
			if(sum == temp){
				flag = true;
				}
				
		if(flag){
			System.out.println("Number is neon");
			}
		else{
			System.out.println("Number is normal");
			}
	}
}
			
			