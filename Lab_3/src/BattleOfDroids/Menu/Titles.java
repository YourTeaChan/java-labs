package BattleOfDroids.Menu;

public class Titles {

    public void game() {
        System.out.println((char) 27 + "[32m");
        String line1 = "▒█▀▀█ ░█▀▀█ ▀▀█▀▀ ▀▀█▀▀ ▒█░░░ ▒█▀▀▀ 　 ▒█▀▀▀█ ▒█▀▀▀ 　 ▒█▀▀▄ ▒█▀▀█ ▒█▀▀▀█ ▀█▀ ▒█▀▀▄ ▒█▀▀▀█";
        String line2 = "▒█▀▀▄ ▒█▄▄█ ░▒█░░ ░▒█░░ ▒█░░░ ▒█▀▀▀ 　 ▒█░░▒█ ▒█▀▀▀ 　 ▒█░▒█ ▒█▄▄▀ ▒█░░▒█ ▒█░ ▒█░▒█ ░▀▀▀▄▄";
        String line3 = "▒█▄▄█ ▒█░▒█ ░▒█░░ ░▒█░░ ▒█▄▄█ ▒█▄▄▄ 　 ▒█▄▄▄█ ▒█░░░ 　 ▒█▄▄▀ ▒█░▒█ ▒█▄▄▄█ ▄█▄ ▒█▄▄▀ ▒█▄▄▄█";
        System.out.printf("\n%126s\n%126s\n%126s\n\n", line1, line2, line3);
    }

    public void menu() {
        System.out.print((char) 27 + "[34m");
        String line1 = "█▀▄▀█  █▀▀  █▄ █  █ █";
        String line2 = "█ ▀ █  ██▄  █ ▀█  █▄█";
        System.out.printf("\n%93s\n%93s\n", line1, line2);
    }

    public void press() {
        String line1 = "Start (press 1)";
        String line2 = "Show droids (press 2)";
        String line3 = "Exit (press 0)";
        String line4 = "Your choice: ";
        System.out.printf("\n%90s\n%93s\n%90s\n\n%89s", line1, line2, line3, line4);
    }

    public void fight() {
        System.out.print((char) 27 + "[34m");
        String line1 = "█▀▀  █  █▀▀  █ █  ▀█▀  █";
        String line2 = "█▀   █  █▄█  █▀█   █   ▄";
        System.out.printf("\n\n%95s\n%95s\n\n", line1, line2);
    }

    public void youWon() {
        System.out.print((char) 27 + "[36m");
        String line1 = "█▄█  █▀█  █ █    █ █ █  █▀█  █▄ █  █";
        String line2 = " █   █▄█  █▄█    ▀▄▀▄▀  █▄█  █ ▀█  ▄";
        System.out.printf("\n%101s\n%101s\n", line1, line2);
    }

    public void youLost() {
        System.out.print((char) 27 + "[31m");
        String line1 = "█▄█  █▀█  █ █    █    █▀█  █▀  ▀█▀  ▀ █▀▀";
        String line2 = " █   █▄█  █▄█    █▄▄  █▄█  ▄█   █   ▄ █▄▄";
        System.out.printf("\n%104s\n%104s\n", line1, line2);
    }

    public void yourTeamWon() {
        System.out.print((char) 27 + "[36m");
        String line1 = "█▄█  █▀█  █ █  █▀█    ▀█▀  █▀▀  ▄▀█  █▀▄▀█     █ █ █  █▀█  █▄ █  █";
        String line2 = " █   █▄█  █▄█  █▀▄     █   ██▄  █▀█  █ ▀ █     ▀▄▀▄▀  █▄█  █ ▀█  ▄";
        System.out.printf("\n%117s\n%117s\n", line1, line2);
    }

    public void yourTeamLost() {
        System.out.print((char) 27 + "[31m");
        String line1 = "█▄█  █▀█  █ █  █▀█    ▀█▀  █▀▀  ▄▀█  █▀▄▀█    █    █▀█  █▀  ▀█▀  ▀ █▀▀";
        String line2 = " █   █▄█  █▄█  █▀▄     █   ██▄  █▀█  █ ▀ █    █▄▄  █▄█  ▄█   █   ▄ █▄▄";
        System.out.printf("\n%119s\n%119s\n", line1, line2);
    }

    public void gameOver() {
        System.out.print((char) 27 + "[34m");
        String line1 = "█▀▀  ▄▀█  █▀▄▀█  █▀▀    █▀█  █ █  █▀▀  █▀█";
        String line2 = "█▄█  █▀█  █ ▀ █  ██▄    █▄█  ▀▄▀  ██▄  █▀▄";
        System.out.printf("\n\n%104s\n%104s\n", line1, line2);
    }
}