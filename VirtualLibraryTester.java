public class VirtualLibraryTester {
    public static void main(String[] args) {
        // Test Book class functionality
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789");
        Book book2 = new Book("1984", "George Orwell", "987654321");

        assert book1.getTitle().equals("The Great Gatsby") : "Book title mismatch.";
        assert book1.getAuthor().equals("F. Scott Fitzgerald") : "Book author mismatch.";
        assert book1.getISBN().equals("123456789") : "Book ISBN mismatch.";
        assert book1.isAvailable() : "New book should be available.";

        // Test Library class functionality
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        // Initially, both books should be available
        assert library.checkBookAvailability("123456789") : "Book should be available.";
        assert library.checkBookAvailability("987654321") : "Book should be available.";

        // Lend a book and check availability
        library.lendBook("123456789");
        assert !library.checkBookAvailability("123456789") : "Book should be lent out.";

        // Test display functionality (visual inspection)
        System.out.println("Available books after lending out The Great Gatsby:");
        library.displayAvailableBooks();

        // Test returning a book
        library.returnBook("123456789");
        assert library.checkBookAvailability("123456789") : "Book should be available after return.";

        System.out.println("All tests passed.");
    }
}
