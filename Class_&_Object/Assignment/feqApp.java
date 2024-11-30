import java.util.*;
class ArrayFeqCount
{
	int c[];
	void setItArray(int ch[]){
		c=ch;
		}
	
	void countFeqCount(){
		
		for(int i=0; i<c.length; i++){
			boolean flag = false;
			for(int j=0; j<i; j++){
				if(c[i] == c[j]){
				flag = true;
				break;
				}
			}

			if(!flag){
				int count = 0;
				for(int j = 0; j<c.length; j++){
					if(c[i] == c[j]){
					count++;
					}
				}
			System.out.println("Elements " + c[i] + " appears " + count +" times ");
			}
			
		} 
	}
}

public class feqApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[] = new int[6];

		System.out.print("Enter six elements : ");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
			
		ArrayFeqCount a1 = new ArrayFeqCount();
			
		a1.setItArray(a);
		a1.countFeqCount();
	}
}