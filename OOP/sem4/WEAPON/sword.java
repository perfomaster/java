package WEAPON;
import SHIELD.noshield;
import SHIELD.shields;
import SHIELD.withshield;

import java.util.Random;

public class sword extends weapon {

    public sword(int pointOfDamage) {
        super(pointOfDamage);
    }

    @Override
    public String toString() {
        return String.format("Sword damage = %d", pointOfDamage);
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }

}