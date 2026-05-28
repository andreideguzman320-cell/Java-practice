import java.util.*;
public class ShopOOP {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Shop shop=new Shop();
        int choice;

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Add to Cart");
            System.out.println("4. Remove from Cart");
            System.out.println("5. View Cart");
            System.out.println("6. Checkout");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Product ID: ");
                        int ID = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Product name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Product stock: ");
                        int stock = scanner.nextInt();
                        System.out.print("Enter Product price: ");
                        double price = scanner.nextDouble();
                        shop.addItem(name,ID,stock,price);
                    }
                    case 2 -> shop.viewAll();
                    case 3 -> {
                        shop.viewAll();
                        System.out.print("Enter product ID: ");
                        int ID=scanner.nextInt();
                        System.out.print("Enter Amount to add: ");
                        int amount=scanner.nextInt();
                        shop.addToCart(ID,amount);
                    }
                    case 4 -> {
                        System.out.print("Enter Product ID to remove: ");
                        int id = scanner.nextInt();
                        shop.removeFromCart(id);
                    }
                    case 5 -> {
                        shop.viewCart();
                    }
                    case 6 ->{
                        shop.checkout();
                    }
                    case 7 -> {
                        System.out.println("Thank you for using the app");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (IllegalStateException e) {
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

