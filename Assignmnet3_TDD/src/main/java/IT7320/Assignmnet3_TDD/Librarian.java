package IT7320.Assignmnet3_TDD;


import java.util.Scanner;

public class Librarian {
	
	static LibrarySystem lib = new LibrarySystem();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String[] args) {
		while (running) {
			System.out.println("\nEnter 0 Exit "
					+"\nEnter 1 add book to Library"
					+"\nEnter 2 for see the availble books"
					+"\nEnter 3 to BookRent a Book"
					+"\nEnter 4 return a Book");

			int answer = in.nextInt();
			
			switch (answer) {
			
			case 0:
				
				running=false;
				break;

			case 1:
				addBook();
				
				break;
			case 2:
				System.out.println(lib.toString());
				break;
			case 3:
				 BookRent();
				break;
			case 4:
				returnTheBook();
				
			}
			
		}
		System.exit(0);
		

	}
	private static void addBook() {
		
		 String BookName;
		 String Author;
		 double Cost;
		 double BookRent;
		 int bookQuantity; 

		System.out.println("\nEnter BookName: ");
		BookName = in.next();

		System.out.println("\nEnter Author: ");
		Author = in.next();

		System.out.println("\nEnter Cost: ");
		Cost = in.nextInt();

		System.out.println("\nEnter BookRent Amount: ");
		BookRent = in.nextDouble();
		System.out.println("\nEnter No of Copies Available: ");
		bookQuantity=in.nextInt();

	//	Books b = new Books(BookName, Author, Cost, BookRent);
		Books b1= new Books();
		Books b2=new Books();
		b1.setBookName(BookName);
		b1.setAuthor(Author);
		b1.setCost(Cost);
		b1.setBookRent(BookRent);
		b1.setBookQuantity(bookQuantity);
		b2.setBookName(BookName);
		b2.setBookQuantity(bookQuantity);
		
		lib.add(b1,b2);
		
	}
	
	private static void BookRent() {
		
		 String BookName;
		 int Days;
		 double value;
		 
		System.out.println("\nEnter BookName Name : ");
		BookName = in.next();
		System.out.println("\nEnter No of Days required : ");
		
		Days=in.nextInt();
		
		lib.getFirstAmount(BookName);
		value=lib.CalculateRent(BookName,Days);
		if(value!=0){
		System.out.println("You Book Details"+"\n BookName : "+BookName+"\n Day Requested : "+Days+"\nBookRent Amount : "+value);
		}else
		{
			System.out.println("All Copies are Rented out! ");
			
		}
		
	}
	private static void returnTheBook() {
		
		 String BookName;
		 int status;
		 
		System.out.println("\nEnter BookName Name : ");
		BookName = in.next();
		
		lib.getFirstAmount(BookName);
		status=lib.restoreBook(BookName);
		
		if(status!=0){
			
	   System.out.println("You Book returned Succesfully! Please Visit  Again ");
		}else{
			
			System.out.println(" We are Sorry! Could not find the details in our Inventory");
			
		}
					
	}
	

}