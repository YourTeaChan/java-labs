package BattleOfDroids.DroidDescription.DarkSide.FireDroid;

import BattleOfDroids.DroidDescription.DarkSide.DarkDroid;
import BattleOfDroids.DroidDescription.Droid;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Random;

public class FireDroid extends DarkDroid {
    private int fireDamage;

    public FireDroid(String name) {
        super(name);
        this.fireDamage = 3;
    }

    public int getDoubleDamage() {
        return fireDamage;
    }

    public void setDoubleDamage(int doubleDamage) throws ValueException {
        if (doubleDamage < 0) {
            throw new ValueException("Incorrect value of double damage");
        }
        this.fireDamage = doubleDamage;
    }

    @Override
    public int damageAnEnemy(Droid enemy) {
        Random random = new Random();
        if (this.fireDamage != 0) {
            if (random.nextInt(4) == 2) {
                int fire = 2 * this.getDamage();
                fire = enemy.takeDamageFromAnEnemy(fire);
                this.fireDamage -= 1;
                System.out.printf("%65c", '\0');
                System.out.println(this.toString() + " is using fire damage");
                return fire;
            }
        }
        super.damageAnEnemy(enemy);
        return enemy.takeDamageFromAnEnemy(this.getDamage());
    }

    @Override
    public String toString() {
        System.out.print((char) 27 + "[35m");
        return "#" + this.getName() +
                " [" + this.getHealth() + "♥|"
                + this.getEnergy() + "♦]";
    }
}