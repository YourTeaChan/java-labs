package BattleOfDroids.DroidDescription.LightSide.IceDroid;

import BattleOfDroids.DroidDescription.LightSide.LightDroid;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Random;

public class IceDroid extends LightDroid {
    private int iceProtection;

    public IceDroid(String name) {
        super(name);
        this.iceProtection = 3;
    }

    public int getIceProtection() {
        return iceProtection;
    }

    public void setIceProtection(int iceProtection) throws ValueException {
        if (iceProtection < 0) {
            throw new ValueException("Incorrect value of ice protection");
        }
        this.iceProtection = iceProtection;
    }

    @Override
    public int takeDamageFromAnEnemy(int damage) {
        Random random = new Random();
        if (this.iceProtection != 0) {
            if (random.nextInt(4) == 0) {
                super.takeDamageFromAnEnemy(0);
                this.iceProtection -= 1;
                System.out.printf("%65c", '\0');
                System.out.println(this.toString() + " is using ice protection");
                return 0;
            }
        }
        super.takeDamageFromAnEnemy(damage);
        return damage;
    }

    @Override
    public String toString() {
        System.out.print((char) 27 + "[33m");
        return "*" + this.getName() +
                " [" + this.getHealth() + "♥|"
                + this.getEnergy() + "♦]";
    }
}