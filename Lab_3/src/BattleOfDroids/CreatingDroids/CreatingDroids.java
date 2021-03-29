package BattleOfDroids.CreatingDroids;

import BattleOfDroids.DroidDescription.DarkSide.EnergyDroid.EnergyDroid;
import BattleOfDroids.DroidDescription.DarkSide.FireDroid.FireDroid;
import BattleOfDroids.DroidDescription.Droid;
import BattleOfDroids.DroidDescription.LightSide.HealthDroid.HealthDroid;
import BattleOfDroids.DroidDescription.LightSide.IceDroid.IceDroid;

import java.util.ArrayList;
import java.util.Random;

public class CreatingDroids {

    public Droid createDroid(String name, int typeOfDroid) {
        Droid droid = null;
        switch (typeOfDroid) {
            case (1):
                droid = new HealthDroid(name);
                break;
            case (2):
                droid = new IceDroid(name);
                break;
            case (3):
                droid = new EnergyDroid(name);
                break;
            case (4):
                droid = new FireDroid(name);
                break;
        }
        return droid;
    }

    public ArrayList<Droid> createTeam(int side, Droid you) {
        Random random = new Random();
        int numberOrTeammates = 7;
        if (you != null) {
            numberOrTeammates = 6;
        }
        ArrayList<Droid> team = new ArrayList<Droid>();
        if (side == 1) {
            for (int i = 0; i < numberOrTeammates; i++) {
                String name = "Droid" + random.nextInt(50);
                if (random.nextBoolean()) {

                    team.add(createDroid(name, 1));
                } else {
                    team.add(createDroid(name, 2));
                }
            }
        } else {
            for (int i = 0; i < numberOrTeammates; i++) {
                String name = "Droid" + random.nextInt(50);
                if (random.nextBoolean()) {
                    team.add(createDroid(name, 3));
                } else {
                    team.add(createDroid(name, 4));
                }
            }
        }
        return team;
    }
}