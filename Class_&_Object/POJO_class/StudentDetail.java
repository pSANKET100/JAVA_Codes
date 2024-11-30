import java.util.*;
class Student
{
	private int id;
	private String name;
	private int per;
	
	public void setId(int id){
		this.id=id;
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
	public void setPer(int per){
		this.per=per;
	}
	public int getPer(){
		return per;
	}
}
public class StudentDetail
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		Student s1=null;
		do{
			System.out.println("1.set Data");
			System.out.println("2.get data");
			System.out.println("3.Exit");

		System.out.println("Enter your choice :");
		choice = sc.nextInt();
		switch(choice){
		case 1:
			s1=new Student();
			s1.setId(1);
			s1.setName("sanket");
			s1.setPer(96);
			break; 
		case 2:
			System.out.println("Student id is : "+s1.getId());
			System.out.println("Student name is : "+s1.getName());
			System.out.println("Student percentage is : "+s1.getPer());
			break;
		default:
			System.out.println("Exit");
			}
		
		}while(choice != 3);
	}
}


	
	