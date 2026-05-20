public class Product {
    private String name;
    private String category;
    private double price;
    private int stock;
    private int ID;


    Product(String name,String category,double price,int stock,int ID){
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
        if (stock < 0) throw new IllegalArgumentException("Stock cannot be negative.");
        this.name=name;
        this.category=category;
        this.price=price;
        this.stock=stock;
        this.ID=ID;

    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }
    public int getID(){
        return ID;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    @Override
    public String toString(){
        return name + " | " + category + " | ID: " + ID + " | Price: $" + price + " | Stock: " + stock;
    }
}
