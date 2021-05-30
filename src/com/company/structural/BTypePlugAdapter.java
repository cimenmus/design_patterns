package com.company.structural;

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
