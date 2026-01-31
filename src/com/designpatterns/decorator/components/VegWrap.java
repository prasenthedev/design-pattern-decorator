package com.designpatterns.decorator.components;

import com.designpatterns.decorator.BaseWrap;

public class VegWrap extends BaseWrap {

    public String getDescription() {
        return "Veggie Wrap";
    }

    public Double cost() {
        return 3.8;
    }
}
