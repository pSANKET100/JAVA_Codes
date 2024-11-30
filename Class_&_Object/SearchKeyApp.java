class Search
{
	int n;
	void setNum(int no){
		n=no;
		}
	Boolean isPresent(int skey){
		int temp = n;
		boolean flag = false;
		while(temp != 0){
			int digit = temp%10;
			if(digit == skey){
			flag = true;
			break;
			}
		}
		return flag;
	}
}
public class SearchKeyApp
{
	public static void main(String args[])
	{
		Search s1 = new Search();
		s1.setNum(12345);
		boolean flag = s1.isPresent(5);
		if(flag){
			System.out.println("Found key");	
			}
		else{
			System.out.println("Not found key");	
			}
	}
}		
			
		
		
		
