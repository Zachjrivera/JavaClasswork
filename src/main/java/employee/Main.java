package employee;

public class Main {
    public static void main(String[] args) {

        Employee salaryEmployee = new SalariesEmployee("John","Doe",1793677,2000);
        Employee commishionEmployee = new CommisionedEmployee("Zach","Rivera",1717171,5,50000);
        Employee basePlusEmployee = new BasePlusEmpolyee("My","name",78965412,2,30000,30000);

        Employee [] workers  = {salaryEmployee,commishionEmployee,basePlusEmployee};


        for (Employee e:workers) {

            System.out.println("The"+ e.getClass().getSimpleName()+ " earned " + e.payCheck());
        }

        //===========================================================
    }
}
