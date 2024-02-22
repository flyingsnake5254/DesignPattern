package Strategy;

import Strategy.models.FlyWay1;
import Strategy.models.QuackWay2;

public class RedDuck extends Duck{

    public RedDuck() {
        flyBehavior = new FlyWay1();
        quackBehavior = new QuackWay2();
    }
    @Override
    public void display() {
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
