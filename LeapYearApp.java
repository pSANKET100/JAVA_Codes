import java.util.*;
public class LeapYearApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter year :");
		year =  sc.nextInt();
	
		if (year%4==0){
			System.out.println("year is leap :");
			}
		else {
			System.out.println("year is ordinary :");
			}
	}
}
 		