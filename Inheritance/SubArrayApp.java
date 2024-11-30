import java.util.*;
class ArrayParent
{
	int a[];
	void setArray(int a[]){
		this.a=a;
	}
}
class SubArray extends ArrayParent
{	
	int start , end;
	void setIndexes(int start , int end){
		this.start = start;
		this.end = end;
		}

	int [] getSubArray(){ 
		int size = 0;
		int arr[];
		for(int i=0; i<a.length; i++){
			if(start >= a.length){	
				System.out.println("invalid entry ");
				break;
				}
			else if(i >= start && i <= end){
				size++;
				}
			}	

		        arr = new int[size];
			int index = 0;
			for(int i=0; i<a.length; i++){
				if(start > a.length - 1){
					System.out.println("invalid entry");
					break;	
					}
				else if(i >= start && i <= end){
					arr[index] = a[i];
					index++;
				}	
			} 
			return arr;
		}
}
class FindSumSubArray extends ArrayParent 
{	
	int value;
	void setValue(int value){
		this.value = value;
		}

	int[] getSubArray(){
		int count = 0;
		for(int i=0; i<a.length; i++){
			for(int j=i; j<a.length; j++){

				count = count + a[j];
		
				if(count ==  value){
					int size = j - i + 1;
					int[] subArray  = new int [size];
					for(int k=0; k < size; k++){
						subArray[k] = a[i+k];
						}
					return subArray;
					}
				}
			}
			return null;
		}
}

public class SubArrayApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		System.out.println("Enter elements of the array : ");

		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}

		System.out.println("Enter Start and end index : ");

			int start = sc.nextInt();
			int end  = sc.nextInt();
	

		SubArray  s1 = new SubArray ();
		s1.setArray(a);
		s1.setIndexes(start , end);
		int result[] = s1.getSubArray();
		System.out.println("Sub array is ");
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
			}

		System.out.println("Enter value what you want too check");
			int value = sc.nextInt();
		
		FindSumSubArray f1 = new FindSumSubArray();
		f1.setArray(a);
		f1.setValue(value);
		int resultSum[] = f1.getSubArray();

			if(resultSum != null){
				System.out.println("Sub value is ");
				for(int i=0; i<resultSum.length; i++){
					System.out.println(i+" ");
					}
				}
			else{
				System.out.println("not subarray found");
				}
	}
}
		
		

