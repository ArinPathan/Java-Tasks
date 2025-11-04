public class Start {
    public static void main(String[] args) {
        TextBook txb1 = new TextBook("TXB101", "Physics", "Halliday", 500.0, 10, 12);
        TextBook txb2 = new TextBook("TXB102", "Math", "Sharma", 400.0, 8, 10);
        TextBook txb3 = new TextBook("TXB103", "Chemistry", "Tandon", 450.0, 12, 11);
        TextBook txb4 = new TextBook("TXB104", "Biology", "Campbell", 600.0, 5, 12);
        TextBook txb5 = new TextBook("TXB105", "History", "Thapar", 350.0, 6, 9);

        StoryBook stb1 = new StoryBook("STB201", "Harry Potter", "Rowling", 700.0, 10, "Fantasy");
        StoryBook stb2 = new StoryBook("STB202", "Sherlock Holmes", "Doyle", 600.0, 7, "Mystery");
        StoryBook stb3 = new StoryBook("STB203", "Alice", "Carroll", 500.0, 9, "Adventure");
        StoryBook stb4 = new StoryBook("STB204", "Jungle Book", "Kipling", 450.0, 4, "Children");
        StoryBook stb5 = new StoryBook("STB205", "Hobbit", "Tolkien", 800.0, 3, "Fantasy");

        BookShop shop = new BookShop("AIUB Book Corner");

        shop.insertTextBook(txb1);
        shop.insertTextBook(txb2);
        shop.insertTextBook(txb3);
        shop.insertTextBook(txb4);
        shop.insertTextBook(txb5);

        shop.insertStoryBook(stb1);
        shop.insertStoryBook(stb2);
        shop.insertStoryBook(stb3);
        shop.insertStoryBook(stb4);
        shop.insertStoryBook(stb5);

        System.out.println("All TextBooks:");
        shop.showAllTextBooks();

        System.out.println("All StoryBooks:");
        shop.showAllStoryBooks();

        System.out.println("Searching for TextBook TXB103:");
        TextBook foundTextBook = shop.searchTextBook("TXB103");
        if (foundTextBook != null) {
            foundTextBook.showDetails();
        }

        System.out.println("Searching for StoryBook STB202:");
        StoryBook foundStoryBook = shop.searchStoryBook("STB202");
        if (foundStoryBook != null) {
            foundStoryBook.showDetails();
        }

        shop.removeTextBook(txb3);
        shop.removeStoryBook(stb2);

        System.out.println("After removal:");
        shop.showAllTextBooks();
        shop.showAllStoryBooks();
    }
}
