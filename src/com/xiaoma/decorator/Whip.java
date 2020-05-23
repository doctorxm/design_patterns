package com.xiaoma.decorator;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName Whip.java
 * @Description 奶泡
 * @createTime 2020年05月23日 21:43:00
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
    @Override
    public double cost() {
        return .10+beverage.cost();
    }
}
