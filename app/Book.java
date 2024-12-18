package LibraryMS;

public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    // getters
    public String getTitle() {
        return title;
    }

//    public String getAuthor() {
//        return author;
//    }

//    public String getPublisher() {
//        return publisher;
//    }

//    public String getIsbn() {
//        return isbn;
//    }

    public boolean isAvailable() {
        return available;
    }

    // setters

//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//

//
//    public void setAvailable(boolean available) {
//        this.available = available;
//    }

    public void borrow() {
        if (available) {
            available = false;
        } else {
            System.out.println(title + " is already borrowed");
        }
    }

    public void returnBook() {
        available = true;
    }

    public String toString() {
        return title + " by " + author + ", " + "Available: " + available;
    }
}

