import java.util.*;
class Rectangle
{
	private float len,wid;
	
	void setLengthWidth(float len, float wid){
		this.len=len;
		this.wid=wid;
		}
	void showArea(){
		float area = len * wid;
		System.out.print ("Area of retangle is :"+area );
		}
}
public class RectangleApp
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Rectangle r1=new Rectangle();
		
	System.out.print("Enter length :");
	float len = sc.nextFloat();

	System.out.print("Enter width :");	
	float wid = sc.nextFloat();
		
	r1.setLengthWidth(len,wid);
		
	r1.showArea();
	}
}
	