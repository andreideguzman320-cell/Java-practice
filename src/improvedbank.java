import java.util.*;

public class improvedbank {


    static Scanner scanner = new Scanner(System.in);
    static BankAcc bank = null;
    static ArrayList<BankAcc> users= new ArrayList<>();

    static int transaction = 0;
    public static void main(String[] args) {

        int choice = 0;

        while(true){
            try {
                System.out.println("1.Create Account\n2.View Account\n3.Deposit\n4.Withdraw\n5.Select Account\n6.Exit");
                choice = scanner.nextInt();
                scanner.nextLine();


                switch (choice) {
                    case 1 -> createAccount();

                    case 2 -> viewAccount();

                    case 3 -> deposit();

                    case 4 -> withdraw();

                    case 5 -> selectAccount();

                    case 6 -> {
                        System.out.println("You have made " + transaction + " transactions");
                        return;
                    }

                    default -> {
                        System.out.println("Invalid choice");
                    }
                }
            }
            catch(Exception e) {
                System.out.println("Invalid input then yeah?");
                scanner.nextLine();

            }
        }

    }//public main



    static void createAccount(){
        double amount;
        String username;
        System.out.println("Enter username: ");
        username=scanner.nextLine();
        System.out.print("Enter the amount you want to Deposit: ");
        amount=scanner.nextDouble();
        scanner.nextLine();
        if(amount<0) {
            System.out.println("Invalid Input!");
            return;
        }
        bank=new BankAcc(username,amount);
        users.add(bank);
        System.out.println(bank.getUsername()+ " You have deposited $"+bank.getBalance());
        bank = null;

    }
    static void viewAccount(){
        int i=1;
        if(bank==null) {
            System.out.println("Create/select a account first! ");
            return;
        }
        for(BankAcc user:users)
            System.out.println(i++ +". " +  user.getUsername()+" With the balance of $"+bank.getBalance());

    }
    static void deposit(){
        double amount;
        if(bank==null) {
            System.out.println("Create/select a account first! ");
            return;
        }
        System.out.print("Enter the amount you want to deposit: ");
        amount=scanner.nextDouble();
        bank.deposit(amount);

        transaction++;
    }
    static void withdraw(){
        double amount;

        if(bank==null) {
            System.out.println("Create/select a account first! ");
            return;
        }
        System.out.print("Enter the amount you want to withdraw: ");
        amount=scanner.nextDouble();

        bank.withdraw(amount);

        transaction++;

    }
    static void selectAccount(){

        int i = 1;

        for(BankAcc user : users){
            System.out.println(i++ + ". " + user.getUsername());
        }

        System.out.print("Choose account: ");
        int choice = scanner.nextInt();

        int index = choice - 1;

        if(index < 0 || index >= users.size()){
            System.out.println("Invalid account!");
            return;
        }

        bank = users.get(index);

        System.out.println(
                "Logged into " + bank.getUsername()
        );
    }

}//class main