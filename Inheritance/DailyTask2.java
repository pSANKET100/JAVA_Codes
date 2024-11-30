import java.util.*;
class charArray
{
	char ch[];
	void setCharArray(char ch[]){
		this.ch=ch;
		}
}
class CovertToUpper extends charArray
{
	void convertToUpperCase(){
		for(int i=0; i<ch.length; i++){
			if(ch[i] >= 'a' && ch[i]  <= 'z'){
				ch[i] -= 32;
				}
				System.out.println(ch[i]+" ");
			}
		}
}
class RevCharArr extends charArray
{
	void revCharArray(){
		int left = 0;
		int right = ch.length-1;
		while(left < right){
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			right --;
			left ++;
			}
			for(int i=0; i<ch.length; i++){
				System.out.println( ch[i]+" ");
				}
		
		}
}
class FindCapitalLetters extends charArray
{
	void findUpperCaseLetter(){
		for(int i=0; i<ch.length; i++){
			if(ch[i] >= 'A' && ch[i] <= 'z'){
				System.out.println(ch[i] +" ");
				}
			} 
		}
}

public class DailyTask2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size of character array : ");
		int size =  sc.nextInt();
		
		char a[] = new char [size];
		
		System.out.println("Enter character elements : ");
		for(int i=0; i<a.length; i++){
			a[i] = sc.next().charAt(0);
			}
	
		
		CovertToUpper cc=new CovertToUpper();
		cc.setCharArray(a);
		System.out.println("After converted Upper case :");
		cc.convertToUpperCase();

		RevCharArr rr=new RevCharArr();
		rr.setCharArray(a);
		System.out.println("After reversed :");
		rr.revCharArray();

	
		FindCapitalLetters ff= new FindCapitalLetters();
		ff.setCharArray(a);
		System.out.println("capital letters is :");
		ff.findUpperCaseLetter();

	}
}
	


	
	
		