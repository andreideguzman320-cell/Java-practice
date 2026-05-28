import java.util.*;
public class GradesAverage {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Tracker student = new Tracker();
        while (true) {
            System.out.println("\n1.  Add Student");
            System.out.println("2.  Add Grade");
            System.out.println("3.  View All");
            System.out.println("4.  View Average");
            System.out.println("5.  Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Student ID: ");
                        int ID = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();
                        student.addStudent(name, ID);
                    }
                    case 2 -> {
                        System.out.print("Enter Student ID: ");
                        int ID = scanner.nextInt();
                        System.out.print("Enter Grade: ");
                        int grade = scanner.nextInt();
                        student.addGrade(ID, grade);

                    }
                    case 3 -> student.viewAll();

                    case 4 -> {
                        System.out.println("Enter Student ID");
                        int ID = scanner.nextInt();
                        student.viewAverage(ID);
                    }
                    case 5 -> {
                        System.out.println("Thank you for using app ");
                        System.exit(0);

                    }


                    default -> {
                        System.out.println("Invalid Choice!");
                    }
                }


            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

// scanner
// menu loop — same pattern as your
// handle IllegalStateException and IllegalArgumentException