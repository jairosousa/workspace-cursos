package com.jnsdev.hexagonal.application.core.usecase;

import com.jnsdev.hexagonal.application.core.domain.Customer;
import com.jnsdev.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.jnsdev.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.jnsdev.hexagonal.application.ports.out.InsertCustomerOutputPort;

/**
 * @Autor Jairo Nascimento
 * @Created 25/11/2022 - 20:05
 */
public class InsertCustumerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustumerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
