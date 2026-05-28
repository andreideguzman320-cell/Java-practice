import java.util.*;
public class TicketOOP {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TicketHistory w = new TicketHistory();
        TicketQueue e = new TicketQueue();

        while (true) {
            System.out.println("\n1. Add Ticket Request");
            System.out.println("2. Process Next");
            System.out.println("3. Browse History");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Ticket number: ");
                        int number = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Issue: ");
                        String issue = scanner.nextLine();
                        e.submit(name, issue, number);
                    }
                    case 2 -> {
                        Ticket r=e.next();
                        System.out.println(r);
                        w.addHistory(r);

                    }
                    case 3 ->{
                        if (w.empty())
                            throw new IndexOutOfBoundsException("Queue History is empty");
                        w.reset();
                        System.out.println(w.current());
                        boolean flag=true;
                        while(flag) {
                            System.out.println("Enter what you want to do" +
                                    "\n 1: Check Next Ticket request. " +
                                    "\n2: Check Previous Ticket request." +
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
                            }catch (IllegalStateException p) {
                                System.out.println("Error: " + p.getMessage());
                            } catch (IllegalArgumentException p) {
                                System.out.println("Error: " + p.getMessage());
                            } catch (InputMismatchException p) {
                                System.out.println("Enter a number, not text.");
                                scanner.nextLine();
                            }
                            catch (IndexOutOfBoundsException p) {
                                System.out.println(p.getMessage());
                            }

                        }
                    }
                    case 4-> {
                        System.out.println("Thank you for using our app");
                        System.exit(0);
                    }
                }


            }catch (IllegalStateException p) {
                System.out.println("Error: " + p.getMessage());
            } catch (IllegalArgumentException p) {
                System.out.println("Error: " + p.getMessage());
            } catch (InputMismatchException p) {
                System.out.println("Enter a number, not text.");
                scanner.nextLine();
            }catch (IndexOutOfBoundsException p) {
                System.out.println(p.getMessage());
            }


        }

    }
}

