package com.company.creational.abstractfactory;

import com.company.creational.abstractfactory.model.computer.Computer;
import com.company.creational.abstractfactory.model.computer.ComputerType;
import com.company.creational.abstractfactory.model.phone.Phone;
import com.company.creational.abstractfactory.model.phone.PhoneType;

public interface ElectronicFactory {

    Computer createComputer(ComputerType type);
    Phone createPhone(PhoneType type);
}
