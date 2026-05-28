public class Task {
    boolean status;
    String description;
    int taskID;

    Task(String description, int taskID){

        this.description=description;
        this.taskID=taskID;
    }
    public boolean getStatus(){
        return status;
    }
    public String getDescription(){
        return description;
    }
    public int getID(){
        return taskID;
    }
    public void setStatus(boolean status){
        this.status=status;
    }
    @Override
    public String toString(){
        return "Task Description: "+description+" | Task ID: "+ taskID+" | Status: " +(status ? "Done" :"Not done");
    }
}
