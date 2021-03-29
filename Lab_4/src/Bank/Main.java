package Bank;

import Bank.Credit.Credit;
import Bank.Credit.TargetedCredits.*;
import Bank.InformationAboutClient.Client;
import Bank.Menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Client client = new Client();
    final public static ArrayList<Credit> listOfBanks = new ArrayList<Credit>();
    Main(int c){
        System.out.println(c);
    }

    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            Scanner scanner = new Scanner(System.in);
            banks();
            int choice;
            menu.execute(1);
            while (true) {
                System.out.print("Enter command: ");
                choice = scanner.nextInt();
                menu.execute(choice);
            }
        }
        catch (Exception exception) {
            System.out.println("Exception " + exception);
        }
    }

    public static void banks(){
        listOfBanks.add(new OtherCredit("Monobank", 1, 3, 1000, 4000, 1, 3));
        listOfBanks.add(new OtherCredit("Lviv bank", 2, 4, 500, 3000, 4, 10));
        listOfBanks.add(new CarCredit("Privat Bank", 2, 4, 10000, 50000, 5, 15));
        listOfBanks.add(new Mortgage("Privat Bank", 5, 15, 100000, 500000, 10, 18));
        listOfBanks.add(new CreditForHouseholdAppliances("Monobank", 1, 1, 500, 20000, 3, 5));
        listOfBanks.add(new CreditForHouseholdAppliances("Oschad Bank", 1, 3, 1000, 50000, 7, 13));
        listOfBanks.add(new BusinessStartUpCredit("Monobank", 2, 5, 100000, 500000, 5, 15));
    }
}