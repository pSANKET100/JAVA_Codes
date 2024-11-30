import java.util.Scanner;

public class MonkeyFeeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total number of monkeys, bananas, peanuts, and the amounts each monkey can eat
        System.out.print("Enter total number of monkeys (n): ");
        int n = sc.nextInt();
        System.out.print("Enter total number of bananas (m): ");
        int m = sc.nextInt();
        System.out.print("Enter total number of peanuts (p): ");
        int p = sc.nextInt();
        System.out.print("Enter number of bananas each monkey can eat (k): ");
        int k = sc.nextInt();
        System.out.print("Enter number of peanuts each monkey can eat (j): ");
        int j = sc.nextInt();

        // Calculate the number of monkeys that can eat
        int monkeysFed = 0;

        while (monkeysFed < n) {
            // Check if there are enough bananas and peanuts for the next monkey
            if (m >= k || p >= j) {
                // A monkey can eat either k bananas or j peanuts
                if (m >= k) {
                    m -= k; // Feed the monkey bananas
                } else {
                    m = 0; // Less than k bananas, feed whatever is left
                }
                
                if (p >= j) {
                    p -= j; // Feed the monkey peanuts
                } else {
                    p = 0; // Less than j peanuts, feed whatever is left
                }
                
                monkeysFed++; // One more monkey has been fed
            } else {
                // If we cannot feed any more monkeys
                break;
            }
        }

        // Calculate the remaining monkeys on the tree
        int remainingMonkeys = n - monkeysFed;

        System.out.println("Number of monkeys left on the tree: " + remainingMonkeys);
        sc.close(); // Close the scanner
    }
}
