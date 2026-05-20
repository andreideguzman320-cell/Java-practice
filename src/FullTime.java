public class FullTime extends Employee{

    double monthlySalary;

    FullTime(String name, int employeeID,double monthlySalary) {
        super(name, employeeID);
        this.monthlySalary=monthlySalary;
    }



    @Override
    double computePay(){
        return monthlySalary;
    }
}
