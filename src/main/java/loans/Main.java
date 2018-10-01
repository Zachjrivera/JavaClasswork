package loans;

public class Main {
    public static void main(String[] args) {


        Loans carLoan = new CarLoan(20000, .02f, 200, 55, .20, 55, 25, 300);
        Loans mortgage = new MortgageLoan(500000, .60f, 500, 50, 2500, 60, 25, 500, 300, 3500, 2500);
        Loans homeimprovement = new HomeImprovement(11000, .25f, 600, 100, .3, 200, 25, false, "Kithchen refurbishment");

        Loans [] loans = {carLoan,mortgage,homeimprovement};


        carLoan.setInterestRate(.52f);
        System.out.println(carLoan.changeInterestrate(carLoan));


        //===========================================================================
    }
}
