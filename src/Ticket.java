public class Ticket {
    String name;
    String issue;
    int number;

    Ticket(String name,String issue,int number){
        this.name=name;
        this.issue=issue;
        this.number=number;
    }
    public String getName(){
        return name;
    }
    public String getIssue(){
        return issue;
    }
    public int getNumber(){
        return number;
    }
    @Override
    public String toString(){
        return "Name: "+name+" | Ticket Number: "+number+" | Issue: "+ issue;
    }


}
