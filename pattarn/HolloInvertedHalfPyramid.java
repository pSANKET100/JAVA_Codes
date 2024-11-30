public class HolloInvertedHalfPyramid
{
	public static void main(String args[])
	{
		int i,j,no=1;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++){
					if(j==1 || i==1 || j==6-i){
						System.out.print(j+" ");
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