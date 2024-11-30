import java.util.*;
class Per
{
	int m[];
	void setMarks(int marks[]){
		m =  marks;
		}
}
class Nine extends Per
{
	void showNineper(){
		 double per =0;
		double total = 0;
		for(int i=0; i<m.length; i++){
			total = total + m[i];
		        per = (total / (m.length*100) )*100;
			}
		System.out.println("Ninth class percentage is : "+per);
		}
		
}
class Ten extends Per
{
	int m[];
	void setMarks(int marks[]){
		m =  marks;
		}
		void showTenper(){
			for(int i=0; i<m.length; i++){
				for(int j=0; j<m.length; j++){
				if(m[i] > m[j]){
					int temp = m[i];
					    m[i] = m[j];
					    m[j] = temp;
						}
					}
				
		             }
		double per =0;
		double total = 0;
		for(int i=0; i<m.length-1; i++){
			total = total + m[i];
		        per = (total / ((m.length-1)*100))*100;
			}
		System.out.print("Tenth class percentage is : "+per);

		}
			
}
public class OverridingPer
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int[6];
		
		System.out.println("Enter elements of array :");
		for(int i=0; i<a.length; i++){
			a[i]= sc.nextInt();
			}
		
		Nine n1= new Nine();
		n1.setMarks(a);
		n1.showNineper();
	
		Ten t1 = new Ten();
		t1.setMarks(a);
		t1.showTenper();
	}
}
		