package Bank.Menu;

public class HelpCommand implements MenuExecute{

    @Override
    public void execute() {
        System.out.println("\n========================================\n");
        System.out.println("List of commands:\n" +
                "\n\t" + "1 - Help" +
                "\n\t" + "2 - Enter information" +
                "\n\t" + "3 - Show all credits" +
                "\n\t" + "4 - Search for credits by parameters" +
                "\n\t" + "5 - Show credits for client" +
                "\n\t" + "6 - Choose credit" +
                "\n\t" + "0 - Exit");
        System.out.println("\n========================================\n");
    }
}
