import java.util.*;
class  Factorial
{
	Scanner sc = new Scanner(System.in);
	int fact=1,n;
	void noShow(){
		System.out.println("Enter any number :");
		n = sc.nextInt();
		}
	void resultShow(){
		for(int i=1; i<=n; i++){
			fact = fact*i;
			}
			System.out.println("Factorial of number is :  "+fact);
		}
}
public class FactorialApp
{
	public static void main(String arga[])
	{
		Factorial f1 = new Factorial();
		f1.noShow();
		f1.resultShow();
	}
}
		