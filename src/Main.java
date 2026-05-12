import java.util.*;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Books> books =new ArrayList<>();
    public static void main(String[] args) {
        addBook();
        viewBooks();

    }//void main
static void addBook(){
    String name;
    String author;
    int bookID;
    int stock;

    System.out.print("Enter Book Name: ");
    name=scanner.nextLine();

    System.out.print("Enter book author: ");
    author=scanner.nextLine();

    System.out.print("Enter book ID: ");
    bookID=scanner.nextInt();

    System.out.print("Enter book stock: ");
    stock=scanner.nextInt();

    Books book=new Books(name,author,bookID,stock);
    books.add(book);
}
static void viewBooks(){
    if(books.isEmpty()){
        System.out.println("No books available");
        return;
    }
    for(Books book:books){
        System.out.println(book);
    }
}

}//public class main