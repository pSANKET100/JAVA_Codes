import java.util.Scanner;

public class FibonacciPrimeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int term;
        if (n % 2 == 1) {
            term = fibonacci((n / 2) + 1);
        } else {
            term = prime(n / 2);
        }

        System.out.println(term);
    }

    private static int fibonacci(int index) {
        if (index == 1) return 1;
        if (index == 2) return 2;

        int a = 1, b = 2;
        for (int i = 3; i <= index; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    private static int prime(int index) {
        int count = 0;
        int num = 1;
        while (count < index) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
