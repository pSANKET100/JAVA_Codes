import java.util.*;
public class TriangleValidApp
{	
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int angle1,angle2,angle3;
		
		System.out.println("Enter first angle :");
		angle1 = sc.nextInt();
		System.out.println("Enter second angle :");
		angle2 = sc.nextInt();
		System.out.println("Enter third angle :");
		angle3 = sc.nextInt();
		
		angle1 != 0;
		angle2 != 0;
		angle3 != 0;
		
		if(angle1 + angle2 + angle3 == 180){
			System.out.println("Triangle is valid ");
			}
		else {
			System.out.println("Triangle is not valid ");
			}
	}
} 