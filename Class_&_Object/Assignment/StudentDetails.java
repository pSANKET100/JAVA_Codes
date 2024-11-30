import java.util.*;
class Student
{
	private int [] marks = new int[6];
	private double per;

	void setSubMarks(int s[]){
		this.marks = s;
		}

	void calculatePer(){
		int totalMarks = 0;
		for(int i=0; i<marks.length; i++){
		totalMarks = totalMarks + marks[i];
		}
		per = (double) totalMarks/marks.length;
		System.out.println("Student percentage is :" +per);
		}
			
	void checkGrades(){
		if(per>75 && per<=100 ){
			System.out.println("student is distinction");
			}
		else if(per>60 && per<=75){
			System.out.println("student is first division");
			}
		else if(per>=50 && per<=60){
			System.out.println("student is second  division");
		        }
		else if(per>=40 && per<=50){
			System.out.println("student is third   division");
		        }
		else{
			System.out.println("student is failed");
		        }
		}
}
public class StudentDetails{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int[] subjectMarks = new int[6];

	System.out.print("Enter 6 subject marks :");
	for(int i=0; i<subjectMarks.length; i++){
	subjectMarks[i]  = sc.nextInt();
	}

	Student s1 = new Student();
		
	s1.setSubMarks(subjectMarks);

	s1.calculatePer();
	
	s1.checkGrades();
	
     }
}

	
		
	

	