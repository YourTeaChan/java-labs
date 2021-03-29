package Bank.Menu.SearchMenu;

import java.util.Scanner;

import static Bank.Menu.SearchForCreditsByParametersCommand.listByParameters;

public class BankNameParameter implements SearchMenuExecute {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String bankName;
        System.out.print("\t\t\t\tEnter bank name: ");
        bankName = scanner.nextLine();
        while(bankName.isEmpty())
        {
            System.out.print(" Incorrect bank name. Please try again: ");
            bankName = scanner.nextLine();
        }
        for(int i = 0; i < listByParameters.size(); i++){
            if(!listByParameters.get(i).getBankName().equalsIgnoreCase(bankName)){
                listByParameters.remove(i);
                i--;
            }
        }
    }
}