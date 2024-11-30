import java.util.Scanner;

public class NthTermInMixedSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int term;

        if (n % 2 == 1) {
            term = 2 * (n / 2);
        } else {
            term = (2 * ((n / 2) - 1)) / 2;
        }

        System.out.println(term);
    }
}
