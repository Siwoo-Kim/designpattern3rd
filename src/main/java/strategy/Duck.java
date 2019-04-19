package strategy;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void changeFlyStrategy(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void changeQuackStrategy(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks can swim, even fake one can do.");
    }

    public abstract void display();

}
