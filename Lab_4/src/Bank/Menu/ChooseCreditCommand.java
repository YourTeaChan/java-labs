package Bank.Menu;

import Bank.Credit.ApplyForACredit;
import Bank.Main;
import java.util.Scanner;

import static Bank.Menu.ShowCreditsForClientCommand.listForClient;

public class ChooseCreditCommand implements MenuExecute {

    public static ApplyForACredit application = new ApplyForACredit();

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        ShowCreditsForClientCommand showCredits = new ShowCreditsForClientCommand();
        int indexOfCredit = 0;
        int creditAmount = 0;
        int creditTerm = 0;

        if(Main.client.getFirstName().isEmpty()){
            EnterInformationCommand info = new EnterInformationCommand();
            info.execute();
        }
        showCredits.execute();
        if(listForClient.isEmpty()){
            System.out.println(" Sorry, we can not lend you a credit :(");
            System.out.println("\n==================================================\n");
            return;
        }
        application.setClient(Main.client);
        System.out.println("\n==================================================\n");
        System.out.println(" Congrats!!!\n");
        System.out.print(" Choose credit: ");
        indexOfCredit = scanner.nextInt() - 1;
        while(!listForClient.contains(listForClient.get(indexOfCredit))){
            System.out.print(" Your choice is incorrect. Please try again: ");
            indexOfCredit = scanner.nextInt() - 1;
        }
        application.setCredit(listForClient.get(indexOfCredit));
        System.out.print(" Enter credit amount: ");
        creditAmount = scanner.nextInt();
        while(creditAmount < listForClient.get(indexOfCredit).getMinimumCreditAmount() || creditAmount > listForClient.get(indexOfCredit).getMaximumCreditAmount()){
            System.out.print(" Your choice is incorrect. Please try again: ");
            indexOfCredit = scanner.nextInt();
        }
        application.setCreditAmount(creditAmount);

        System.out.print(" Enter credit term: ");
        creditTerm = scanner.nextInt();
        while(creditTerm < listForClient.get(indexOfCredit).getMinimumCreditTerm() || creditTerm > listForClient.get(indexOfCredit).getMaximumCreditAmount()){
            System.out.print(" Your choice is incorrect. Please try again: ");
            indexOfCredit = scanner.nextInt();
        }
        application.setCreditTerm(creditTerm);
        System.out.println("\n\n ***********************************************************\n");
        System.out.println(" Your application:\n");
        System.out.println(application.toString());
        System.out.println("\n\n ***********************************************************\n");
        System.out.println("\n==================================================\n");
    }
}