import java.util.*;
class Board
{
	String boardName;
	void setBoardName(String boardName){
		this.boardName = boardName;
		}
	
}
class STD extends Board
{
	int marks[];
	String stdName, studName;
	void setMarks(String stdName,String studName,int marks[]){
		this.stdName=stdName;
		this.studName= studName;
		this.marks=marks;
		}
}
class Result extends STD 
{
	void showResult(){
		System.out.println("Board Name is : " +boardName);
		System.out.println("Std name is : " +stdName);
		System.out.println("Stud Name is : " +studName);
		
		int per = 0;
		for(int i=0; i<marks.length; i++){
			per = per + marks[i];
			}
		System.out.println("Percentage is : "+(per/marks.length));
		}	
}
public class SingleLevelApp
{
	public static void main(String args [])
	{
		Result r1=new Result();
		Scanner sc = new Scanner (System.in);
		int a[] = new int [6];
		System.out.println("Enter board name : ");
		String boardName = sc.nextLine();
		System.out.println("Enter Standard name : ");
		String stdName = sc.nextLine();
		System.out.println("Enter student name : ");
		String studName = sc.nextLine();

		System.out.println("Enter marks of Student ");
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
			}
		r1.setBoardName(boardName);
		r1.setMarks(stdName, studName,a);
		r1.showResult();
	}
}
		
		