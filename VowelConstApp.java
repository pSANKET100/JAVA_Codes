import java.util.*;
public class VowelConstApp
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		char ch;
		System.out.println("Enter any alphabets  :");
		ch = sc.nextLine().charAt(0);

		if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'
                  ||ch == 'A' || ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U' ){
			
			System.out.println("This alphabet is vowel");
			}

		else{		
			System.out.println("This alphabet is constnant");
			}
	}
}