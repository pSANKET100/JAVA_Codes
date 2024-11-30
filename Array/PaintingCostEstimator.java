import java.util.Scanner;

public class PaintingCostEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int interiorCostPerSqFt = 18;
        final int exteriorCostPerSqFt = 12;

        System.out.print("Enter the number of interior walls: ");
        int numInteriorWalls = sc.nextInt();
        int totalInteriorArea = 0;

             if (numInteriorWalls > 0) {
            for (int i = 1; i <= numInteriorWalls; i++) {
                System.out.print("Enter surface area of interior wall " + i + " (in sq.ft): ");
                int area = sc.nextInt();
                totalInteriorArea += area; // Accumulate total area
            }
        }

        
        System.out.print("Enter the number of exterior walls: ");
        int numExteriorWalls = sc.nextInt();
        int totalExteriorArea = 0;

      
        if (numExteriorWalls > 0) {
            for (int i = 1; i <= numExteriorWalls; i++) {
                System.out.print("Enter surface area of exterior wall " + i + " (in sq.ft): ");
                int area = sc.nextInt();
                totalExteriorArea += area; 
            }
        }


        int totalCost = (totalInteriorArea * interiorCostPerSqFt) + (totalExteriorArea * exteriorCostPerSqFt);

       
        System.out.println("Total cost of painting the property: Rs." + totalCost);


    }
}
