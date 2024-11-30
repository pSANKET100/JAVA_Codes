public class InvertedFullPyramid
{
	public static void main(String args[])
	{
		int i,j;
		Boolean flag = true;
		for(i=1;i<=6;i++){
			for(j=1;j<=11;j++){
				if(j>=i && j<=10-i && flag){
					System.out.print("*");
					flag = false;
					}
				else{	
					System.out.print(" ");
					flag = true;
					}
				}
				System.out.println();
			}
	}
}