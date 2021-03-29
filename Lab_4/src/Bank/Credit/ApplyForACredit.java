package Bank.Credit;

import Bank.InformationAboutClient.Client;

public class ApplyForACredit {
    private Client client;
    private Credit credit;
    private double creditAmount;
    private int creditTerm;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public int getCreditTerm() {
        return creditTerm;
    }

    public void setCreditTerm(int creditTerm) {
        this.creditTerm = creditTerm;
    }

    @Override
    public String toString() {
        return " \n\t client: " + client +
                "\n\t credit: " + credit +
                "\n\t credit amount: " + creditAmount +
                "\n\t credit term: " + creditTerm;
    }
}