import java.util.ArrayList;

public class Library {

    ArrayList<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.ISBN.equals(isbn)) {
                book.setAvailability(true);
                System.out.println("Book with ISBN " + isbn + " has been returned.");
            }
        }
    }

    public void lendBook(String isbn) {
        for (Book book : books) {
            if (book.ISBN.equals(isbn)) {
                book.setAvailability(false);
                System.out.println("Book with ISBN " + isbn + " has been lent out.");
            }
        }
    }

    public Boolean checkBookAvailability(String isbn) {
        for (Book book : books) {
            if (book.ISBN.equals(isbn)) {
                return book.isAvailable();
            }
        }
        return false;
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books: ");

        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

}
