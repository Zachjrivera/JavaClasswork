package employee;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.omg.PortableInterceptor.ServerRequestInfo;

public class Employee {
    private String firstName;
    private String lastName;
    private double employeeID;

    public Employee(String firstName, String lastName,double employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public String payCheck()
    {
        return " ";
    }

}
