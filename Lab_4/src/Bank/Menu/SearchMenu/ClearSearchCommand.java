package Bank.Menu.SearchMenu;

import static Bank.Main.listOfBanks;
import static Bank.Menu.SearchForCreditsByParametersCommand.listByParameters;

public class ClearSearchCommand implements SearchMenuExecute {
    @Override
    public void execute() {
        if(!listByParameters.isEmpty()) {
            while(listByParameters.size() != 0) {
                listByParameters.remove(0);
            }
        }
        for (int i = 0; i < listOfBanks.size(); i++) {
            listByParameters.add(listOfBanks.get(i));
        }
    }
}