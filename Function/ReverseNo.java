import java.util.*;
public class ReverseNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int no;
		System.out.println("Enter Any Number :");
		no = sc.nextInt();
		
		int result = getRev(no);
		System.out.println("Reverse no is :"+result);
		
	}
	public static int getRev(int x){
		int r=0,rem;
		while(x !=0){
			rem= x % 10;
			x = x/10;
			r = r*10+rem;
			}
		return r;
	}
}