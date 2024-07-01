package src;
import java.util.ArrayList;
public class Library implements LibraryOperations{
    private ArrayList<Book>books;
    public Library(){
        this.books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added :"+book);
    }
    public void removeBook(Book book){
        if(books.remove(book)){
            System.out.println("Book removed:"+book);
        }
        else{
            System.out.println("book not found:"+book);
        }
    }
    public void updateBook(Book oldBook,Book newBook){
        int index= books.indexOf(oldBook);
        if(index!=-1){
            books.set(index,newBook);
            System.out.println("Book updated: "+newBook);
        }
        else{
            System.out.println("Book not updated: "+oldBook);
        }
    }

    @Override
    public void displayBooks() {
        if(books.isEmpty()){
            System.out.println("no books in library");
        }
        else {
            System.out.println("Books are there");
        }
    }
}