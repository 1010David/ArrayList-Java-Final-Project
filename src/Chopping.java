public class Chopping implements  Comparable<Chopping>{

    private double cost;
    private String description;

    public Chopping(double cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Chopping: cost=" + cost +
                ", description='" + description;
    }

    @Override
    public int compareTo(Chopping otraCompra) {
        return Double.valueOf(this.cost).compareTo(Double.valueOf(otraCompra.getCost()));
    }
}
