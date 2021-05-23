package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.model.computer.ComputerFactory;
import com.company.creational.abstractfactory.model.phone.PhoneFactory;

public class ElectronicFactoryProducer {

    public static ElectronicFactory getFactory(ElectronicFactoryType type){
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
