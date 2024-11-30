import java.util.*;

public class NeonApp 
{
    public static void main (String args[]) 
	{
        Scanner sc = new Scanner (System.in);
        int sqr, num, sum = 0 ,no;
        System.out.println("Enter number");
        no = sc.nextInt();
        
        sqr = no *  no;
        System.out.println("sqr is : " + sqr);
        
        num = sqr % 10;    // num = 81 % 10 = 1
        sum = num + sum;   // sum = 0 + 1 = 1
        num = sqr / 10;    // num = 81 / 10 = 8
        sum = num + sum;   // sum = 8 + 1 = 9

        String result = (no == sum) ? "neon" : "normal";
        System.out.println("This number is " + result);
        System.out.println("Sum of digit is : " + sum);
        }
}
