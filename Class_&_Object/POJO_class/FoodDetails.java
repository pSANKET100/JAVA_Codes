import java.util.Scanner;

class Food {
    private int fid;
    private String fname;
    private int fprice;
    private String fcategory;

    public void setIFid(int fid) {
        this.fid = fid;
    }

    public int getFid() {
        return fid;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setFprice(int fprice) {
        this.fprice = fprice;
    }

    public int getFprice() {
        return fprice;
    }

    public void setFcategory(String fcategory) {
        this.fcategory = fcategory;
    }

    public String getFcategory() {
        return fcategory;
    }
}

public class FoodDetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Food f1[] = new Food[4];
        int choice;
        int count = 0;
        int totalBill = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add All Food details.");
            System.out.println("2. Display All Food details.");
            System.out.println("3. Display food details whose price range between 500 to 1000.");
            System.out.println("4. Search Food details using by id.");
            System.out.println("5. Update Food details using by name.");
            System.out.println("6. Delete Food details using by price.");
            System.out.println("7. Purchase Food Items.");
            System.out.println("8. Display Bill Details.");
            System.out.println("9. Exit.");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for(int i = 0;i<f1.length;i++){
                        f1[i] = new Food();
                        System.out.print("Enter food id: ");
                        int fid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter food name: ");
                        String fname = sc.nextLine();
                        System.out.print("Enter food price: ");
                        int fprice = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter food category: ");
                        String fcategory = sc.nextLine();

                        f1[i].setIFid(fid);
                        f1[i].setFname(fname);
                        f1[i].setFprice(fprice);
                        f1[i].setFcategory(fcategory);
                        count++;
                    }
                    break;

                case 2:
                    System.out.println("Displaying all food details...");
                    for (int i = 0; i < count; i++) {
                        System.out.println(f1[i].getFid() + "\t" + f1[i].getFname() + "\t" + f1[i].getFprice() + "\t" + f1[i].getFcategory());
                    }
                    break;

                case 3:
                    System.out.println("Displaying food details in price range 500 to 1000...");
                    for (int i = 0; i < count; i++) {
                        if (f1[i].getFprice() >= 500 && f1[i].getFprice() <= 1000) {
                            System.out.println(f1[i].getFid() + "\t" + f1[i].getFname() + "\t" + f1[i].getFprice() + "\t" + f1[i].getFcategory());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Search food by ID...");
                    System.out.print("Enter food ID: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (f1[i].getFid() == id) {
                            found = true;
                            System.out.println(f1[i].getFid() + "\t" + f1[i].getFname() + "\t" + f1[i].getFprice() + "\t" + f1[i].getFcategory());
                        }
                    }
                    if (!found) {
                        System.out.println("Food with ID " + id + " not found.");
                    }
                    break;

                case 5:
                    System.out.println("Updating food details by name...");
                    sc.nextLine();
                    System.out.print("Enter food name to update: ");
                    String searchName = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (f1[i].getFname().equalsIgnoreCase(searchName)) {
                            System.out.print("Enter new food ID: ");
                            int newFid = sc.nextInt();
                            System.out.print("Enter new food price: ");
                            int newFprice = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter new food category: ");
                            String newFcategory = sc.nextLine();

                            f1[i].setIFid(newFid);
                            f1[i].setFprice(newFprice);
                            f1[i].setFcategory(newFcategory);

                            found = true;
                            System.out.println("Food details updated successfully!");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Food with the name " + searchName + " not found.");
                    }
                    break;

                case 6:
                    System.out.println("Deleting food by price...");
                    System.out.print("Enter food price to delete: ");
                    int delPrice = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (f1[i].getFprice() == delPrice) {
                            for (int j = i; j < count - 1; j++) {
                                f1[j] = f1[j + 1];
                            }
                            f1[count - 1] = null;
                            count--;
                            found = true;
                            System.out.println("Food deleted successfully.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Food with price " + delPrice + " not found.");
                    }
                    break;

                case 7:
                    System.out.println("Purchasing food items...");
                    System.out.print("Enter food ID to purchase: ");
                    int purchaseId = sc.nextInt();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (f1[i].getFid() == purchaseId) {
                            found = true;
                            totalBill += f1[i].getFprice(); 
                            System.out.println("Purchased " + f1[i].getFname() + " for " + f1[i].getFprice());
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Food with ID " + purchaseId + " not found.");
                    }
                    break;

                case 8:
                    System.out.println("Display Bill Details:");
                    System.out.println("1. Bill Without GST");
                    System.out.println("2. Bill With GST");
                    System.out.print("Choose an option: ");
                    int billChoice = sc.nextInt();

                    if (billChoice == 1) {
                        System.out.println("Total Bill Without GST: " + totalBill);
                    } else if (billChoice == 2) {
                        double gst = 0.18;
                        double totalWithGST = totalBill + (totalBill * gst);
                        System.out.println("Total Bill With GST: " + totalWithGST);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;
		 case 9:
                    System.out.println("Displaying food details starting with 'P' and ending with 'A'...");
                    for (int i = 0; i < count; i++) {
                        String name = f1[i].getFname();
                        if (name.startsWith("P") && name.endsWith("A")) {
                            System.out.println(f1[i].getFid() + "\t" + f1[i].getFname() + "\t" + f1[i].getFprice() + "\t" + f1[i].getFcategory());
                        }
                    }
                    break;

                case 10:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
        } while (choice != 9);
        sc.close();
    }
}
