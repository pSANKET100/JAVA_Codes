import java.util.*;
abstract class Value
{
	int a,b;
	void setValues(int x, int y){
		a=x;
		b=y;
	}
	abstract void performCalculation();
}
class Add extends Value
{
	void performCalculation(){
		int add = a+b;
		System.out.println("Addition is : "+add);
	}
}

class Mul extends Value
{
	void performCalculation(){
		int mul = a*b;
		System.out.println("Multiplication is : "+mul);
	}
}

class Div extends Value
{
	void performCalculation(){
		int div = a/b;
		System.out.println("Division is : " +div);
		}
}
class Sub extends Value
{
	void performCalculation(){
		int sub = a-b;
		System.out.println("Substraction is : "+sub);
		}
}

class Calculator
{
	void performOperation(Value v){
		v.performCalculation();
		}
}

public class LooseCouplingApp
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in); 

		System.out.println("Enter two numbers :");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		Value v=null;
		int choice ;
		
		do{
			
			System.out.println("1.Addition ");
			System.out.println("2.Multiplication ");
			System.out.println("3.Division ");
			System.out.println("4.Substraction ");
			System.out.println("5.Exit.... ");

		System.out.print("Enter your choice : ");
		choice = sc.nextInt();

		Calculator c=new Calculator();
	
		switch(choice){
			
			case 1:
				v=new Add();
				v.setValues(no1,no2);
				c.performOperation(v);
				break;

			case 2:
				v=new Mul();
				v.setValues(no1,no2);
				c.performOperation(v);
				break;

			case 3:
				v=new Div();
				v.setValues(no1,no2);
				c.performOperation(v);
				break;
	
			case 4:
				v=new Sub();
				v.setValues(no1,no2);
				c.performOperation(v);
				break;
			case 5: 
				break;				
			}
		}while(choice!=5);
	}
}	
				
	
		

				
		
		
			