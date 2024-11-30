class CheckChar
{
	private char ch;
	
	public void setChar(char c){
		this.ch = c;
		}
		
	public Boolean checkChar(){
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
			return true;
			}

		else if(ch >= '0' && ch <= '9'){
			return true;
			}
		else{
			return false;
			}
	}
}
public class CheckApha
{
	public static void main(String args [] )
	{
		CheckChar ch1 = new CheckChar();
		
		ch1.setChar('&');
		System.out.println("this character is : " +ch1.checkChar());
	}
}