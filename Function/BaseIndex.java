import java.util.*;
public class BaseIndex
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int base,index;
		System.out.println("Enter base and index :");
		base = sc.nextInt();
		index = sc.nextInt();
		
		showPower(base,index);
		}

		public static void showPower(int base, int index)
		{
			int p=1;		
			for( int i=0; i<index; i++){
				p = p*base;
				}
			System.out.println("power is :"+p);
		}
}