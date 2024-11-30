import java.util.Scanner;
class Library{
	private int number;
	private String title;
	private String author;
	private int price;
	
	public void setNumber(int number){
		this.number = number;
		}
	public int getNumber(){
		return number;
		}
	public void setTitle(String title){
		this.title = title;
		}
	public String getTitle(){
		return title;
		}
	public void setAuthor(String author){
		this.author = author;
		}
	public String getAuthor(){
		return author;
		}
	public void setPrice(int price){
		this.price = price;
		}
	public int getPrice(){
		return price;
		}
}
public class LibraryDetails
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		Library l1[] = new Library[2];

		int choice;
		int count =0;
		
		do{
			System.out.println("1.Add Book details ");
			System.out.println("2. Display All Book Details ");
			System.out.println("3. Display List of all book of given author. ");	
			System.out.println("4. Display list the title of specified book. ");
			System.out.println("5. Display list count of the book in the library. ");
			System.out.println("6. Display list the books in the ascending order of accession number.");
			System.out.println("7. Update book details by title of book. ");
			System.out.println("8. Delete book details by price. ");
			System.out.println("9. Exit The Code.");
	
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
		switch(choice){
			case 1: 
				System.out.println("Adding book details ");
				 for (int i = 0; i < l1.length; i++) {
                        		l1[i] = new Library();
                        		System.out.print("Enter book number: ");
                        		int number = sc.nextInt();
                        		sc.nextLine();
                        		System.out.print("Enter book title: ");
                        		String title = sc.nextLine();
                        		System.out.print("Enter book author: ");
                        		String author = sc.nextLine();
                        		System.out.print("Enter book price: ");
                        		int price = sc.nextInt();
					System.out.println("-------------------------------");

                       			 l1[i].setNumber(number);
                       			 l1[i].setTitle(title);
                       			 l1[i].setAuthor(author);
                       			 l1[i].setPrice(price);
                       			 count++;
					}
					break;
			case 2:
				System.out.println("Displaying All Book details ");
				 for (int i = 0; i < count; i++) {
                      		         System.out.println(l1[i].getNumber() +"\t"+ 
						            l1[i].getTitle() + "\t" +    				    			            l1[i].getAuthor() + "\t" + 
							    l1[i].getPrice());
                   		        }
					break;
			case 3:
				System.out.println("Displaying all books of given author");
				for 
			
			default:
				System.out.println("invalid ");
			}
		}while(choice != 9);
	}
}
