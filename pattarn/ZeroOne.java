public class ZeroOne
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++){
				if(j==1 || j==2){
					System.out.print("0");	
					}
				else{
					System.out.print("1");
					}
				}
				System.out.println();
			}
	}
}