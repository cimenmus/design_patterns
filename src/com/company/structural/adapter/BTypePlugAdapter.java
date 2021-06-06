package com.company.structural.adapter;

import com.company.structural.adapter.model.BTypePlug;
import com.company.structural.adapter.model.Plug;

public class BTypePlugAdapter implements Plug {

    private BTypePlug bTypePlug;

    public BTypePlugAdapter(BTypePlug bTypePlug) {
        this.bTypePlug = bTypePlug;
    }

    @Override
    public void turnOn() {
        bTypePlug.printOnStatus();
    }

    @Override
    public void turnOff() {
        bTypePlug.printOffStatus();
    }
}
