import java.util.*;
public class TrinvalidApp
{
	public static void main(String args[])		
	{\
		Scanner sc = new Scanner(System.in);
		int angle1,angle2,angle3;
		System.out.println("Enter the angles");
		angle1 = sc.nextInt();
		angle2 = sc.nextInt();
		angle3 = sc.nextInt();
		String result = angle1 + angle2 + angle3 == 180 ? "Tringle is valid ":"Tringle is not valid";
		System.out.println(result);
	}
}
		