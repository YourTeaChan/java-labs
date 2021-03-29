package Bank.Menu.SearchMenu;

import java.util.Scanner;

import static Bank.Menu.SearchForCreditsByParametersCommand.listByParameters;

public class CreditTermParameter implements SearchMenuExecute {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int creditTerm = 0;
        System.out.print("\n\t\t\t\tEnter credit term: ");
        creditTerm = scanner.nextInt();
        while(creditTerm < 0 || creditTerm > 30)
        {
            System.out.print(" Incorrect credit term. Please try again: ");
            creditTerm = scanner.nextInt();
        }
        for(int i = 0; i < listByParameters.size(); i++){
            if(listByParameters.get(i).getMinimumCreditTerm() < creditTerm || listByParameters.get(i).getMaximumCreditTerm() > creditTerm){
                listByParameters.remove(i);
                i--;
            }
        }
    }
}