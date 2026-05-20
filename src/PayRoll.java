import java.util.ArrayList;

public class PayRoll {
    ArrayList<Employee> lists=new ArrayList<>();


    public void addFullTime(String name,int ID,double monthlySalary){
        if(ID<0)
            throw new IllegalArgumentException("ID cannot be negative");

        for(Employee s:lists){
            if(s.getID()==ID){
                throw new IllegalArgumentException ("User already exists");
            }
        }
        if(monthlySalary<0)
            throw new IllegalArgumentException("Salary cannot be negative");

        FullTime s=(new FullTime(name,ID,monthlySalary));
        lists.add(s);

    }
    public void addPartTime(String name,int ID,int hoursWorked,double HourlyRate){
        if(ID<0)
            throw new IllegalArgumentException("ID cannot be negative");

        for(Employee list:lists){
            if(list.getID()==ID){
                throw new IllegalArgumentException ("User already exists");
            }
        }
        if(hoursWorked<0)
            throw new IllegalArgumentException("Hours worked cannot be negative");

        if(HourlyRate<0)
            throw new IllegalArgumentException("Hourly rate cannot be negative");

        PartTime s=(new PartTime(name,ID,hoursWorked,HourlyRate));
        lists.add(s);

    }
    public void viewAll(){

        if(lists.isEmpty())
            throw new IllegalStateException ("No employee to show");

        for(Employee list:lists)
            System.out.println(list);

    }
    public void viewPay(int ID){
        if(ID<0)
            throw new IllegalArgumentException("ID cannot be negative");

        if(lists.isEmpty())
            throw new IllegalStateException ("No employee to show");

        boolean found=false;
        for(Employee list:lists){
            if (ID == list.getID()){
                System.out.println("\n"+list);
                found=true;
                break;
            }
        }
        if (!found)
            throw new IllegalArgumentException("No Employee found with that ID.");
    }







}



