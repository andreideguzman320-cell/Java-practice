class Books{
    private String name;
    private String author;
    private int bookID;
    private int stocks;
    private int stockLimit;
    Books(String name, String author,int bookID,int stocks){
        this.name=name;
        this.author=author;
        this.bookID=bookID;
        this.stocks=stocks;
        this.stockLimit=stocks;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getBookID(){
        return bookID;
    }
    public int getStocks(){
        return stocks;
    }
    public int getLimit(){
        return stockLimit;
    }
    public void setStocks(int stocks){
        this.stocks=stocks;
    }


    @Override
    public String toString() {
        return "\n-----------------------------" +
                "\nBookName:      " +this.getName() +
                "\nAuthor:        " + this.getAuthor() +
                "\nBook ID:       " + this.getBookID() +
                "\nStocks:        " +   this.getStocks() +
                "\n-----------------------------";
    }
}