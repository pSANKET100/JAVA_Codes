import java.util.*;
public class AtmApp
{
	public static void main (String args[])
	{
		Scanner sc = new  Scanner(System.in);
		double amount,balance;

		System.out.println("Enter amount :");
		amount = sc.nextDouble();
		System.out.println(" Your Balance is :");
		balance = sc.nextDouble();
		
		if (amount > balance){
			System.out.println("insufficient fund");
			}
		else if (amount % 5 != 0){
				System.out.println("Incorrect Withdrawal Amount (not multiple of 5)");
			}
		else {
				balance = balance - 00.5;
				balance = balance - amount;
				System.out.println("current balance is :"+balance);
				}
		}
}
