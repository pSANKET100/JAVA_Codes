import java.util.*;
public class HappyNumApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no,rem,sum = 0,sqr,sqr1;
		boolean flag = false;
		System.out.println("Enter any number :");
		no = sc.nextInt();
		
		while(no != 0){
			rem = no % 10;
			sqr = rem*rem;
			no = no / 10;
			sqr1 = no * no;
			sum = sqr + sqr1;


			if(sum == 1){
				flag = true;
				}
			}

			if(flag){
				System.out.println("Number is happy");
				}
			else{
				System.out.println("Number is not happy");
				}
	}
}