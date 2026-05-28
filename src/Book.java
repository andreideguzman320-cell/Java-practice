public class Book {
    String name;
    String author;
    int ID;

    Book(String name,String author,int ID){
        this.name=name;
        this.author=author;
        this.ID=ID;
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

    @Override
    public String toString(){
        return "Book Name: "+name + " | ID: " + ID + " | Author: " + author;
    }
}
