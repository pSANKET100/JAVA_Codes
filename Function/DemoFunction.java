import java.util.*;
public class DemoFunction
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int no;
		System.out.println("Enter any number :");
		no = sc.nextInt();
		int result = show(no);
		System.out.println(result);
	}
	public  static int show(int no)
	{
		return no*no;
	}
}
		