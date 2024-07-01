package src;
import java.util.Scanner;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library=new Library();
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        while(!exit){
            System.out.println("Library Management System");
            System.out.println("1.Add Book");
            System.out.println("2.Remove Book");
            System.out.println("3.Update Book");
            System.out.println("4.Display Book");
            System.out.println("5.Exit");
            System.out.print("Enter");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println( "Add book title");
                    String title= sc.nextLine();
                    System.out.println("Enter author");
                    String author=sc.nextLine();
                    System.out.println("Enter ISBN");
                    String isbn=sc.nextLine();
                    System.out.println("Enter number of copies");
                    int NumberOfCopies=sc.nextInt();
                    sc.nextLine();
                    Book newBook=new Book(title,author,isbn,NumberOfCopies);
                    library.addBook(newBook);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    exit=true;
                    System.out.println("Exit library Management System");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
        sc.close();
    }
}
