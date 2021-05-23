package com.company.creational.abstractfactory.model.phone;

import com.company.creational.abstractfactory.ElectronicFactory;
import com.company.creational.abstractfactory.model.computer.Computer;
import com.company.creational.abstractfactory.model.computer.ComputerType;

public class PhoneFactory implements ElectronicFactory {

    @Override
    public Phone createPhone(PhoneType type){
        Phone phone = null;
        switch (type){
            case SMART_PHONE:
                phone = new Smartphone();
                break;
            case LAND_PHONE:
                phone = new LandPhone();
                break;
        }
        return phone;
    }

    @Override
    public Computer createComputer(ComputerType type) {
        return null;
    }
}
