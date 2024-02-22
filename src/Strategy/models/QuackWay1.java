package Strategy.models;

import Strategy.Interface.QuackBehavior;

public class QuackWay1 implements QuackBehavior {
    // implements Quack Strategy.Interface 後，定義叫聲行為
    @Override
    public void quack() {
        System.out.println("叫聲1");
    }
}
