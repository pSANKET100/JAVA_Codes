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
		this.name=name;
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
public class PlayerApp
{
	public static void main (String args[])
	{
		Player p[ ]=new Player[2];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<p.length; i++){
		p[i]=new Player();
	
		System.out.println("Enter id name and run :");
		int id=sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		int run = sc.nextInt();
	
		p[i].setId(id);
		p[i].setName(name);
		p[i].setRun(run);
		}
		System.out.println("Display all plyers records ");
		for(int i=0; i<p.length; i++){
		System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRun());
		}
		System.out.println("Enter search id:");
		int skey =sc.nextInt();
		boolean flag = false;
		for(int i=0; i<p.length; i++){
		int pid=p[i].getId();
		if(pid==skey){
			flag = true;
			break;
			}
		}
		if(flag){
			System.out.println("Player found ");
			}
		else{
			System.out.println("Player not found");
			}
	}
}
			
	
	