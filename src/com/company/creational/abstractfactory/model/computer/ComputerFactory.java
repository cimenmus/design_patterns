package com.company.creational.abstractfactory.model.computer;

import com.company.creational.abstractfactory.ElectronicFactory;
import com.company.creational.abstractfactory.model.phone.Phone;
import com.company.creational.abstractfactory.model.phone.PhoneType;

public class ComputerFactory implements ElectronicFactory {

    @Override
    public Computer createComputer(ComputerType type){
        Computer computer = null;
        switch (type){
            case LAPTOP:
                computer = new Laptop();
                break;
            case DESKTOP:
                computer = new Desktop();
                break;
        }
        return computer;
    }

    @Override
    public Phone createPhone(PhoneType type) {
        return null;
    }
}
