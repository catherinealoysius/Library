package IT7320.Assignmnet3_TDD;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class LibrarySystem {
	
private List<Books> bookDetails;
final private List<Books> NameandAmount;
int ArrayLisyindexCounter=0;
int BookQuantity = 0;

public LibrarySystem(){
	
	bookDetails = new ArrayList<Books>();
	//This ArrayList is created to store the initial values of book Inventory.
	NameandAmount= new ArrayList<Books>();
}

public int add(Books book,Books book1){
	
	bookDetails.add(book);
	NameandAmount.add(book1);
	
	return ArrayLisyindexCounter++;
	
}


public void getFirstAmount(String Title){
	
for(int j=0;j<NameandAmount.size();j++){
		
		if(Title.equals(NameandAmount.get(j).getBookName())){
			
			BookQuantity=NameandAmount.get(j).getBookQuantity();
			
						
		}
		
		
	}
	
			
	}


public double CalculateRent(String Title,int Days){
	
	double total=0.0;
	int bookQuantity;
			
	for (int i=0; i<bookDetails.size(); i++){
		
		if(bookDetails.get(i).getBookQuantity() !=0){
		
		if(Title.equals(bookDetails.get(i).getBookName())){
		total= (Days*bookDetails.get(i).getBookRent());
				
		bookQuantity=bookDetails.get(i).getBookQuantity();
		bookDetails.get(i).setBookQuantity(bookQuantity-1);
						
							
		}
		
		
		}else{
			
			return 0;
			
			
		}
	}
		
	
	return total;
	
}

public int restoreBook(String Title){
	
	int bookQuantity;
	int returnStatus = 0;
	
	System.out.println("Inside Book Return Method");
	
	for (int i=0; i<bookDetails.size(); i++){
		
		System.out.println("Book Quantity"+bookDetails.get(i).getBookQuantity());
		
						
		if(Title.equals(bookDetails.get(i).getBookName())& bookDetails.get(i).getBookQuantity()<BookQuantity){
			
//			System.out.println("Inside if title matched");
								
				bookQuantity=bookDetails.get(i).getBookQuantity();
				bookDetails.get(i).setBookQuantity(bookQuantity+1);
				
				returnStatus=1;
								
				break;
			
			}else{
				
				returnStatus=0;
				
			}
				
			
		}
	return returnStatus;
		
}


@Override
public String toString(){
	String totalQuantity="\n";
	
	Iterator<Books> i = bookDetails.iterator();
	while(i.hasNext()){
		Books b = (Books) i.next();
		totalQuantity = totalQuantity + b.toString();
	}
	return totalQuantity;
	
}
	

}