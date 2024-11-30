import java.util.*;
public class AnagramCharInt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		char c[] = new char[5];
		char d[] = new char[5];
		
		System.out.println("Enter five Interger Elements :");
		for(int i=0; i<a.length; i++){	
                        a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			}
			if(a.length == b.length){
				
			boolean result = anagramApp(a,b);
			if(result){
				System.out.println("Array is anagram ");
				}
			else{
				System.out.println("Array is not anagram ");
				}
			}
			else{
				System.out.println("length are not same ");
				}

		}
		public static boolean anagramApp(int a[],int b[]){
			boolean flag = false;
			for(int i=0; i<a.length; i++){
				for(int j=0; j<b.length; j++){

					if(a[i] == b[j]){
						flag = true;
						break;
					}
				}
			}
			return flag;
		}
	}
		
						
						
				
		
					
				
		
			
		
				
			