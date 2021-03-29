package Bank.Menu;

import static Bank.Main.listOfBanks;
public class ShowAllCreditsCommand implements MenuExecute {

    @Override
    public void execute() {
        System.out.println("\n=================================================================================================\n");
        System.out.println(" List of available credits:");
        for(int i = 0; i < listOfBanks.size(); i++){
            System.out.println("\n\t\t\t\t" + (i+1) + ". " + listOfBanks.get(i));
        }
        System.out.println("\n=================================================================================================\n");
    }
}