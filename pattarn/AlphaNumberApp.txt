public class AlphaNumberApp
{
	public static void main(String args[])
	{
		int i,j,no=1,ch=65;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++){
				if(i%no != 0){
					System.out.print(no" ");
					}no++
				else{
					System.out.print((char)ch" ");
					}ch++
				}
				System.out.println();
			}
	}
}