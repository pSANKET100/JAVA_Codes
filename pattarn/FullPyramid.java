public class FullPyramid
{
	public static void main(String args[])
	{
		int i,j;
		boolean flag = true;
		for(i=1;i<=5;i++){
			for(j=1;j<=9;j++){
				if(j>=6-i && j<=4+i && flag){
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