package employee;

public class SalariesEmployee extends Employee {
    public double weeklySalary;


    public SalariesEmployee (String firstName,String lastName,double employeeID,double weeklySalary){
        super(firstName,lastName,employeeID);
        this.weeklySalary = weeklySalary;
    }



    @Override
    public  double payCheck(){
        return  weeklySalary;
    }




}
