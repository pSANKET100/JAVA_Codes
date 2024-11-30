import java.util.*;
class Duck
{
	Scanner sc=new Scanner(System.in);
	int n;
	void setNo()
	{
		System.out.println("Enter any number :");
		n = sc.nextInt();
	}
	boolean isShow()
	{
		int rem;
		Boolean flag = false;
		while(n>0){
			rem = n %10;
			n = n/10;
			if(rem == 0){
				flag = true;
				break;
			}
		}
		return flag;
	}
}
public class DuckNumberApp
{
	public static void main(String args[])
	{
		Duck d1 = new Duck();
		d1.setNo();
		boolean flag = d1.isShow();
		if(flag){
			System.out.println("This number is duck ");
			}
		else{
			System.out.println("This number is NOT duck ");
			}
	}
}
	