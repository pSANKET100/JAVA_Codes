public class CustomPattern {
    public static void main(String[] args) {
        int rows = 5;

           for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j == i || j == rows || i == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();         }
    }
}
