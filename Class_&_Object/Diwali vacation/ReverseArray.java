class Reverse
{
	private int array[];
	
	public void setArray(int a[]){
		array = new int[a.length];
		for(int i=0; i<a.length; i++){
			array[i] = a[i];
		}
	}
	
	public int[] getSortArray(){
		if(array == null || array.length == 0){
			return new int[0];
		}
		
		int n = array.length;
		for(int i=0; i < n/2; i++){
			int temp = array[i];
			array[i] = array[n-i-1];
			array[n-i-1] = temp;
		}
	
	for(int i=0; i<n-1; i++){
		for(int j=0; j<n-1-i; j++){
			if(array[j] > array[j + 1]){
				int temp = array[j];
				array[j] = array[j+1];
				array[j+1] =temp;
				}
			}
		}
	return array;
	}
}
public class ReverseArray
{
	public static void main(String args[])
	{
		Reverse r1=new Reverse();
		
		int [] sampleArray = {5,6,9,4,2,8};
	
		r1.setArray(sampleArray);
	
		int[] sortedReverseArray = r1.getSortArray();
		
		System.out.println("Sorted Reversed array :");
		
		for(int i=0; i<sortedReverseArray.length; i++){
			System.out.println(sortedReverseArray[i] + " ");
		}
	}
}
			
		
		