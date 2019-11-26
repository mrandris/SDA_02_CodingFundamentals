package exercices.bookstore;

import java.util.List;

public class Author {
    private String firstName;
    private String lastName;
    private int age;
    private List<Book> books;
    private boolean readFromAuthor; // new field: have I read from this author or not

    // consructor with last and first name
    public Author(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public boolean isReadFromAuthor() // method, which says if I have read a book from this author
    {
        for(Book book: books) {
            if(book.isReadBook()) {
                readFromAuthor = true;
                return readFromAuthor;
            } else {
                readFromAuthor = false;
            }
        }
        return readFromAuthor;
    }
}
