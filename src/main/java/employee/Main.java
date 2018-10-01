package employee;

public class Main {
    public static void main(String[] args) {

        Employee salaryEmployee = new SalariesEmployee("John","Doe",1793677,2000);
        Employee commishionEmployee = new CommisionedEmployee("Zach","Rivera",1717171,5,50000);
        Employee basePlusEmployee = new BasePlusEmpolyee("My","name",78965412,2,30000,30000);
        Employee hourlyEmployee = new HourlyEmployee("Jimmy","notReal",789654123,10.75,25);
         Vendor vendor  = new Vendor();

        Employee [] workers  = {salaryEmployee,commishionEmployee,basePlusEmployee,hourlyEmployee};


//        for (Employee e:workers) {
//
//            System.out.println("The"+ e.getClass().getSimpleName()+ " earned " + e.payCheck());
//
//        }

//        salaryEmployee.setBonus(50.00);
//
//        System.out.println(salaryEmployee.bonusAlert(salaryEmployee));
//        System.out.println(salaryEmployee.printEmployeesFullName(salaryEmployee));
//        System.out.println(commishionEmployee.printEmployeesFullName(commishionEmployee));

        System.out.println(((CommisionedEmployee) commishionEmployee).pay());
        System.out.println(vendor.pay());
        System.out.println(((BasePlusEmpolyee) basePlusEmployee).pay());

       Object [] works = {commishionEmployee,basePlusEmployee,vendor};
        for (Object o: works ){


        }




        //===========================================================
    }
}
