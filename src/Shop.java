import java.util.ArrayList;

public class Shop {

    ArrayList<Products> items=new ArrayList<>();
    Cart cart = new Cart();

    public void addItem(String name,int ID,int stock,double price){

        if(ID<0||stock<0||price<0)
            throw new IllegalArgumentException("Input cannot be negative");


        for(Products id:items){

            if(id.getID()==ID)
                throw new IllegalArgumentException ("Product ID already exist");


        }

        Products item=(new Products(name,ID,stock,price));

        items.add(item);

        System.out.println(name+" has been added "+"With the price of $"+price);

    }
    public void viewAll(){

        if(items.isEmpty())
            throw new IllegalStateException ("No Products to show");

        for(Products s:items)

            System.out.println(s);


    }
    public void addToCart(int ID,int amount){
        if(ID<0)
            throw new IllegalStateException ("ID cannot be negative");
        if(amount<0)
            throw new IllegalStateException ("Amount cannot be negative");

        boolean found=false;

        for(Products s:items){

            if(s.getID()==ID){
                cart.addItem(s,amount);
                found=true;
                break;
            }

        }
        if(!found)
            throw new IllegalStateException ("Product ID doesnt match any product");

    }

    public void removeFromCart(int ID){

        if(items.isEmpty())
            throw new IllegalStateException ("No items in cart");

        if(ID<0)
            throw new IllegalStateException ("ID cannot be negative");

        cart.viewCart();


        boolean found=false;

        for(Products s:items){

            if(s.getID()==ID){
                cart.removeItem(ID);
                found=true;
                break;
            }

        }
        if(!found)
            throw new IllegalStateException ("Product ID doesnt match any product");


    }
    public void viewCart(){
        cart.viewCart();
    }
    public void checkout(){
        cart.checkout();
    }


}
