import java.util.*;
class TestArr
{
	int a[],b[];
	void acceptArray(int a[],int b[]){
		this.a=a;
		this.b=b;
		}
}
class Union extends TestArr
{
	void findUnion(){
		int union [] = new int[a.length + b.length];
		int index = 0;
		
		for(int i=0; i<a.length; i++){
			union[index++] = a[i];
			}
		for(int i=0; i<b.length; i++){
			boolean f=true;
			for(int j=0; j<a.length; j++){
				if(b[i] == a[j]){
					f=false;
					break;
					}
				}
			if(f){
				union[index++] = b[i];
			}
		}
		System.out.println("Union array is :");
			for(int i=0; i< index; i++){
				System.out.print(union[i] + " ");
				}
			System.out.println();
	}
}
class Intersection extends TestArr
{
		void findIntersection() {
			System.out.println("Intersion array is :");
			for(int i=0; i<a.length; i++){
				for(int j=0; j<a.length; j++){
					if(a[i] == b[j]){
						System.out.println(a[i] + " ");
						} 
					}
				}
		}

}
class MargeArray extends TestArr
{

	void margeArray(){
		int m[] = new int[a.length + b.length];
		int index = 0;
		
		for(int i=0; i<a.length; i++){
			m[index++] = a[i];
			}
		for(int j=0; j<b.length; j++){
			m[index++] = b[j];
			}
		System.out.println("Marge array is : ");
		for(int i=0; i<m.length; i++){
			System.out.print(m[i] + " ");
			}
		}
		
}
public class OverideArray
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		int b[] = new int[5];
		
		System.out.println("Enter first array elements : ");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}

		System.out.println("Enter second array elements : ");
		for(int i=0; i<b.length; i++){
			b[i] = sc.nextInt();
			}

		Union u1=new Union();
		u1.acceptArray(a,b);
		u1.findUnion();
			
		Intersection I1 = new Intersection();
		I1.acceptArray(a,b);
		I1.findIntersection() ;
		
		MargeArray m1=new MargeArray();
		m1.acceptArray(a,b);
		m1.margeArray();
	}
}
		
		