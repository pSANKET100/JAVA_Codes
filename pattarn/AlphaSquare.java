public class AlphaSquare
{
	public static void main(String args[])
	{
		int ch=65,i,j;
		for(i=0;i<=4;i++){
			for(j=0;j<=4;j++){
				System.out.print((char)(ch+i+j));
				}
			System.out.println();
			}
	}
}