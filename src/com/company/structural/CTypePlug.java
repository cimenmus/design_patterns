package com.company.structural;

public class CTypePlug implements Plug {

    @Override
    public void turnOn() {
        System.out.println("C Type plug is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("C Type plug is turned off");
    }
}
