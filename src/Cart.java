import java.util.ArrayList;

public class Cart {

    ArrayList<Products> items = new ArrayList<>();
    ArrayList<Integer> quantity = new ArrayList<>();


    public void addItem(Products product, int amount) {


        if (amount > product.getStock())
            throw new IllegalStateException("You cannot exceed Stock");

        items.add(product);
        quantity.add(amount);
    }
    public void removeItem( int ID) {

        Products found=null;

        for (Products s : items) {

            if (s.getID() == ID) {
                found=s;

                break;
            }
        }
        if(found==null)
            throw new IllegalStateException ("Product ID doesnt match any item");


        int index=items.indexOf(found);

        items.remove(found);

        quantity.remove(index);


    }
    public void viewCart() {
        if (items.isEmpty()&&quantity.isEmpty())
            throw new IllegalStateException("No items in cart");

        for(int i=0;i<items.size();i++)

            System.out.println(items.get(i) + " | Quantity: " + quantity.get(i));
    }
    public void checkout(){
        int i=0;
        double total = 0;
        if (items.isEmpty()&&quantity.isEmpty())
            throw new IllegalStateException("No items to check out");

        for(Products s:items)

           total+= s.getPrice()* quantity.get(i++);


        System.out.println("Your Total bill to pay is: "+total);
        items.clear();
        quantity.clear();

    }
}
