import java.util.*;

public class RepeatElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter five elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] < 0 || a[i] >= a.length) {
                System.out.println("Out of bound. Please enter a number between 0 and " + (a.length - 1));
                i--;
            }
        }

        int[] count = new int[a.length];
        int maxcount = 0;
        int maxrepeat = -1;

        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxcount) {
                maxcount = count[i];
                maxrepeat = i;
            }
        }

        if (maxrepeat != -1) {
            System.out.println("The maximum repeating element is: " + maxrepeat);
        } else {
            System.out.println("No repeating elements found.");
        }

        sc.close();
    }
}
