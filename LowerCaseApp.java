import java.util.*;
public class LowerCaseApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		char ch;
		System.out.println("Enter any character :");
		ch = sc.nextLine().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z' ) {
			ch = (char)(ch + 32);
			System.out.println("Lowercase is = "+ch);
			}
		elseif(ch >= 'a' && ch <= 'z'){
			ch = (char)(ch - 32);
			System.out.println("Uppercase is = "+ch);
			}
		else {
			System.out.println("Not both ");
			}
	}
}
			