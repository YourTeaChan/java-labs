package BattleOfDroids.BattleArena;

import BattleOfDroids.DroidDescription.Droid;

import java.util.Random;

public class Duel {

    public Droid fight(Droid you, Droid enemy) {
        Droid winner;
        Logger log = new Logger();
        Random random = new Random();
        while (you.isAlive() && enemy.isAlive()) {
            if (random.nextBoolean()) {
                log.attack(you, enemy);
            } else {
                log.attack(enemy, you);
            }
        }
        if (you.isAlive()) {
            winner = you;
            System.out.printf("%65c", '\0');
            System.out.println((char) 27 + "[31m" + enemy.getName() + " died!");
        } else {
            winner = enemy;
            System.out.printf("%65c", '\0');
            System.out.println((char) 27 + "[31m" + you.getName() + " died!");
        }
        return winner;
    }
}