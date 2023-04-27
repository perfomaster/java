import WEAPON.*;

public class bowTeam extends warrior {

    public bowTeam(String name, int healthPoint, bow bow) {
        super(name, healthPoint, bow);
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }

    public int shotRange() {
        return ((bow) getWeapon()).getRange();
    }
    
}