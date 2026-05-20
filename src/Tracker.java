import java.util.ArrayList;

public class Tracker {
    private ArrayList<Student> grades = new ArrayList<>();

    public void addStudent(String name, int ID) {
        if (ID < 0) {
            throw new IllegalArgumentException("ID cannot be negative!");
        }
        for (Student grade : grades) {
            if (grade.getID() == ID) {
                throw new IllegalStateException("Student already exist!");
            }
        }

        grades.add(new Student(name, ID));
        System.out.println("Student " + name + " has been added");


    }

    public void addGrade(int ID, int grade) {
        if (ID < 0) {
            throw new IllegalArgumentException("ID cannot be negative");
        }
        Student found = null;
        for (Student s : grades) {
            if (s.getID() == ID) {
                found = s;
                break;
            }
        }
        if (found == null) {
            throw new IllegalArgumentException("Student not found!");
        }
        found.addGrade(grade);
    }

    public void viewAll() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student not found!");
        }
        int i = 1;
        for (Student s : grades) {
            System.out.println(i++ + ". " + s);
        }
    }

    public void viewAverage(int ID) {

        if (ID < 0) {
            throw new IllegalArgumentException("ID cannot be negative");
        }

        Student found = null;
        for (Student s : grades) {
            if (s.getID() == ID) {
                found = s;
                System.out.println(found);
                break;
            }
        }
        if (found == null) {
            throw new IllegalArgumentException("Student not found!");
        }

    }
}





