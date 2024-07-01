package src;

public class Book {
   private String title;
   private String author;
   private String isbn;
   private int NumberOfCopies;
   public Book(String title,String author,String isbn,int NumberOfCopies){
       this.title=title;
       this.author=author;
       this.isbn=isbn;
       this.NumberOfCopies=NumberOfCopies;
   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumberOfCopies() {
        return NumberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        NumberOfCopies = numberOfCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ",author='" + author + '\'' +
                ",isbn='" + isbn + '\'' +
                ",NumberOfCopies='" + NumberOfCopies + '\'' +
                '}';
    }
}
