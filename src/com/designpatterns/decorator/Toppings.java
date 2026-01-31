package com.designpatterns.decorator;

public abstract class Toppings extends BaseWrap {

    protected BaseWrap wrap;

    public abstract String getDescription();

}
