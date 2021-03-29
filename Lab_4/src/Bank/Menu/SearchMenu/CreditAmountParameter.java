package Bank.Menu.SearchMenu;

import java.util.Scanner;

import static Bank.Menu.SearchForCreditsByParametersCommand.listByParameters;

public class CreditAmountParameter implements SearchMenuExecute {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int creditAmount = 0;
        System.out.print("\n\t\t\t\tEnter credit amount: ");
        creditAmount = scanner.nextInt();
        while(creditAmount < 0 || creditAmount > 1000000)
        {
            System.out.print(" Incorrect credit amount. Please try again: ");
            creditAmount = scanner.nextInt();
        }
        for(int i = 0; i < listByParameters.size(); i++){
            if(listByParameters.get(i).getMinimumCreditAmount() < creditAmount || listByParameters.get(i).getMaximumCreditAmount() > creditAmount){
                listByParameters.remove(i);
                i--;
            }
        }
    }
}