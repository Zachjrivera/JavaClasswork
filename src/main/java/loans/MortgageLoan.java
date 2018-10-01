package loans;

public class MortgageLoan extends Loans {
    public double appraisalFee;
    public double homeInspection;
    public double assumptionFee;
    public double attorneyFee;


    public MortgageLoan(double loanAmount, float interestRate, double annualfee, double latefee, double apr, double originationfee, double applicationFee, double appraisalFee, double homeInspection, double assumptionFee, double attorneyFee) {
        super(loanAmount, interestRate, annualfee, latefee, apr, originationfee, applicationFee);
        this.appraisalFee = appraisalFee;
        this.homeInspection = homeInspection;
        this.assumptionFee = assumptionFee;
        this.attorneyFee = attorneyFee;
    }


}
