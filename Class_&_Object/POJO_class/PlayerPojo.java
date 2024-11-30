import java.util.*;
class Player
	{
	private int id;
	private String name;
	private int run;
	
	public void setId(int id){
               this.id=id;
		}
	public int getId(){
		return id;
		}
	public void setName(String name){
		this.name = name;
		}
	public String getName(){
		return name;
		}
	public void setRun(int run){
		this.run=run;	
		}
	public int getRun(){
		return run;
		}
	}
public class PlayerPojo{
	public static void main(String args[]){
	int choice;
	Scanner sc=new Scanner(System.in);
	Player p1=null;
	
	do{
		System.out.println("1.set data ");
		System.out.println("2.get data ");
		System.out.println("3.exit");

	System.out.println("Enter your choice :");
		choice = sc.nextInt();
	switch(choice){
		case 1:
			p1=new Player();
			p1.setId(18);
			p1.setName("Virat kohli");
			p1.setRun(10000);
			break;
		case 2:
			System.out.println("Player id :"+p1.getId());
			System.out.println("Player name :"+p1.getName());
			System.out.println("Player run :"+p1.getRun());
			break;
		default:
			System.out.println("exit");
			break;
		}
	}while(choice !=3 );
}
}

	
	
	
	