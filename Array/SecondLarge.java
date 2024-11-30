import java.util.*;

public class SecondLarge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter five elements:");

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
	for(int i=0; i<a.length; i++){
		for(int j=i+1; j<a.length; j++){
		int temp = 0;
			if(a[i] < a[j]){
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			}
		}
	}
    System.out.println("Second largest elements is:");
	int count = 1;
	for(int i=0; i<a.length-1; i++){
		if(a[i] != a[i+1]){
			count++;
			}
		if(count == 2){
			System.out.println(a[i+1]);
			}
		}
    }
}	