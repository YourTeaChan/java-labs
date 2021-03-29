package BattleOfDroids.DroidDescription;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;

public abstract class Droid {
    private String name;
    private int health;
    private int energy;
    private int damage;

    public Droid(String name) {
        this.name = name;
        this.health = 100;
        this.energy = 100;
        this.damage = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ValueException {
        if (name == null) {
            throw new ValueException("Incorrect name of droid");
        }
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) throws ValueException {
        if (health < 0 || health > 100) {
            throw new ValueException("Incorrect value of health");
        }
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) throws ValueException {
        if (energy < 0 || health > 100) {
            throw new ValueException("Incorrect value of energy");
        }
        this.energy = energy;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) throws ValueException {
        if (damage < 0) {
            throw new ValueException("Incorrect value of damage");
        }
        this.damage = damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public boolean isCharged() {
        return this.energy >= 10;
    }

    public int damageAnEnemy(Droid enemy) {
        this.energy -= 10;
        return enemy.takeDamageFromAnEnemy(this.damage);
    }

    public int takeDamageFromAnEnemy(int damage) {
        if (this.health < damage) {
            this.health = 0;
        } else {
            this.health = this.health - damage;
        }
        return damage;
    }

    public void energyRecovery() {
        if (this.energy < 100)
            this.energy += 1;
    }

    public void healthRecovery() {
    }

    public abstract void superPower(ArrayList<Droid> droids);

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", energy=" + energy +
                ", damage=" + damage +
                '}';
    }
}