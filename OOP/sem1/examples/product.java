package examples;
public class product {

    private String name;
    private double cost;

    public product(String name, double cost) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("name: %s, cost: %f", this.name, this.cost);
    }
}