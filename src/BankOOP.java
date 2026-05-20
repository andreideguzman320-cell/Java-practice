import java.util.*;
public class BankOOP {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        Bank account=new Bank();

        while (true) {
            System.out.println("\n1. Add Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer Funds");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Account ID: ");
                        int ID = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Username: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter balance: ");
                        double balance = scanner.nextDouble();
                        account.addAccount(name, balance, ID);
                    }
                    case 2 -> account.viewAccount();
                    case 3 -> {
                        account.viewAccount();
                        System.out.print("Enter Account ID: ");
                        int ID = scanner.nextInt();
                        System.out.print("Enter amount you want to deposit: ");
                        double amount = scanner.nextDouble();
                        account.deposit(ID,amount);
                    }
                    case 4 -> {
                        account.viewAccount();
                        System.out.print("Enter Account ID: ");
                        int ID = scanner.nextInt();
                        System.out.print("Enter amount you want to withdraw: ");
                        double amount = scanner.nextDouble();
                        account.withdraw(ID,amount);
                    }
                    case 5 -> {
                        account.viewAccount();
                        System.out.print("Enter User ID: ");
                        int ID1 = scanner.nextInt();

                        System.out.print("Enter amount you want to transfer: ");
                        double amount = scanner.nextDouble();

                        System.out.print("Enter money recipient: ");
                        int ID2 = scanner.nextInt();

                        account.transfer(amount,ID1,ID2);
                    }
                    case 6 -> {
                        System.out.println("Thank you for using the app");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (IllegalStateException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Enter a number, not text.");
                scanner.nextLine();
            }
        }
    }
}

// scanner
// menu loop — same pattern as your LibraryOOP.java
// handle IllegalStateException and IllegalArgumentException