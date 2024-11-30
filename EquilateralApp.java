import java.util.*;
public class EquilateralApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int angle1,angle2,angle3;
		System.out.println("Enter first angle :");
		angle1 = sc.nextInt();
		System.out.println("Enter second angle :");
		angle2 = sc.nextInt();
		System.out.println("Enter third angle :");
		angle3 = sc.nextInt();

		if(angle1 == angle2 && angle2 == angle3 && angle1 == angle3){
			System.out.println("This is equilateral triangle ");
			}
		else{
			System.out.println("not equilateral triangle ");
			}
	}
}
			
