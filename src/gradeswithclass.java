import java.util.*;

public class gradeswithclass {

    static ArrayList<Students> students=new ArrayList<>();
    static Management users=null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        while (true) {
            try {
                System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
                System.out.println("1. Create Account");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student Grade");
                System.out.println("4. Delete a Student");
                System.out.println("5. Search for a Student");
                System.out.println("6. Exit");
                System.out.print("Select an option: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> createAccount();
                    case 2 -> viewStudents();
                    case 3 -> updateGrade();
                    case 4 -> deleteStudent();
                    case 5 -> searchStudent();
                    case 6 -> {
                        System.out.println("fuck you");
                        return;
                    }
                    default -> System.out.println("Invalid Input");
                }
            } catch(Exception e) {
                System.out.println("WTF?");
                scanner.nextLine();
            }


        }



    }//public main
    static void createAccount() {
        String name;
        int age;
        int studentId;
        double grades;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Enter your grades: ");
        grades = scanner.nextDouble();
        System.out.print("Enter your student ID: ");
        studentId = scanner.nextInt();

        scanner.nextLine();

        Management newUser = new Management(name, age, grades, studentId);
        students.add(newUser);
        System.out.println("Account created successfully!");
    }
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled yet.");
            return;
        }
        int i = 1; // Start counter BEFORE the loop
        for (Students student : students) {
            System.out.println(i++ + ". " + "Name: " + student.getStudent() +
                    "\n   Age: " + student.getAge() +
                    "\n   Student ID: " + student.getStudentId() +
                    "\n   Grade: " + student.getGrade());
        }
    }
    static void updateGrade() {
        if (students.isEmpty()) {
            System.out.println("No students to update.");
            return;
        }

        viewStudents(); // Show them the numbers first
        System.out.print("Enter student number: ");
        int choice = scanner.nextInt();
        int index = choice - 1; // Convert user's "1" to index "0"

        if (index >= 0 && index < students.size()) {
            System.out.print("Enter new grade: ");
            double grade = scanner.nextDouble();
            students.get(index).setGrade(grade);
            System.out.println("Grade updated!");
        } else {
            System.out.println("Invalid number.");
        }
    }
    static void deleteStudent() {
        if (students.isEmpty()) {
            System.out.println("No students to delete.");
            return;
        }

        int i = 1;
        for (Students student : students) {
            System.out.println(i++ + ". Name: " + student.getStudent());
        }

        System.out.print("Enter the number of the student to delete: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        int index = choice - 1;

        if (index >= 0 && index < students.size()) {
            Students removed = students.remove(index);
            System.out.println(removed.getStudent() + " has been removed.");
        } else {
            System.out.println("Invalid number.");
        }
    }
    static void searchStudent() {
        String search = "";
        boolean found = false;
        if (students.isEmpty()) {
            System.out.println("No students to delete.");
            return;
        }

        System.out.print("Enter Student name: ");
        search=scanner.nextLine();
        for (Students s : students) {
            if (s.getStudent().equalsIgnoreCase(search)) {
                System.out.println("Student Details: " + s.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

}//class main
