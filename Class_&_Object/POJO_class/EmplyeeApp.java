import java.util.*;
class Emplyee
{
	private int id;
	private String name;
	private int sal;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
}
public class EmplyeeApp
{
	public static void main (String args[])
	{	
		Emplyee e[ ] = new Emplyee[2];
		Scanner sc=new Scanner(System.in);

		for(int i=0; i<e.length; i++){
		e[i] = new Emplyee();

		System.out.println("Enter emplyee id name and sal :");
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		
		int sal = sc.nextInt();
		

		e[i].setId(id);
		e[i].setName(name);
		e[i].setSal(sal);

		}
		System.out.println("Display all emplyees");
		for(int i=0; i<e.length; i++){
		System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSal());
		}
	}
}
		

