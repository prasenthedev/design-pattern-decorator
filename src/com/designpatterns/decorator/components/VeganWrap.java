package com.designpatterns.decorator.components;

import com.designpatterns.decorator.BaseWrap;

public class VeganWrap extends BaseWrap {

    public String getDescription() {
        return "Vegan Wrap";
    }

    public Double cost() {
        return 4.5;
    }
}
