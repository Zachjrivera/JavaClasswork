package employee;

public class CommisionedEmployee extends Employee{
        protected double grossSales;
        protected double commissionRate;


    public CommisionedEmployee(String firstName, String lastName, double employeeID,double grossSales,double commissionRate) {
        super(firstName, lastName, employeeID);
    this.grossSales = grossSales;
    this.commissionRate = commissionRate;
    }

    @Override
    public String payCheck(){
        return "The CommishionedEmployee earned "+ commissionRate*grossSales;
    }







}
