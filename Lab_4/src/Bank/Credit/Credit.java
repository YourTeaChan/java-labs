package Bank.Credit;

import Bank.InformationAboutClient.Client;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

abstract public class Credit {

    private String bankName;
    private String creditPurpose;

    private int minimumCreditTerm;
    private int maximumCreditTerm;
    private double minimumCreditAmount;
    private double maximumCreditAmount;
    private double minimumInterestRate;
    private double maximumInterestRate;

    private boolean changeCreditRepaymentPlan;
    private boolean earlyCreditRepayment;
    private boolean creditLineExtension;
    private boolean creditDeferral;

    public String getBankName() {
        return bankName;
    }

    protected void setBankName(String bankName) throws ValueException {
        if(bankName.isEmpty()){
            throw new ValueException("Empty line of bank name");
        }
        this.bankName = bankName;
    }

    public String getCreditPurpose() {
        return creditPurpose;
    }

    protected void setCreditPurpose(String creditPurpose) throws ValueException{
        if(creditPurpose.isEmpty()){
            throw new ValueException("Empty line of credit purpose");
        }
        this.creditPurpose = creditPurpose;
    }

    public int getMinimumCreditTerm() {
        return minimumCreditTerm;
    }

    protected void setMinimumCreditTerm(int minimumCreditTerm) throws ValueException{
        if(minimumCreditTerm <= 0){
            throw new ValueException("Incorrect value of minimum credit term");
        }
        this.minimumCreditTerm = minimumCreditTerm;
    }

    public int getMaximumCreditTerm() {
        return maximumCreditTerm;
    }

    protected void setMaximumCreditTerm(int maximumCreditTerm) throws ValueException {
        if(maximumCreditTerm <= 0){
            throw new ValueException("Incorrect value of maximum credit term");
        }
        this.maximumCreditTerm = maximumCreditTerm;
    }

    public double getMinimumCreditAmount() {
        return minimumCreditAmount;
    }

    protected void setMinimumCreditAmount(double minimumCreditAmount) throws ValueException{
        if(minimumCreditAmount < 0){
            throw new ValueException("Incorrect value of minimum credit amount");
        }
        this.minimumCreditAmount = minimumCreditAmount;
    }

    public double getMaximumCreditAmount() {
        return maximumCreditAmount;
    }

    protected void setMaximumCreditAmount(double maximumCreditAmount) throws ValueException{
        if(maximumCreditAmount > 1000000){
            throw new ValueException("Incorrect value of maximum credit amount");
        }
        this.maximumCreditAmount = maximumCreditAmount;
    }

    public double getMinimumInterestRate() {
        return minimumInterestRate;
    }

    protected void setMinimumInterestRate(double minimumInterestRate) throws ValueException
    {
        if(minimumInterestRate < 0.0 || minimumInterestRate > 100.0){
            throw new ValueException("Incorrect value of minimum interest rate");
        }
        this.minimumInterestRate = minimumInterestRate;
    }

    public double getMaximumInterestRate() {
        return maximumInterestRate;
    }

    protected void setMaximumInterestRate(double maximumInterestRate) throws ValueException {
        if(maximumInterestRate < 0.0 || maximumInterestRate > 100.0){
            throw new ValueException("Incorrect value of maximum interest rate");
        }
        this.maximumInterestRate = maximumInterestRate;
    }

    public boolean isChangeCreditRepaymentPlan() {
        return changeCreditRepaymentPlan;
    }

    protected void setChangeCreditRepaymentPlan(boolean changeCreditRepaymentPlan) {
        this.changeCreditRepaymentPlan = changeCreditRepaymentPlan;
    }

    public boolean isEarlyCreditRepayment() {
        return earlyCreditRepayment;
    }

    protected void setEarlyCreditRepayment(boolean earlyCreditRepayment) {
        this.earlyCreditRepayment = earlyCreditRepayment;
    }

    public boolean isCreditLineExtension() {
        return creditLineExtension;
    }

    protected void setCreditLineExtension(boolean creditLineExtension) {
        this.creditLineExtension = creditLineExtension;
    }

    public boolean isCreditDeferral() {
        return creditDeferral;
    }

    protected void setCreditDeferral(boolean creditDeferral) {
        this.creditDeferral = creditDeferral;
    }

    @Override
    public String toString() {
        return "Credit\t[" +
                "bank name: '" + bankName + '\'' + ", credit purpose: '" + creditPurpose + '\'' +
                ",\n\t\t\t\t\t" + " minimum credit term: " + minimumCreditTerm +
                ", maximum credit term: " + maximumCreditTerm +
                ",\n\t\t\t\t\t" + " minimum credit amount: " + minimumCreditAmount +
                ", maximum credit amount: " + maximumCreditAmount +
                ",\n\t\t\t\t\t" + " minimum interest rate: " + minimumInterestRate + "%" +
                ", maximum interest rate: " + maximumInterestRate + "%" +
                ']';
    }

    abstract public boolean meetsTheRequirementsOfTheCredit(Client client);
}