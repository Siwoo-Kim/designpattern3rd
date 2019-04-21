package decorator;

public class DecoratorPattern {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        printBeverage(beverage);

        //double mocha
        beverage = new Mocha(new Mocha(beverage));
        beverage = new Whip(beverage);
        printBeverage(beverage);

        beverage = new Whip(new HouseBlend());
        printBeverage(beverage);
    }

    private static void printBeverage(Beverage beverage) {
        System.out.println(String.format("%s $%.2f", beverage.getDescription(), beverage.cost()));
    }
}
