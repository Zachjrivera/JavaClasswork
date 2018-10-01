package loans;

public class Loans {
    private double loanAmount;
    private float interestRate;
    private double annualfee;
    private double latefee;
    private double apr;
    private double originationfee;
    private double applicationFee;


    public Loans(double loanAmount, float interestRate, double annualfee, double latefee, double apr, double originationfee, double applicationFee) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.annualfee = annualfee;
        this.latefee = latefee;
        this.apr = apr;
        this.originationfee = originationfee;
        this.applicationFee = applicationFee;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String  changeInterestrate(Loans l)
    {
        return l.getClass().getSimpleName() + " intrest rate changed to " + interestRate;
    }
}
