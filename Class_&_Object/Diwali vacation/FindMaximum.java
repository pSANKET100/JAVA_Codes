class FindMax
{
	private int max[];
		
	public void setArray(int a[]){
		max = new int[a.length];	
		for(int i=0; i<a.length; i++){
		max[i] = a[i];
		}
	}
	public int getMax(){
		int array = max[0];
		for(int i=1; i<max.length; i++){
			if(max [i] > array){
			array = max[i];
			}
		}
		return array;
	}
}
public class FindMaximum
{
	public static void main(String args[])
	{
		FindMax f1 = new FindMax();
		int [] simpleArray = {1,8,5,6,9,2};
		
		f1.setArray(simpleArray);
		
		System.out.println("Maximum number is : " +f1.getMax());
	}
}
		
		