package decorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    private double additionalPrice = 0.20F;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public double cost() {
        return additionalPrice + beverage.cost();
    }
}
