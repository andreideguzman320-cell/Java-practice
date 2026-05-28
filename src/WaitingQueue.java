import java.util.*;

public class WaitingQueue {
    Patient patient;
    Queue<Patient> queue = new LinkedList<>();

    public void enqueue(int ID,String name,int age){

        for(Patient list:queue){
            if(ID==list.getID())
                throw new IllegalStateException("Patient ID already exist!");

        }
        if(ID<0||age<0)
            throw new IllegalArgumentException ("Input cannot be negative");


        Patient p=(new Patient(name,ID,age));
        queue.offer(p);


    }
    public Patient deque(){
        if (queue.isEmpty())
           throw new IllegalStateException ("Theres no patients on queue");
        return queue.poll();
    }
    public Patient checkQueue(){
        if (queue.isEmpty())
            throw new IllegalStateException ("Theres no more patients on queue");
        return queue.peek();
    }
    public boolean empty() {
        return queue.isEmpty();
    }
    public Queue<Patient> getQueue(){
        return queue;
    }



}
