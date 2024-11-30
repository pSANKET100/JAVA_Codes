import java.util.*;
public class HolloRectangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int i,j,n,m;
		System.out.println("Enter numbers ");
		n = sc.nextInt();
		m = sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=m;j++){
		
					if(i==1 || j==1 || i==n || j==m){
						System.out.print("*");
							}
					else{
						System.out.print(" ");
							}
			}
	
		System.out.println();
		}				
	}
}
				
			