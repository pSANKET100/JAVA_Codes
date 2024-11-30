import java.util.*;
public class SearchKey
{
	static Boolean flag = false;
	public static void main(String args [])
	{
		Scanner sc = new Scanner (System.in);
		int skey,digit;
		System.out.println("Enter any digit :");
		digit = sc.nextInt();
		System.out.println("Enter search key :");
		skey = sc.nextInt();

		boolean flag = skeyDigit(digit,skey);			
		if(flag){
			System.out.println("Digit found ");
			}
		else{
			System.out.println("Digit not found");
			}
		
	}
	public static boolean skeyDigit(int x ,int skey){
		if(x != 0){
			int rem = x % 10;
			
		 if(rem == skey){ 
			flag = true;
			return flag;
			}
			else{ 
				x = x/10;
				return skeyDigit(x,skey);
				}
			}
		else{
			return false;
			}	
		}
}