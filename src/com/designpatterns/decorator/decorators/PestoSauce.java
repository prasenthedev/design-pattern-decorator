package com.designpatterns.decorator.decorators;

import com.designpatterns.decorator.BaseWrap;
import com.designpatterns.decorator.Toppings;

public class PestoSauce extends Toppings {

    public PestoSauce(BaseWrap wrap) {
        this.wrap = wrap;
    }

    @Override
    public String getDescription() {
        return wrap.getDescription() + ", with Pesto Sauce";
    }

    @Override
    public Double cost() {
        return wrap.cost() + 0.9;
    }
}
