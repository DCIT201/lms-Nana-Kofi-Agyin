package LibraryMS;

public class App {
    public static void main(String[] args) {
        Library lib = new Library();

        //  Add books
        lib.addBook(new Book("Ten Thousand Seas", "Mark"));
        lib.addBook(new Book("Leaving For The Future", "Paul Smith"));

        // Remove books
        lib.removeBook(new Book("The Forsaken Truth", "William"));


        //  View books
        lib.viewBooks();
    }
}
