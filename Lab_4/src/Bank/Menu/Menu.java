package Bank.Menu;

import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {

    Map<Integer, MenuExecute> command;

    public Menu() {
        this.command = new LinkedHashMap<>();
        this.command.put(1, new HelpCommand());
        this.command.put(2, new EnterInformationCommand());
        this.command.put(3, new ShowAllCreditsCommand());
        this.command.put(4, new SearchForCreditsByParametersCommand());
        this.command.put(5, new ShowCreditsForClientCommand());
        this.command.put(6, new ChooseCreditCommand());
        this.command.put(0, new ExitCommand());
    }

    public void execute(int command){
        MenuExecute exe = this.command.get(command);
        if(exe != null){
            exe.execute();
            System.out.println("");
        }
        else{
            System.out.println("Error");
        }
    }
}