import java.util.*;
public class ASCIIvalue
{
	public static void main (String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the char");
		        char l = sc.next().charAt(0);
			int asciiValue = (int)l;
			System.out.println("asccivalue is = "+asciiValue);
			sc.close();
			
		}
}
