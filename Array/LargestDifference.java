import java.util.*;

public class LargestDifference {
    public static void main(String args[]) {
        int max = 0, sub = 0; 
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        
        System.out.println("Enter any array:");
        for (int i = 0; i < a.length; i++) {    
            a[i] = sc.nextInt();
        }

        System.out.println("The Maximum difference between two elements in the array is:");

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    sub = a[j] - a[i];
                    if (sub > max) {
                        max = sub; 
                    }
                }
            }
        }

        System.out.println(max);
    }
}