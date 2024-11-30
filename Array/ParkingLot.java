import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.print("Enter the number of rows (R): ");
        int R = sc.nextInt();
        System.out.print("Enter the number of columns (C): ");
        int C = sc.nextInt();


        int[][] parkingLot = new int[R][C];

      
        System.out.println("Enter the parking lot matrix (0 for empty, 1 for full):");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                parkingLot[i][j] = sc.nextInt();
            }
        }

      
        int maxFullSpaces = -1;
        int rowIndex = -1;


        for (int i = 0; i < R; i++) {
            int countFull = 0; 
            for (int j = 0; j < C; j++) {
                if (parkingLot[i][j] == 1) {
                    countFull++;
                }
            }
       
            if (countFull > maxFullSpaces) {
                maxFullSpaces = countFull;
                rowIndex = i;
            }
        }

       
        if (rowIndex != -1) {
            System.out.println("Row with the most full parking spaces is: " + rowIndex);
            System.out.println("Number of full spaces in that row: " + maxFullSpaces);
        } else {
            System.out.println("No parking spaces are occupied.");
        }


    }
}
