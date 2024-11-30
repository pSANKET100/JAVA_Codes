class Value
{ 
	int a,b;
	void setValue(int x,int y){
		a=x;
		b=y;
		}
}
class Add extends Value
{
	int getAdd(){
		return a+b;
		}
}
class Mult extends Value
{
	int getMult(){
		return a*b;
		}
}
public class IntApp
{
	public static void main(String args[])
	{	
		Add a1 = new Add();
		a1.setValue(10,20);
		int result = a1.getAdd();
		System.out.println("addition is " +result);
		
		Mult m1 = new Mult();
		m1.setValue(5,6);
		 result = m1.getMult();
		System.out.println("Multiplication is "+result);
	}
}