package BattleOfDroids.BattleArena;

import BattleOfDroids.DroidDescription.Droid;

import java.util.ArrayList;
import java.util.Random;

public class TeamBattle {

    public ArrayList<Droid> fight(ArrayList<Droid> yourTeam, ArrayList<Droid> enemyTeam) {
        ArrayList<Droid> winners;
        Logger log = new Logger();
        Random random = new Random();
        int attacker;
        int victim;

        while (!yourTeam.isEmpty() && !enemyTeam.isEmpty()) {
            if (random.nextBoolean()) {
                attacker = random.nextInt(yourTeam.size());
                victim = random.nextInt(enemyTeam.size());
                log.attack(yourTeam.get(attacker), enemyTeam.get(victim));
                isDead(enemyTeam, enemyTeam.get(victim));
                yourTeam.get(attacker).superPower(yourTeam);
            } else {
                attacker = random.nextInt(enemyTeam.size());
                victim = random.nextInt(yourTeam.size());
                log.attack(enemyTeam.get(attacker), yourTeam.get(victim));
                isDead(yourTeam, yourTeam.get(victim));
                enemyTeam.get(attacker).superPower(enemyTeam);
            }
        }
        if (enemyTeam.isEmpty()) {
            winners = yourTeam;
        } else {
            winners = enemyTeam;
        }
        return winners;
    }

    public static void isDead(ArrayList<Droid> team, Droid victim) {
        if (!victim.isAlive()) {
            System.out.printf("%65c", '\0');
            System.out.println((char) 27 + "[31m" + victim.getName() + " died!");
            team.remove(victim);
        }
        else {
            victim.superPower(team);
        }
    }
}