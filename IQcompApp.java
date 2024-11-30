import java.util.*;
public class IQcompApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int IQ;
		System.out.println("Enter IQ :");
		IQ = sc.nextInt();
		
		if(IQ + 7 >= 170){
			System.out.println("Yes");
			}
		else{
			System.out.println("NO");		
			}
	}
}
		