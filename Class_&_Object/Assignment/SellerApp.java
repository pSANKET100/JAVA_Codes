import java.util.*;
class Seller
{
	int sp,cp;
	void acceptSellingCostPrice(int sellerprice, int costprice){
		sp = sellerprice;
		cp = costprice;
		}
	void showProfitLoss(){
		if(sp > cp ){
			System.out.println("profit");
			}
		else if(sp < cp){
			System.out.println("loss");
			}
		else{
			System.out.println("No profit No loss");
			}
		}
}

public class SellerApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter seller price : ");
			int sp = sc.nextInt();
			
		System.out.print("Enter cost price : ");
			int cp = sc.nextInt();

		Seller s1=new Seller();

		s1.acceptSellingCostPrice(sp,cp);
	
		s1.showProfitLoss();
	}
}
		
		

		