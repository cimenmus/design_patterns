package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.computer.ComputerFactory;
import com.company.creational.abstractfactory.phone.PhoneFactory;

public class FactoryProducer {

    public static ElectronicFactory getFactory(FactoryType type){
        ElectronicFactory electronicFactory = null;
        switch (type){
            case PHONE:
                electronicFactory = new PhoneFactory();
                break;
            case COMPUTER:
                electronicFactory = new ComputerFactory();
                break;
        }
        return electronicFactory;
    }
}
