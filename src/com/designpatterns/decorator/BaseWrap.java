package com.designpatterns.decorator;

public abstract class BaseWrap {

    String description = "Unknown Wrap";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();

}
