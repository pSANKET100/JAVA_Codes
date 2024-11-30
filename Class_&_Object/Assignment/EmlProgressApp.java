import java.util.*;
class Employee
{
	private String name;
	private int id;
	private int basicSal;
	private int incremented = 0;
		
	void setPersonalInfo(String name, int id, int basicSal){
		this.name=name;
		this.id=id;
		this.basicSal=basicSal;
		}
	void setProgressPer(int progress){
		if(progress > 60){
			incremented = incremented + (basicSal * 30 )/100;
			System.out.println("progress is greater than 60% so basic increase 30%");
			}
		else{
			System.out.println("progress is not greater than 60% ");
		}
	}

	void show() {
                int totalSal = basicSal + incremented;

        	System.out.println("Employee Name: " + name);
        	System.out.println("Employee ID: " + id);
        	System.out.println("Employee Basic Salary: " + basicSal);

        	if (incremented > 0) {
            		System.out.println("Incremented Salary: " + incremented);
        	} else {
            		System.out.println("No Incremented Salary");
        		}

        	System.out.println("Total Salary: " + totalSal);
    }
}

public class EmlProgressApp
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	Employee e1 = new Employee();
	
	System.out.print("Enter employee name :");
	String name = sc.nextLine();

	System.out.print("Enter employee id :");
	int id = sc.nextInt();

	System.out.print("Enter employee basicSal :");
	int basicSal = sc.nextInt(); 
	
	e1.setPersonalInfo(name , id , basicSal);

	System.out.println("Enter progress percentage :");
	int progress = sc.nextInt();
	
	e1.setProgressPer(progress);
	
	e1.show();
	}
}
	
	
	