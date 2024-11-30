import java.util.*;
class cricle
{
	private float radius;
	void setRadius(float radius){
		this.radius= radius;
		}
	void showArea(){
		float area = (float)(Math.PI * radius *radius);
		System.out.println("Cricle of area is :"+area);
		}
}
public class cricleRadius
{
	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	
	cricle c1=new cricle();
	
	c1.setRadius(5);
	
	c1.showArea();
	
	}
}
	
		