public class NumberPattern
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=7;i++){
			int row=1;
			for(j=1;j<=7;j++){
				if(i>=j){
					System.out.printf("%d ",row);
						row = row*(i-j)/j;
						}
				else{
					System.out.printf(" ");
					}
				}
				System.out.println();
			}
	}
}

				