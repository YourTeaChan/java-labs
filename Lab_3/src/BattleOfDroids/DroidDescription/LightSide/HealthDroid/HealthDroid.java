package BattleOfDroids.DroidDescription.LightSide.HealthDroid;

import BattleOfDroids.DroidDescription.LightSide.LightDroid;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class HealthDroid extends LightDroid {
    private int extraHealth;

    public HealthDroid(String name) {
        super(name);
        this.extraHealth = 3;
    }

    public int getExtraHealth() {
        return extraHealth;
    }

    public void setExtraHealth(int extraHealth) throws ValueException {
        if (extraHealth < 0) {
            throw new ValueException("Incorrect value of extra health");
        }
        this.extraHealth = extraHealth;
    }

    @Override
    public void healthRecovery() {
        if (this.getHealth() < 50) {
            if (this.extraHealth != 0) {
                int health = getHealth() + 10;
                this.setHealth(health);
                this.extraHealth -= 1;
                System.out.printf("%65c", '\0');
                System.out.println(this.toString() + " is using extra health");
                return;
            }
        }
    }

    @Override
    public String toString() {
        System.out.print((char) 27 + "[33m");
        return "♥" + this.getName() +
                " [" + this.getHealth() + "♥|"
                + this.getEnergy() + "♦]";
    }
}