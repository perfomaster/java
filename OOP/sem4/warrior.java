import WEAPON.withweapon;

public abstract class warrior {
    private String name;
    private int healthPoint;
    private withweapon weapon;
    
    public warrior(String name, int healthPoint, withweapon weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }
    
    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public withweapon getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warrior [name = " + name + ", healthPoint = " + healthPoint + ", weapon = " + weapon + "]";
    }
}