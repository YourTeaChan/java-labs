package Bank.Menu.SearchMenu;

import static Bank.Menu.SearchForCreditsByParametersCommand.listByParameters;

public class CreditLineExtensionParameter implements SearchMenuExecute {

    @Override
    public void execute() {
        for(int i = 0; i < listByParameters.size(); i++){
            if(!listByParameters.get(i).isCreditLineExtension()){
                listByParameters.remove(i);
                i--;
            }
        }
    }
}