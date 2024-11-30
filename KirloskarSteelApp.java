import java.util.*;
public class KirloskarSteelApp
{
	public static void main(String arge[])
	{
		Scanner sc = new Scanner (System.in);
		double hr,cc,ts;
		System.out.println("Enter tr");
		hr = sc.nextDouble();
		System.out.println("Enter cc");
		cc = sc.nextDouble();
		System.out.println("Enter ts");
		ts = sc.nextDouble();
		String result = ((hr >50 && cc < 0.7) && ts > 5600)?"Grade is 10":
   				(hr > 50 && cc < 0.7) ?"Grade is 9":
				(cc < 0.7 && ts > 5600) ?"Grade is 8":
				(hr > 50 && ts > 5600 ) ? "Grade is 7":
				((hr >50 || cc < 0.7) || ts > 5600) ?"Grade is 6":"Grade is 5";
				
		System.out.println(result);
	}
}
		
		
		
