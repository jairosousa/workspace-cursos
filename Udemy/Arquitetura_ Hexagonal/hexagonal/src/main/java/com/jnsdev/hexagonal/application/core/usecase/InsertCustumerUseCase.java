package com.jnsdev.hexagonal.application.core.usecase;

import com.jnsdev.hexagonal.application.core.domain.Custumer;
import com.jnsdev.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.jnsdev.hexagonal.application.ports.out.InsertCustomerOutputPort;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 20:05
 */
public class InsertCustumerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustumerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Custumer custumer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        custumer.setAddress(address);
        insertCustomerOutputPort.insert(custumer);
    }
}
