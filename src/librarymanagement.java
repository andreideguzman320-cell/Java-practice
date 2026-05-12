import java.util.*;

public class librarymanagement {

    static ArrayList<Books> books=new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        while (true) {

            try {

                System.out.println("\n===== LIBRARY SYSTEM =====");
                System.out.println("1. Add Book");
                System.out.println("2. View Books");
                System.out.println("3. Borrow Book");
                System.out.println("4. Return Book");
                System.out.println("5. Search Book");
                System.out.println("6. Delete Book");
                System.out.println("7. Exit");
                System.out.print("Enter choice: ");

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){

                    case 1 -> addBook();

                    case 2 -> viewBooks();

                    case 3 -> borrowBooks();

                    case 4 -> returnBooks();

                    case 5 -> searchBook();

                    case 6 -> deleteBook();

                    case 7 -> {
                        System.out.println("Thank you for using our app");
                        return;
                    }

                    default -> System.out.println("Invalid Input");
                }

            } catch(InputMismatchException e){

                System.out.println("Invalid input!");
                scanner.nextLine();
            }
        }


    }//public main
    static void addBook(){
         String name;
         String author;
         int bookID;
         int stocks;

        System.out.print("Enter book name: ");
        name=scanner.nextLine();

        System.out.print("Enter author: ");
        author=scanner.nextLine();

        System.out.print("Enter Book ID: ");
        bookID=scanner.nextInt();

        System.out.print("Enter Stocks: ");
        stocks=scanner.nextInt();

        Books book = new Books(name,author,bookID,stocks);
        books.add(book);
    }
    static void viewBooks(){
        int i=1;
        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }
        for(Books book:books)
            System.out.println(i++ +". "+book);
    }
    static void borrowBooks(){
        int choice;
        int amount;

        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }
        viewBooks();

        System.out.print("Enter choice: ");
        choice=scanner.nextInt();

        int index=choice-1;
//
        if(index<0||index>=books.size()) {
            System.out.println("Invalid Input");
            return;
        }
        //to set index
        Books selectedBook= books.get(index);
        if(selectedBook.getStocks()<=0) {
            System.out.println("The book are out of stock");
            return;
        }

        System.out.print("Enter amount you want to borrow: ");
        amount=scanner.nextInt();

        if(amount<0 || amount>selectedBook.getStocks()){
            System.out.println("Invalid Input!");
            return;
        }
        //to update stock amount
        selectedBook.setStocks(selectedBook.getStocks() - amount);

        System.out.println("You borrowed " + amount + " copy/copies of "
                + selectedBook.getName());

    }
    static void returnBooks(){
        int choice;
        int amount;

        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        viewBooks();


        System.out.print("Enter choice: ");
        choice=scanner.nextInt();

        int index=choice-1;

        if(index<0||index>=books.size()) {
            System.out.println("Invalid Input");
            return;
        }
        //get index
        Books selectedBook= books.get(index);
        if(selectedBook.getStocks()<=0) {
            System.out.println("The book are out of stock");
            return;
        }

        System.out.print("Enter amount you want to return: ");
        amount=scanner.nextInt();

        if(amount<0){
            System.out.println("Invalid Input!");
            return;
        }
        //update stock
        selectedBook.setStocks(selectedBook.getStocks() + amount);

        System.out.println("You returned " + amount + " copy/copies of "
                + selectedBook.getName());

    }
    static void searchBook(){
        String search = "";
        boolean found=false;

        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        System.out.println("Enter Book Name: ");
        search=scanner.nextLine();
        //loop for books to find if search match
        for(Books book:books) {
            if (book.getName().equalsIgnoreCase(search)) {
                System.out.println("\n" + book);

                found = true;
                break;
            }
            if (!found) {
                System.out.println("No Books Found!");
            }
        }
    }
    static void deleteBook() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        viewBooks();

        System.out.print("\nEnter the number of the book to delete: ");

        int choice = scanner.nextInt();

        int index = choice - 1;

        if (index >= 0 && index < books.size()) {
            //set index to be removed
            Books removed = books.remove(index);

            System.out.println(removed.getName() + " has been removed.");

        } else {

            System.out.println("Invalid number.");
        }
    }

}//class main
