public class PairSum
{
	public static void main(String args[])
	{
		int a[]= {6,8,4,-5,7,9};
		int sum = 15;	
		for(int i=0; i<a.length; i++){
		for(int j=i+1; j<a.length; j++){
			if(a[j] == sum-a[i]){
				System.out.println(i+","+j);
				}
		}
		}
	}
}