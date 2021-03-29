package Bank.Menu.SearchMenu;

import static Bank.Menu.SearchForCreditsByParametersCommand.listByParameters;

public class EarlyCreditRepaymentParameter implements SearchMenuExecute {

    @Override
    public void execute() {
        for(int i = 0; i < listByParameters.size(); i++){
            if(!listByParameters.get(i).isEarlyCreditRepayment()){
                listByParameters.remove(i);
                i--;
            }
        }
    }
}