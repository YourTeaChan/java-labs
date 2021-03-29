package BattleOfDroids.Menu;

import BattleOfDroids.Game.Game;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Titles title = new Titles();
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        title.game();
        int choice = 1;
        String name = null;
        int yourSide = 0;
        int yourDroid = 0;
        int typeOfBattle = 0;

        try {
            while (choice != 0) {
                title.menu();
                title.press();
                choice = scanner.nextInt();
                switch (choice) {
                    case (1): {
                        name = nameOfDroid();
                        yourSide = chooseSide();
                        yourDroid = chooseDroid(yourSide);
                        typeOfBattle = chooseTypeOfBattle();
                        game.play(name, yourSide, yourDroid, typeOfBattle);
                        System.out.print((char) 27 + "[34m");
                        System.out.printf("\n\n%100s\n%89s", "Do you wanna reply? (no - press 0)", "Your choice: ");
                        choice = scanner.nextInt();
                        break;
                    }
                    case (2): {
                        showDroids();
                        break;
                    }
                    case (0):
                        title.gameOver();
                        return;
                    default: {
                        System.out.printf("%90s\n\n", "Please, try again");
                        choice = 1;
                        continue;
                    }
                }
            }
        } catch (ValueException message) {
            System.out.println(message);
        }
        title.gameOver();
    }

    public static String nameOfDroid() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.printf("%92s", "Enter name of your droid: ");
        name = scanner.nextLine();
        while (name.length() == 0) {
            System.out.printf("%92s", "Enter name of your droid: ");
            name = scanner.nextLine();
        }
        return name;
    }

    public static int chooseSide() {
        Scanner scanner = new Scanner(System.in);
        int sideChoice = 0;
        while (sideChoice != 1 && sideChoice != 2) {
            String side = "Light (press 1) or Dark (press 2)";
            String chooseSide = "Choose side: ";
            System.out.printf("\n%99s\n%89s", side, chooseSide);
            sideChoice = scanner.nextInt();
        }
        return sideChoice;
    }

    public static int chooseDroid(int side) {
        Scanner scanner = new Scanner(System.in);
        int typeChoice = 0;
        if (side == 1) {
            while (typeChoice != 1 && typeChoice != 2) {
                String type = "Health droid (press 1) or Ice droid (press 2)";
                String chooseType = "Choose type: ";
                System.out.printf("\n%105s\n%89s", type, chooseType);
                typeChoice = scanner.nextInt();
            }
        } else {
            while (typeChoice != 3 && typeChoice != 4) {
                String type = "Energy droid (press 3) or Fire droid (press 4)";
                String chooseType = "Choose type: ";
                System.out.printf("\n%106s\n%89s", type, chooseType);
                typeChoice = scanner.nextInt();
            }
        }
        return typeChoice;
    }

    public static int chooseTypeOfBattle() {
        Scanner scanner = new Scanner(System.in);
        int battleChoice = 0;
        while (battleChoice != 1 && battleChoice != 2) {
            String battle = "Duel (press 1) or Team battle 7x7 (press 2)";
            String chooseBattle = "Choose battle: ";
            System.out.printf("\n%104s\n%89s", battle, chooseBattle);
            battleChoice = scanner.nextInt();
        }
        return battleChoice;
    }

    public static void showDroids() {
        String lightSide = "Light side (+50♥ once):";
        String healthDroid = "♥Health droid (recover health +10♥ thrice)";
        String iceDroid = "*Ice droid (ice protection thrice)";
        System.out.print((char) 27 + "[33m");
        System.out.printf("\n%80s\n%123s\n%115s\n", lightSide, healthDroid, iceDroid);

        String darkSide = "Dark side (+50♦ once):";
        String energyDroid = "♦Energy droid (recover energy +20♦ thrice)";
        String fireDroid = "#Fire droid (2x damage thrice)";
        System.out.print((char) 27 + "[35m");
        System.out.printf("\n%80s\n%123s\n%115s\n", darkSide, energyDroid, iceDroid);
    }
}