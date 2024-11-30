public class LeftArrow
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=9;j++){
				if(j==6-i || i==5 ||i==j+4){
					System.out.print("*");
					}
				else{
					System.out.print(" ");
					}	
				}
				System.out.println();
			}
	}
}