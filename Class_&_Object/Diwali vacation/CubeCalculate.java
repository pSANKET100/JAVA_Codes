import java.util.*;
class Cube
{
	private int x;
	void setValue(int x){
		this.x=x;
		}
	int getCube(){
		return x*x*x;
		}
}
public class CubeCalculate
{
public static void main(String agrs [])
{
	Cube c1=new Cube();
	c1.setValue(3);
	System.out.println("Cube is :" +c1.getCube());
	
    }
}
	