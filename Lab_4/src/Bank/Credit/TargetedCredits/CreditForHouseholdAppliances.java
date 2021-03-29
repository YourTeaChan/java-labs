package Bank.Credit.TargetedCredits;

import Bank.Credit.Credit;
import Bank.InformationAboutClient.Client;

public class CreditForHouseholdAppliances extends Credit {

    public CreditForHouseholdAppliances(String bankName, int minimumCreditTerm, int maximumCreditTerm,
                                 double minimumCreditAmount, double maximumCreditAmount,
                                 double minimumInterestRate, double maximumInterestRate) {

        this.setBankName(bankName);
        this.setCreditPurpose("Credit for household appliances");

        this.setMinimumCreditTerm(minimumCreditTerm);
        this.setMaximumCreditTerm(maximumCreditTerm);
        this.setMinimumCreditAmount(minimumCreditAmount);
        this.setMaximumCreditAmount(maximumCreditAmount);
        this.setMinimumInterestRate(minimumInterestRate);
        this.setMaximumInterestRate(maximumInterestRate);

        this.setChangeCreditRepaymentPlan(false);
        this.setEarlyCreditRepayment(false);
        this.setCreditLineExtension(false);
        this.setCreditDeferral(false);
    }

    public boolean meetsTheRequirementsOfTheCredit(Client client){

        if(client.getAge() < 18 || client.getAge() > 75){
            return false;
        }
        if(!client.getCitizenship().equals("Ukraine")){
            return false;
        }
        if(client.getWorkPlace().equals("-")){
            return false;
        }
        if(client.getFinancialPosition() < 50000.0){
            return false;
        }
        return true;
    }
}