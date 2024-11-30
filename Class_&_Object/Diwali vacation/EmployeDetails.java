class Employee
{
	private int id;
	private String name;
	private double salary;
		
	public void setId(int id){
		this.id = id;
		}
	public int getId(){
		return id;
		}
	public void setName(String name){
		this.name=name;
		}
	public String getName(){
		return name;
		}
	public void setSalary(double salary){
		this.salary= salary;
		}
	public double getSalary(){
		return salary;
		}
}
public class EmployeDetails
{
	public static void main(String args [])
	{
		Employee e1 = new Employee();
		
		e1.setId(5);
		e1.setName("Sanket");
		e1.setSalary(50000);
	
		System.out.println("Retrive data ");
		System.out.println("Employee id : " +e1.getId());
		System.out.println("Employee name : " +e1.getName());
		System.out.println("Employee salary : " +e1.getSalary());
	}
}
		