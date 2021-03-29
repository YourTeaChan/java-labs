package Bank.Credit.TargetedCredits;

import Bank.Credit.Credit;
import Bank.InformationAboutClient.Client;

public class Mortgage extends Credit {

    public Mortgage(String bankName, int minimumCreditTerm, int maximumCreditTerm,
                                 double minimumCreditAmount, double maximumCreditAmount,
                                 double minimumInterestRate, double maximumInterestRate) {

        this.setBankName(bankName);
        this.setCreditPurpose("Mortgage");
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

    public boolean meetsTheRequirementsOfTheCredit(Client client) {

        if (client.getAge() < 25 || client.getAge() > 60) {
            return false;
        }
        if (!client.getCitizenship().equals("Ukraine")) {
            return false;
        }
        if (!client.getEducation()) {
            return false;
        }
        if (!client.isMarried()) {
            return false;
        }
        if (client.getWorkPlace().equals("-")) {
            return false;
        }
        if (!client.isPermanentJob()) {
            return false;
        }
        if (client.getFinancialPosition() < 100000.0) {
            return false;
        }
        if (!client.isAvailabilityOfRealEstate()) {
            return false;
        }
        if (client.getRealEstateValue() < 500000) {
            return false;
        }
        if (client.getCreditHistory() == 1) {
            return false;
        }
        return true;
    }
}