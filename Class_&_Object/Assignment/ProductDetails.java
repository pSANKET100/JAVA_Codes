class Product {
    private int id;
    private String name;
    private int qty;
    private int rate;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

 
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

  
    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

   
    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

  
    public int calculateTotalPrice() {
        return qty * rate;
    }
}
class CalculateBill {


    public void calculateTotalAmount(Product... products) {
        int totalAmount = 0;
        System.out.println("Product Details:");
        System.out.println("ID\tName\tQty\tRate\tTotal");

      
        for (Product product : products) {
            int productTotal = product.calculateTotalPrice();
            totalAmount += productTotal;
            System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getQty() + "\t" + product.getRate() + "\t" + productTotal);
        }

        System.out.println("\nTotal Bill Amount: " + totalAmount);
    }
}
public class ProductDetails {
    public static void main(String[] args) {
      
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Product A");
        product1.setQty(3);
        product1.setRate(100);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Product B");
        product2.setQty(5);
        product2.setRate(200);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Product C");
        product3.setQty(2);
        product3.setRate(150);

      
        CalculateBill bill = new CalculateBill();
     
        bill.calculateTotalAmount(product1, product2, product3);
    }
}
