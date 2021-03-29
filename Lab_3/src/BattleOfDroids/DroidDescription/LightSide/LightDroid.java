package BattleOfDroids.DroidDescription.LightSide;

import BattleOfDroids.DroidDescription.Droid;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;

public abstract class LightDroid extends Droid {
    private static int magicOfHealth;

    public LightDroid(String name) {
        super(name);
        LightDroid.magicOfHealth = 1;
    }

    public static int getMagicOfHealth() {
        return magicOfHealth;
    }

    public static void setMagicOfHealth(int magicOfHealth) throws ValueException {
        if (magicOfHealth < 0) {
            throw new ValueException("Incorrect value of magic of health");
        }
        LightDroid.magicOfHealth = magicOfHealth;
    }

    @Override
    public void superPower(ArrayList<Droid> droids) {
        if (getMagicOfHealth() != 0) {
            if (this.getHealth() < 50) {
                System.out.printf("%65c", '\0');
                System.out.println(this.toString() + " is using magic of health!");
                for (int i = 0; i < droids.size(); i++) {
                    if (droids.get(i).getHealth() > 50) {
                        droids.get(i).setHealth(100);
                    } else {
                        int extraHealth = droids.get(i).getHealth() + 50;
                        droids.get(i).setHealth(extraHealth);
                    }
                }
                setMagicOfHealth(getMagicOfHealth()-1);
            }
        }
    }
}