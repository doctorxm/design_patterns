package com.xiaoma.decorator;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName Mocha.java
 * @Description 摩卡
 * @createTime 2020年05月23日 21:43:00
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
    @Override
    public double cost() {
        return .20+beverage.cost();
    }
}
