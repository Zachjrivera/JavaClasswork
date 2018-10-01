package employee;

public class CommisionedEmployee extends Employee implements  IPayable{
        protected double grossSales;
        protected double commissionRate;


    public CommisionedEmployee(String firstName, String lastName, double employeeID,double grossSales,double commissionRate) {
        super(firstName, lastName, employeeID);
    this.grossSales = grossSales;
    this.commissionRate = commissionRate;
    }

    @Override
    public double payCheck(){
        return  commissionRate*grossSales;
    }


    public String pay() {
        return"Fuck biteches get money";
    }
}
