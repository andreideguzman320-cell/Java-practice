
import java.util.*;

public class PatientNavigator {
    LinkedList<Patient> s=new LinkedList<>();
    int index=0;

    public void loadFromQueue(Queue<Patient> queue){
            s.clear();
            s.addAll(queue);

    }
    public Patient nextPatient(){
        if (index>=s.size()-1)
            throw new IllegalStateException ("Already at the ending of the queue");

        index++;
        return s.get(index);

    }
    public Patient previousPatient(){
        if (index<=0)
            throw new IllegalStateException ("Already at the beginning of the queue");

        index--;
        return s.get(index);

    }
    public Patient currentPatient(){
        return s.get(index);

    }
}
