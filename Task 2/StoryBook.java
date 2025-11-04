public class StoryBook extends Book {
    private String category;

    public StoryBook() {}

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
    }

    public void setCategory(String category) {
		this.category = category; }
    public String getCategory() {
		return category; }

    
    public void showDetails() {
        System.out.println("StoryBook Details:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availableQuantity);
        System.out.println("Category: " + category);
        System.out.println("------------------------");
    }
}
