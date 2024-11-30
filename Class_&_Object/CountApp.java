class Count
{
	int n,rem,count = 0;
	void setValue(int no){
		n=no;
		}
	void getDigitCount(){
	while(n!=0){
		 n = n/10;
		 count++;
		}
		System.out.println(count);
	}
}
public class CountApp 
{
	public static void main(String args[])
	{
		Count c1 = new Count();
		c1.setValue(100);
		c1.getDigitCount();
	}
}
		
		
		