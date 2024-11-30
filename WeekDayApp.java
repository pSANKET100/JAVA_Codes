import java.util.*;
public class WeekDayApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice(1 to 7) :");
		choice = sc.nextInt();
		
		switch(choice){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thrusday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Sat");
			break;
			case 7:
			System.out.println("Sunday");
			break;
			default : 
			System.out.println("wrong choice");
			break;
		}
	}
}
		
		
		