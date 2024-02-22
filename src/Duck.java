import Interface.FlyBehavior;
import Interface.QuackBehavior;

public class Duck {
    // 針對會改變的部份，另外建立 Interface (FlyBehavior, QuackBehavior)
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // 不會改變的部份，直接定義在 Duck
    public void display() {
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
