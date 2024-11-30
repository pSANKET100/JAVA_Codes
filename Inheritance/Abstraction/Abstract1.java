import java.util.*;
abstract class num
{
	int n;
	void setNum(int n){
		this.n=n;
		}
	abstract int getResult();
}
class revNumber extends num
{
	int getResult()
	{
		int rev=0, rem;
		while(n!=0){
			rem= n%10;
			rev= rev*10+rem;
			n=n/10;
			}
		return rev;
	}
}
class CountDigit extends num
{
	int getResult()
	{	
		int count=0;
		while(n!=0){
			n = n/10;
			count++;
			}
		return count;
	}
}
public class Abstract1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number for reverse : ");
		int no=sc.nextInt();
		
		revNumber r1=new revNumber();
		r1.setNum(no);
		int result = r1.getResult();
		System.out.println("Reverse number is :"+result);	
		CountDigit c1=new CountDigit();
		c1.setNum(no);
		result = c1.getResult();
		System.out.println("Number count is : "+result);
	}
}