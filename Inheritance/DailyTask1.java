import java.util.*;
class ArrParent
{
	int a[];
	void setArray(int a[]){
		this.a=a;
		}
}
class Sort extends ArrParent 
{
	int [] getSortedArray(){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length; j++){
				if(a[i] < a[j]){
					int temp = a[i];
					    a[i] = a[j];
					    a[j] = temp;
					    }
				       }
				}
			return a;
				
		}
}
class Max extends ArrParent
{
	int getMax(){
		int max = a[0];
		for(int i=0; i<a.length; i++){
				if(a[i] > max){
				max = a[i];	
				}
		}
		return max;
			
		}
}
class Min extends ArrParent
{
	int getMin(){	
		int min = a[0];
		for(int i=0; i<a.length; i++){
				if(a[i] < min){
				min = a[i];	
				}
		}
		return min;

		}
}

public class DailyTask1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		
		System.out.println("Enter elments : ");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}

		Sort s1=new Sort();
		s1.setArray(a);
		int result [] =  s1.getSortedArray();
		System.out.println("After sorted array ");
		for(int i=0; i<result.length; i++){
		System.out.println(result[i]);
		}
	
		Max m1=new Max();
		m1.setArray(a);
		int max = m1.getMax();
		System.out.println("Max value is : "+max );

		Min m2=new Min();
		m2.setArray(a);
		int min = m2.getMin();
		System.out.println("Min value is : "+min );
	}
}

		

		