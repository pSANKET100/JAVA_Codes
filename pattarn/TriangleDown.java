public class TriangleDown
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++){
			int no = 1;
			for(j=1;j<=5;j++){
				if(j>=6-i){
					System.out.print(no);
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