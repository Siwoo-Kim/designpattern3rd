package decorator;

public class HouseBlend extends Beverage {
    private final double cost;

    public HouseBlend() {
        description = "하우스 블렌드 커피";
        cost = 0.89F;
    }

    public double cost() {
        return cost;
    }
}
