import java.util.*;
public class CeilFloor
{
	public static void main(String args[])
	{
		int a[] = {1,5,7,2,3};	
		int floor=0, ceil = 0;	
		for(int i=0; i<=10; i++){
		for(int j=0; j<a.length; j++){
			if(a[j] > i){
			floor = -1;
			ceil = a[j];
			break;
			}
		else if(a[a.length-1] < i){
			floor = a[a.length-1];
			ceil = -1;
			break;
			}
		else if(a[j] == i){
			floor = a[j];
			ceil = a[j];
			break;
			}
		else if(a[j]<i && a[j+1]>i){
			floor = a[j];
			ceil = a[j+1];
			break;
			}
		}
		System.out.println("Number is : " +i+ " floor is : " +floor+ " ceil is : " +ceil);
		}
	}
}

