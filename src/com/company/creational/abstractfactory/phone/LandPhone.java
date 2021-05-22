package com.company.creational.abstractfactory.phone;

public class LandPhone implements Phone {

    @Override
    public void makeCall() {
        System.out.println("Call on Land Phone");
    }
}
