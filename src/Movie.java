public class Movie {
    String title;
    int movieID;
    double price;
    boolean available;

    Movie(String title,int movieID,double price){
        this.title=title;
        this.movieID=movieID;
        this.price=price;
        this.available=true;
    }
    public String getTitle(){
        return title;
    }
    public int getID(){
        return movieID;
    }

    public double getPrice(){
        return price;
    }
    public void setAvailable(boolean available){
        this.available=available;
    }
    @Override
    public String toString(){
        return "Title: "+title+" | ID: "+ movieID+" | Price : $"+price+ " |"+(available ?"Avalable" : "Not Available");
    }






}
