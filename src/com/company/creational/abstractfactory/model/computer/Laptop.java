package com.company.creational.abstractfactory.model.computer;

public class Laptop implements Computer {

    @Override
    public void run() {
        System.out.println("Laptop is run");
    }
}
