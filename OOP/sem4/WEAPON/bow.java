package WEAPON;

import java.util.Random;

public class bow extends weapon implements withweapon{
    private int range;

    public bow(int pointOfDamage, int range) {
        super(pointOfDamage);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }

    @Override
    public String toString() {
        return "Bow [range=" + range + "], " + "Damage = " + pointOfDamage;
    }
}