 import java.util.*;
class Inventory {
    private ArrayList<Product> products=new ArrayList<>();
     public void addProduct(String name,String category,double price,int stock,int ID){
        if(ID<0)
            throw new IllegalArgumentException("ID cannot be negative");

        products.add(new Product(name,category,price,stock,ID));
        System.out.println(name+" has been added");
     }
     public void viewProducts(){
         int i=1;
        if(products.isEmpty()){
            throw new IllegalStateException("No Item in inventory");
        }
        for(Product product:products){

            System.out.println(i++ +". "+product);
        }
     }
     public void addStock(int index,int amount) {
         if (products.isEmpty()) {
             throw new IllegalStateException("No Item in inventory");
         }

         if(index<0|| index >= products.size()){
             throw new IllegalArgumentException("Invalid product selection");
         }

         Product product=products.get(index);
         product.setStock(product.getStock()+amount);


     }
     public void sellProduct(int index,int amount){
         if (products.isEmpty()) {
             throw new IllegalStateException("No Item in inventory");
         }
         if(index<0|| index >= products.size()){
             throw new IllegalArgumentException("Invalid product selection");
         }

         Product product=products.get(index);
         if(amount>product.getStock())
             throw new IllegalArgumentException("Not enough stock");

         product.setStock(product.getStock()-amount);
     }
     public void searchProduct(int ID){
         if (products.isEmpty()) {
             throw new IllegalStateException("No Item in inventory");
         }
         if(ID<0)
             throw new IllegalArgumentException("ID cannot be negative");
         boolean found=false;

         for(Product product:products){
             if(ID==product.getID()){
                 System.out.println("\n" +product);
                 found=true;
                 break;
             }
         }
         if (!found)
             throw new IllegalArgumentException("No book found with that ID.");
     }
     public void removeProduct(int index){
         if (products.isEmpty()) {
             throw new IllegalStateException("No Item in inventory");
         }
         if(index<0)
             throw new IllegalArgumentException("ID cannot be negative");
         Product remove=products.remove(index);
         System.out.println(remove.getName()+" has been removed");
     }
}
