package IT7320.Assignmnet3_TDD;


public class Books {
	
	private String BookName;
	private String Author;
	private double Cost;
	private double BookRent;
	private int BookQuantity;
	
	public String getBookName() {
		return BookName;
	}
	public int getBookQuantity() {
		return BookQuantity;
	}
	public void setBookQuantity(int bookQuantity) {
		BookQuantity = bookQuantity;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public double getCost() {
		return Cost;
	}
	public void setCost(double Cost) {
		this.Cost = Cost;
	}
	public double getBookRent() {
		return BookRent;
	}
	public void setBookRent(double BookRent) {
		this.BookRent = BookRent;
	}


		
	public Books(){
		BookName=null;
		Author=null;
		Cost=0.0;
		BookRent=0.0;
		BookQuantity=0;
		
	}
//	public Books(String BookName,String Author,double Cost,double BookBookBookRent){
//		this.BookName=BookName;
//		this.Author=Author;
//		this.Cost=Cost;
//		this.BookRent=BookRent;
//		
//		
//	}
	
	@Override
	public String toString(){
		return "\nBookName: " + BookName + "\nAuthor: " + Author +
				"\nCost: " + Cost + "\n BookRent Amount: " + BookRent +"\nAvailable Copies:"+BookQuantity+"\n_____________________";
	}
	
	

}
