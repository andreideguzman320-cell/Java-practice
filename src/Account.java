import java.util.*;

public class Account {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pin=1234;
        int inputPin=0;
        int attempts = 0;
        int limit=3;
        int choice=0;
        double balance=1000;
        boolean condition = true;
        boolean isLoggedIn=false;

        while(attempts<limit) {
            System.out.println("Enter Pin: ");
            inputPin=scanner.nextInt();
            if(inputPin==pin){
                isLoggedIn=true;
                break;
            }else
                attempts++;

        }if(!isLoggedIn) {
            System.out.println("You've been locked out!");
            return;
        }

        do{
            System.out.println("1.View Balance\n2.Deposit\n3.Withdraw\n4.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> viewBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> condition = false;
            }
        }while(condition);


    }
    static void viewBalance(double balance){
        System.out.printf("$%.2f\n",balance);
    }
    static double deposit(){
        double amount=0;
        System.out.println("Enter the amount you want to Deposit: ");
        amount=scanner.nextDouble();
        if(amount<0) {
            System.out.println("You cannot deposit a negative amount! ");
            return 0;
        }
        else
            System.out.println("You have deposited: "+ "$"+amount);

        return amount;
    }
    static double withdraw(double balance){
        double amount=0;
        System.out.print("Enter the amount you want to withdraw: ");
        amount=scanner.nextDouble();
        if(amount<0){
            System.out.println("You cannot withdraw a negative amount");
            return 0;
        }else if (amount>balance){
            System.out.println("Insufficient Funds!");
            return 0;
        }else
            return amount;
    }



}