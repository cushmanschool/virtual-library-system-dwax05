[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=13789241)

# Virtual Library System Project

## Description
Create a simple Virtual Library System in Java that allows users to manage a collection of books. The system will enable users to add new books, lend books, and display available books.

## Components

### 1. Book Class
#### Fields:
- `title` (String): The title of the book.
- `author` (String): The author of the book.
- `ISBN` (String): The unique ISBN of the book.
- `isAvailable` (boolean): A flag to check if the book is available.

#### Constructor:
- `Book(String title, String author, String isbn)`: Initializes the fields of the book.

#### Accessor Methods:
- `getTitle()`: Returns the title of the book.
- `getAuthor()`: Returns the author of the book.
- `getISBN()`: Returns the ISBN of the book.
- `isAvailable()`: Returns the availability of the book.

#### Mutator Method:
- `setAvailability(boolean isAvailable)`: Sets the availability of the book.

### 2. Library Class
#### Fields:
- `books` (ArrayList<Book>): A collection to store the books.

#### Methods:
- `addBook(Book book)`: Adds a new book to the collection.
- `lendBook(String isbn)`: Lends a book based on its ISBN.
- `displayAvailableBooks()`: Displays all available books.

### 3. Main Class
A menu-driven program to interact with the library system.

#### Functionality:
- Add a new book to the library.
- Lend a book to a user.
- Display all available books.
- Exit the program.

## Instructions for Students
1. Read and understand the provided code structure and classes.
2. Implement any missing parts in the code.
3. Test the system by adding several books, lending out some books, and displaying the available books.
4. (Optional) Extend the functionality by adding features like returning books, searching for books by title or author, etc.

## Learning Objectives
- Understand and apply basic Java concepts like primitive types, object usage, booleans, conditional statements, iterations, and class design.
- Practice object-oriented programming principles.
- Develop a small-scale functional system using Java.

## Deliverables
- Complete Java code fulfilling all the requirements of the project.
- (Optional) Additional features or enhancements to the basic system.
