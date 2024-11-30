import java.util.*;
public class ProfitLossApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int costprize,sellprize;
		System.out.println("Enter product cost prize:");
		costprize = sc.nextInt();
		System.out.println("Enter product selling prize:");
		sellprize = sc.nextInt();
		String result = costprize < sellprize?"profit":"loss";
		System.out.println("Product is in :"+result);
	}
}
