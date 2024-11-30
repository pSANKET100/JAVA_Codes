import java.util.*;
abstract class pattern
{
	abstract void display();
}
class first extends pattern 
{
	void display(){
		int i,j;

		for(i=1; i<=5; i++){
			for( j=1; j<=5; j++){
				if(i>=j){
					if(i%2!=0){
						System.out.print(" "+(char)(96+j));
						}
					else{
						System.out.print(" "+(char)(64+j));
						}
					}
				}
				System.out.println();
			}

		}
}
public class pattarnApp
{
	public static void main(String args[])
	{
		first f1=new first();
		f1.display();
	}
}