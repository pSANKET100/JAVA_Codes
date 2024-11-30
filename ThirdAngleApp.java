import java.util.*;
public class ThirdAngleApp
{
	public static void main (String args[])
	{
		Scanner sc =new Scanner (System.in);
		int angle1,angle2,angle3;
		System.out.println("Enter first angle :");
		angle1 = sc.nextInt();
		System.out.println("Enter second angle :");
		angle2= sc.nextInt();
	
		if(angle1 > 0 && angle2 > 0 && angle1 + angle2 < 180 ){
			angle3 = 180 - (angle1 + angle2);
			System.out.println("Third angle is :"+angle3);
			}
		else {
			System.out.println("tringle is not valid");
			}
	}	
}
			