package WEAPON;

public abstract class weapon implements withweapon {
    protected int pointOfDamage;

    public weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }
}