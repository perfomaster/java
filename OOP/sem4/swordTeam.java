import SHIELD.noshield;
import SHIELD.shields;
import SHIELD.withshield;
import WEAPON.sword;

public class swordTeam extends warrior  implements withshield {

    private shields shield = noshield.getInstance();

    public swordTeam(String name, int healthPoint, sword sword) {
        super(name, healthPoint, sword);
    }

    public swordTeam(String name, int healthPoint, sword sword, shields shield){
        this(name, healthPoint, sword);
        this.shield = shield;
    }

    public void setDamage(int value){
        int healthValue = Math.max(0, getHealthPoint() - value);
        setHealthPoint(healthValue);
        shield.addDamage(value);
        if (armor() <= 0){
            shield = noshield.getInstance();
        }
    }

    @Override
    public String toString() {
        return String.format("name :%s, healthPoint = %s, weapon: %s, armor: %s", getName(), getHealthPoint(), getWeapon(), armor());
    }

    @Override
    public int sizeShield() {
        return shield.getSize();
    }

    @Override
    public int armor() {
        return shield.getArmorReserve();
    }

    @Override
    public shields getShield() {
        return shield;
    }

}