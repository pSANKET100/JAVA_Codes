class Sum
{
	void calSum(int ...x){
		int sum = 0;
		for(int i=0;  i<x.length; i++){
			sum = sum + x[i];
			}
		System.out.println("sum is : "+sum);
			
		}
}
public class SumApplication
{
	public static void main(String x[])
	{
	     Sum s1= new Sum();
	      			
		s1.calSum(25,96,45,12);
		s1.calSum(155,10);
	}
}
		
		