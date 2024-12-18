package LibraryMS;

public class App {
    public static void main(String[] args) {
        Library lib = new Library();

        //  Add books
        lib.addBook(new Books("Ten Thousand Seas", "Mark"));
        lib.addBook(new Books("Leaving For The Future", "Paul Smith"));

        // Remove books
        lib.removeBook(new Books("The Forsaken Truth", "William"));


        //  View books
        lib.viewBooks();
    }
}
