public class drink extends product{

    double volume;
    drinkType type;

    public drink(String name, double cost, double volume, drinkType type) {
        super(name, cost);
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", volume: %f, type: %s", this.volume, this.type);
    }
}