public class NumberHalfPyramid
{
	public static void main(String args[])
	{
		int i,j,no=1;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++){
				if(j<=i){
					System.out.print(j);
					no++;
					}
				else{
					System.out.print(" ");
					}
				}
				System.out.println();
			}
	}
}