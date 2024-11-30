import java.util.*;
public class VowelApp
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in)
		char ch ;
		System.out.println("Enter any character");
		ch = sc.next().charAt(0);
		String result = (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'||				 
				 ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'|| 
				?" Vowels":(ch >='a' && ch <= 'z'||ch >= 'A' && ch <='Z')	
				?"constnant";
		System.out.println(result);
	}
}