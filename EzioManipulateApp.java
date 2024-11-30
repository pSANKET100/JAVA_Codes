import java.util.*;
public class EzioManipulateApp
{
	public static void main(String args[])
	{		
		Scanner sc = new Scanner(System.in);
		int guards,place;
		
		System.out.println("Enter no of guards :");
		guards = sc.nextInt();
	        System.out.println("Enter place :");
		place = sc.nextInt();
		
		if(guards > place){
			System.out.println("YES");
			}
		else if (guards == place){
			System.out.println("YES");
			}
		else{
			System.out.println("NO");
			}
	}
}
			