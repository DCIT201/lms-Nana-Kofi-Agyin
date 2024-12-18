package LibraryMS;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Books> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Books book) {
        books.add(book);
        System.out.println("Added book:" + book.getTitle());
    }

    public void removeBook(Books book) {
        books.remove(book);
        System.out.println("Removed book:" + book.getTitle());
    }

    public void viewBooks() {
        System.out.println("Book List:");
        for (Books book : books) {
            System.out.println(book);
        }
    }


}
