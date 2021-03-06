package employee;

public class BasePlusEmpolyee extends CommisionedEmployee implements IPayable {

public double basesalary;

    public BasePlusEmpolyee(String firstName, String lastName, double employeeID, double grossSales, double commissionRate, double basesalary) {
        super(firstName, lastName, employeeID, grossSales, commissionRate);
        this.basesalary = basesalary;
    }

    @Override
    public double payCheck(){
        return commissionRate * grossSales+basesalary;
    }

    public String pay() {
        return "Gimmie the loot";
    }
}
