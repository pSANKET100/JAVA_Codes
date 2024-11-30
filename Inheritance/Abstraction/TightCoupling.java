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
	int getResult(){
		return a+b;
		}
}

class Mul extends Value
{
	int getResult(){
		return a*b;
		}
}

class Calculator
{
	void performOperation(Add ad)
	{
		int result = ad.getResult();
		System.out.println("Addition is : "+result);
	}
}

public class TightCoupling 
{
	public static void main(String args[])
	{
		Calculator c = new Calculator ();
		Add ad=new Add();
		ad.setValue(10,20);
		c.performOperation(ad);
				
		Mul m=new Mul();
		m.setValue(5,4);

		
		}
}
