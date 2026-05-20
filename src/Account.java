
public class Account {

    String name;
    double balance;
    int accountID;
    Account(String name,double balance,int accountID){
        if(balance<0){
            throw new IllegalArgumentException("balance cannot be  negative");
        }
        this.name=name;
        this.balance=balance;
        this.accountID=accountID;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public int getID(){
        return accountID;
    }
    public void deposit(double amount){
        if(amount<0) {
            throw new IllegalArgumentException("deposit amount cannot be negative");
        }

             this.balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<0) {
            throw new IllegalArgumentException("Withdraw amount cannot be negative");
        }
        if(amount>this.balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        this.balance-=amount;
    }
    @Override
    public String toString(){
        return "Account Holder: "+name + " | ID: " + accountID + " | Balance: " + balance;
    }
}
// your fields here
// constructor
// getters
// deposit method
// withdraw method
// toString — accountHolder | ID: x | Balance: x