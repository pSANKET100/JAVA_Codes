import java.util.*;
public class TableApp
{
	static int count = 1;
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int no;
		System.out.println("Enter any Number :");
		no = sc.nextInt();
		
		showTable(no);
	}
	public static void showTable(int x){
		if(count<=10){
			System.out.println(count * x);
			++count;
		showTable(x);
		}
	}
}