package BattleOfDroids.Game;

import BattleOfDroids.BattleArena.Duel;
import BattleOfDroids.BattleArena.TeamBattle;
import BattleOfDroids.CreatingDroids.CreatingDroids;
import BattleOfDroids.DroidDescription.Droid;
import BattleOfDroids.Menu.Titles;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    public void play(String name, int side, int typeOfDroid, int typeOfBattle) {
        Titles title = new Titles();
        Random random = new Random();
        CreatingDroids create = new CreatingDroids();
        Droid you = create.createDroid(name, typeOfDroid);
        if (typeOfBattle == 1) {
            Duel duel = new Duel();
            int enemyDroid;
            if (side == 1) {
                if (random.nextBoolean()) {
                    enemyDroid = 3;
                } else {
                    enemyDroid = 4;
                }
            } else {
                if (random.nextBoolean()) {
                    enemyDroid = 1;
                } else {
                    enemyDroid = 2;
                }
            }
            Droid enemy = create.createDroid("Enemy", enemyDroid);
            printYouAndEnemy(you, enemy);

            title.fight();
            Droid winner = duel.fight(you, enemy);
            if (winner.equals(you)) {
                title.youWon();
            } else {
                title.youLost();
            }
        } else {
            TeamBattle teamBattle = new TeamBattle();
            int enemySide;
            if (side == 1) {
                enemySide = 2;
            } else {
                enemySide = 1;
            }
            ArrayList<Droid> yourTeam = create.createTeam(side, you);
            ArrayList<Droid> enemyTeam = create.createTeam(enemySide, null);
            yourTeam.add(you);
            printTeams(yourTeam, enemyTeam);

            title.fight();
            ArrayList<Droid> winners = teamBattle.fight(yourTeam, enemyTeam);
            if (winners.equals(yourTeam)) {
                title.yourTeamWon();
            } else {
                title.yourTeamLost();
            }
        }
    }

    public static void printYouAndEnemy(Droid you, Droid enemy) {
        System.out.print((char) 27 + "[34m");
        System.out.printf("\n%80s", "You: ");
        System.out.println(you.toString());
        System.out.print((char) 27 + "[34m");
        System.out.printf("\n%80s", "Enemy: ");
        System.out.println(enemy.toString());
    }

    public static void printTeams(ArrayList<Droid> yourTeam, ArrayList<Droid> enemyTeam) {
        System.out.print((char) 27 + "[34m");
        System.out.printf("\n%80s\n", "Your team: ");
        for (int i = 0; i < yourTeam.size(); i++) {
            System.out.printf("%82c", '\0');
            System.out.println(yourTeam.get(i));
        }
        System.out.print((char) 27 + "[34m");
        System.out.printf("\n%80s\n", "Enemy team: ");
        for (int i = 0; i < enemyTeam.size(); i++) {
            System.out.printf("%82c", '\0');
            System.out.println(enemyTeam.get(i));
        }
    }
}