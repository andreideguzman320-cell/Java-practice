import java.util.*;
public class PayRollOOP {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PayRoll roll= new PayRoll();
        
        try{


            while (true){
                System.out.println("1. Add Full Time");
                System.out.println("2. Add Part Time");
                System.out.println("3. View All");
                System.out.println("4. View Pay");
                System.out.println("5. Exit");
                System.out.print("Enter Choice: ");
                int choice=scanner.nextInt();

                switch (choice) {
                    case 1->{
                        System.out.print("Enter Employee ID: ");
                        int ID=scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Employee name: ");
                        String name=scanner.nextLine();

                        System.out.print("Enter Monthly Salary");
                        double salary=scanner.nextDouble();

                        roll.addFullTime(name,ID,salary);
                    }
                    case 2->{
                        System.out.print("Enter Employee ID: ");
                        int ID=scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Employee name: ");
                        String name=scanner.nextLine();

                        System.out.print("Enter Hours Worked");
                        int hours=scanner.nextInt();

                        System.out.print("Enter Employee Rate");
                        double rate=scanner.nextDouble();

                        roll.addPartTime(name,ID,hours,rate);
                    }
                    case 3 ->{
                        roll.viewAll();
                    }
                    case 4->{
                        System.out.print("Enter Employee ID: ");
                        int ID=scanner.nextInt();

                        roll.viewPay(ID);
                    }
                    case 5-> {
                        System.out.println("Thank you for using the app");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid Choice");


                }
            }


        }catch(IllegalStateException |IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Something Went Wrong");
        }

    }
}

