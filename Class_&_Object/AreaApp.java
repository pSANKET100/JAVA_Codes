import java.util.*;

class Employee {
    int id;
    String name;
    double basicsal;
    int process;
    double totalsal;
    double incremented;

    void setPersonalInfo(String n, int i, double basic) {
        name = n;
        id = i;
        basicsal = basic;
    }

    void setProgressPer(int process) {
        this.process = process;
        if (process < 60) {
            totalsal = basicsal * 0.3;
            incremented = basicsal - totalsal;
        } else {
            incremented = 0;
            totalsal = basicsal;  
           }
    }

    void show() {
        System.out.println("Name: " + name);	
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + basicsal);
        System.out.println("Total Salary: " + totalsal);	
        System.out.println("Incremented: " + incremented);
    }
}

public class AreaApp {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.setPersonalInfo("Sanket", 12, 5000);
        e1.setProgressPer(50);
        e1.show();
    }
}
