import java.lang.*;
public class Book{
private String isbn; 
private String bookTitle; 
private String authorName;
private double price;
private int availableQuantity;
 
public Book( ) {}
public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity){
this.isbn=isbn;
this.bookTitle=bookTitle;
this.price=price;
this.availableQuantity=availableQuantity;
}	
 
void setIsbn(String isbn){
this.isbn=isbn;
}	
void setBookTitle(String bookTitle){
	this.bookTitle=bookTitle;
}
void setAuthorName(String authorName){
this.authorName=authorName;
}	
void setPrice(double price){
	this.price=price;
}
void setAvaiableQuantity(int availableQuantity){
this.availableQuantity=availableQuantity;
}	
 
String getIsbn( ){
	return isbn;
}
String getBookTitle( ){
	return bookTitle;
}
String getAuthorName( ){
return authorName; 
}	
double getPrice( ){
	return price;
}
int getAvailableQuantity( ){
return availableQuantity;
}	
 
void addQuantity(int amount){
	if(amount>0){
		availableQuantity += amount;
	}
}
void sellQuantity(int amount){
	if(amount>0 && amount<=availableQuantity){
		availableQuantity -= amount;
	}
}
 
void showDetails( ){
	 System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Available Quantity: " + availableQuantity);
    }
}