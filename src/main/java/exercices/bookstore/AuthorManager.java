package exercices.bookstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AuthorManager {
    // method for printing Book attributes
    public static void printBook(Book x) {
        System.out.println("BOOK:");
        System.out.println("Title: " + x.getTitle());
        System.out.println("Genre: " + x.getGenre());
        System.out.println("Number of pages: " + x.getNumberOfPages());
        if (x.isReadBook()) // prints if the book was read or not
        {
            System.out.println("Book read. Good job!");
        } else {
            System.out.println("Book NOT read. Must read it sometime!");
        }
        System.out.println();
    }

    // method for printing Author attributes
    public static void printAuthor(Author x) {
        System.out.println("Author: " + x.getLastName() + ", " + x.getFirstName());
        System.out.println("List of Books: ");
//        System.out.println(x.getBooks()); // nu merge inca :)))

        // print books with all attributes
/*        for(Book k: x.getBooks()) {
            printBook(k);
        }*/

        // print only the title of the book
        List<Book> books = x.getBooks();
        if (books != null) {
            for (Book k : x.getBooks()) {
                System.out.println(k.getTitle()); //ce se intampla daca un autor nu are initializata lista de carti??? ERROR!!! Null pointer exception.
            }
            // print if I have read from this author or not
            if(x.isReadFromAuthor()) {
                System.out.println("You have read at least one book from this author.");
            } else {
                System.out.println("You have NOT read from this author. You should!");
            }
        } else {
            System.out.println("No books assigned yet.");
        }
        System.out.println();
    }

    // has an author a book of genre X // de ce ne trebuie autorul, daca avem ca parametru lista de carti a autorului???
    public static boolean isBookByGenre(Author author, List<Book> books, String genre) {
        System.out.println("Does " + author.getFirstName() + " " + author.getLastName() + " have a book of genre: " + genre + "?");
        for(Book book: books) {
//            System.out.println("Does this Author have a book of " + book.getGenre() + ": ");

/*            if(book.getGenre() != null) // daca nu ar fi conditia asta si nu ar fi setat genre la o carte, programul crapa (genre nu este initializat)
                {
                if(book.getGenre().equals(genre)){
                    return true;
                }
            }*/

            if(genre.equals(book.getGenre())) // daca inversam conditia si nu este setat genre la carte, programul nu mai crapa
            {
                return true;
            }
        }
        return false;
    }

    // add a new book to the author's book list
    public static List<Book> addBookToAuthor(Author author, Book book) { //ce se intampla daca un autor nu are initializata lista de carti??? ERROR!!! Null pointer exception.
        author.getBooks().add(book);
        return author.getBooks();
    }

    // add a new book to the author's book list --- by Marcel
    public static void addBookToAuthorM(Author author, Book book) {
        List<Book> books = author.getBooks();
        if(books == null) {
            books = new ArrayList<Book>();
        }
        System.out.println("Book '" + book.getTitle() + "' added to " + author.getFirstName() + " " + author.getLastName() + "'s book list.");
        System.out.println();
        books.add(book);
        author.setBooks(books); // optional! lista deja este setata. oare???
    }


    // delete a book from the author's book list
    public static List<Book> deleteBookFromAuthor(Author author, String bookTitle) {
        for(Book book : author.getBooks()) {
            if(book.getTitle().equals(bookTitle)) {
                System.out.println("Book titled '" + book.getTitle() + "' is not written by " + author.getFirstName() + " " + author.getLastName() + ". Book removed!");
                author.getBooks().remove(book);
//                break; // not working without break!!! and deletes ONLY the first item which matches the condition
            }
        }
        return author.getBooks();
    }

    // delete a book from the author's book list - by Marcel ----------- for indexat: tema de casa
    public static void deleteBookFromAuthorM(Author author, String bookTitle) {
        List<Book> books = author.getBooks();
        if(books != null) {
            Iterator<Book> iter = books.iterator();
            while (iter.hasNext()) {
                Book book = iter.next();
                if(book.getTitle().equals(bookTitle)) {
                    System.out.println("Remove book '" + book.getTitle() + "'");
                    iter.remove();
                }
            }
        }
    }

    // delete a book from the author's book list with for loop
    public static void deleteBookFromAuthorForIterated(Author author, String bookTitle) {
        List<Book> books = author.getBooks();
        boolean bookNotFound = true;
//        if(books != null) {
        for (int i = 0; i<books.size(); ++i) {
            Book bookToDelete = books.get(i);
            if(bookToDelete.getTitle().equals(bookTitle)) {
                System.out.println("Remove book '" + bookToDelete.getTitle() + "' from " + author.getFirstName() + " " + author.getLastName() + "'s book list.");
                books.remove(bookToDelete);
                i--; // avoid skipping shifted element!
                bookNotFound = false;
            }
        }
//        }
        if (bookNotFound) {
            System.out.println("Book '" + bookTitle + "' not found in " + author.getFirstName() + " " + author.getLastName() + "'s book list. Nothing to delete!");
        }
        System.out.println();
    }
}
