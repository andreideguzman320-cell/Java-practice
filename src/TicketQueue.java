import java.util.*;

public class TicketQueue {
    Queue<Ticket> q = new LinkedList<>();

    public void submit(String name,String issue,int number){
        if(number<0)
            throw new IllegalStateException ("Ticket Number Cannot be Negative");
        for(Ticket s:q){
            if (s.getNumber()==number)
                throw new IllegalArgumentException ("Ticket number already exist");
        }

        Ticket w=(new Ticket(name,issue,number));
        q.offer(w);
    }
    public Ticket next(){
        if(q.isEmpty())
            throw new IllegalStateException("Theres no more ticket on queue");
        return q.poll();
    }
    public boolean empty(){
        return q.isEmpty();
    }
    public Queue<Ticket> getQ(){
        return q;
    }
}
