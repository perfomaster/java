package SHIELD;

public class buckler extends shields{

    public buckler(int size, int armorReserve) {
        super(size, armorReserve);
    }

    @Override
    public String toString() {
        return "Buckler{" +
                "armorReserve=" + armorReserve +
                '}';
    }
}
