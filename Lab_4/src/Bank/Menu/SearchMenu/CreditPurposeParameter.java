package Bank.Menu.SearchMenu;

import java.util.Scanner;

import static Bank.Menu.SearchForCreditsByParametersCommand.listByParameters;

public class CreditPurposeParameter implements SearchMenuExecute {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String creditPurpose;
        System.out.print("\n\t\t\t\tEnter credit purpose: ");
        creditPurpose = scanner.nextLine();
        while(creditPurpose.isEmpty())
        {
            System.out.print(" Incorrect credit purpose. Please try again: ");
            creditPurpose = scanner.nextLine();
        }
        for(int i = 0; i < listByParameters.size(); i++){
            if(!listByParameters.get(i).getCreditPurpose().equalsIgnoreCase(creditPurpose)){
                listByParameters.remove(i);
                i--;
            }
        }
    }
}