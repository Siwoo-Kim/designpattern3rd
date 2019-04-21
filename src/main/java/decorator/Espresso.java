package decorator;

public class Espresso extends Beverage {
    private final double cost;
    public Espresso() {
        description = "에스프레소";
        cost = 1.99F;
    }

    public double cost() {
        return cost;
    }
}
