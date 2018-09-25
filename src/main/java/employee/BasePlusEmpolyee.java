package employee;

public class BasePlusEmpolyee extends CommisionedEmployee {

public double basesalary;

    public BasePlusEmpolyee(String firstName, String lastName, double employeeID, double grossSales, double commissionRate, double basesalary) {
        super(firstName, lastName, employeeID, grossSales, commissionRate);
        this.basesalary = basesalary;
    }

    @Override
    public String payCheck(){
        return "The BaseplusEmployee earned " + (commissionRate * grossSales+basesalary);
    }

}
