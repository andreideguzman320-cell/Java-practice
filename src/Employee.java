public abstract class Employee {



    private String name;
    private int employeeID;

    Employee(String name,int employeeID){
        this.name=name;
        this.employeeID=employeeID;
    }

    public String getName(){
        return name;
    }
    public int getID(){
        return employeeID;
    }

    void display(){
        System.out.println("FUCK YOU");
    }
    abstract double computePay();

    @Override
    public String toString(){
        return "Name: "+ name+" | "+"ID: "+employeeID+" | "+" Pay: "+computePay();
    }

}
