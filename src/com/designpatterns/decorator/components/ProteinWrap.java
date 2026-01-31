package com.designpatterns.decorator.components;

import com.designpatterns.decorator.BaseWrap;

public class ProteinWrap extends BaseWrap {

    public String getDescription() {
        return "Protein Wrap";
    }

    public Double cost() {
        return 5.0;
    }

}
