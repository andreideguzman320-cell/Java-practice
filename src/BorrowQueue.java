import java.util.*;

public class BorrowQueue {
    Queue<Book> q= new LinkedList<>();


    public void addRequest(int ID,String name , String author){
        if(ID<0)
            throw new IllegalStateException ("ID cannot be negative");

        Book e=(new Book(name,author,ID));
        q.offer(e);

    }
    public Book processNext(){
        if(q.isEmpty())
            throw new IllegalStateException ("Theres no more queue request");
        return q.poll();
    }
    public Book peekNext(){
        if(q.isEmpty())
            throw new IllegalStateException ("Theres no more queue request");
        return q.peek();
    }
    public boolean empty(){
        return q.isEmpty();
    }
    public Queue<Book> getQueue(){
        return q;
    }
}
