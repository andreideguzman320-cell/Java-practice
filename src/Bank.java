import java.util.*;
public class Bank {
ArrayList<Account> account= new ArrayList<>();

public void addAccount(String name,double balance,int ID){
    if(ID<0){
        throw new IllegalArgumentException ("ID cannot be negative");
    }
   for(Account id:account){
       if(id.getID()==ID){
           throw new IllegalArgumentException ("User ID already exist");
       }
   }
   account.add(new Account(name,balance,ID));
   System.out.println("User: "+name+" with the balance of "+balance+" has been created");
}
public void deposit(int ID,double amount){
    if (ID < 0) {
        throw new IllegalArgumentException("ID cannot be negative");
    }
    Account found=null;
    for (Account s:account){
        if(s.getID()==ID){
            found=s;
            s.deposit(amount);
            break;
        }
    }
    if(found==null){
        throw new IllegalArgumentException("Account not found");
    }

}
    public void withdraw(int ID,double amount){
        if (ID < 0) {
            throw new IllegalArgumentException("ID cannot be negative");
        }
        Account found=null;
        for (Account s:account){
            if(s.getID()==ID){
                found=s;
                s.withdraw(amount);
                break;
            }
        }
        if(found==null){
            throw new IllegalArgumentException("Account not found");
        }

}
    public void transfer(double amount,int ID1,int ID2) {
        if (ID1 < 0 || ID2 < 0 || amount < 0) {
            throw new IllegalArgumentException("ID cannot be negative");
        }
        if(ID1==ID2) {
            throw new IllegalArgumentException("Cannot transfer money to yourself");
        }

        Account found1 = null;
        for (Account s : account) {
            if (s.getID() == ID1) {
                found1 = s;
               break;

            }
        }
        if(found1==null){
            throw new IllegalArgumentException("Account not found");
        }
        Account found2 = null;
        for (Account s : account) {
            if (s.getID() == ID2) {
                found2 = s;
                break;
            }
        }
        if(found2==null){
            throw new IllegalArgumentException("Account not found");
        }

        if(amount>found1.getBalance()){
            throw new IllegalArgumentException("Insufficient funds");
        }

        found1.withdraw(amount);
        found2.deposit(amount);

    }
    public void viewAccount(){
    if(account.isEmpty()){
        throw new IllegalStateException ("No accounts availabale");
    }
    for(Account acc:account){
        System.out.println(acc);
    }
    }
    }


// addAccount
// deposit
// withdraw
// transfer
// viewAll