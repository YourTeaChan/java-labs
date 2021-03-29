package Bank.Menu.SearchMenu;

public class SearchHelpCommand implements SearchMenuExecute {

    @Override
    public void execute() {
        System.out.println("\n========================================\n");
        System.out.println("Parameters for search:\n" +
                "\n\t" + "1 - Help" +
                "\n\t" + "2 - Clear search" +
                "\n\t" + "3 - Bank name" +
                "\n\t" + "4 - Credit purpose" +
                "\n\t" + "5 - Credit term" +
                "\n\t" + "6 - Credit amount" +
                "\n\t" + "7 - Changeable credit plan" +
                "\n\t" + "8 - Early credit repayment" +
                "\n\t" + "9 - Credit line extension" +
                "\n\t" + "10 - Credit deferral" +
                "\n\t" + "0 - End of search");
        System.out.println("\n========================================\n");
    }
}
