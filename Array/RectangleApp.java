class Rectangle
{	
	int a,b;
	void setLengthWidth(int width, int length){
		int a=width;
		int b=length;
		}
	void showArea(){
		System.out.print("Area of rectangle :" + a * b);
		}
}
		
		
public class RectangleApp
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		r1.setLengthWidth(5,9);
		r1.showArea();
	}
}
	
			