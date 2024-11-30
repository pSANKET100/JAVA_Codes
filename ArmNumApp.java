import java.util.*;
public class ArmNumApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no,rev=0,rem,temp;
		System.out.println("Enter three digit number :");
		no = sc.nextInt();
		temp = no;

		rem = no%10;
		rev = rev+rem*rem*rem;
		no = no/10;
		
		rem = no%10;
		rev = rev+rem*rem*rem;
		no = no/10;

		rem = no%10;
		rev = rev+rem*rem*rem;
		
		if(rev == temp){
			System.out.println("number is Armstrong :");
			}
		else{
			System.out.println("Number is not Armstrong");
			}
	}
}