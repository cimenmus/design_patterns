package com.company.creational.abstractfactory.model.phone;

public class Smartphone implements Phone {

    @Override
    public void makeCall() {
        System.out.println("Call on Smart Phone");
    }
}
