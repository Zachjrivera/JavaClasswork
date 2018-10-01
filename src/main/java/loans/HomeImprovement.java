package loans;

public class HomeImprovement extends Loans {

    private boolean highrisk;
    private String improvementArea;


    public HomeImprovement(double loanAmount, float interestRate, double annualfee, double latefee, double apr, double originationfee, double applicationFee, boolean highrisk, String improvementArea) {
        super(loanAmount, interestRate, annualfee, latefee, apr, originationfee, applicationFee);
        this.highrisk = highrisk;
        this.improvementArea = improvementArea;
    }
}
