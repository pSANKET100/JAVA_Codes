import java.util.*;
class Student {
    private int id;
    private String name;
    private float per;
    private int totalFees;
    private int disFees;
    private int actualPaidFees;

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setPer(float per) {
        this.per = per;
    }

    float getPer() {
        return per;
    }

    void setTotalfees(int totalFees) {
        this.totalFees = totalFees;
    }

    int getTotalfees() {
        return totalFees;
    }

    void setDisfees(int disFees) {
        this.disFees = disFees;
    }

    int getDisfees() {
        return disFees;
    }

    void setActualFees(int actualPaidFees) {
        this.actualPaidFees = actualPaidFees;
    }

    int getActualFees() {
        return actualPaidFees;
    }
}

class DiscountFees {
    Student student;

    void setStudent(Student student) {
        this.student = student;
    }

    void checkDiscountEligibility(int per) {

        if (per > 60) {
            int discount = (int) (student.getTotalfees() * 0.3);
            student.setDisfees(discount);
            student.setActualFees(student.getTotalfees() - discount);
        } else {
            student.setDisfees(0);
            student.setActualFees(student.getTotalfees());
        }
    }

    void show() {
        System.out.println("Student Id: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Percentage: " + student.getPer());
        System.out.println("Total Fees: " + student.getTotalfees());
        System.out.println("Discounted Fees: " + student.getDisfees());
        System.out.println("Actual Fees to Pay: " + student.getActualFees());
    }
}

public class StudentDiscountApp {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter percentage: ");
        float per = sc.nextFloat();

        System.out.println("Enter total fees: ");
        int totalFees = sc.nextInt();

        Student s1 = new Student();
        s1.setId(id);
        s1.setName(name);
        s1.setPer(per);
        s1.setTotalfees(totalFees);

        DiscountFees discount = new DiscountFees();

        discount.setStudent(s1);

        discount.checkDiscountEligibility((int) per);

        discount.show();

    }
}
