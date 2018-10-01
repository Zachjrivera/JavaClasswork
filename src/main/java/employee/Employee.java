package employee;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.omg.PortableInterceptor.ServerRequestInfo;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private double employeeID;
    private double bonus;

    public Employee(String firstName, String lastName,double employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double payCheck()
    {
        return 0;
    }


    public String bonusAlert(Employee e){
        return e.getClass().getSimpleName() +" got a bonus of "+ bonus+ "and now earns " + (payCheck()+ bonus) ;
    }



    public String printEmployeesFullName(Employee e){
        return e.getClass().getSimpleName() +" Full name is "+ firstName +" " +lastName;
    }
}
