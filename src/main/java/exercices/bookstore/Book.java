package exercices.bookstore;

public class Book {
    private String title;
    private String genre;
    private int numberOfPages;
    private boolean readBook; // new field: was the book read or not

    public Book() {
        // void constructor
    }

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isReadBook() {
        return readBook;
    }

    public void setReadBook(boolean readBook) {
        this.readBook = readBook;
    }
}
