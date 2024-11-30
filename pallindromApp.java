import java.util.*;
public class pallindromApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int no,temp,rev=0,rem;
		System.out.println("Enter any three digit number :");
		no = sc.nextInt();
		temp = no;

		rem = no%10;
		rev = rev+rem*100;
		no = no/10;

		rem = no%10;
		rev = rev+rem*10;
		no = no/10;
		
		rem = no%10;
		rev = rev+rem*1;

		System.out.println("Rev no is :"+rev);
		
		if(rev == temp){
			System.out.println("Number is pallindrom");
			}
		else{
			System.out.println("Number is not pallindrom");
			}
	}
}