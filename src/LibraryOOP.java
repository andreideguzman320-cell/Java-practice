import java.util.*;
public class LibraryOOP {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library();
        int choice;

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Search Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Book ID: ");
                        int ID = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Book name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Author: ");
                        String author = scanner.nextLine();
                        library.addBook(name, author, ID);
                    }
                    case 2 -> library.viewBooks();
                    case 3 -> {
                        library.viewBooks();
                        System.out.print("Enter book number to borrow: ");
                        int index = scanner.nextInt() - 1;
                        library.borrowBook(index);
                    }
                    case 4 -> {
                        System.out.print("Enter Book ID to search: ");
                        int id = scanner.nextInt();
                        library.searchBook(id);
                    }
                    case 5 -> {
                        library.viewBooks();
                        System.out.print("Enter book to return: ");
                        int index = scanner.nextInt() - 1;
                        library.returnBook(index);
                    }
                    case 6 -> {
                        System.out.println("Thank you for using the app");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Enter a number, not text.");
                scanner.nextLine();
            }
        }
    }
}