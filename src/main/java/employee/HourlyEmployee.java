package employee;

public class HourlyEmployee extends Employee {
        private double basePay;
        private double hours;

    public HourlyEmployee(String firstName, String lastName, double employeeID,double basePay,double hours) {
        super(firstName, lastName, employeeID);
        this.basePay = basePay;
        this.hours = hours;
    }


    @Override
    public double payCheck(){
        return basePay * hours;
    }
}
