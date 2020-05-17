package com.xiaoma.strategy;

/**
 * @Author 厉害的小马fighting!
 * @Date 2019/12/11
 * @Description: com.xiaoma.strategy
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }
}
