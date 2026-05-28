public class Products {
    private String productName;
    private int productID;
    private int stock;
    private double price;

    Products(String productName,int productID,int stock,double price){
        this.productName=productName;
        this.productID=productID;
        this.stock=stock;
        this.price=price;

    }

    public String getName(){
        return productName;
    }
    public int getID(){
        return productID;
    }
    public int getStock(){
        return stock;
    }
    public double getPrice(){
        return price;
    }
    public void reduceStock(int quantity){
        if(stock<quantity)
            throw new IllegalArgumentException ("Not enough stock");
        stock-=quantity;
    }
    @Override
    public String toString(){
        return "Product Name: "+productName+" | Product ID: "+productID+" | Price: $"+price+" | Stock: "+stock;
    }
}

