import java.util.*;
public class Switch1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int i,n;
		System.out.println("Enter any number");
		n = sc.nextInt();
		
		switch(n){
		case 1:
			System.out.println("First floor");
			break;
		case 2:
			System.out.println("Second floor");
			break;
		case 3:
			System.out.println("Third floor");
			break;
		default:
			System.out.println("Exit");
			
		}
	}	
}
		