package decorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;
    private double additionalPrice = 0.1F;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    public double cost() {
        return additionalPrice + beverage.cost();
    }
}
