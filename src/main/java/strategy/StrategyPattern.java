package strategy;

public class StrategyPattern {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();

        duck = new ModelDuck();
        duck.fly();
        duck.quack();

        duck.changeFlyStrategy(new FlyRocketPowered());
        duck.fly();
    }
}