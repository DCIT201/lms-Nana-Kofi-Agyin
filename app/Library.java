package LibraryMS;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book:" + book.getTitle());
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Removed book:" + book.getTitle());
    }

    public void viewBooks() {
        System.out.println("Book List:");
        for (Book book : books) {
            System.out.println(book);
        }
    }


}
