class Factorial 
{
	private int x;
	void setValue(int x){
		this.x=x;
		}
	int getFactorial(){
		int result = 1;
		for(int i=1; i<=x; i++){
		result = result * i;
		}
		return result;
	}
}
public class FactorialApp
{
public static void main(String args[])
{
	Factorial f1=new Factorial();
	f1.setValue(5);
	System.out.println("Factorial is :"+f1.getFactorial());
}
}