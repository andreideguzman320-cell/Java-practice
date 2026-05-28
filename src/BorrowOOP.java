import java.util.*;
public class BorrowOOP {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BorrowQueue q = new BorrowQueue();
        BookNavigator w = new BookNavigator();
        while (true) {
            System.out.println("\n1. Add borrow request");
            System.out.println("2. Process Next");
            System.out.println("3. Browse Queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Book ID: ");
                        int ID = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Book Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Book Author: ");
                        String author = scanner.nextLine();
                        q.addRequest(ID, name, author);
                    }
                    case 2 -> {
                        System.out.println(q.processNext());
                    }
                    case 3 ->{
                        if(q.empty()) {
                            System.out.println("The queue is empty!");
                            break;
                        }
                        w.loadFromQueue(q.getQueue());
                        System.out.println(w.getCurrent());
                        boolean flag=true;
                        while(flag) {
                            System.out.println("Enter what you want to do" +
                                    "\n 1: Check Next Borrow request. " +
                                    "\n2: Check Previous Borrow request." +
                                    "\n3: Exit");
                            try{
                                System.out.print("Enter Choice: ");
                                int c = scanner.nextInt();
                                switch (c) {
                                    case 1 -> System.out.println(w.next());
                                    case 2 -> System.out.println(w.previous());
                                    case 3 -> {
                                        flag = false;
                                    }

                                }
                            }catch (IllegalStateException e) {
                                System.out.println("Error: " + e.getMessage());
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            } catch (InputMismatchException e) {
                                System.out.println("Enter a number, not text.");
                                scanner.nextLine();
                            }
                        }
                    }
                    case 4-> {
                        System.out.println("Thank you for using our app");
                        System.exit(0);
                    }
                }


            }catch (IllegalStateException e) {
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

