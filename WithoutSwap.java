public class WithoutSwap
{
	public static void main(String args[])
		{
			int a,b;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			System.out.println("Before swapping = "+a);//10
			System.out.println("Before swapping = "+b);//20
			a=a+b;//10+20=30
			b=a-b;//30-20=10(b)
			a=a-b;//30-10=20(a)
			System.out.println("After swapping = "+a);
			System.out.println("After swapping = "+b);
		}
}