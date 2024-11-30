import java.util.*;
class Table
{
		int no=0;
		Scanner sc=new Scanner(System.in);
		void tableValue(){
		System.out.println("Enter a number :");
			no = sc.nextInt();
			}
		void tableShow(){
		for(int i=1; i<=10; i++){
			System.out.println(no*i);
			}
                }
}
public class TableApp
{
	public static void main(String args[])
	{
		Table p1=new Table();
		p1.tableValue();
		p1.tableShow();
	}
}
			
		