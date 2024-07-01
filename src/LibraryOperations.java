package src;

public interface LibraryOperations {
    void addBook(Book book);
    void removeBook(Book book);
    void updateBook(Book oldBook,Book newBook);
    void displayBooks();
}
