import java.util.*;
public class librarymanagement {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Books> books =new ArrayList<>();
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

                    case 5 -> searchBooks();

                    case 6 -> deleteBooks();

                    case 7 -> {
                        System.out.println("Thank you for using our app");
                        System.exit(0);
                    }

                    default -> System.out.println("Invalid Input");
                }

            } catch(InputMismatchException e){

                System.out.println("Invalid input!");
                scanner.nextLine();
            }
        }


    }//void main
    static void addBook(){
        try{
            String name;
            String author;
            int bookID;
            int stock;

            System.out.print("Enter book ID: ");
            bookID = scanner.nextInt();
            scanner.nextLine();
            for (Books book : books) {
                if (book.getBookID() == (bookID)) {
                    System.out.println("This book already exist!");
                    return;
                }
            }

            System.out.print("Enter Book Name: ");
            name = scanner.nextLine();

            System.out.print("Enter book author: ");
            author = scanner.nextLine();


            System.out.print("Enter book stock: ");
            stock = scanner.nextInt();

            Books book = new Books(name, author, bookID, stock);

            books.add(book);
        }catch(Exception e){
            System.out.println("Invalid Input");
        }
    }
    static void viewBooks(){
        int i=1;
        if(books.isEmpty()){
            System.out.println("No books available");
            System.exit(0);
        }
        for(Books book:books){
            System.out.println(i++ +". "+ book);
        }
    }
    static void borrowBooks(){
        try{
            int choice;
            int amount;
            if (books.isEmpty()) {
                System.out.println("No books available");
                return;
            }

            viewBooks();

            System.out.print("Enter Book: ");
            choice = scanner.nextInt();

            int index = choice - 1;

            if (index < 0 || index >= books.size()) {
                System.out.println("invalid input");
                return;
            }

            System.out.print("Enter the amount you want to borrow: ");
            amount = scanner.nextInt();

            if (amount < 0) {
                System.out.println("You cannot borrow a negative amount of books");
                return;
            }

            Books bookSelected = books.get(index);

            if (bookSelected.getStocks() < amount) {
                System.out.println("amount inputted Exceeded stock");
                return;
            }

            bookSelected.setStocks(bookSelected.getStocks() - amount);

        }catch(Exception e){
            System.out.println("Invalid Input");
        }
    }
    static void returnBooks(){
        try{
            int choice;
            int amount;
            if (books.isEmpty()) {
                System.out.println("No books available");
                return;
            }

            viewBooks();
            System.out.print("Enter Book: ");
            choice = scanner.nextInt();

            int index = choice - 1;

            if (index < 0 || index >= books.size()) {
                System.out.println("invalid input");
                return;
            }

            System.out.print("Enter the amount you want to return: ");
            amount = scanner.nextInt();

            Books limit = books.get(index);

            if (amount < 0) {
                System.out.println("You cannot return a negative amount of books");
                System.exit(0);
            } else if ((amount + limit.getStocks()) > limit.getLimit()) {
                System.out.println("Cannot exceed the original amount");
                return;
            }


            Books bookSelected = books.get(index);

            bookSelected.setStocks(bookSelected.getStocks() + amount);
        }catch (Exception e){
            System.out.println("Invalid input");
        }
    }
    static void searchBooks(){
        try{
            String search;
            boolean found = false;
            if (books.isEmpty()) {
                System.out.println("No Books!");
                return;
            }

            System.out.print("Enter book name to search: ");
            search = scanner.nextLine();

            for (Books book : books) {
                if (book.getName().equalsIgnoreCase(search)) {
                    System.out.println("\n" + book);
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.println("No books Found");
        }catch(Exception e){
            System.out.println("Invalid Input");
        }
    }
    static void deleteBooks(){
        try{
            int choice;

            viewBooks();

            System.out.println("Enter book to remove");
            choice = scanner.nextInt();

            int index = choice - 1;

            if (index >= 0 && index < books.size()) {

                Books removed = books.remove(index);

                System.out.println(removed.getName() + " has been removed");
            } else {
                System.out.println("Invalid input");
            }
        }catch(Exception e){
            System.out.println("Invalid Input");
        }
    }

}//public class main