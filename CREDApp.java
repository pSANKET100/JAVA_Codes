import java.util.*;
public class CREDApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int creditscore;
		System.out.println("Enter your creditscore :");
		creditscore = sc.nextInt();
		
		if(creditscore >= 750){
			System.out.println("YES");
			}
		else{
			System.out.println("NO");
			}
	}
}