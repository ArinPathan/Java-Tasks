public class BookShop {
    private String name;
    private TextBook[] textBooks = new TextBook[100];
    private StoryBook[] storyBooks = new StoryBook[100];

    public BookShop() {}

    public BookShop(String name) {
        this.name = name;
    }

    public void setName(String name) { 
	this.name = name; }
    public String getName() {
		return name; }

    public boolean insertTextBook(TextBook txb) {
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == null) {
                textBooks[i] = txb;
                return true;
            }
        }
        return false;
    }

    public boolean removeTextBook(TextBook txb) {
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == txb) {
                textBooks[i] = null;
                return true;
            }
        }
        return false;
    }

    public TextBook searchTextBook(String isbn) {
        for (TextBook txb : textBooks) {
            if (txb != null && txb.getIsbn().equals(isbn)) {
                return txb;
            }
        }
        return null;
    }

    public void showAllTextBooks() {
        for (TextBook txb : textBooks) {
            if (txb != null) {
                txb.showDetails();
                System.out.println("-----------------");
            }
        }
    }

    public boolean insertStoryBook(StoryBook stb) {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == null) {
                storyBooks[i] = stb;
                return true;
            }
        }
        return false;
    }

    public boolean removeStoryBook(StoryBook stb) {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == stb) {
                storyBooks[i] = null;
                return true;
            }
        }
        return false;
    }

    public StoryBook searchStoryBook(String isbn) {
        for (StoryBook stb : storyBooks) {
            if (stb != null && stb.getIsbn().equals(isbn)) {
                return stb;
            }
        }
        return null;
    }

    public void showAllStoryBooks() {
        for (StoryBook stb : storyBooks) {
            if (stb != null) {
                stb.showDetails();
                System.out.println("-----------------");
            }
        }
    }
}

