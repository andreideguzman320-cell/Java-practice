import java.util.*;

public class BookNavigator {
    LinkedList<Book> b= new LinkedList<>();
    int index;

    public void loadFromQueue(Queue<Book> q){
        b.clear();
        b.addAll(q);
    }
    public Book next() {
        if (index >=b.size()-1)
            throw new IllegalStateException ("Already at the end of queue");

        index++;
       return b.get(index);
    }
    public Book previous(){
        if (index <=0)
            throw new IllegalStateException ("Already at the beginning of queue");

        index--;
        return b.get(index);
    }
    public Book getCurrent(){
        return b.get(index);
    }
}
