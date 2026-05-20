import java.util.*;
public class StoreOOP {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Inventory inventory=new Inventory();

        int choice;

        while (true) {
            System.out.println("\n1.  Add Product");
            System.out.println("2.  View Products");
            System.out.println("3.  Add Stock");
            System.out.println("4.  Sell Products");
            System.out.println("5.  Search Product by ID");
            System.out.println("6.  Remove Product");
            System.out.println("7.  Exit");
            System.out.print("Enter choice: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Product name: ");
                        String name=scanner.nextLine();
                        System.out.print("Enter Category: ");
                        String category=scanner.nextLine();
                        System.out.print("Enter Product Price");
                        double price=scanner.nextDouble();
                        System.out.print("Enter Product stock");
                        int stock=scanner.nextInt();
                        System.out.print("Enter Product ID: ");
                        int ID=scanner.nextInt();

                        inventory.addProduct(name,category,price,stock,ID);
                    }
                    case 2-> inventory.viewProducts();
                    case 3->{
                        inventory.viewProducts();
                        System.out.print("Enter Product number: ");
                        int index=scanner.nextInt()-1;
                        System.out.print("Enter Amount you want to add");
                        int amount=scanner.nextInt();
                        inventory.addStock(index,amount);
                    }
                    case 4->{
                        inventory.viewProducts();
                        System.out.print("Enter Product number to purchase: ");
                        int index=scanner.nextInt()-1;
                        System.out.print("Enter amount you want to purchase: ");
                        int amount=scanner.nextInt();
                        inventory.sellProduct(index,amount);


                    }
                    case 5->{
                        System.out.print("Enter book to search: ");
                        int ID=scanner.nextInt();
                        inventory.searchProduct(ID);
                    }
                    case 6->{
                        inventory.viewProducts();
                        System.out.print("Enter Product to remove: ");
                        int index=scanner.nextInt()-1;
                        inventory.removeProduct(index);
                    }
                    case 7->{
                        System.out.println("Thank you for using the app");
                        System.exit(0);
                    }
                    default->{
                        System.out.println("Choose a valid number: ");

                    }
                }


            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Enter a number, not text.");
                scanner.nextLine();
            }catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());

            }
        }
    }//class main
}//public void main