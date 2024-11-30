import java.util.Scanner;

public class NthTermInSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int term;
        if (N % 2 == 1) {
            term = 1;
            for (int i = 0; i < (N / 2); i++) {
                term *= 2;             }
        } else {
           
            term = 1;
            for (int i = 0; i < (N / 2) - 1; i++) {
                term *= 3;             }
        }
        System.out.println(term);
    }
}
