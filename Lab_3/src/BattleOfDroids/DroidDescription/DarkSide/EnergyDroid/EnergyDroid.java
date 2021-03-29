package BattleOfDroids.DroidDescription.DarkSide.EnergyDroid;

import BattleOfDroids.DroidDescription.DarkSide.DarkDroid;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class EnergyDroid extends DarkDroid {
    private int extraEnergy;

    public EnergyDroid(String name) {
        super(name);
        this.extraEnergy = 3;
    }

    public int getExtraEnergy() {
        return extraEnergy;
    }

    public void setExtraEnergy(int extraEnergy) throws ValueException {
        if (extraEnergy < 0) {
            throw new ValueException("Incorrect value of extra energy");
        }
        this.extraEnergy = extraEnergy;
    }

    @Override
    public void energyRecovery() {
        if (this.getEnergy() < 50) {
            if (this.extraEnergy != 0) {
                int energy = this.getEnergy() + 20;
                this.setEnergy(energy);
                this.extraEnergy -= 1;
                System.out.printf("%65c", '\0');
                System.out.println(this.toString() + " is using extra energy");
                return;
            }
        }
    }

    @Override
    public String toString() {
        System.out.print((char) 27 + "[35m");
        return "♦" + this.getName() +
                " [" + this.getHealth() + "♥|"
                + this.getEnergy() + "♦]";
    }
}