public class Start {
    public static void main(String[] args) {
  
        StoryBook sb1 = new StoryBook("SB001", "Harry Potter", "J.K. Rowling", 800.0, 10, "Fantasy");
        StoryBook sb2 = new StoryBook("SB002", "Sherlock Holmes", "Conan Doyle", 600.0, 8, "Mystery");
        StoryBook sb3 = new StoryBook("SB003", "Jungle Book", "R. Kipling", 450.0, 12, "Adventure");
        StoryBook sb4 = new StoryBook("SB004", "Hobbit", "Tolkien", 850.0, 5, "Fantasy");
        StoryBook sb5 = new StoryBook("SB005", "Narnia", "C.S. Lewis", 700.0, 6, "Fantasy");

      
        TextBook tb1 = new TextBook("TB101", "Physics", "Halliday", 500.0, 15, 12);
        TextBook tb2 = new TextBook("TB102", "Math", "Sharma", 450.0, 20, 10);
        TextBook tb3 = new TextBook("TB103", "Biology", "Campbell", 600.0, 10, 11);
        TextBook tb4 = new TextBook("TB104", "Chemistry", "Tandon", 480.0, 8, 10);
        TextBook tb5 = new TextBook("TB105", "History", "Thapar", 400.0, 7, 9);

      
        BookShop shop = new BookShop("AIUB Library");

      
        shop.insertBook(sb1);
        shop.insertBook(sb2);
        shop.insertBook(sb3);
        shop.insertBook(sb4);
        shop.insertBook(sb5);

        shop.insertBook(tb1);
        shop.insertBook(tb2);
        shop.insertBook(tb3);
        shop.insertBook(tb4);
        shop.insertBook(tb5);

        shop.showAllBooks();

    
        Book search = shop.searchBook("TB103");
        if (search != null) {
            System.out.println("Searched Book Found:");
            search.showDetails();
        } else {
            System.out.println("Book not found.");
        }

       
        shop.removeBook(sb3);
        System.out.println("After removing SB003:");
        shop.showAllBooks();
    }
}
