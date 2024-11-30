public class NumberDiamond
{
	public static void main (String args[])
	{
		int i,j;
		for(i=1;i<=5;i++){
			int row = 1;
			for(j=1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					System.out.printf("%d",row);
						if(j<=5){
							++row;
							}
						else{
							--row;
							}
						}
					else{
						System.out.print(" ");
						}
					}
					System.out.println(" ");
				}
		}	
}