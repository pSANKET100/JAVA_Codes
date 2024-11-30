import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int totalworking;
    private double salary;
    private double overtime;

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

    public void setTotalWorking(int totalworking) {
        this.totalworking = totalworking;
    }

    public int getTotalworking() {
        return totalworking;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void displayInformation() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Total Working Hours: " + totalworking);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Overtime Pay: " + overtime);
        System.out.println("Total Salary (with Overtime): " + (salary + overtime));
        System.out.println("--------------------------------------");
    }
}

public class EmployeeOvertime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e1 = new Employee[3];

        for (int i = 0; i < e1.length; i++) {
            e1[i] = new Employee();

            System.out.println("Enter Employee ID:");
            e1[i].setId(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter Employee Name:");
            e1[i].setName(sc.nextLine());

            System.out.println("Enter total working hours in the week:");
            e1[i].setTotalWorking(sc.nextInt());

            System.out.println("Enter basic salary:");
            e1[i].setSalary(sc.nextDouble());

            if (e1[i].getTotalworking() > 40) {
                int overtimeHours = e1[i].getTotalworking() - 40;
                double overtime = overtimeHours * 50;
                e1[i].setOvertime(overtime);
            } else {
                e1[i].setOvertime(0);
            }
        }

        for (int i=0; i<e1.length; i++) {
            e1[i].displayInformation();
        }
    }
}
