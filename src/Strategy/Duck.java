package Strategy;

import Strategy.Interface.FlyBehavior;
import Strategy.Interface.QuackBehavior;

public abstract class Duck {
    // 利用「多型」宣告行為
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
