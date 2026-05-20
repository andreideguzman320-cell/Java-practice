public class Book {
    private String name;
    private String author;
    private int ID;
    private boolean available;

    public Book(String name,String author,int ID){
        this.name=name;
        this.author=author;
        this.ID=ID;
        this.available=true;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getID(){
        return ID;
    }
    public boolean getAvailable(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available=available;
    }
    @Override
    public String toString(){
        return name + " | " + author + " | ID: " + ID + " | " + (available ? "Available" : "Borrowed");
    }
}
