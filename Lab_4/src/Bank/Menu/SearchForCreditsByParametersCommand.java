package Bank.Menu;

import Bank.Credit.Credit;
import Bank.Menu.SearchMenu.SearchMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchForCreditsByParametersCommand implements MenuExecute {

    public static ArrayList<Credit> listByParameters = new ArrayList<Credit>();

    @Override
    public void execute() {
        System.out.println("\n========================================");
        SearchMenu menu = new SearchMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        menu.execute(1);
        menu.execute(2);
        while(true){
            System.out.print(" Enter parameter: ");
            choice = scanner.nextInt();
            if(choice == 0)
            {
                System.out.println("\n End of search");
                System.out.println("\n========================================\n");
                return;
            }
            menu.execute(choice);
            if(listByParameters.isEmpty()){
                System.out.println(" Sorry, there are no credits by this parameter..");
            }
            else {
                for (int i = 0; i < listByParameters.size(); i++) {
                    System.out.println("\n\t\t\t\t\t\t" + (i + 1) + ". " + listByParameters.get(i));
                }
            }
            menu.execute(2);
            System.out.println("");
        }
    }
}