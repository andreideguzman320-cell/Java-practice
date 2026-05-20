import java.util.*;
 public class Library {
     public ArrayList<Book> books = new ArrayList<>();
     public void addBook(String name,String author,int ID){
         if(ID<0){
             throw new  IllegalArgumentException("ID cannot be negative.");
         }
         for(Book book:books){
             if (book.getID()==ID) {
                 throw new IllegalStateException("Book already Exist");
             }
         }

         books.add(new Book(name,author,ID));
         System.out.println(name+" has been added");
     }
     public void viewBooks(){
         int i=1;

         if (books.isEmpty()) {
             throw new IllegalStateException("No books available.");
         }
         for(Book book:books){
             System.out.println(i++ +". " + book);
         }
     }
     public void borrowBook(int index){

         if (books.isEmpty()) {
             throw new IllegalStateException("No books available.");
         }
         if (index < 0 || index >= books.size()) {
             throw new IllegalArgumentException("Invalid book selection.");
         }
         Book borrow=books.get(index);
         if(!borrow.getAvailable()){
             throw new IllegalStateException("Book not available.");
         }
         borrow.setAvailable(false);

             System.out.println(borrow.getName()+" has been borrowed");

     }
     public void returnBook(int index) {

         if (books.isEmpty()) {
             throw new IllegalStateException("No books available.");
         }
         if (index < 0 || index >= books.size()) {
             throw new IllegalArgumentException("Invalid book selection.");
         }
         Book returned = books.get(index);
         returned.setAvailable(true);

         System.out.println(returned.getName() + " has been returned");
     }
     public void searchBook(int ID){
         if (books.isEmpty()) {
             throw new IllegalStateException("No books available.");
         }
         if (ID < 0 ) {
             throw new IllegalArgumentException("Invalid book selection.");
         }
         boolean found=false;

         for (Book book : books) {
             if (book.getID()==(ID)) {
                 System.out.println("\n" + book);
                 found = true;
                 break;
             }
         }
             if (!found) {
                 throw new IllegalArgumentException("No book found with that ID.");
             }
     }
}
