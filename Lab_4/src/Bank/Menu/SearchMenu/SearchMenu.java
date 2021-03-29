package Bank.Menu.SearchMenu;

import java.util.LinkedHashMap;
import java.util.Map;

public class SearchMenu {
    Map<Integer, SearchMenuExecute> parameter;

    public SearchMenu() {
        this.parameter = new LinkedHashMap<>();
        this.parameter.put(1, new SearchHelpCommand());
        this.parameter.put(2, new ClearSearchCommand());
        this.parameter.put(3, new BankNameParameter());
        this.parameter.put(4, new CreditPurposeParameter());
        this.parameter.put(5, new CreditTermParameter());
        this.parameter.put(6, new CreditAmountParameter());
        this.parameter.put(7, new ChangeableCreditPlanParameter());
        this.parameter.put(8, new EarlyCreditRepaymentParameter());
        this.parameter.put(9, new CreditLineExtensionParameter());
        this.parameter.put(10, new CreditDeferralParameter());
    }

    public void execute(int parameter){
        SearchMenuExecute exe = this.parameter.get(parameter);
        if(exe != null){
            exe.execute();
        }
        else{
            System.out.println("Error command");
        }
    }
}
