package Bank.Menu;

public class ExitCommand implements MenuExecute {

    @Override
    public void execute() {
        System.out.println("\n========================================\n");
        System.out.println(" Exit");
        System.out.println("\n========================================\n");
        System.exit(0);
    }
}