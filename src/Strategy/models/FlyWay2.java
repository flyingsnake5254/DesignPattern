package Strategy.models;

import Strategy.Interface.FlyBehavior;

public class FlyWay2 implements FlyBehavior {
    // implements Fly Strategy.Interface 後，定義飛行行為
    @Override
    public void fly() {
        System.out.println("Fly Way 2");
    }
}
