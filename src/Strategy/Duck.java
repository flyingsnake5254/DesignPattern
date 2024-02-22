package Strategy;

import Strategy.Interface.FlyBehavior;
import Strategy.Interface.QuackBehavior;

public abstract class Duck {
    // 針對會改變的部份，另外建立 Strategy.Interface (FlyBehavior, QuackBehavior)
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    // 讓行為可以動態改變
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // 不會改變的部份，直接定義在 Strategy.Duck
    public abstract void display();
}
