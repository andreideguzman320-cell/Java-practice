import java.util.*;
public class MovieOOP {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        VideoStore shop=new VideoStore(); 
        int choice = 0;

        while (true) {
            System.out.println("\n1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Rent Movie");
            System.out.println("4. Return Movie");
            System.out.println("5. View Rentals");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            try{
                choice = scanner.nextInt();
                scanner.nextLine();

                switch(choice){
                    case 1->{
                        System.out.print("Enter ID");
                        int ID=scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Movie name");
                        String name=scanner.nextLine();
                        System.out.print("Enter Movie Price");
                        double price=scanner.nextDouble();
                        shop.addMovie(name,ID,price);
                    }
                    case 2->{
                        shop.viewMovies();
                    }
                    case 3->{
                        shop.viewMovies();
                        System.out.print("Enter ID: ");
                        int ID=scanner.nextInt();
                        shop.rentMovies(ID);
                    }
                    case 4->{
                        shop.viewRentals();
                        System.out.print("Enter Movie ID");
                        int ID=scanner.nextInt();
                        shop.returnMovies(ID);
                    }
                    case 5->{
                        shop.viewRentals();

                    }
                    case 6->{
                        System.out.println("Thank you for using our movie rental App");
                        System.exit(0);
                    }
                    default-> System.out.println("Enter a valid choice!");

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

