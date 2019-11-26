package exercices.bookstore;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // new book - Amintiri din copilarie
        Book amintDinCop = new Book("Amintiri din copilarie", 120);
        amintDinCop.setGenre("Childrens' book");
        amintDinCop.setReadBook(false);  // new field: was the book read or not

        AuthorManager.printBook(amintDinCop);

        // new book - Count of Monte Cristo
        Book monteCristo = new Book("Count of Monte Cristo", 600);
        monteCristo.setGenre("Adventures");
        monteCristo.setReadBook(true); // new field: was the book read or not
        AuthorManager.printBook(monteCristo);

        // new book - the three Musketeers
        Book musketeers = new Book("The Three Musketeers", 700);
        monteCristo.setGenre("Adventures");

        // new author Alexandre Dumas
        Author dumas = new Author("DUMAS", "Alexander");
        List<Book> dumasBooks = new ArrayList<>(); // List<Book> as parameter in class Author!
        dumas.setBooks(dumasBooks);
        dumasBooks.add(monteCristo);
        dumasBooks.add(musketeers);

        AuthorManager.printAuthor(dumas);

        // new author Ion Creanga
        Author creanga = new Author("CREANGA", "Ion");
        List<Book> creangaBooks = new ArrayList<>();
        creanga.setBooks(creangaBooks);
        creangaBooks.add(amintDinCop);

        AuthorManager.printAuthor(creanga);

        boolean isBook = AuthorManager.isBookByGenre(dumas, dumasBooks, "Adventures");
        System.out.println(isBook);
        System.out.println();

        boolean isBook2 = AuthorManager.isBookByGenre(creanga, creangaBooks, "Adventures");
        System.out.println(isBook2);
        System.out.println();

        // new book - Dracula
        Book dracula = new Book("Dracula", 300);

        // add a new book to author's book list
        AuthorManager.addBookToAuthor(creanga, dracula);
        AuthorManager.printAuthor(creanga);

        // delete a book from the author's book list
        AuthorManager.deleteBookFromAuthor(creanga, "Dracula");
        AuthorManager.printAuthor(creanga);

        // new author Jules Verne
        Author verne = new Author("VERNE", "Jules");
//        AuthorManager.printAuthor(verne); // no books yet ---- null pointer exception

        // new book Captain Nemo
        Book nemo = new Book("Captain Nemo", 400);

        // new book Captain Nemo
        Book magicIsland = new Book("Magic Island", 400);

        // add nemo to verne
        AuthorManager.addBookToAuthorM(verne, nemo);
        AuthorManager.addBookToAuthorM(verne, magicIsland);
        AuthorManager.printAuthor(verne);

        AuthorManager.deleteBookFromAuthorM(verne, "Captain Nemo");
        AuthorManager.printAuthor(verne);

        AuthorManager.deleteBookFromAuthorM(verne, "Magic Island");
        AuthorManager.printAuthor(verne);

        AuthorManager.deleteBookFromAuthorM(verne, "bullshit");

        Author tolkien = new Author("TOLKIEN", "John Ronald");
        Book lotr = new Book("Lord of the Rings", 1000);
        AuthorManager.printAuthor(tolkien);
        AuthorManager.addBookToAuthorM(tolkien, lotr);
        AuthorManager.addBookToAuthorM(tolkien, lotr);
        AuthorManager.addBookToAuthorM(tolkien, lotr);
        AuthorManager.addBookToAuthorM(tolkien, lotr);
        AuthorManager.printAuthor(tolkien);
        AuthorManager.deleteBookFromAuthorForIterated(tolkien, "Lord of the Rings");
        AuthorManager.printAuthor(tolkien);
        System.out.println("Delete again");
        AuthorManager.deleteBookFromAuthorForIterated(tolkien, "Lord of the Rings");
        AuthorManager.printAuthor(tolkien);
    }
}
