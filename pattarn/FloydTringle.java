public class FloydTringle
{
	public static void main(String args[])
	{
		int n=5;
		int row=1;
		for(int i=1; i<=n; i++){
		for(int j=1; j<=n; j++){	
			if(j<=i){
				System.out.print(row+" ");
				row++;
				}
			else{
				System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}
		