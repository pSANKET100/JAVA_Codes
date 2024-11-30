public class swapping
{
	public static void main(String args[])
	{
		int a,b,c;
		a = Integer.parseInt(args[0]);//10
		b = Integer.parseInt(args[1]);//20
		System.out.println("Before swapping a="+a);//10
		System.out.println("Before swapping b= "+b+"\n");//20
		c=a; //c=10
		a=b; //a=20
		b=c; //b=10
		System.out.println("After swapping a= "+a);
		System.out.println("After swapping b= "+b);
	}
}