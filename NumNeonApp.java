public class NumNeonApp
{
	public static void main(String args[])
	{
		int sum = 0,rem,i,sqr;
		i = 1;
		boolean flag = false;
		while(i<=100){
			sqr = i*i;
			rem = sqr % 10;
			sum = sum + rem;
			sqr = sqr/10;
		        if(sum==i){
			flag = true;
			break;
			}
		i++;
		}
		if(flag){
		System.out.println("neon numbers is :"+i);
			}
	}
}
			
			

		