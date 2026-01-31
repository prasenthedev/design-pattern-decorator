package com.designpatterns.decorator.decorators;

import com.designpatterns.decorator.BaseWrap;
import com.designpatterns.decorator.Toppings;

public class ExtraProtein extends Toppings {

    public ExtraProtein(BaseWrap wrap) {
        this.wrap = wrap;
    }


    @Override
    public String getDescription() {
        return wrap.getDescription() + ", with Extra Protein";
    }

    @Override
    public Double cost() {
        return wrap.cost() + 2.5;
    }
}
