import java.util.*;
public class DuckNumApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no,rem;
		boolean flag = false;
		System.out.println("Enter any number : ");
		no = sc.nextInt();

		while(no != 0){
			rem = no%10;
			no = no/10;
			if(rem == 0){
				flag = true;
				break;
			}	
		}
		if(flag){
			System.out.println("Number is duck ");
			}
		else{
			System.out.println("Number is not duck ");
			}
	}
}
  			
			
			
			
			
		