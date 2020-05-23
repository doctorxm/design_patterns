package com.xiaoma.decorator;

/**
 * @author doctorxm
 * @version 1.0.0
 * @ClassName CondimentDecorator.java
 * @Description 调料抽象类(装饰者类)
 * @createTime 2020年05月23日 21:34:00
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract  String getDescription();
}
