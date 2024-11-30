import java.util.Scanner;

class MargeArr {
    int x[], y[], z[];

    void setArray(int a[], int b[]) {
        x = a;
        y = b;
    }

    void performMarge() {
        z = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
        }
        for (int i = 0; i < y.length; i++) {
            z[x.length + i] = y[i];
        }
    }

    public int[] getMargeArray() {
        return z;
    }
}

public class MargeArray {
    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first array:");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Enter second array:");
        for (int i = 0; i < y.length; i++) {
            y[i] = sc.nextInt();
        }

        MargeArr m1 = new MargeArr();
        m1.setArray(x, y);
        m1.performMarge();
        int[] mergedArray = m1.getMargeArray();

        System.out.println("Merged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
