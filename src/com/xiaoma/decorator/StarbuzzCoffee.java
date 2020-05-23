package com.xiaoma.decorator;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName StarbuzzCoffee.java
 * @Description 测试
 * @createTime 2020年05月23日 21:51:00
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());//订一杯Espresso
        Beverage beverage1=new DarkRoast();
        beverage1=new Mocha(beverage1);
        beverage1=new Mocha(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription()+"$"+beverage1.cost());
        Beverage beverage2=new HouseBlend();
        beverage2=new Soy(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
    }
}
