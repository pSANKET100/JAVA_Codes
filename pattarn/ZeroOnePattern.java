public class ZeroOnePattern
{
	public static void main(String args[])
	{
		int i,j,no=1;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++){
			if(j<=i){
				if(i % 2 != 0){
					System.out.print("0");
					no++;
					}
				else{
					System.out.print("1");
					no++;
					}
				}
				}
				System.out.println();
			}
	}
}
		