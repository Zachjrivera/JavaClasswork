package loans;

public class CarLoan extends Loans {
    private double princapal;


    public CarLoan(double loanAmount, float interestRate, double annualfee, double latefee, double apr, double originationfee, double applicationFee, double princapal) {
        super(loanAmount, interestRate, annualfee, latefee, apr, originationfee, applicationFee);
        this.princapal = princapal;
    }
}
