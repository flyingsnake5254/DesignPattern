package models;

import Interface.QuackBehavior;

public class QuackWay1 implements QuackBehavior {
    // implements Quack Interface 後，定義叫聲行為
    @Override
    public void quack() {
        System.out.println("叫聲1");
    }
}
