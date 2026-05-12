import java.util.*;

public class ministore {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String [] products={"coke","chips","candy"};
        int [] stocks={10,5,20};
        double [] prices={25.0,15.0,10.0};
        int choice=0;

        while (true){
            System.out.println("1.View Inventory\n2.Add Stock\n3.Sell Product\n4.Exit\n");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            if (choice > 3) {
                System.out.println("Invalid Input");
            }
            switch (choice) {
                case 1 -> viewInventory(products,stocks);
                case 2-> addStock(stocks);
                case 3 -> sellProduct(stocks,prices,products);
                case 4 -> {
                    System.out.println("Thank you for using our app");
                    return;
                }
            }


        }
    }
    static void viewInventory(String [] products,int [] stocks){

    }
    static int addStock(int [] stocks){
        int amount=0;
        int choice=0;

        System.out.println("Which product would you like to add stocks? ");
        System.out.println("1.Coke\n2.Chips\n3.Candy\n");
        choice=scanner.nextInt();

        int productIndex=choice-1;
        System.out.print("How many would you like to add? ");
        amount=scanner.nextInt();

        stocks[productIndex] += amount;

        if(amount < 0) {
            System.out.println("You cannot enter a negative amount! ");
            return 0;
        }

        return 0;
    }
    static int sellProduct(int [] stocks,double [] prices,String [] products){
        int choice=0;
        int amount=0;

        System.out.println("1.Coke\n2.Chips\n3.Candy\n");
        System.out.print("What product do you want to buy?\n");
        choice=scanner.nextInt();
        if(choice < 0 || choice >= products.length+1){
            System.out.println("Invalid product!");
            return 0;
        }
        System.out.print("How much do you want to buy?\n");
        amount=scanner.nextInt();

        int index=choice-1;
        if(index < 0 || index >= products.length){
            System.out.println("Invalid product!");
            return 0;
        }
        double total = amount * prices[index];
        if (amount<0) {
            System.out.println("You cannot buy a negative amount!");
            return 0;
        }
        else if (amount > stocks[index]){
            System.out.println("You have exceeded what we have in stock!");
            return 0;
        }else {
            stocks[index] -= (int) amount;
        }
        System.out.println("sold "+amount+" "+products[index]+" for $"+total);

        return 0;
    }
}