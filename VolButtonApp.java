import java.util.*;
public class VolButtonApp
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int crntvol,aftervol,total;
		System.out.println("Enter current volume of is :");
		crntvol = sc.nextInt();
		System.out.println("Enter after pressing button volume :");
		aftervol = sc.nextInt();

		if(crntvol < aftervol){
			total = aftervol - crntvol;
			System.out.println("Increase after press the volume up button "+total);
			}

		else if(crntvol > aftervol){
			total = crntvol - aftervol;
			System.out.println("Decrease after press the volume down button  "+total);
			}
		else{
			System.out.println("not change volume");
			}
	}
}
			