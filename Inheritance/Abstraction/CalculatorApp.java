import java.util.Scanner;

class Operation{
	int a, b;
	void setValues(int a, int b){
		this.a=a;
		this.b=b;
	}
	int getResult(){
		System.out.println("I am method from parent class");
		return 0;	
	}
}
class Add extends Operation{
	int getResult(){
		return a+b;
	}
}
class Mul extends Operation{
	int getResult(){
		return a*b;
	}
}
class Sub extends Operation{
	int getResult(){
		return a-b;
	}
}
class Div extends Operation{
	int getResult(){
		return a/b;
	}
}
class Calculator{
	void performOperation(Operation a){
		System.out.println("Result : " + a.getResult());
	}
}
class CalculatorApp{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in); 
		Operation v =null;
		Calculator c = new Calculator();
		System.out.println("Enter two numbers :");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		while(true){
			
			System.out.println("1.Addition ");
			System.out.println("2.Multiplication ");
			System.out.println("3.Division ");
			System.out.println("4.Substraction ");
			System.out.println("5.Exit.... ");

		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
	
		switch(choice){
			
			case 1:
				v=new Add();
				break;

			case 2:
				v=new Mul();
				break;

			case 3:
				v=new Div();
				break;
	
			case 4:
				v=new Sub();
				break;
		
			case 5: 
				System.out.print("The end");
				return;

			default:
				System.out.println("Invalid choice");
				continue;
			}

			v.setValues(no1,no2);
			c.performOperation(v);
		}

	}
}
