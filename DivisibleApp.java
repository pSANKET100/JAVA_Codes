import java.util.*;
public class DivisibleApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("Enter number : ");
		no = sc.nextInt();
		String result = no%5 == 0 && no%11 == 0 ?"number is divisible":"number is not divisible";
		System.out.println(result);
	}
}

		
