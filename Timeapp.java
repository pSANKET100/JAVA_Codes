import java.util.*;
public class Timeapp
{
	public static void main (String args[])
		{
			Scanner sc = new Scanner(System.in);
			int min,sec,hours,rem;
			System.out.println("Enter second");
			sec = sc.nextInt();
			rem = sec % 3600;
			hours = sec /3600;
			min = rem / 60;
			rem = rem % 60;
			System.out.print(hours+"hrs:"\n+min+"minutes:"\n+rem+"seconds");
		}
}			
			
			