import java.util.*;

public class addcart {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] products = {"bag", "shoes", "gloves"};
        double[] prices = {10.0, 15.0, 20.0};

        String[] cartProducts = new String[10];
        int[] cartQuantities = new int[10];
        int cartCount = 0;

        int choice;

        while (true) {
            System.out.println("\n1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid Input");
                continue;
            }

            switch (choice) {
                case 1 -> viewProducts(products, prices);

                case 2 -> cartCount = addCart(products, cartProducts, cartQuantities, cartCount);

                case 3 -> viewCart(cartProducts, cartQuantities, prices, cartCount);

                case 4 -> {
                    checkout(cartProducts, cartQuantities, prices, cartCount);
                    cartCount = 0;
                }

                case 5 -> {
                    System.out.println("Thank you for using our app");
                    return;
                }
            }
        }
    }

    static void viewProducts(String[] products, double[] prices) {
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - $" + prices[i]);
        }
    }

    static int addCart(String[] products,
                       String[] cartProducts,
                       int[] cartQuantities,
                       int cartCount) {

        System.out.println("Select product:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }

        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        int index = choice - 1;

        if (index < 0 || index >= products.length) {
            System.out.println("Invalid product");
            return cartCount;
        }

        System.out.print("Quantity: ");
        int qty = scanner.nextInt();

        if (qty <= 0) {
            System.out.println("Invalid quantity");
            return cartCount;
        }

        cartProducts[cartCount] = products[index];
        cartQuantities[cartCount] = qty;

        cartCount++;

        System.out.println("Added to cart.");

        return cartCount;
    }

    static void viewCart(String[] cartProducts,
                         int[] cartQuantities,
                         double[] prices,
                         int cartCount) {

        double total = 0;

        System.out.println("\n--- CART ---");

        for (int i = 0; i < cartCount; i++) {
            String product = cartProducts[i];
            int qty = cartQuantities[i];

            // find price
            double price = 0;
            for (int j = 0; j < 3; j++) {
                if (product.equalsIgnoreCase(getProductName(j))) {
                    price = prices[j];
                }
            }

            double subtotal = qty * price;
            total += subtotal;

            System.out.println(product + " x" + qty + " = $" + subtotal);
        }

        System.out.println("Total: $" + total);
    }

    static void checkout(String[] cartProducts,
                         int[] cartQuantities,
                         double[] prices,
                         int cartCount) {

        viewCart(cartProducts, cartQuantities, prices, cartCount);
        System.out.println("Checkout complete!");
    }

    static String getProductName(int index) {
        return switch (index) {
            case 0 -> "bag";
            case 1 -> "shoes";
            case 2 -> "gloves";
            default -> "";
        };
    }
}