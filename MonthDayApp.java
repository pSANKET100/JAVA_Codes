import java.util.*;
public class MonthDayApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int month;
		System.out.println("Enter month number :");
		month = sc.nextInt();
	
		switch(month)
		{
			case 1:
			System.out.println("January");
			System.out.println("Total number of days is 31");
			break;
			
			case 2:
			System.out.println("Fabruary");
			System.out.println("Total number of days is 28");
			break;
			
			case 3:
			System.out.println("March");
			System.out.println("Total number of days is 31");
			break;
		
			case 4:
			System.out.println("April");
			System.out.println("Total number of days is 30");
			break;
			
			case 5:
			System.out.println("May");
			System.out.println("Total number of days is 31");
			break;
		
			case 6:
			System.out.println("June");
			System.out.println("Total number of days is 30");
			break;
	
			case 7:
			System.out.println("Jully");
			System.out.println("Total number of days is 31");
			break;
		
			case 8:
			System.out.println("August");
			System.out.println("Total number of days is 31");
			break;

			case 9:
			System.out.println("September");
			System.out.println("Total number of days is 30");
			break;
	
			case 10:
			System.out.println("October");
			System.out.println("Total number of days is 31");
			break;
		
			case 11:
			System.out.println("November");
			System.out.println("Total number of days is 30");
			break;

			case 12:
			System.out.println("December");
			System.out.println("Total number of days is 31");
			break;
		
			default:
			System.out.println("wrong choice");
			break;
		}
	}
}
			