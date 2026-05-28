import java.util.LinkedList;
import java.util.Queue;

public class TicketHistory {
    LinkedList<Ticket> q= new LinkedList<>();
    int index;

    public void addHistory(Ticket e){
        q.add(e);
    }
    public Ticket next() {
        if (index >= q.size()-1)
            throw new IllegalStateException("Already at the end of the queue");

        index++;
        return q.get(index);
    }
    public Ticket previous() {
        if (index <=0)
            throw new IllegalStateException("Already at the beginning of the queue");

        index--;
        return q.get(index);
    }
    public Ticket current(){
        return q.get(index);
    }
    public boolean empty(){

        return q.isEmpty();
    }
    public void reset(){
         index=0;
    }

}
