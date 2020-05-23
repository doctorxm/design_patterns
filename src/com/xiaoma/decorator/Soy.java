package com.xiaoma.decorator;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName Soy.java
 * @Description 豆浆
 * @createTime 2020年05月23日 21:43:00
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
    @Override
    public double cost() {
        return .15+beverage.cost();
    }
}
