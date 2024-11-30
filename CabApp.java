import java.util.*;
public class CabApp
	{
		public static void main(String args[])	
		{
			Scanner sc=new Scanner (System.in);
			int cab1,cab2;
			System.out.println("Enter caps service prize :");
			cab1 =  sc.nextInt();
			cab2 =  sc.nextInt();

			if(cab1 < cab2){
				System.out.println("First service is cheaper ");
				}
			else if(cab1 > cab2){	
				System.out.println("Second service is cheaper ");
				}

			else{
				System.out.println("any");
				}
		}
}