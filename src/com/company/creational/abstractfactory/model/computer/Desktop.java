package com.company.creational.abstractfactory.model.computer;

public class Desktop implements Computer {

    @Override
    public void run() {
        System.out.println("Desktop is run");
    }
}
