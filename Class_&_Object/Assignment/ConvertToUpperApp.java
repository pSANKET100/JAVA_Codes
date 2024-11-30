import java.util.*;
class ConvertToUpper
{
	char c[];
	void setCharArray(char ch[]){
		c=ch;
		}
	void convertToUpperCase(){
		for(int i=0; i<c.length; i++){
	
		if(c[i] >= 'a' && c[i] <= 'z'){
			c[i]=(char) (c[i]-32);
			}
		System.out.println("Upper case is : "+c[i]);
		}
	}
}
public class ConvertToUpperApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		char ch[]=new char[5];
		
		System.out.println("Enter character :");
		for(int i=0; i<ch.length; i++){
			ch[i] = sc.next().charAt(0);
			}

		ConvertToUpper c1=new ConvertToUpper();
		
		c1.setCharArray(ch);
		
		c1.convertToUpperCase();
	}
}
		