package BattleOfDroids.BattleArena;

import BattleOfDroids.DroidDescription.Droid;

import java.util.Random;

public class Logger {

    public void attack(Droid attacker, Droid victim) {
        if (attacker.isCharged()) {
            process(attacker, victim);
        } else if (victim.isCharged()) {
            System.out.printf("%65c", '\0');
            System.out.println(attacker.toString() + " is discharged!");
            process(victim, attacker);
        } else {
            System.out.printf("%65c", '\0');
            System.out.println(attacker.toString() + " is discharged!");
            System.out.printf("%65c", '\0');
            System.out.println(victim.toString() + " is discharged!");
        }
        attacker.energyRecovery();
        attacker.healthRecovery();
        victim.energyRecovery();
        victim.healthRecovery();
    }

    public void process(Droid attacker, Droid victim) {
        Random random = new Random();
        if (random.nextInt(5) != 0) {
            int damage = attacker.damageAnEnemy(victim);
            System.out.printf("%65c", '\0');
            System.out.print(attacker.toString());
            System.out.print((char) 27 + "[38m" + " ► " + damage + " ► ");
            System.out.println(victim.toString());
        } else {
            System.out.printf("%65c", '\0');
            System.out.print(attacker.toString());
            System.out.print((char) 27 + "[38m" + " ► missed ► ");
            System.out.println(victim.toString());
            attacker.setEnergy(attacker.getEnergy() - 10);
        }
    }
}