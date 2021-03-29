package Bank.Menu;

import Bank.Main;

import java.util.Scanner;

public class EnterInformationCommand implements MenuExecute {

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=========================================================================\n");
        System.out.println(" Enter information:");
        System.out.print("\t\t\t\t\tFirst name: ");
        Main.client.setFirstName(scanner.nextLine());
        System.out.print("\t\t\t\t\tSecond name: ");
        Main.client.setSecondName(scanner.nextLine());
        System.out.print("\t\t\t\t\tAge: ");
        Main.client.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("\t\t\t\t\tCitizenship: ");
        Main.client.setCitizenship(scanner.nextLine());
        System.out.print("\t\t\t\t\tEducation (true/false): ");
        Main.client.setEducation(scanner.nextBoolean());
        System.out.print("\t\t\t\t\tMarried (true/false): ");
        Main.client.setMarried(scanner.nextBoolean());
        scanner.nextLine();
        System.out.print("\t\t\t\t\tWork place: ");
        Main.client.setWorkPlace(scanner.nextLine());
        System.out.print("\t\t\t\t\tPermanent job (true/false): ");
        Main.client.setPermanentJob(scanner.nextBoolean());
        System.out.print("\t\t\t\t\tFinancial position: ");
        Main.client.setFinancialPosition(scanner.nextDouble());
        System.out.print("\t\t\t\t\tAvailability of real estate (true/false): ");
        Main.client.setAvailabilityOfRealEstate(scanner.nextBoolean());
        System.out.print("\t\t\t\t\tReal estate value: ");
        Main.client.setRealEstateValue(scanner.nextDouble());
        System.out.print("\t\t\t\t\tCredit history (0 - clean/1 - bad/2 - normal/3 - good): ");
        Main.client.setCreditHistory(scanner.nextInt());
        System.out.println("\n=========================================================================\n");
    }
}