package com.designpatterns.decorator.decorators;

import com.designpatterns.decorator.BaseWrap;
import com.designpatterns.decorator.Toppings;

public class Avocado extends Toppings {

    public Avocado(BaseWrap wrap) {
        this.wrap = wrap;
    }

    @Override
    public String getDescription() {
        return wrap.getDescription() + ", with Avocado";
    }

    @Override
    public Double cost() {
        return wrap.cost() + 1.1;
    }
}
