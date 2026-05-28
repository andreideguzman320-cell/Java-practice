import java.util.*;
public class QueueingOOP {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        WaitingQueue q = new WaitingQueue();
        PatientNavigator w = new PatientNavigator();
        while (true) {
            System.out.println("\n1. Add Patient");
            System.out.println("2. Attend Next");
            System.out.println("3. Browse Queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Patient ID: ");
                        int ID = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Patient Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Patient Age: ");
                        int age = scanner.nextInt();
                        q.enqueue(ID, name, age);
                    }
                    case 2 -> {
                        q.checkQueue();
                        System.out.println(q.deque());
                    }
                    case 3 ->{
                        if(q.empty()) {
                            System.out.println("The queue is empty!");
                            break;
                        }
                        w.loadFromQueue(q.getQueue());
                        System.out.println(w.currentPatient());
                        boolean flag=true;
                        while(flag) {
                            System.out.println("Enter what you want to do" +
                                    "\n 1: Check Next Patient. " +
                                    "\n2: Check Previous Patient." +
                                    "\n3: Exit");
                            try{
                                System.out.print("Enter Choice: ");
                                int c = scanner.nextInt();
                                switch (c) {
                                    case 1 -> System.out.println(w.nextPatient());
                                    case 2 -> System.out.println(w.previousPatient());
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

