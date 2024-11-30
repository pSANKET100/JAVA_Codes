import java.util.*;
public class Uppercase
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter any Alphabets");
		ch = sc.next().charAt(0);
		String result = (ch >= 'A' && ch <='Z')? "This is capital":"This is small";
		System.out.println(result);
	}
}