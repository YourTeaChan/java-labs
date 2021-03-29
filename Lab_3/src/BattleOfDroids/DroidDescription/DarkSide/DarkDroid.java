package BattleOfDroids.DroidDescription.DarkSide;

import BattleOfDroids.DroidDescription.Droid;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;

public abstract class DarkDroid extends Droid {
    private static int powerOfEnergy;

    public DarkDroid(String name) {
        super(name);
        DarkDroid.powerOfEnergy = 1;
    }

    public static int getPowerOfEnergy() {
        return powerOfEnergy;
    }

    public static void setPowerOfEnergy(int powerOfEnergy) throws ValueException {
        if (powerOfEnergy < 0) {
            throw new ValueException("Incorrect value of power of energy");
        }
        DarkDroid.powerOfEnergy = powerOfEnergy;
    }

    @Override
    public void superPower(ArrayList<Droid> droids) {
        if (getPowerOfEnergy() != 0) {
            if (this.getEnergy() < 50) {
                System.out.printf("%65c", '\0');
                System.out.println(this.toString() + " is using power of energy!");
                for (int i = 0; i < droids.size(); i++) {
                    if (droids.get(i).getEnergy() > 50) {
                        droids.get(i).setEnergy(100);
                    } else {
                        int extraEnergy = droids.get(i).getEnergy() + 50;
                        droids.get(i).setEnergy(extraEnergy);
                    }
                }
                setPowerOfEnergy(getPowerOfEnergy() - 1);
            }
        }
    }
}