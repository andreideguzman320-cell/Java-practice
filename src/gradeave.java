import java.util.*;

public class gradeave {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String student;
        ArrayList<Double> grades= new ArrayList<>();
        String choice = "";
        double total ;
        double average;

        System.out.print("Enter your name: ");
        student=scanner.nextLine();

        System.out.print("Enter your Grades: ( Enter -1 to stop): ");

        while(true) {
            double grade = scanner.nextDouble();
            if (grade == -1) break;
            grades.add(grade);
        }
        scanner.nextLine();
        System.out.print("Do you wish to see your average? (y/n)");
        choice = scanner.nextLine().toLowerCase();
 
        switch(choice) {
            case "y" ->{
                if (grades.isEmpty())
                    System.out.println("No Grades Entered!");
                else{
                    System.out.println("Your grades:");
                    for(double grade : grades){
                        System.out.println(grade);
                    }
                    double sum = 0;
                    for(double grade : grades){
                        sum += grade;
                    }
                    average = sum / grades.size();
                    System.out.println("Your average is: " + average);
                }

            }
            default->{
                System.out.println("Invalid Input!");
            }
        }

        scanner.close();
    }
}
