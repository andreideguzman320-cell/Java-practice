public class PartTime extends Employee{


    int hoursWorked;
    double hourlyRate;




    PartTime(String name, int employeeID,int hoursWorked,double hourlyRate) {
        super(name, employeeID);

        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;

    }

    @Override
    double computePay(){
        return hoursWorked*hourlyRate;
    }
}
