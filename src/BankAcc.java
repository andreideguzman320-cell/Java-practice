class BankAcc{
    private String username;
    private double balance;
    BankAcc(String username,double balance){
        this.username=username;
        this.balance=balance;
    }
    String getUsername(){
        return username;
    }
    double getBalance(){
        return balance;
    }
    void deposit(double amount){
        if(amount<0){
            System.out.println("Enter a positive amount");
            return;
        }
        balance+=amount;
        System.out.println("You have deposited $"+amount);

        System.out.println("You new is balance $"+balance);
    }
    void withdraw(double amount){
        if(amount<0){
            System.out.println("Enter a positive amount");
            return;
        } else if(amount>balance){
            System.out.println("Insufficient funds");
            return;
        }
        balance-=amount;
        System.out.println("Your new balance is: $"+balance);
    }


}